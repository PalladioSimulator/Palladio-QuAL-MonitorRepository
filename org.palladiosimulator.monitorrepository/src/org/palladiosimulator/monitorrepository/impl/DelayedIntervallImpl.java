/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.monitorrepository.DelayedIntervall;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Delayed Intervall</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.DelayedIntervallImpl#getDelay
 * <em>Delay</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelayedIntervallImpl extends IntervallImpl implements DelayedIntervall {

    /**
     * The default value of the '{@link #getDelay() <em>Delay</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getDelay()
     * @generated
     * @ordered
     */
    protected static final double DELAY_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DelayedIntervallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.DELAYED_INTERVALL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getDelay() {
        return (Double) this.eDynamicGet(MonitorRepositoryPackage.DELAYED_INTERVALL__DELAY,
                MonitorRepositoryPackage.Literals.DELAYED_INTERVALL__DELAY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDelay(final double newDelay) {
        this.eDynamicSet(MonitorRepositoryPackage.DELAYED_INTERVALL__DELAY,
                MonitorRepositoryPackage.Literals.DELAYED_INTERVALL__DELAY, newDelay);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MonitorRepositoryPackage.DELAYED_INTERVALL__DELAY:
            return this.getDelay();
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
        case MonitorRepositoryPackage.DELAYED_INTERVALL__DELAY:
            this.setDelay((Double) newValue);
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
        case MonitorRepositoryPackage.DELAYED_INTERVALL__DELAY:
            this.setDelay(DELAY_EDEFAULT);
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
        case MonitorRepositoryPackage.DELAYED_INTERVALL__DELAY:
            return this.getDelay() != DELAY_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // DelayedIntervallImpl
