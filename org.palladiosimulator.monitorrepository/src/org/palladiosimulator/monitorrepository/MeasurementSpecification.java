/**
 */
package org.palladiosimulator.monitorrepository;

import org.palladiosimulator.metricspec.MetricDescription;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Measurement Specification</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> A measurement specification for a pcm element including the performance
 * metric and the statistical charaterization. <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getMetricDescription
 * <em>Metric Description</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getMonitor
 * <em>Monitor</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getName <em>Name</em>
 * }</li>
 * <li>{@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getSpecificationKind
 * <em>Specification Kind</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getMeasurementSpecification()
 * @model
 * @generated
 */
public interface MeasurementSpecification extends Identifier {
    /**
     * Returns the value of the '<em><b>Metric Description</b></em>' reference. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Metric Description</em>' reference isn't clear, there really
     * should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Metric Description</em>' reference.
     * @see #setMetricDescription(MetricDescription)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getMeasurementSpecification_MetricDescription()
     * @model required="true"
     * @generated
     */
    MetricDescription getMetricDescription();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getMetricDescription
     * <em>Metric Description</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Metric Description</em>' reference.
     * @see #getMetricDescription()
     * @generated
     */
    void setMetricDescription(MetricDescription value);

    /**
     * Returns the value of the '<em><b>Monitor</b></em>' container reference. It is bidirectional
     * and its opposite is '
     * {@link org.palladiosimulator.monitorrepository.Monitor#getMeasurementSpecifications
     * <em>Measurement Specifications</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitor</em>' container reference isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Monitor</em>' container reference.
     * @see #setMonitor(Monitor)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getMeasurementSpecification_Monitor()
     * @see org.palladiosimulator.monitorrepository.Monitor#getMeasurementSpecifications
     * @model opposite="measurementSpecifications" required="true" transient="false"
     * @generated
     */
    Monitor getMonitor();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getMonitor
     * <em>Monitor</em>}' container reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Monitor</em>' container reference.
     * @see #getMonitor()
     * @generated
     */
    void setMonitor(Monitor value);

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
     * @see #setName(String)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getMeasurementSpecification_Name()
     * @model default="" volatile="true" derived="true" annotation=
     *        "http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.specificationKind.oclIsTypeOf(TimeDrivenVariableSizeAggregation) then self.monitor.entityName + \': TimeDrivenVariableSizeAggregation( \' + self.specificationKind.oclAsType(TimeDrivenVariableSizeAggregation).statisticalCharacterization.toString() +\')\' else self.monitor.entityName + \': \' + self.specificationKind.toString() endif'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getName <em>Name</em>
     * }' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Specification Kind</b></em>' containment reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.monitorrepository.SpecificationKind#getMeasurementSpecification
     * <em>Measurement Specification</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Specification Kind</em>' containment reference isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Specification Kind</em>' containment reference.
     * @see #setSpecificationKind(SpecificationKind)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getMeasurementSpecification_SpecificationKind()
     * @see org.palladiosimulator.monitorrepository.SpecificationKind#getMeasurementSpecification
     * @model opposite="measurementSpecification" containment="true" required="true"
     * @generated
     */
    SpecificationKind getSpecificationKind();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getSpecificationKind
     * <em>Specification Kind</em>}' containment reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Specification Kind</em>' containment reference.
     * @see #getSpecificationKind()
     * @generated
     */
    void setSpecificationKind(SpecificationKind value);

} // MeasurementSpecification
