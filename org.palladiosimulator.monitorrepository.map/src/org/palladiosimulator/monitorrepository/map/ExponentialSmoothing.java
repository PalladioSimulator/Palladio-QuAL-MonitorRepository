/**
 */
package org.palladiosimulator.monitorrepository.map;

import java.util.Map;
import java.util.function.UnaryOperator;
import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.palladiosimulator.measurementframework.MeasuringValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential Smoothing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A special, stateful {@link Mapper} implementation  which performs a (first order) exponential smoothing of a sequence of measurements.<br>
 * That is, starting with an initial <em>smoothed value</em><code> x<sub>0</sub></code> of zero, upon reception of a new measurement <code>y<sub>k</sub></code> computes the weighted arithmetic mean <code>x<sub>k</sub>=&alpha;y<sub>k</sub>+(1-&alpha;)x<sub>k-1</sub></code> with fixed <em>smoothing factor </em><code>&alpha;</code> in <code>[0,1]</code>.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.monitorrepository.map.ExponentialSmoothing#getSmoothingFactor <em>Smoothing Factor</em>}</li>
 *   <li>{@link org.palladiosimulator.monitorrepository.map.ExponentialSmoothing#getSmoothedValue <em>Smoothed Value</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.map.MapPackage#getExponentialSmoothing()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='alpha mapping'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL alpha='self.smoothingFactor >= 0 and self.smoothingFactor <=1' mapping='self.map.outputMetricDescription.id = self.map.measurementSpecification.metricDescription.id'"
 * @generated
 */
public interface ExponentialSmoothing extends Mapper {
    /**
     * Returns the value of the '<em><b>Smoothing Factor</b></em>' attribute.
     * The default value is <code>"0.5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Smoothing Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Smoothing Factor</em>' attribute.
     * @see #setSmoothingFactor(double)
     * @see org.palladiosimulator.monitorrepository.map.MapPackage#getExponentialSmoothing_SmoothingFactor()
     * @model default="0.5" required="true"
     * @generated
     */
    double getSmoothingFactor();

    /**
     * Sets the value of the '{@link org.palladiosimulator.monitorrepository.map.ExponentialSmoothing#getSmoothingFactor <em>Smoothing Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smoothing Factor</em>' attribute.
     * @see #getSmoothingFactor()
     * @generated
     */
    void setSmoothingFactor(double value);

    /**
     * Returns the value of the '<em><b>Smoothed Value</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Smoothed Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Smoothed Value</em>' attribute.
     * @see #setSmoothedValue(Measure)
     * @see org.palladiosimulator.monitorrepository.map.MapPackage#getExponentialSmoothing_SmoothedValue()
     * @model default="" dataType="org.palladiosimulator.edp2.models.ExperimentData.EJSMeasure<org.eclipse.emf.ecore.EDoubleObject, org.palladiosimulator.metricspec.IJSQuantity>"
     * @generated
     */
    Measure<Double, Quantity> getSmoothedValue();

    /**
     * Sets the value of the '{@link org.palladiosimulator.monitorrepository.map.ExponentialSmoothing#getSmoothedValue <em>Smoothed Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Smoothed Value</em>' attribute.
     * @see #getSmoothedValue()
     * @generated
     */
    void setSmoothedValue(Measure<Double, Quantity> value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gets the mapping function which implements the (first order)  exponential smoothing.
     * <!-- end-model-doc -->
     * @model kind="operation" dataType="org.palladiosimulator.monitorrepository.map.util.Func<org.palladiosimulator.monitorrepository.map.util.MeasuringValue>"
     *        annotation="http://www.eclipse.org/emf/2002/Ecore suppressedSetVisibility='true'"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (input) -> {\r\n            org.palladiosimulator.metricspec.NumericalBaseMetricDescription expectedMetric = (org.palladiosimulator.metricspec.NumericalBaseMetricDescription) getMap()\r\n                    .getOutputMetricDescription();\r\n            javax.measure.unit.Unit<Quantity> unit = expectedMetric.getDefaultUnit();\r\n            double value = input.getMeasureForMetric(expectedMetric).doubleValue(unit);\r\n            Measure<?, javax.measure.quantity.Duration> time = input.getMeasureForMetric(\r\n                    org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.POINT_IN_TIME_METRIC);\r\n            double oldValue = getSmoothedValue() == null ? 0d : getSmoothedValue().doubleValue(unit);\r\n            setSmoothedValue(\r\n                    Measure.valueOf(oldValue * (1 - getSmoothingFactor()) + value * getSmoothingFactor(), unit));\r\n            return new org.palladiosimulator.measurementframework.TupleMeasurement(\r\n                    (org.palladiosimulator.metricspec.MetricSetDescription) input.getMetricDesciption(), time,\r\n                    getSmoothedValue());\r\n        };'"
     * @generated
     */
    UnaryOperator<MeasuringValue> getMappingFunction();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Validator method to assert that the metric description of the associated measurement specification is a {@link org.palladiosimulator.metricspec.NumericalBaseMetricDescription}.
     * <!-- end-model-doc -->
     * @model
     * @generated
     */
    boolean isMetricNumericalBaseMetric(DiagnosticChain chain, Map<?, ?> context);

} // ExponentialSmoothing
