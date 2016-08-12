/**
 */
package org.palladiosimulator.monitorrepository.map;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.measurementframework.MeasuringValue;

import org.palladiosimulator.metricspec.MetricDescription;

import org.palladiosimulator.monitorrepository.ProcessingType;

import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ProcessingType which specifies that a mapping (i.e., some sort of transformation function) shall be applied to every measurement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.monitorrepository.map.Map#getOutputMetricDescription <em>Output Metric Description</em>}</li>
 *   <li>{@link org.palladiosimulator.monitorrepository.map.Map#getMapper <em>Mapper</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.map.MapPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends EObject, ProcessingType, NamedElement {
    /**
     * Returns the value of the '<em><b>Output Metric Description</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Output Metric Description</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Output Metric Description</em>' reference.
     * @see #setOutputMetricDescription(MetricDescription)
     * @see org.palladiosimulator.monitorrepository.map.MapPackage#getMap_OutputMetricDescription()
     * @model
     * @generated
     */
    MetricDescription getOutputMetricDescription();

    /**
     * Sets the value of the '{@link org.palladiosimulator.monitorrepository.map.Map#getOutputMetricDescription <em>Output Metric Description</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output Metric Description</em>' reference.
     * @see #getOutputMetricDescription()
     * @generated
     */
    void setOutputMetricDescription(MetricDescription value);

    /**
     * Returns the value of the '<em><b>Mapper</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.palladiosimulator.monitorrepository.map.Mapper#getMap <em>Map</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mapper</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mapper</em>' containment reference.
     * @see #setMapper(Mapper)
     * @see org.palladiosimulator.monitorrepository.map.MapPackage#getMap_Mapper()
     * @see org.palladiosimulator.monitorrepository.map.Mapper#getMap
     * @model opposite="map" containment="true"
     * @generated
     */
    Mapper getMapper();

    /**
     * Sets the value of the '{@link org.palladiosimulator.monitorrepository.map.Map#getMapper <em>Mapper</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mapper</em>' containment reference.
     * @see #getMapper()
     * @generated
     */
    void setMapper(Mapper value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Applies the mapping function provided by the associated <code>mapper</code> to the given measurement.
     * <!-- end-model-doc -->
     * @model dataType="org.palladiosimulator.monitorrepository.map.util.MeasuringValue" newMeasurementDataType="org.palladiosimulator.monitorrepository.map.util.MeasuringValue"
     *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getMapper().getMappingFunction().apply(newMeasurement);'"
     * @generated
     */
    MeasuringValue apply(MeasuringValue newMeasurement);

} // Map
