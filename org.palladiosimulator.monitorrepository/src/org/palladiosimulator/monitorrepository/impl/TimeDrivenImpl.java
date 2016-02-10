/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.TimeDriven;
import org.palladiosimulator.monitorrepository.WindowCharacterization;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Time Driven</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.TimeDrivenImpl#getWindowCharacterization
 * <em>Window Characterization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeDrivenImpl extends SpecificationKindImpl implements TimeDriven {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TimeDrivenImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.TIME_DRIVEN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public WindowCharacterization getWindowCharacterization() {
        return (WindowCharacterization) this.eDynamicGet(MonitorRepositoryPackage.TIME_DRIVEN__WINDOW_CHARACTERIZATION,
                MonitorRepositoryPackage.Literals.TIME_DRIVEN__WINDOW_CHARACTERIZATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetWindowCharacterization(final WindowCharacterization newWindowCharacterization,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newWindowCharacterization,
                MonitorRepositoryPackage.TIME_DRIVEN__WINDOW_CHARACTERIZATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setWindowCharacterization(final WindowCharacterization newWindowCharacterization) {
        this.eDynamicSet(MonitorRepositoryPackage.TIME_DRIVEN__WINDOW_CHARACTERIZATION,
                MonitorRepositoryPackage.Literals.TIME_DRIVEN__WINDOW_CHARACTERIZATION, newWindowCharacterization);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case MonitorRepositoryPackage.TIME_DRIVEN__WINDOW_CHARACTERIZATION:
            return this.basicSetWindowCharacterization(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MonitorRepositoryPackage.TIME_DRIVEN__WINDOW_CHARACTERIZATION:
            return this.getWindowCharacterization();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MonitorRepositoryPackage.TIME_DRIVEN__WINDOW_CHARACTERIZATION:
            this.setWindowCharacterization((WindowCharacterization) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case MonitorRepositoryPackage.TIME_DRIVEN__WINDOW_CHARACTERIZATION:
            this.setWindowCharacterization((WindowCharacterization) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case MonitorRepositoryPackage.TIME_DRIVEN__WINDOW_CHARACTERIZATION:
            return this.getWindowCharacterization() != null;
        }
        return super.eIsSet(featureID);
    }

} // TimeDrivenImpl
