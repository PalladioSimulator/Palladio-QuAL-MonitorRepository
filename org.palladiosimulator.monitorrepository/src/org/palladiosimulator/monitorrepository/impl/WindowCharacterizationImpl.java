/**
 */
package org.palladiosimulator.monitorrepository.impl;

import javax.measure.Measure;
import javax.measure.quantity.Duration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.WindowCharacterization;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Window Characterization</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.WindowCharacterizationImpl#getWindowLength
 * <em>Window Length</em>}</li>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.WindowCharacterizationImpl#getWindowIncrement
 * <em>Window Increment</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.WindowCharacterizationImpl#getName
 * <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindowCharacterizationImpl extends CDOObjectImpl implements WindowCharacterization {
    /**
     * The default value of the '{@link #getWindowLength() <em>Window Length</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWindowLength()
     * @generated
     * @ordered
     */
    protected static final double WINDOW_LENGTH_EDEFAULT = 10.0;

    /**
     * The default value of the '{@link #getWindowIncrement() <em>Window Increment</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWindowIncrement()
     * @generated
     * @ordered
     */
    protected static final double WINDOW_INCREMENT_EDEFAULT = 10.0;

    /**
     * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal) MonitorRepositoryPackage.Literals.WINDOW_CHARACTERIZATION__NAME)
            .getSettingDelegate();

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected WindowCharacterizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.WINDOW_CHARACTERIZATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getWindowLength() {
        return (Double) this.eDynamicGet(MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_LENGTH,
                MonitorRepositoryPackage.Literals.WINDOW_CHARACTERIZATION__WINDOW_LENGTH, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWindowLength(final double newWindowLength) {
        this.eDynamicSet(MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_LENGTH,
                MonitorRepositoryPackage.Literals.WINDOW_CHARACTERIZATION__WINDOW_LENGTH, newWindowLength);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getWindowIncrement() {
        return (Double) this.eDynamicGet(MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_INCREMENT,
                MonitorRepositoryPackage.Literals.WINDOW_CHARACTERIZATION__WINDOW_INCREMENT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setWindowIncrement(final double newWindowIncrement) {
        this.eDynamicSet(MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_INCREMENT,
                MonitorRepositoryPackage.Literals.WINDOW_CHARACTERIZATION__WINDOW_INCREMENT, newWindowIncrement);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getName() {
        return (String) this.eDynamicGet(MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__NAME,
                MonitorRepositoryPackage.Literals.WINDOW_CHARACTERIZATION__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure<Double, Duration> getWindowLengthAsMeasure() {
        return Measure.valueOf(this.getWindowLength(), javax.measure.unit.SI.SECOND);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure<Double, Duration> getWindowIncrementAsMeasure() {
        return Measure.valueOf(this.getWindowIncrement(), javax.measure.unit.SI.SECOND);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_LENGTH:
            return this.getWindowLength();
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_INCREMENT:
            return this.getWindowIncrement();
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__NAME:
            return this.getName();
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
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_LENGTH:
            this.setWindowLength((Double) newValue);
            return;
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_INCREMENT:
            this.setWindowIncrement((Double) newValue);
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
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_LENGTH:
            this.setWindowLength(WINDOW_LENGTH_EDEFAULT);
            return;
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_INCREMENT:
            this.setWindowIncrement(WINDOW_INCREMENT_EDEFAULT);
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
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_LENGTH:
            return this.getWindowLength() != WINDOW_LENGTH_EDEFAULT;
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__WINDOW_INCREMENT:
            return this.getWindowIncrement() != WINDOW_INCREMENT_EDEFAULT;
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION__NAME:
            return this.NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
        }
        return super.eIsSet(featureID);
    }

} // WindowCharacterizationImpl
