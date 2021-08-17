package org.palladiosimulator.monitorrepository.statisticalcharacterization;

import java.util.Objects;
import java.util.Optional;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.quantity.Quantity;
import javax.measure.unit.SI;
import javax.measure.unit.Unit;

import org.jscience.physics.amount.Amount;
import org.palladiosimulator.measurementframework.BasicMeasurement;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.ScopeOfValidity;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.monitorrepository.StatisticalCharacterization;

/**
 * Abstract base class for all implementations of aggregators for
 * {@link StatisticalCharacterization}s.
 * 
 * @author Florian Rosenthal
 *
 */
public abstract class StatisticalCharacterizationAggregator {

    private final NumericalBaseMetricDescription dataMetric;
    private final Unit<Quantity> dataDefaultUnit;

    private Amount<Duration> intervalLeftBound;
    private Amount<Duration> intervalLength;
    private Amount<Duration> intervalRightBound;

    private static final Amount<Duration> ZERO_DURATION = Amount.valueOf(0, Duration.UNIT);

    /**
     * Initializes a new instance of the {@link StatisticalCharacterizationAggregator} class with
     * the given parameter.
     * 
     * @param expectedDataMetric
     *            The {@link NumericalBaseMetricDescription} that describes which kind of
     *            measurements are expected to aggregate.
     * @throws NullPointerException
     *             In case {@code expectedWindowMetric == null}.
     */
    public StatisticalCharacterizationAggregator(final NumericalBaseMetricDescription expectedDataMetric) {
        super();
        this.dataMetric = Objects.requireNonNull(expectedDataMetric);
        this.dataDefaultUnit = dataMetric.getDefaultUnit();
    }

    /**
     * Gets the data metric of the measurements this instance is aggregating.
     * 
     * @return The {@link NumericalBaseMetricDescription} representing the underlying metric of the
     *         data.
     * @see #getDataDefaultUnit()
     */
    public NumericalBaseMetricDescription getDataMetric() {
        return this.dataMetric;
    }

    /**
     * Gets the default unit of the aggregated data.
     * 
     * @return The default unit of the aggregated data, expressed as a {@link Unit} object.
     * @see NumericalBaseMetricDescription#getDefaultUnit()
     * @see #getDataMetric()
     */
    public Unit<Quantity> getDataDefaultUnit() {
        return this.dataDefaultUnit;
    }

    /**
     * Method to be called by clients that wish to aggregate a sequence of data.
     * 
     * @param data
     *            The sequence of data/measurements to be aggregated, expressed as an
     *            {@link Iterable} of {@link MeasuringValue}s.
     * @param intervalLeftBound
     *            The left bound of the interval all measurements lie in, expressed in terms of a
     *            {@link Duration} {@link Amount}.<br>
     *            In the common case this parameter is only used for measurements with a continuous
     *            {@link ScopeOfValidity} data metric.
     * @param intervalRightBound
     *            The right bound of the interval all measurements lie in, expressed in terms of a
     *            {@link Duration} {@link Amount}.<br>
     *            In the common case this parameter is only used for measurements with a continuous
     *            {@link ScopeOfValidity} data metric.
     * @param intervalLength
     *            A potentially empty {@link Optional} indicating the interval length.<br>
     *            If empty, the length is computed from the passed interval bounds.
     * @return A {@link MeasuringValue} representing the result of the aggregation.
     * @throws NullPointerException
     *             If any of the parameters is {@code null}.
     * @throws IllegalArgumentException
     *             If any of the given {@link Amounts} represents a negative value.
     * @see #getDataMetric()
     */
    public final MeasuringValue aggregateData(final Iterable<MeasuringValue> data,
            final Amount<Duration> intervalLeftBound, final Amount<Duration> intervalRightBound,
            final Optional<Amount<Duration>> intervalLength) {

        Objects.requireNonNull(data);

        this.intervalLeftBound = Objects.requireNonNull(intervalLeftBound);
        this.intervalRightBound = Objects.requireNonNull(intervalRightBound);
        this.intervalLength = Objects.requireNonNull(intervalLength)
                .orElse(this.intervalRightBound.minus(this.intervalLeftBound));

        ensureDurationAmountsNonNegative();

        Measure<Double, Quantity> result = null;
        switch (this.dataMetric.getScopeOfValidity()) {
        case CONTINUOUS:
            result = calculateStatisticalCharacterizationContinuous(data);
            break;
        case DISCRETE:
            result = calculateStatisticalCharaterizationDiscrete(data);
            break;
        default:
            throw new AssertionError();
        }
        return new BasicMeasurement<Double, Quantity>(result, this.dataMetric);
    }

    private void ensureDurationAmountsNonNegative() {
        if (this.intervalLeftBound.isLessThan(ZERO_DURATION)) {
            throw new IllegalArgumentException("Interval left bound must not be negative.");
        }
        if (this.intervalRightBound.isLessThan(ZERO_DURATION)) {
            throw new IllegalArgumentException("Interval right bound must not be negative.");
        }
        if (this.intervalLength.isLessThan(ZERO_DURATION)) {
            throw new IllegalArgumentException("Interval length must not be negative.");
        }
    }

    private Measure<Double, Quantity> obtainDataFromMeasurementAsMeasure(final MeasuringValue measurement) {
        return measurement.getMeasureForMetric(this.dataMetric);
    }

