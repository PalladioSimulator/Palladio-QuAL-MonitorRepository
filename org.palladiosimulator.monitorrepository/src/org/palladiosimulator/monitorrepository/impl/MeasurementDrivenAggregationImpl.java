/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.monitorrepository.MeasurementDrivenAggregation;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Measurement Driven Aggregation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.MeasurementDrivenAggregationImpl#getFrequency
 * <em>Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MeasurementDrivenAggregationImpl extends AggregationImpl implements MeasurementDrivenAggregation {
    /**
     * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFrequency()
     * @generated
     * @ordered
     */
    protected static final int FREQUENCY_EDEFAULT = 1;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MeasurementDrivenAggregationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.MEASUREMENT_DRIVEN_AGGREGATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getFrequency() {
        return (Integer) this.eDynamicGet(MonitorRepositoryPackage.MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY,
                MonitorRepositoryPackage.Literals.MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setFrequency(final int newFrequency) {
        this.eDynamicSet(MonitorRepositoryPackage.MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY,
                MonitorRepositoryPackage.Literals.MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY, newFrequency);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY:
            return this.getFrequency();
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
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY:
            this.setFrequency((Integer) newValue);
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
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY:
            this.setFrequency(FREQUENCY_EDEFAULT);
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
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY:
            return this.getFrequency() != FREQUENCY_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // MeasurementDrivenAggregationImpl
