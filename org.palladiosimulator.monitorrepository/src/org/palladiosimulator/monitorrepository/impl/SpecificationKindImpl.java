/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.SpecificationKind;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Specification Kind</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.SpecificationKindImpl#getMeasurementSpecification
 * <em>Measurement Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpecificationKindImpl extends IdentifierImpl implements SpecificationKind {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SpecificationKindImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.SPECIFICATION_KIND;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MeasurementSpecification getMeasurementSpecification() {
        return (MeasurementSpecification) this.eDynamicGet(
                MonitorRepositoryPackage.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION,
                MonitorRepositoryPackage.Literals.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetMeasurementSpecification(
            final MeasurementSpecification newMeasurementSpecification, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newMeasurementSpecification,
                MonitorRepositoryPackage.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMeasurementSpecification(final MeasurementSpecification newMeasurementSpecification) {
        this.eDynamicSet(MonitorRepositoryPackage.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION,
                MonitorRepositoryPackage.Literals.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION,
                newMeasurementSpecification);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MonitorRepositoryPackage.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetMeasurementSpecification((MeasurementSpecification) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
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
        case MonitorRepositoryPackage.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION:
            return this.basicSetMeasurementSpecification(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
        switch (this.eContainerFeatureID()) {
        case MonitorRepositoryPackage.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION:
            return this.eInternalContainer().eInverseRemove(this,
                    MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND,
                    MeasurementSpecification.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MonitorRepositoryPackage.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION:
            return this.getMeasurementSpecification();
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
        case MonitorRepositoryPackage.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION:
            this.setMeasurementSpecification((MeasurementSpecification) newValue);
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
        case MonitorRepositoryPackage.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION:
            this.setMeasurementSpecification((MeasurementSpecification) null);
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
        case MonitorRepositoryPackage.SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION:
            return this.getMeasurementSpecification() != null;
        }
        return super.eIsSet(featureID);
    }

} // SpecificationKindImpl
