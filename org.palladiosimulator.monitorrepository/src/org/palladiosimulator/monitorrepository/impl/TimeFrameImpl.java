/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.TimeFrame;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Time Frame</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.TimeFrameImpl#getStart <em>Start</em>}
 * </li>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.TimeFrameImpl#getStop <em>Stop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeFrameImpl extends TemporalCharacterizationImpl implements TimeFrame {

    /**
     * The default value of the '{@link #getStart() <em>Start</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getStart()
     * @generated
     * @ordered
     */
    protected static final double START_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #getStop() <em>Stop</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getStop()
     * @generated
     * @ordered
     */
    protected static final double STOP_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TimeFrameImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.TIME_FRAME;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getStart() {
        return (Double) this.eDynamicGet(MonitorRepositoryPackage.TIME_FRAME__START,
                MonitorRepositoryPackage.Literals.TIME_FRAME__START, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStart(final double newStart) {
        this.eDynamicSet(MonitorRepositoryPackage.TIME_FRAME__START,
                MonitorRepositoryPackage.Literals.TIME_FRAME__START, newStart);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getStop() {
        return (Double) this.eDynamicGet(MonitorRepositoryPackage.TIME_FRAME__STOP,
                MonitorRepositoryPackage.Literals.TIME_FRAME__STOP, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStop(final double newStop) {
        this.eDynamicSet(MonitorRepositoryPackage.TIME_FRAME__STOP, MonitorRepositoryPackage.Literals.TIME_FRAME__STOP,
                newStop);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MonitorRepositoryPackage.TIME_FRAME__START:
            return this.getStart();
        case MonitorRepositoryPackage.TIME_FRAME__STOP:
            return this.getStop();
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
        case MonitorRepositoryPackage.TIME_FRAME__START:
            this.setStart((Double) newValue);
            return;
        case MonitorRepositoryPackage.TIME_FRAME__STOP:
            this.setStop((Double) newValue);
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
        case MonitorRepositoryPackage.TIME_FRAME__START:
            this.setStart(START_EDEFAULT);
            return;
        case MonitorRepositoryPackage.TIME_FRAME__STOP:
            this.setStop(STOP_EDEFAULT);
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
        case MonitorRepositoryPackage.TIME_FRAME__START:
            return this.getStart() != START_EDEFAULT;
        case MonitorRepositoryPackage.TIME_FRAME__STOP:
            return this.getStop() != STOP_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // TimeFrameImpl
