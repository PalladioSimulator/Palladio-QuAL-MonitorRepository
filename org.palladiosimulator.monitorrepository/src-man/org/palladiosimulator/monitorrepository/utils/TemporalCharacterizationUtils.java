package org.palladiosimulator.monitorrepository.utils;

import java.util.Objects;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.palladiosimulator.monitorrepository.MeasurementDrivenVariableSizeAggregation;
import org.palladiosimulator.monitorrepository.RetrospectiveCharacterization;
import org.palladiosimulator.monitorrepository.TimeDriven;
import org.palladiosimulator.monitorrepository.WindowCharacterization;

public final class TemporalCharacterizationUtils {
    /**
     * The ctor is private as this is a utility class.
     */
    private TemporalCharacterizationUtils() {
        // private ctor as this is a utility class
    }

    /**
     * Retrieves the properties {@code window length} and {@code window increment} in terms of
     * {@link Measure}s from the given {@link WindowCharacterization}.
     * 
     * @param windowCharacterization
     *            A {@link WindowCharacterization} belonging to a {@link TimeDriven} specification
     *            kind.
     * @return A two-element array containing the window length at position 0 and the window
     *         increment at position 1.<br>
     *         Both values are expressed in terms of a {@link Measure}.<br>
     * @throws NullPointerException
     *             In case the given window characterization is {@code null}.
     */
    public static Measure<Double, Duration>[] getWindowPropertiesFromWindowCharacterization(
            WindowCharacterization windowCharacterization) {

        @SuppressWarnings("unchecked")
        Measure<Double, Duration>[] result = (Measure<Double, Duration>[]) new Measure<?, ?>[2];
        result[0] = Measure.valueOf(
                Objects.requireNonNull(windowCharacterization, "Given windowCharacterization must not be null.")
                        .getWindowLength(),
                SI.SECOND);
        result[1] = Measure.valueOf(windowCharacterization.getWindowIncrement(), SI.SECOND);
        return result;
    }

    /**
     * Retrieves the properties {@code retrospection length} in terms of {@link Measure} from the
     * given {@link RetrospectiveCharacterization}.
     * 
     * @param retrospectiveCharacterization
     *            A {@link RetrospectiveCharacterization} belonging to a
     *            {@link MeasurementDrivenVariableSizeAggregation} specification kind.
     * @return A {@link Measure} that expresses the retrospection length property.
     * @throws NullPointerException
     *             In case the given retrospective characterization is {@code null}.
     */
    public static Measure<Double, Duration> getRetrospectionFromRetrospectiveCharacterization(
            RetrospectiveCharacterization retrospectiveCharacterization) {

        return Measure
                .valueOf(
                        Objects.requireNonNull(retrospectiveCharacterization,
                                "Given retrospectiveCharacterization must not be null.").getRetrospectionLength(),
                        SI.SECOND);
    }

}
