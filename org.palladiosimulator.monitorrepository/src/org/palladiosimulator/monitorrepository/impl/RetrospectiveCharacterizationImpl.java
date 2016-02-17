/**
 */
package org.palladiosimulator.monitorrepository.impl;

import javax.measure.Measure;
import javax.measure.quantity.Duration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.RetrospectiveCharacterization;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Retrospective Characterization</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.RetrospectiveCharacterizationImpl#getRetrospectionLength
 * <em>Retrospection Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetrospectiveCharacterizationImpl extends CDOObjectImpl implements RetrospectiveCharacterization {
    /**
     * The default value of the '{@link #getRetrospectionLength() <em>Retrospection Length</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRetrospectionLength()
     * @generated
     * @ordered
     */
    protected static final double RETROSPECTION_LENGTH_EDEFAULT = 10.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RetrospectiveCharacterizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.RETROSPECTIVE_CHARACTERIZATION;
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
    public double getRetrospectionLength() {
        return (Double) this.eDynamicGet(MonitorRepositoryPackage.RETROSPECTIVE_CHARACTERIZATION__RETROSPECTION_LENGTH,
                MonitorRepositoryPackage.Literals.RETROSPECTIVE_CHARACTERIZATION__RETROSPECTION_LENGTH, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRetrospectionLength(final double newRetrospectionLength) {
        this.eDynamicSet(MonitorRepositoryPackage.RETROSPECTIVE_CHARACTERIZATION__RETROSPECTION_LENGTH,
                MonitorRepositoryPackage.Literals.RETROSPECTIVE_CHARACTERIZATION__RETROSPECTION_LENGTH,
                newRetrospectionLength);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Measure<Double, Duration> getRetrospectionLengthAsMeasure() {
        return Measure.valueOf(this.getRetrospectionLength(), javax.measure.unit.SI.SECOND);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MonitorRepositoryPackage.RETROSPECTIVE_CHARACTERIZATION__RETROSPECTION_LENGTH:
            return this.getRetrospectionLength();
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
        case MonitorRepositoryPackage.RETROSPECTIVE_CHARACTERIZATION__RETROSPECTION_LENGTH:
            this.setRetrospectionLength((Double) newValue);
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
        case MonitorRepositoryPackage.RETROSPECTIVE_CHARACTERIZATION__RETROSPECTION_LENGTH:
            this.setRetrospectionLength(RETROSPECTION_LENGTH_EDEFAULT);
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
        case MonitorRepositoryPackage.RETROSPECTIVE_CHARACTERIZATION__RETROSPECTION_LENGTH:
            return this.getRetrospectionLength() != RETROSPECTION_LENGTH_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // RetrospectiveCharacterizationImpl
