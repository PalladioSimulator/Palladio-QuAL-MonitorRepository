/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.monitorrepository.Aggregation;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.StatisticalCharacterization;
import org.palladiosimulator.monitorrepository.TimeDrivenAggregation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Time Driven Aggregation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.TimeDrivenAggregationImpl#getStatisticalCharacterization
 * <em>Statistical Characterization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeDrivenAggregationImpl extends TimeDrivenImpl implements TimeDrivenAggregation {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected TimeDrivenAggregationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.TIME_DRIVEN_AGGREGATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public StatisticalCharacterization getStatisticalCharacterization() {
        return (StatisticalCharacterization) this.eDynamicGet(
                MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION,
                MonitorRepositoryPackage.Literals.AGGREGATION__STATISTICAL_CHARACTERIZATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetStatisticalCharacterization(
            final StatisticalCharacterization newStatisticalCharacterization, NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newStatisticalCharacterization,
                MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setStatisticalCharacterization(final StatisticalCharacterization newStatisticalCharacterization) {
        this.eDynamicSet(MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION,
                MonitorRepositoryPackage.Literals.AGGREGATION__STATISTICAL_CHARACTERIZATION,
                newStatisticalCharacterization);
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
        case MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION:
            return this.basicSetStatisticalCharacterization(null, msgs);
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
        case MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION:
            return this.getStatisticalCharacterization();
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
        case MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION:
            this.setStatisticalCharacterization((StatisticalCharacterization) newValue);
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
        case MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION:
            this.setStatisticalCharacterization((StatisticalCharacterization) null);
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
        case MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION:
            return this.getStatisticalCharacterization() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(final int derivedFeatureID, final Class<?> baseClass) {
        if (baseClass == Aggregation.class) {
            switch (derivedFeatureID) {
            case MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION:
                return MonitorRepositoryPackage.AGGREGATION__STATISTICAL_CHARACTERIZATION;
            default:
                return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(final int baseFeatureID, final Class<?> baseClass) {
        if (baseClass == Aggregation.class) {
            switch (baseFeatureID) {
            case MonitorRepositoryPackage.AGGREGATION__STATISTICAL_CHARACTERIZATION:
                return MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION;
            default:
                return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} // TimeDrivenAggregationImpl
