/**
 */
package org.palladiosimulator.monitorrepository;

import javax.measure.Measure;
import javax.measure.quantity.Duration;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Retrospective Characterization</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.RetrospectiveCharacterization#getRetrospectionLength
 * <em>Retrospection Length</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.RetrospectiveCharacterization#getName
 * <em>Name</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getRetrospectiveCharacterization()
 * @model annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore/OCL retroLength='self.retrospectionLength > 0.0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='retroLength'"
 * @extends CDOObject
 * @generated
 */
public interface RetrospectiveCharacterization extends CDOObject {
    /**
     * Returns the value of the '<em><b>Retrospection Length</b></em>' attribute. The default value
     * is <code>"10.0"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc
     * --> This value (interpreted as seconds) determines the length of the retrospection interval.
     * That is, it specifies which measurements shall be included in the aggregation. <!--
     * end-model-doc -->
     *
     * @return the value of the '<em>Retrospection Length</em>' attribute.
     * @see #setRetrospectionLength(double)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getRetrospectiveCharacterization_RetrospectionLength()
     * @model default="10.0" required="true"
     * @generated
     */
    double getRetrospectionLength();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.RetrospectiveCharacterization#getRetrospectionLength
     * <em>Retrospection Length</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Retrospection Length</em>' attribute.
     * @see #getRetrospectionLength()
     * @generated
     */
    void setRetrospectionLength(double value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute. The default value is
     * <code>""</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a
     * description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Name</em>' attribute.
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getRetrospectiveCharacterization_Name()
     * @model default="" changeable="false" volatile="true" derived="true" annotation=
     *        "http://www.eclipse.org/emf/2002/Ecore/OCL derivation='\'retrospectionLength \' + self.windowLength.toString()  + \' s\''"
     * @generated
     */
    String getName();

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Convenience method to
     * retrieve the property 'retrospectionLength' in terms of a javax.measure.Measure <!--
     * end-model-doc -->
     *
     * @model kind="operation" dataType=
     *        "org.palladiosimulator.edp2.models.ExperimentData.EJSMeasure<org.eclipse.emf.ecore.EDoubleObject, org.palladiosimulator.monitorrepository.util.Duration>"
     *        annotation=
     *        "http://www.eclipse.org/emf/2002/GenModel body=' return Measure .valueOf(getRetrospectionLength(),  javax.measure.unit.SI.SECOND);'"
     * @generated
     */
    Measure<Double, Duration> getRetrospectionLengthAsMeasure();

} // RetrospectiveCharacterization
