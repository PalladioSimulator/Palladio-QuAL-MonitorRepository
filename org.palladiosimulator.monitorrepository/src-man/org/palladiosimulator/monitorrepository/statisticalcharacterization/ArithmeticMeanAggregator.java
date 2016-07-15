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

/**
 * {@link SlidingWindowAggregator} which computes the arithmetic mean from the measurements in the
 * window once it moves on:<br>
 * AM=(x<sub>1</sub> + x<sub>2</sub> + ... + x<sub>n</sub>) / n
 * 
 * @author Florian Rosenthal
 *
 */
public class ArithmeticMeanAggregator extends StatisticalCharacterizationAggregator {

    public ArithmeticMeanAggregator(NumericalBaseMetricDescription expectedWindowMetric) {
        super(expectedWindowMetric);
    }

    @Override
    protected Measure<Double, Quantity> calculateStatisticalCharaterizationDiscrete(
            Iterable<MeasuringValue> windowData) {
        double arithmeticMean = StreamSupport.stream(windowData.spliterator(), false)
                .collect(Collectors.averagingDouble(this::obtainDataValueFromMeasurement));

        return Measure.valueOf(arithmeticMean, getDataDefaultUnit());
    }

    @Override
    protected Measure<Double, Quantity> calculateStatisticalCharacterizationContinuous(
            Iterable<MeasuringValue> windowData) {

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
