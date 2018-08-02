/**
 */
package org.palladiosimulator.monitorrepository.map.impl;

import java.util.Map;
import java.util.function.UnaryOperator;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.monitorrepository.map.ExponentialSmoothing;
import org.palladiosimulator.monitorrepository.map.MapPackage;
import org.palladiosimulator.monitorrepository.map.util.MapValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Exponential Smoothing</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.monitorrepository.map.impl.ExponentialSmoothingImpl#getSmoothingFactor <em>Smoothing Factor</em>}</li>
 *   <li>{@link org.palladiosimulator.monitorrepository.map.impl.ExponentialSmoothingImpl#getSmoothedValue <em>Smoothed Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExponentialSmoothingImpl extends MapperImpl implements ExponentialSmoothing {
    /**
     * The default value of the '{@link #getSmoothingFactor() <em>Smoothing Factor</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSmoothingFactor()
     * @generated
     * @ordered
     */
    protected static final double SMOOTHING_FACTOR_EDEFAULT = 0.5;

    /**
     * The cached value of the '{@link #getSmoothingFactor() <em>Smoothing Factor</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getSmoothingFactor()
     * @generated
     * @ordered
     */
    protected double smoothingFactor = SMOOTHING_FACTOR_EDEFAULT;

    /**
     * The cached value of the '{@link #getSmoothedValue() <em>Smoothed Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getSmoothedValue()
     * @generated
     * @ordered
     */
    protected Measure<Double, Quantity> smoothedValue;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ExponentialSmoothingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MapPackage.Literals.EXPONENTIAL_SMOOTHING;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public double getSmoothingFactor() {
        return smoothingFactor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSmoothingFactor(double newSmoothingFactor) {
        double oldSmoothingFactor = smoothingFactor;
        smoothingFactor = newSmoothingFactor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.EXPONENTIAL_SMOOTHING__SMOOTHING_FACTOR, oldSmoothingFactor, smoothingFactor));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Measure<Double, Quantity> getSmoothedValue() {
        return smoothedValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSmoothedValue(Measure<Double, Quantity> newSmoothedValue) {
        Measure<Double, Quantity> oldSmoothedValue = smoothedValue;
        smoothedValue = newSmoothedValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.EXPONENTIAL_SMOOTHING__SMOOTHED_VALUE, oldSmoothedValue, smoothedValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnaryOperator<MeasuringValue> getMappingFunction() {
        return (input) -> {
                    org.palladiosimulator.metricspec.NumericalBaseMetricDescription expectedMetric = (org.palladiosimulator.metricspec.NumericalBaseMetricDescription) getMap()
                            .getOutputMetricDescription();
                    javax.measure.unit.Unit<Quantity> unit = expectedMetric.getDefaultUnit();
                    double value = input.getMeasureForMetric(expectedMetric).doubleValue(unit);
                    Measure<?, javax.measure.quantity.Duration> time = input.getMeasureForMetric(
                            org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.POINT_IN_TIME_METRIC);
                    double oldValue = getSmoothedValue() == null ? 0d : getSmoothedValue().doubleValue(unit);
                    setSmoothedValue(
                            Measure.valueOf(oldValue * (1 - getSmoothingFactor()) + value * getSmoothingFactor(), unit));
                    return new org.palladiosimulator.measurementframework.TupleMeasurement(
                            (org.palladiosimulator.metricspec.MetricSetDescription) input.getMetricDesciption(), time,
                            getSmoothedValue());
                };
    }

    /**
     * <!-- begin-user-doc -->Validator method to assert that the metric description of the
     * associated measurement specification is a
     * {@link org.palladiosimulator.metricspec.NumericalBaseMetricDescription}. <!-- end-user-doc
     * -->
     * 
     * @generated NOT
     */
    @Override
    public boolean isMetricNumericalBaseMetric(final DiagnosticChain chain, final Map<?, ?> context) {
        org.palladiosimulator.metricspec.MetricDescription metric = this.getMap().getMeasurementSpecification()
                .getMetricDescription();

        if (metric == null
                || !org.palladiosimulator.metricspec.MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION
                        .isInstance(metric)) {
            if (chain != null) {
                chain.add(new BasicDiagnostic(Diagnostic.ERROR, MapValidator.DIAGNOSTIC_SOURCE,
                        MapValidator.EXPONENTIAL_SMOOTHING__IS_METRIC_NUMERICAL_BASE_METRIC,
                        "'" + MapPackage.Literals.EXPONENTIAL_SMOOTHING.getName() + "' (id: " + this.getId()
                                + ") can only be applied to measurements with a '"
                                + org.palladiosimulator.metricspec.MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION
                                        .getName()
                                + "'!",
                        new Object[] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MapPackage.EXPONENTIAL_SMOOTHING__SMOOTHING_FACTOR:
                return getSmoothingFactor();
            case MapPackage.EXPONENTIAL_SMOOTHING__SMOOTHED_VALUE:
                return getSmoothedValue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MapPackage.EXPONENTIAL_SMOOTHING__SMOOTHING_FACTOR:
                setSmoothingFactor((Double)newValue);
                return;
            case MapPackage.EXPONENTIAL_SMOOTHING__SMOOTHED_VALUE:
                setSmoothedValue((Measure<Double, Quantity>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MapPackage.EXPONENTIAL_SMOOTHING__SMOOTHING_FACTOR:
                setSmoothingFactor(SMOOTHING_FACTOR_EDEFAULT);
                return;
            case MapPackage.EXPONENTIAL_SMOOTHING__SMOOTHED_VALUE:
                setSmoothedValue((Measure<Double, Quantity>)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MapPackage.EXPONENTIAL_SMOOTHING__SMOOTHING_FACTOR:
                return smoothingFactor != SMOOTHING_FACTOR_EDEFAULT;
            case MapPackage.EXPONENTIAL_SMOOTHING__SMOOTHED_VALUE:
                return smoothedValue != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (smoothingFactor: ");
        result.append(smoothingFactor);
        result.append(", smoothedValue: ");
        result.append(smoothedValue);
        result.append(')');
        return result.toString();
    }

} // ExponentialSmoothingImpl
