/**
 */
package org.palladiosimulator.monitorrepository.map.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.monitorrepository.map.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapFactoryImpl extends EFactoryImpl implements MapFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MapFactory init() {
        try {
            MapFactory theMapFactory = (MapFactory)EPackage.Registry.INSTANCE.getEFactory(MapPackage.eNS_URI);
            if (theMapFactory != null) {
                return theMapFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MapFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MapFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case MapPackage.MAP: return createMap();
            case MapPackage.EXPONENTIAL_SMOOTHING: return createExponentialSmoothing();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map createMap() {
        MapImpl map = new MapImpl();
        return map;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExponentialSmoothing createExponentialSmoothing() {
        ExponentialSmoothingImpl exponentialSmoothing = new ExponentialSmoothingImpl();
        return exponentialSmoothing;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MapPackage getMapPackage() {
        return (MapPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MapPackage getPackage() {
        return MapPackage.eINSTANCE;
    }

} //MapFactoryImpl
