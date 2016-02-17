/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.RetrospectiveCharacterization;
import org.palladiosimulator.monitorrepository.VariableSizeAggregation;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Variable Size Aggregation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.VariableSizeAggregationImpl#getRetrospection
 * <em>Retrospection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableSizeAggregationImpl extends AggregationImpl implements VariableSizeAggregation {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected VariableSizeAggregationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.VARIABLE_SIZE_AGGREGATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RetrospectiveCharacterization getRetrospection() {
        return (RetrospectiveCharacterization) this.eDynamicGet(
                MonitorRepositoryPackage.VARIABLE_SIZE_AGGREGATION__RETROSPECTION,
                MonitorRepositoryPackage.Literals.VARIABLE_SIZE_AGGREGATION__RETROSPECTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRetrospection(final RetrospectiveCharacterization newRetrospection,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newRetrospection,
                MonitorRepositoryPackage.VARIABLE_SIZE_AGGREGATION__RETROSPECTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRetrospection(final RetrospectiveCharacterization newRetrospection) {
        this.eDynamicSet(MonitorRepositoryPackage.VARIABLE_SIZE_AGGREGATION__RETROSPECTION,
                MonitorRepositoryPackage.Literals.VARIABLE_SIZE_AGGREGATION__RETROSPECTION, newRetrospection);
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
        case MonitorRepositoryPackage.VARIABLE_SIZE_AGGREGATION__RETROSPECTION:
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
        case MonitorRepositoryPackage.VARIABLE_SIZE_AGGREGATION__RETROSPECTION:
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
        case MonitorRepositoryPackage.VARIABLE_SIZE_AGGREGATION__RETROSPECTION:
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
        case MonitorRepositoryPackage.VARIABLE_SIZE_AGGREGATION__RETROSPECTION:
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
        case MonitorRepositoryPackage.VARIABLE_SIZE_AGGREGATION__RETROSPECTION:
            return this.getRetrospection() != null;
        }
        return super.eIsSet(featureID);
    }

} // VariableSizeAggregationImpl
