/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.monitorrepository.FixedSizeAggregation;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Fixed Size Aggregation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.FixedSizeAggregationImpl#getNumberOfMeasurements
 * <em>Number Of Measurements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedSizeAggregationImpl extends MeasurementDrivenAggregationImpl implements FixedSizeAggregation {
    /**
     * The default value of the '{@link #getNumberOfMeasurements() <em>Number Of Measurements</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getNumberOfMeasurements()
     * @generated
     * @ordered
     */
    protected static final int NUMBER_OF_MEASUREMENTS_EDEFAULT = 10;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected FixedSizeAggregationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.FIXED_SIZE_AGGREGATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getNumberOfMeasurements() {
        return (Integer) this.eDynamicGet(MonitorRepositoryPackage.FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS,
                MonitorRepositoryPackage.Literals.FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setNumberOfMeasurements(final int newNumberOfMeasurements) {
        this.eDynamicSet(MonitorRepositoryPackage.FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS,
                MonitorRepositoryPackage.Literals.FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS,
                newNumberOfMeasurements);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MonitorRepositoryPackage.FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS:
            return this.getNumberOfMeasurements();
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
        case MonitorRepositoryPackage.FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS:
            this.setNumberOfMeasurements((Integer) newValue);
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
        case MonitorRepositoryPackage.FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS:
            this.setNumberOfMeasurements(NUMBER_OF_MEASUREMENTS_EDEFAULT);
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
        case MonitorRepositoryPackage.FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS:
            return this.getNumberOfMeasurements() != NUMBER_OF_MEASUREMENTS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // FixedSizeAggregationImpl
