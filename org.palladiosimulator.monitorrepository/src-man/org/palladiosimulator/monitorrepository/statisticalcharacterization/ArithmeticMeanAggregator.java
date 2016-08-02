package org.palladiosimulator.monitorrepository.statisticalcharacterization;

import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.SI;

import org.jscience.physics.amount.Amount;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.monitorrepository.ArithmeticMean;

/**
 * {@link StatisticalCharacterizationAggregator} corresponding to the {@link ArithmeticMean} model
 * class which computes the arithmetic mean of a sequence of measurements (discrete case) or a
 * function with respect to an interval (continuous case): <br>
 * In the discrete case this is simply
 * <code>AM=(x<sub>1</sub> + x<sub>2</sub> + ... + x<sub>n</sub>) / n</code> with {@code n} being
 * the number of measurements. <br>
 * <br>
 * In the continuous case, this aggregator approximates the integral </code> AM=&#8747;f(x)dx
 * &frasl; (b-a)</code> where {@code a} and {@code b} are upper and lower interval bound and the
 * integration is carried out from a to b, and the (positive) function {@code f} is interpolated
 * from a given (finite) set of samples (i.e., measurements).
 * 
 * @author Florian Rosenthal
 * @see <a href=https://en.wikipedia.org/wiki/Mean_of_a_function>https://en.wikipedia.org/wiki/
 *      Mean_of_a_function</a>
 */
public class ArithmeticMeanAggregator extends StatisticalCharacterizationAggregator {

    public ArithmeticMeanAggregator(final NumericalBaseMetricDescription expectedWindowMetric) {
        super(expectedWindowMetric);
    }

    @Override
    protected Measure<Double, Quantity> calculateStatisticalCharaterizationDiscrete(
            final Iterable<MeasuringValue> windowData) {
        double arithmeticMean = StreamSupport.stream(windowData.spliterator(), false)
                .collect(Collectors.averagingDouble(this::obtainDataValueFromMeasurement));

        return Measure.valueOf(arithmeticMean, getDataDefaultUnit());
    }

    @Override
    protected Measure<Double, Quantity> calculateStatisticalCharacterizationContinuous(
            final Iterable<MeasuringValue> windowData) {

        Amount<? extends Quantity> area = Amount.valueOf(0d, getDataDefaultUnit().times(SI.SECOND));
        Iterator<MeasuringValue> iterator = windowData.iterator();

        if (iterator.hasNext()) {
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
                        .times(obtainDataFromMeasurement(currentMeasurement)));

                if (nextMeasurement.isPresent()) {
                    currentMeasurement = nextMeasurement.get();
                }
            } while (nextMeasurement.isPresent());
        }
        @SuppressWarnings("unchecked")
        Amount<Quantity> arithmeticMean = (Amount<Quantity>) area.divide(getIntervalLength());
        return Measure.valueOf(arithmeticMean.doubleValue(getDataDefaultUnit()), getDataDefaultUnit());
    }
}
