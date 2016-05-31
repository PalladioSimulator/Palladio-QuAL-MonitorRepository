/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.monitorrepository.Intervall;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Intervall</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.IntervallImpl#getIntervall
 * <em>Intervall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervallImpl extends TemporalCharacterizationImpl implements Intervall {

    /**
     * The default value of the '{@link #getIntervall() <em>Intervall</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIntervall()
     * @generated
     * @ordered
     */
    protected static final double INTERVALL_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IntervallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.INTERVALL;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getIntervall() {
        return (Double) this.eDynamicGet(MonitorRepositoryPackage.INTERVALL__INTERVALL,
                MonitorRepositoryPackage.Literals.INTERVALL__INTERVALL, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIntervall(final double newIntervall) {
        this.eDynamicSet(MonitorRepositoryPackage.INTERVALL__INTERVALL,
                MonitorRepositoryPackage.Literals.INTERVALL__INTERVALL, newIntervall);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MonitorRepositoryPackage.INTERVALL__INTERVALL:
            return this.getIntervall();
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
        case MonitorRepositoryPackage.INTERVALL__INTERVALL:
            this.setIntervall((Double) newValue);
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
        case MonitorRepositoryPackage.INTERVALL__INTERVALL:
            this.setIntervall(INTERVALL_EDEFAULT);
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
        case MonitorRepositoryPackage.INTERVALL__INTERVALL:
            return this.getIntervall() != INTERVALL_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // IntervallImpl
