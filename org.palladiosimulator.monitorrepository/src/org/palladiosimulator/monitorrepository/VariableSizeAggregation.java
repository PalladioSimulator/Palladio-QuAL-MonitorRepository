/**
 */
package org.palladiosimulator.monitorrepository;

import javax.measure.Measure;
import javax.measure.quantity.Duration;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Variable Size Aggregation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.VariableSizeAggregation#getRetrospectionLength
 * <em>Retrospection Length</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getVariableSizeAggregation()
 * @model annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore/OCL retroLength='self.retrospectionLength > 0.0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='retroLength'"
 * @generated
 */
public interface VariableSizeAggregation extends MeasurementDrivenAggregation {
    /**
     * Returns the value of the '<em><b>Retrospection Length</b></em>' attribute. The default value
     * is <code>"10.0"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
     * --> This value (interpreted as seconds) determines the length of the retrospection interval.
     * That is, it specifies which measurements shall be included in the aggregation. <!--
     * end-model-doc -->
     *
     * @return the value of the '<em>Retrospection Length</em>' attribute.
     * @see #setRetrospectionLength(double)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getVariableSizeAggregation_RetrospectionLength()
     * @model default="10.0" required="true"
     * @generated
     */
    double getRetrospectionLength();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.VariableSizeAggregation#getRetrospectionLength
     * <em>Retrospection Length</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Retrospection Length</em>' attribute.
     * @see #getRetrospectionLength()
     * @generated
     */
    void setRetrospectionLength(double value);

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Convenience method to
     * retrieve the property 'retrospectionLength' (interpreted as given in seconds) in terms of a
     * {@link javax.measure.Measure}. <!-- end-model-doc -->
     *
     * @model kind="operation" dataType=
     *        "org.palladiosimulator.edp2.models.ExperimentData.EJSMeasure<org.eclipse.emf.ecore.EDoubleObject, org.palladiosimulator.monitorrepository.util.Duration>"
     *        annotation=
     *        "http://www.eclipse.org/emf/2002/GenModel body=' return Measure .valueOf(getRetrospectionLength(),  javax.measure.unit.SI.SECOND);'"
     * @generated
     */
    Measure<Double, Duration> getRetrospectionLengthAsMeasure();

} // VariableSizeAggregation
