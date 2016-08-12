/**
 */
package org.palladiosimulator.monitorrepository;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Processing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> A ProcessingType specifies in what way measurements shall be further
 * processed or aggregated (besides or before being recorded) upon reception. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.ProcessingType#getMeasurementSpecification
 * <em>Measurement Specification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getProcessingType()
 * @model abstract="true"
 * @generated
 */
public interface ProcessingType extends Identifier {
    /**
     * Returns the value of the '<em><b>Measurement Specification</b></em>' container reference. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getProcessingType
     * <em>Processing Type</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Specification</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Measurement Specification</em>' container reference.
     * @see #setMeasurementSpecification(MeasurementSpecification)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getProcessingType_MeasurementSpecification()
     * @see org.palladiosimulator.monitorrepository.MeasurementSpecification#getProcessingType
     * @model opposite="processingType" required="true" transient="false"
     * @generated
     */
    MeasurementSpecification getMeasurementSpecification();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.ProcessingType#getMeasurementSpecification
     * <em>Measurement Specification</em>}' container reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Measurement Specification</em>' container reference.
     * @see #getMeasurementSpecification()
     * @generated
     */
    void setMeasurementSpecification(MeasurementSpecification value);

} // ProcessingType