    /**
     * Gets the length of the interval that the data to aggregate lie in.
     * 
     * @return An {@link Amount} indicating the interval length.
     */
    protected final Amount<Duration> getIntervalLength() {
        return this.intervalLength;
    }

    /**
     * Gets the desired data (i.e., the data that adheres to the expected data metric) from the
     * given measurement.
     * 
     * @param measurement
     *            A {@link MeasuringValue} containing the data.
     * @return The desired data, expressed in terms of an {@link Amount}.
     * 
     * @see #obtainDataValueFromMeasurement(MeasuringValue)
     * @see NumericalBaseMetricDescription#getDefaultUnit()
     */
    protected final Amount<Quantity> obtainDataFromMeasurement(final MeasuringValue measurement) {
        Measure<Double, Quantity> measure = obtainDataFromMeasurementAsMeasure(measurement);
        return Amount.valueOf(measure.getValue(), measure.getUnit());
    }

    /**
     * Gets the numeric value of desired data (i.e., the data that adheres to the expected data
     * metric) from the given measurement.
     * 
     * @param measurement
     *            A {@link MeasuringValue} containing the data.
     * @return The desired data value, expressed in terms of a double value in the default unit of
     *         the corresponding metric.
     * 
     * @see NumericalBaseMetricDescription#getDefaultUnit()
     * @see #obtainDataFromMeasurement(MeasuringValue)
     */
    protected final double obtainDataValueFromMeasurement(final MeasuringValue measurement) {
        return obtainDataFromMeasurementAsMeasure(measurement).doubleValue(this.dataDefaultUnit);
    }

    /**
     * Method to be implemented by each subclass to calculate the statistical characterization of a
     * sequence of measurements with a discrete scope of validity (i.e., to aggregate them).<br>
     * This method is invoked within {@link #aggregateData(Iterable, Amount, Amount, Optional)}.
     * 
     * @param dataToAggregate
     *            The sequence of data/measurements to be aggregated, expressed as an
     *            {@link Iterable} of {@link MeasuringValue}s.
     * @return A {@link Measure} representing the result of the aggregation.
     * @see #getDataMetric()
     * @see NumericalBaseMetricDescription#getScopeOfValidity()
     */
    protected abstract Measure<Double, Quantity> calculateStatisticalCharaterizationDiscrete(
            Iterable<MeasuringValue> dataToAggregate);

    /**
     * Method to be implemented by each subclass to calculate the statistical characterization of a
     * sequence of measurements with a continuous scope of validity (i.e., to aggregate them).<br>
     * This method is invoked within {@link #aggregateData(Iterable, Amount, Amount, Optional)}.
     * 
     * @param dataToAggregate
     *            The sequence of data/measurements to be aggregated, expressed as an
     *            {@link Iterable} of {@link MeasuringValue}s.
     * @return A {@link Measure} representing the result of the aggregation.
     * @see #getDataMetric()
     * @see NumericalBaseMetricDescription#getScopeOfValidity()
     */
    protected abstract Measure<Double, Quantity> calculateStatisticalCharacterizationContinuous(
            Iterable<MeasuringValue> dataToAggregate);

    private static Amount<Duration> getPointInTimeOfMeasurement(final MeasuringValue measurement) {
        assert measurement != null;

        Measure<Double, Duration> pointInTimeMeasure = measurement
                .getMeasureForMetric(MetricDescriptionConstants.POINT_IN_TIME_METRIC);

        return Amount.valueOf(pointInTimeMeasure.doubleValue(SI.SECOND), SI.SECOND);
    }

    /**
     * Gets how "long" the value of a certain measurement (with a continuous scope of validity) is
     * valid which is the difference between the point in time the next measurement was taken and
     * that of the given measurement (or the left bound of the current interval if the latter is
     * "larger").<br>
     * In case no succeeding measurement is present, the right bound of the interval all data lie in
     * is used instead.
     * 
     * @param currentMeasurement
     *            The {@link MeasuringValue} whose validity "length" is to be determined.
     * @param nextMeasurement
     *            An {@link Optional} containing the directly succeeding {@link MeasuringValue}, or
     *            an empty {@link Optional} in case none is at hand.
     * @return The validity "length" of the measurement, expressed in terms of a {@link Duration}
     *         {@link Amount}.
     * @throws IllegalStateException
     *             If the {@link ScopeOfValidity} of the underlying metric is not
     *             {@link ScopeOfValidity#CONTINUOUS}.
     * @see #aggregateData(Iterable, Amount, Amount, Optional)
     * @see #getDataMetric()
     * @see NumericalBaseMetricDescription#getScopeOfValidity()
     */
    protected final Amount<Duration> obtainCurrentMeasurementValidityLength(final MeasuringValue currentMeasurement,
            final Optional<MeasuringValue> nextMeasurement) {
        if (this.dataMetric.getScopeOfValidity() != ScopeOfValidity.CONTINUOUS) {
            throw new IllegalStateException("Method is only reasonable for metrics with continuous scope of validity!");
        }
        Amount<Duration> current = getPointInTimeOfMeasurement(currentMeasurement);
        Amount<Duration> next = nextMeasurement.map(StatisticalCharacterizationAggregator::getPointInTimeOfMeasurement)
                .orElse(this.intervalRightBound);
        // special treatment for amount that is out of interval bounds:
        // consider only parts inside interval
        return next.minus(current.isLessThan(this.intervalLeftBound) ? this.intervalLeftBound : current);
    }
}
