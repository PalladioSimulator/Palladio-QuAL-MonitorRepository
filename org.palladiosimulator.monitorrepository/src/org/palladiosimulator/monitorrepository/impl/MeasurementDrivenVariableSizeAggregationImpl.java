/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.monitorrepository.MeasurementDrivenVariableSizeAggregation;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.RetrospectiveCharacterization;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Measurement Driven Variable Size Aggregation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.MeasurementDrivenVariableSizeAggregationImpl#getRetrospection
 * <em>Retrospection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementDrivenVariableSizeAggregationImpl extends AggregationImpl
        implements MeasurementDrivenVariableSizeAggregation {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MeasurementDrivenVariableSizeAggregationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public RetrospectiveCharacterization getRetrospection() {
        return (RetrospectiveCharacterization) this.eDynamicGet(
                MonitorRepositoryPackage.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION,
                MonitorRepositoryPackage.Literals.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION, true,
                true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetRetrospection(final RetrospectiveCharacterization newRetrospection,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newRetrospection,
                MonitorRepositoryPackage.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setRetrospection(final RetrospectiveCharacterization newRetrospection) {
        this.eDynamicSet(MonitorRepositoryPackage.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION,
                MonitorRepositoryPackage.Literals.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION,
                newRetrospection);
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
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION:
            return this.basicSetRetrospection(null, msgs);
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
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION:
            return this.getRetrospection();
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
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION:
            this.setRetrospection((RetrospectiveCharacterization) newValue);
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
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION:
            this.setRetrospection((RetrospectiveCharacterization) null);
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
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION:
            return this.getRetrospection() != null;
        }
        return super.eIsSet(featureID);
    }

} // MeasurementDrivenVariableSizeAggregationImpl
