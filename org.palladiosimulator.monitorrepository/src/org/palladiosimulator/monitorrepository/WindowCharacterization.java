/**
 */
package org.palladiosimulator.monitorrepository;

import javax.measure.Measure;
import javax.measure.quantity.Duration;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Window Characterization</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Model class to specifiy the characterizing properties of a sliding
 * window. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.WindowCharacterization#getWindowLength
 * <em>Window Length</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.WindowCharacterization#getWindowIncrement
 * <em>Window Increment</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.WindowCharacterization#getName <em>Name</em>}
 * </li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getWindowCharacterization()
 * @model annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore/OCL windowLength='self.windowLength > 0.0' windowIncrement='self.windowIncrement > 0.0'"
 *        annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore constraints='windowLength windowIncrement'"
 * @extends CDOObject
 * @generated
 */
public interface WindowCharacterization extends CDOObject {
    /**
     * Returns the value of the '<em><b>Window Length</b></em>' attribute. The default value is
     * <code>"10.0"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The length of the sliding window, in seconds. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Window Length</em>' attribute.
     * @see #setWindowLength(double)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getWindowCharacterization_WindowLength()
     * @model default="10.0"
     * @generated
     */
    double getWindowLength();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.WindowCharacterization#getWindowLength
     * <em>Window Length</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Window Length</em>' attribute.
     * @see #getWindowLength()
     * @generated
     */
    void setWindowLength(double value);

    /**
     * Returns the value of the '<em><b>Window Increment</b></em>' attribute. The default value is
     * <code>"10.0"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
     * The increment of the sliding window, in seconds. <!-- end-model-doc -->
     *
     * @return the value of the '<em>Window Increment</em>' attribute.
     * @see #setWindowIncrement(double)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getWindowCharacterization_WindowIncrement()
     * @model default="10.0"
     * @generated
     */
    double getWindowIncrement();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.WindowCharacterization#getWindowIncrement
     * <em>Window Increment</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Window Increment</em>' attribute.
     * @see #getWindowIncrement()
     * @generated
     */
    void setWindowIncrement(double value);

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
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getWindowCharacterization_Name()
     * @model default="" changeable="false" volatile="true" derived="true" annotation=
     *        "http://www.eclipse.org/emf/2002/Ecore/OCL derivation='\'windowLength \' + self.windowLength.toString() + \' s windowIncrement: \' + self.windowIncrement.toString() + \' s\''"
     * @generated
     */
    String getName();

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Convenience method to
     * retrieve the property 'windowLength' (interpreted as given in seconds) in terms of a
     * javax.measure.Measure <!-- end-model-doc -->
     *
     * @model kind="operation" dataType=
     *        "org.palladiosimulator.edp2.models.ExperimentData.EJSMeasure<org.eclipse.emf.ecore.EDoubleObject, org.palladiosimulator.monitorrepository.util.Duration>"
     *        annotation=
     *        "http://www.eclipse.org/emf/2002/GenModel body=' return Measure .valueOf(getWindowLength(),  javax.measure.unit.SI.SECOND);'"
     * @generated
     */
    Measure<Double, Duration> getWindowLengthAsMeasure();

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Convenience method to
     * retrieve the property 'windowIncrement' (interpreted as given in seconds) in terms of a
     * javax.measure.Measure <!-- end-model-doc -->
     *
     * @model kind="operation" dataType=
     *        "org.palladiosimulator.edp2.models.ExperimentData.EJSMeasure<org.eclipse.emf.ecore.EDoubleObject, org.palladiosimulator.monitorrepository.util.Duration>"
     *        annotation=
     *        "http://www.eclipse.org/emf/2002/GenModel body=' return Measure .valueOf(getWindowIncrement(),  javax.measure.unit.SI.SECOND);'"
     * @generated
     */
    Measure<Double, Duration> getWindowIncrementAsMeasure();

} // WindowCharacterization
