/**
 */
package org.palladiosimulator.monitorrepository.map;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.monitorrepository.map.MapPackage
 * @generated
 */
public interface MapFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MapFactory eINSTANCE = org.palladiosimulator.monitorrepository.map.impl.MapFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Map</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Map</em>'.
     * @generated
     */
    Map createMap();

    /**
     * Returns a new object of class '<em>Exponential Smoothing</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exponential Smoothing</em>'.
     * @generated
     */
    ExponentialSmoothing createExponentialSmoothing();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    MapPackage getMapPackage();

} //MapFactory
