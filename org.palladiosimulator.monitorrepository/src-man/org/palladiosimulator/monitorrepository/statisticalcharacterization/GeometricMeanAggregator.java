package org.palladiosimulator.monitorrepository.statisticalcharacterization;

import java.util.Iterator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.measure.unit.SI;

import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.monitorrepository.GeometricMean;

/**
 * {@link StatisticalCharacterizationAggregator} corresponding to the {@link GeometricMean} model
 * class which computes the geometric mean of a sequence of measurements (discrete case) or a
 * (positive) function with respect to an interval (continuous case): <br>
 * In the discrete case this is simply <code> GM=(x<sub>1</sub> * x<sub>2</sub> * ... * x
 * <sub>n</sub>) ^ 1/n</code> with {@code n} being the number of measurements. <br>
 * Note that it is not defined if any of the measurements is negative or exactly 0. In such a case
 * this implementation returns 0.<br>
 * <br>
 * In the continuous case, this aggregator approximates the integral </code>
 * GM=e^(&#8747;log(f(x))dx &frasl; (b-a))</code> where {@code a} and {@code b} are upper and lower
 * interval bound and the integration is carried out from a to b, and the (positive) function
 * {@code f} is given by a finite set of samples (i.e., measurements).
 * 
 * @author Florian Rosenthal
 * @see <a href=https://en.wikipedia.org/wiki/Mean_of_a_function>https://en.wikipedia.org/wiki/
 *      Mean_of_a_function</a>
 */
public class GeometricMeanAggregator extends StatisticalCharacterizationAggregator {

    public GeometricMeanAggregator(NumericalBaseMetricDescription expectedWindowMetric) {
        super(expectedWindowMetric);
    }

    @Override
    protected Measure<Double, Quantity> calculateStatisticalCharaterizationDiscrete(
            Iterable<MeasuringValue> windowData) {
        double meanOfLogs = StreamSupport.stream(windowData.spliterator(), false)
                .collect(Collectors.averagingDouble(m -> Math.log(this.obtainDataValueFromMeasurement(m))));
        double geometricMean = Double.compare(meanOfLogs, 0d) == 0 || !Double.isFinite(meanOfLogs) ? 0d
                : Math.exp(meanOfLogs);

        return Measure.valueOf(geometricMean, super.getDataDefaultUnit());
    }

    @Override
    protected Measure<Double, Quantity> calculateStatisticalCharacterizationContinuous(
            Iterable<MeasuringValue> windowData) {

        Measure<Double, Quantity> geometricMean = Measure.valueOf(0d, super.getDataDefaultUnit());
        Iterator<MeasuringValue> iterator = windowData.iterator();

        if (iterator.hasNext()) {
            double sumOfLogs = 0d;
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
                sumOfLogs += Math.log(obtainDataValueFromMeasurement(currentMeasurement))
                        * obtainCurrentMeasurementValidityScope(currentMeasurement, nextMeasurement)
                                .doubleValue(SI.SECOND);

                if (nextMeasurement.isPresent()) {
                    currentMeasurement = nextMeasurement.get();
                }
            } while (nextMeasurement.isPresent());
            double geometricMeanValue = Double.compare(sumOfLogs, 0d) == 0 || !Double.isFinite(sumOfLogs) ? 0d
                    : Math.exp(sumOfLogs / super.getIntervalLength().doubleValue(SI.SECOND));
            geometricMean = Measure.valueOf(geometricMeanValue, super.getDataDefaultUnit());
        }
        return geometricMean;
    }

}
