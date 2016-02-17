/**
 */
package org.palladiosimulator.monitorrepository;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Aggregation</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.Aggregation#getStatisticalCharacterization
 * <em>Statistical Characterization</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getAggregation()
 * @model abstract="true"
 * @generated
 */
public interface Aggregation extends ProcessingType {
    /**
     * Returns the value of the '<em><b>Statistical Characterization</b></em>' containment
     * reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Statistical Characterization</em>' containment reference isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Statistical Characterization</em>' containment reference.
     * @see #setStatisticalCharacterization(StatisticalCharacterization)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getAggregation_StatisticalCharacterization()
     * @model containment="true" required="true"
     * @generated
     */
    StatisticalCharacterization getStatisticalCharacterization();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.Aggregation#getStatisticalCharacterization
     * <em>Statistical Characterization</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Statistical Characterization</em>' containment
     *            reference.
     * @see #getStatisticalCharacterization()
     * @generated
     */
    void setStatisticalCharacterization(StatisticalCharacterization value);

} // Aggregation
