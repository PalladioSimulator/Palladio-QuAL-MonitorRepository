/**
 */
package org.palladiosimulator.monitorrepository;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Time Driven</b></em>'. <!--
 * end-user-doc -->
 *
 * <!-- begin-model-doc --> SpecificationKind suitable for measurement specifications that demand a
 * WindowCharacterization but are not based on statistical aggregation. Examples for such
 * measurement specifications re the window-based utilization calculation or the power and energy
 * calculation that bases thereof. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.TimeDriven#getWindowCharacterization
 * <em>Window Characterization</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getTimeDriven()
 * @model
 * @generated
 */
public interface TimeDriven extends SpecificationKind {
    /**
     * Returns the value of the '<em><b>Window Characterization</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Window Characterization</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Window Characterization</em>' containment reference.
     * @see #setWindowCharacterization(WindowCharacterization)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getTimeDriven_WindowCharacterization()
     * @model containment="true" required="true"
     * @generated
     */
    WindowCharacterization getWindowCharacterization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.TimeDriven#getWindowCharacterization
     * <em>Window Characterization</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Window Characterization</em>' containment reference.
     * @see #getWindowCharacterization()
     * @generated
     */
    void setWindowCharacterization(WindowCharacterization value);

} // TimeDriven
