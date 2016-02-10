/**
 */
package org.palladiosimulator.monitorrepository;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Specification Kind</b></em>
 * '. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.SpecificationKind#getMeasurementSpecification
 * <em>Measurement Specification</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getSpecificationKind()
 * @model abstract="true"
 * @generated
 */
public interface SpecificationKind extends Identifier {
    /**
     * Returns the value of the '<em><b>Measurement Specification</b></em>' container reference. It
     * is bidirectional and its opposite is '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getSpecificationKind
     * <em>Specification Kind</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurement Specification</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Measurement Specification</em>' container reference.
     * @see #setMeasurementSpecification(MeasurementSpecification)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getSpecificationKind_MeasurementSpecification()
     * @see org.palladiosimulator.monitorrepository.MeasurementSpecification#getSpecificationKind
     * @model opposite="specificationKind" required="true" transient="false"
     * @generated
     */
    MeasurementSpecification getMeasurementSpecification();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.SpecificationKind#getMeasurementSpecification
     * <em>Measurement Specification</em>}' container reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Measurement Specification</em>' container reference.
     * @see #getMeasurementSpecification()
     * @generated
     */
    void setMeasurementSpecification(MeasurementSpecification value);

} // SpecificationKind
