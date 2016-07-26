/**
 */
package org.palladiosimulator.monitorrepository;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Fixed Size Aggregation</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> ProcessingType which indicates that fixed-sized sequences of consecutive
 * measurements shall be aggregated. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.FixedSizeAggregation#getNumberOfMeasurements
 * <em>Number Of Measurements</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getFixedSizeAggregation()
 * @model annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore/OCL measNum='self.numberOfMeasurements > 0'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='measNum'"
 * @generated
 */
public interface FixedSizeAggregation extends MeasurementDrivenAggregation {
    /**
     * Returns the value of the '<em><b>Number Of Measurements</b></em>' attribute. The default
     * value is <code>"10"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> This positive int value determines the number of measurements that shall
     * be aggregated. By default, this value is set to 10. <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Number Of Measurements</em>' attribute.
     * @see #setNumberOfMeasurements(int)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getFixedSizeAggregation_NumberOfMeasurements()
     * @model default="10" required="true"
     * @generated
     */
    int getNumberOfMeasurements();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.FixedSizeAggregation#getNumberOfMeasurements
     * <em>Number Of Measurements</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Number Of Measurements</em>' attribute.
     * @see #getNumberOfMeasurements()
     * @generated
     */
    void setNumberOfMeasurements(int value);

} // FixedSizeAggregation
