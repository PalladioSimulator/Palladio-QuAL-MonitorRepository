package org.palladiosimulator.monitorrepository.statisticalcharacterization;

import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.quantity.Quantity;

import org.jscience.physics.amount.Amount;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.monitorrepository.HarmonicMean;

/**
 * {@link StatisticalCharacterizationAggregator} corresponding to the {@link HarmonicMean} model
 * class which computes the harmonic mean of a sequence of measurements (discrete case) or a
 * function with respect to an interval (continuous case): <br>
 * In the discrete case this is simply the reciprocal of the arithmetic mean of the reciprocals of
 * the measurements.<br>
 * Note that it is not defined if any of the measurements is exactly 0. In such a case this
 * implementation returns 0.<br>
 * <br>
 * In the continuous case, this aggregator approximates the integral </code> HM=(b-a) &frasl;
 * &#8747;dx/f(x)</code> where {@code a} and {@code b} are upper and lower interval bound and the
 * integration is carried out from a to b, and the (positive) function {@code f} is given by a
 * finite set of samples (i.e., measurements).
 * 
 * @author Florian Rosenthal
 * @see <a
 *      href=https://math.stackexchange.com/questions/9007/harmonic-mean-and-logarithmic-mean>https:
 *      //math.stackexchange.com/questions/9007/harmonic-mean-and-logarithmic-mean</a>
 */
public class HarmonicMeanAggregator extends StatisticalCharacterizationAggregator {

    public HarmonicMeanAggregator(NumericalBaseMetricDescription expectedWindowMetric) {
        super(expectedWindowMetric);
    }

    @Override
    protected Measure<Double, Quantity> calculateStatisticalCharaterizationDiscrete(
            Iterable<MeasuringValue> windowData) {
        // harmonic mean is not defined in case that any of the elements equals
        // zero, this implementation will then return 0
        double arithmeticMeanOfInverses = StreamSupport.stream(windowData.spliterator(), false).collect(
                Collectors.averagingDouble(measurement -> 1d / this.obtainDataValueFromMeasurement(measurement)));

        return Measure.valueOf(arithmeticMeanOfInverses == Double.NaN || arithmeticMeanOfInverses == 0 ? 0
                : 1 / arithmeticMeanOfInverses, super.getDataDefaultUnit());

    }

    @Override
    protected Measure<Double, Quantity> calculateStatisticalCharacterizationContinuous(
            Iterable<MeasuringValue> windowData) {

        Measure<Double, Quantity> harmonicMean = Measure.valueOf(0d, super.getDataDefaultUnit());
        Iterator<MeasuringValue> iterator = windowData.iterator();

        if (iterator.hasNext()) {
            Amount<? extends Quantity> area = Amount.valueOf(0d, Duration.UNIT.divide(super.getDataDefaultUnit()));
            MeasuringValue currentMeasurement = iterator.next();

            Optional<MeasuringValue> nextMeasurement = null; // empty optional indicates
                                                             // no further elements
            do {
                if (iterator.hasNext()) {
                    nextMeasurement = Optional.of(iterator.next());
                } else {
                    nextMeasurement = Optional.empty();
                }
                // mac operation
                area = area.plus(obtainCurrentMeasurementValidityScope(currentMeasurement, nextMeasurement)
                        .divide(obtainDataFromMeasurement(currentMeasurement)));

                if (nextMeasurement.isPresent()) {
                    currentMeasurement = nextMeasurement.get();
                }
            } while (nextMeasurement.isPresent());
            @SuppressWarnings("unchecked")
            Amount<Quantity> harmonicMeanAmount = (Amount<Quantity>) super.getIntervalLength().divide(area);

            harmonicMean = Measure.valueOf(harmonicMeanAmount.doubleValue(super.getDataDefaultUnit()),
                    super.getDataDefaultUnit());
        }
        return harmonicMean;
    }
}
