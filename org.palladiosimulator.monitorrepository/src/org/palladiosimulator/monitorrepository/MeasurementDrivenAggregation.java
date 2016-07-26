/**
 */
package org.palladiosimulator.monitorrepository;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Measurement Driven Aggregation</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> ProcessingType that defines a measurement-driven way of aggregation,
 * i.e., aggregation is triggered upon reception of a new measurement. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.MeasurementDrivenAggregation#getFrequency
 * <em>Frequency</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getMeasurementDrivenAggregation()
 * @model abstract="true" annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore/OCL frequency='self.frequency > 0'" annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore constraints='frequency'"
 * @generated
 */
public interface MeasurementDrivenAggregation extends Aggregation {
    /**
     * Returns the value of the '<em><b>Frequency</b></em>' attribute. The default value is
     * <code>"1"</code>. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> This
     * positive int value indicates the frequency of aggregation. That is, a value of 'n' indicates
     * that the aggreation shall be done each n-th measurement. By default, this value is set to 1.
     * <!-- end-model-doc -->
     * 
     * @return the value of the '<em>Frequency</em>' attribute.
     * @see #setFrequency(int)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getMeasurementDrivenAggregation_Frequency()
     * @model default="1" required="true"
     * @generated
     */
    int getFrequency();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.MeasurementDrivenAggregation#getFrequency
     * <em>Frequency</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Frequency</em>' attribute.
     * @see #getFrequency()
     * @generated
     */
    void setFrequency(int value);

} // MeasurementDrivenAggregation
