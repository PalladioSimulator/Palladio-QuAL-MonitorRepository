/**
 */
package org.palladiosimulator.monitorrepository.map;

import de.uka.ipd.sdq.identifier.Identifier;
import java.util.function.UnaryOperator;
import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.measurementframework.MeasuringValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.monitorrepository.map.Mapper#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.monitorrepository.map.MapPackage#getMapper()
 * @model abstract="true"
 * @generated
 */
public interface Mapper extends EObject, Identifier {
    /**
     * Returns the value of the '<em><b>Map</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.palladiosimulator.monitorrepository.map.Map#getMapper <em>Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Map</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Map</em>' container reference.
     * @see #setMap(Map)
     * @see org.palladiosimulator.monitorrepository.map.MapPackage#getMapper_Map()
     * @see org.palladiosimulator.monitorrepository.map.Map#getMapper
     * @model opposite="mapper" transient="false"
     * @generated
     */
    Map getMap();

    /**
     * Sets the value of the '{@link org.palladiosimulator.monitorrepository.map.Mapper#getMap <em>Map</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Map</em>' container reference.
     * @see #getMap()
     * @generated
     */
    void setMap(Map value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation" dataType="org.palladiosimulator.monitorrepository.map.util.Func<org.palladiosimulator.monitorrepository.map.util.MeasuringValue>"
     * @generated
     */
    UnaryOperator<MeasuringValue> getMappingFunction();

} // Mapper
