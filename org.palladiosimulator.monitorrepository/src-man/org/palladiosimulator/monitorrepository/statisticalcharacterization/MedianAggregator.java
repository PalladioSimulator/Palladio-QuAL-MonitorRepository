package org.palladiosimulator.monitorrepository.statisticalcharacterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.quantity.Quantity;

import org.jscience.physics.amount.Amount;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.monitorrepository.Median;

/**
 * {@link StatisticalCharacterizationAggregator} corresponding to the {@link Median} model class
 * which computes the median of a sequence of measurements (discrete case) or a function with
 * respect to an interval (continuous case).
 * 
 * @author Florian Rosenthal
 *
 */
public class MedianAggregator extends StatisticalCharacterizationAggregator {

    public MedianAggregator(final NumericalBaseMetricDescription expectedWindowMetric) {
        super(expectedWindowMetric);
    }

    @Override
    protected Measure<Double, Quantity> calculateStatisticalCharaterizationDiscrete(
            final Iterable<MeasuringValue> windowData) {
        Double[] sortedData = StreamSupport.stream(windowData.spliterator(), false)
                .map(this::obtainDataValueFromMeasurement).sorted().toArray(Double[]::new);
        double median = 0d;
        if (sortedData.length != 0) {
            int middle = sortedData.length / 2;
            if (sortedData.length % 2 == 0) {
                median = 0.5 * (sortedData[middle] + sortedData[middle - 1]);
            } else {
                median = sortedData[middle];
            }
        }
        return Measure.valueOf(median, getDataDefaultUnit());
    }

    @Override
    protected Measure<Double, Quantity> calculateStatisticalCharacterizationContinuous(
            final Iterable<MeasuringValue> windowData) {

        Measure<Double, Quantity> median = Measure.valueOf(0d, getDataDefaultUnit());
        Iterator<MeasuringValue> iterator = windowData.iterator();

        List<Interval> intervalsInWindow = new ArrayList<>();
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
                intervalsInWindow
                        .add(new Interval(obtainCurrentMeasurementValidityScope(currentMeasurement, nextMeasurement),
                                obtainDataFromMeasurement(currentMeasurement)));
                if (nextMeasurement.isPresent()) {
                    currentMeasurement = nextMeasurement.get();
                }
            } while (nextMeasurement.isPresent());
            Interval[] sortedIntervals = intervalsInWindow.stream().sorted().toArray(Interval[]::new);
            @SuppressWarnings("unchecked")
            Amount<Quantity>[] sortedAreas = (Amount<Quantity>[]) Arrays.stream(sortedIntervals).map(Interval::getArea)
                    .toArray(Amount<?>[]::new);
            // compute the prefix sum, i.e., all partial sums of sequences in array
            Arrays.parallelPrefix(sortedAreas, Amount::plus);

            Amount<Quantity> halfTotalArea = sortedAreas[sortedAreas.length - 1].divide(2);

            int medianIndex = IntStream.range(0, sortedAreas.length)
                    .filter(index -> sortedAreas[index].compareTo(halfTotalArea) >= 0).findFirst()
                    .orElseThrow(() -> new AssertionError(
                            "There must be a point where the aggregated area is larger than half of the total area!"));

            median = sortedIntervals[medianIndex].getValueAsMeasure().to(super.getDataDefaultUnit());
        }
        return median;
    }

    private static class Interval implements Comparable<Interval> {

        private final Amount<Duration> length;
        private final Amount<Quantity> value;

        private Interval(final Amount<Duration> length, final Amount<Quantity> value) {
            assert length != null && value != null;

            this.length = length;
            this.value = value;
        }

        @Override
        public int compareTo(final Interval o) {
            // only use value for comparison
            return this.value.compareTo(o.value);
        }

        private Measure<Double, Quantity> getValueAsMeasure() {
            return Measure.valueOf(this.value.doubleValue(this.value.getUnit()), this.value.getUnit());
        }

        @SuppressWarnings("unchecked")
        private Amount<Quantity> getArea() {
            return (Amount<Quantity>) this.length.times(this.value);
        }
    }
}
