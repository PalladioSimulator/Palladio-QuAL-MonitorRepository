/**
 */
package org.palladiosimulator.monitorrepository;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Variable Size Aggregation</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.VariableSizeAggregation#getRetrospection
 * <em>Retrospection</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getVariableSizeAggregation()
 * @model
 * @generated
 */
public interface VariableSizeAggregation extends MeasurementDrivenAggregation {
    /**
     * Returns the value of the '<em><b>Retrospection</b></em>' containment reference. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Retrospection</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Retrospection</em>' containment reference.
     * @see #setRetrospection(RetrospectiveCharacterization)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getVariableSizeAggregation_Retrospection()
     * @model containment="true" required="true"
     * @generated
     */
    RetrospectiveCharacterization getRetrospection();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.VariableSizeAggregation#getRetrospection
     * <em>Retrospection</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Retrospection</em>' containment reference.
     * @see #getRetrospection()
     * @generated
     */
    void setRetrospection(RetrospectiveCharacterization value);

} // VariableSizeAggregation
