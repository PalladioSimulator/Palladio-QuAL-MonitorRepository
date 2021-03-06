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
 * metric and the processing type. <!-- end-model-doc -->
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
 * <li>{@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getProcessingType
 * <em>Processing Type</em>}</li>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#isTriggersSelfAdaptations
 * <em>Triggers Self Adaptations</em>}</li>
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
     *        "http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.processingType.oclIsKindOf(Aggregation) then self.monitor.entityName + \':\' +self.processingType.toString()+\'(\' + self.processingType.oclAsType(Aggregation).statisticalCharacterization.toString() +\')\' else self.monitor.entityName + \': \' + self.processingType.toString() endif'"
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
     * Returns the value of the '<em><b>Processing Type</b></em>' containment reference. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.monitorrepository.ProcessingType#getMeasurementSpecification
     * <em>Measurement Specification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
     * begin-model-doc --> This attribute specifies in what way measurements shall be further
     * processed or aggregated (besides or before being recorded) upon reception. <!-- end-model-doc
     * -->
     *
     * @return the value of the '<em>Processing Type</em>' containment reference.
     * @see #setProcessingType(ProcessingType)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getMeasurementSpecification_ProcessingType()
     * @see org.palladiosimulator.monitorrepository.ProcessingType#getMeasurementSpecification
     * @model opposite="measurementSpecification" containment="true" required="true"
     * @generated
     */
    ProcessingType getProcessingType();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getProcessingType
     * <em>Processing Type</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @param value
     *            the new value of the '<em>Processing Type</em>' containment reference.
     * @see #getProcessingType()
     * @generated
     */
    void setProcessingType(ProcessingType value);

    /**
     * Returns the value of the '<em><b>Triggers Self Adaptations</b></em>' attribute. The default
     * value is <code>"true"</code>. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Triggers Self Adaptations</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Triggers Self Adaptations</em>' attribute.
     * @see #setTriggersSelfAdaptations(boolean)
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getMeasurementSpecification_TriggersSelfAdaptations()
     * @model default="true"
     * @generated
     */
    boolean isTriggersSelfAdaptations();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#isTriggersSelfAdaptations
     * <em>Triggers Self Adaptations</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param value
     *            the new value of the '<em>Triggers Self Adaptations</em>' attribute.
     * @see #isTriggersSelfAdaptations()
     * @generated
     */
    void setTriggersSelfAdaptations(boolean value);

} // MeasurementSpecification
