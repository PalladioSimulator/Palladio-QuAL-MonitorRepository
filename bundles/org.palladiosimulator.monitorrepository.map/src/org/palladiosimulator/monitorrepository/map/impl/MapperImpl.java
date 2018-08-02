/**
 */
package org.palladiosimulator.monitorrepository.map.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;
import java.util.function.UnaryOperator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.monitorrepository.map.Map;
import org.palladiosimulator.monitorrepository.map.MapPackage;
import org.palladiosimulator.monitorrepository.map.Mapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.monitorrepository.map.impl.MapperImpl#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MapperImpl extends IdentifierImpl implements Mapper {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MapperImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MapPackage.Literals.MAPPER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map getMap() {
        if (eContainerFeatureID() != MapPackage.MAPPER__MAP) return null;
        return (Map)eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMap(Map newMap, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newMap, MapPackage.MAPPER__MAP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMap(Map newMap) {
        if (newMap != eInternalContainer() || (eContainerFeatureID() != MapPackage.MAPPER__MAP && newMap != null)) {
            if (EcoreUtil.isAncestor(this, newMap))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newMap != null)
                msgs = ((InternalEObject)newMap).eInverseAdd(this, MapPackage.MAP__MAPPER, Map.class, msgs);
            msgs = basicSetMap(newMap, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.MAPPER__MAP, newMap, newMap));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnaryOperator<MeasuringValue> getMappingFunction() {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case MapPackage.MAPPER__MAP:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetMap((Map)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case MapPackage.MAPPER__MAP:
                return basicSetMap(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case MapPackage.MAPPER__MAP:
                return eInternalContainer().eInverseRemove(this, MapPackage.MAP__MAPPER, Map.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MapPackage.MAPPER__MAP:
                return getMap();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MapPackage.MAPPER__MAP:
                setMap((Map)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MapPackage.MAPPER__MAP:
                setMap((Map)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MapPackage.MAPPER__MAP:
                return getMap() != null;
        }
        return super.eIsSet(featureID);
    }

} //MapperImpl
