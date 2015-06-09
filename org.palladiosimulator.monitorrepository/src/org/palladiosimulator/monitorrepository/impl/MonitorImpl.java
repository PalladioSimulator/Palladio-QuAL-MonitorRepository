/**
 */
package org.palladiosimulator.monitorrepository.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringPoint;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

import de.uka.ipd.sdq.pcm.core.entity.impl.EntityImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Monitor</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.MonitorImpl#getMeasurementSpecifications
 * <em>Measurement Specifications</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.MonitorImpl#getMeasuringPoint <em>
 * Measuring Point</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.MonitorImpl#getMonitorRepository <em>
 * Monitor Repository</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MonitorImpl extends EntityImpl implements Monitor {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MonitorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.MONITOR;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<MeasurementSpecification> getMeasurementSpecifications() {
        return (EList<MeasurementSpecification>) this.eDynamicGet(
                MonitorRepositoryPackage.MONITOR__MEASUREMENT_SPECIFICATIONS,
                MonitorRepositoryPackage.Literals.MONITOR__MEASUREMENT_SPECIFICATIONS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MeasuringPoint getMeasuringPoint() {
        return (MeasuringPoint) this.eDynamicGet(MonitorRepositoryPackage.MONITOR__MEASURING_POINT,
                MonitorRepositoryPackage.Literals.MONITOR__MEASURING_POINT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MeasuringPoint basicGetMeasuringPoint() {
        return (MeasuringPoint) this.eDynamicGet(MonitorRepositoryPackage.MONITOR__MEASURING_POINT,
                MonitorRepositoryPackage.Literals.MONITOR__MEASURING_POINT, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMeasuringPoint(final MeasuringPoint newMeasuringPoint) {
        this.eDynamicSet(MonitorRepositoryPackage.MONITOR__MEASURING_POINT,
                MonitorRepositoryPackage.Literals.MONITOR__MEASURING_POINT, newMeasuringPoint);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MonitorRepository getMonitorRepository() {
        return (MonitorRepository) this.eDynamicGet(MonitorRepositoryPackage.MONITOR__MONITOR_REPOSITORY,
                MonitorRepositoryPackage.Literals.MONITOR__MONITOR_REPOSITORY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetMonitorRepository(final MonitorRepository newMonitorRepository,
            NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newMonitorRepository,
                MonitorRepositoryPackage.MONITOR__MONITOR_REPOSITORY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMonitorRepository(final MonitorRepository newMonitorRepository) {
        this.eDynamicSet(MonitorRepositoryPackage.MONITOR__MONITOR_REPOSITORY,
                MonitorRepositoryPackage.Literals.MONITOR__MONITOR_REPOSITORY, newMonitorRepository);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MonitorRepositoryPackage.MONITOR__MEASUREMENT_SPECIFICATIONS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMeasurementSpecifications()).basicAdd(
                    otherEnd, msgs);
        case MonitorRepositoryPackage.MONITOR__MONITOR_REPOSITORY:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetMonitorRepository((MonitorRepository) otherEnd, msgs);
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
        case MonitorRepositoryPackage.MONITOR__MEASUREMENT_SPECIFICATIONS:
            return ((InternalEList<?>) this.getMeasurementSpecifications()).basicRemove(otherEnd, msgs);
        case MonitorRepositoryPackage.MONITOR__MONITOR_REPOSITORY:
            return this.basicSetMonitorRepository(null, msgs);
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
        case MonitorRepositoryPackage.MONITOR__MONITOR_REPOSITORY:
            return this.eInternalContainer().eInverseRemove(this,
                    MonitorRepositoryPackage.MONITOR_REPOSITORY__MONITORS, MonitorRepository.class, msgs);
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
        case MonitorRepositoryPackage.MONITOR__MEASUREMENT_SPECIFICATIONS:
            return this.getMeasurementSpecifications();
        case MonitorRepositoryPackage.MONITOR__MEASURING_POINT:
            if (resolve) {
                return this.getMeasuringPoint();
            }
            return this.basicGetMeasuringPoint();
        case MonitorRepositoryPackage.MONITOR__MONITOR_REPOSITORY:
            return this.getMonitorRepository();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MonitorRepositoryPackage.MONITOR__MEASUREMENT_SPECIFICATIONS:
            this.getMeasurementSpecifications().clear();
            this.getMeasurementSpecifications().addAll((Collection<? extends MeasurementSpecification>) newValue);
            return;
        case MonitorRepositoryPackage.MONITOR__MEASURING_POINT:
            this.setMeasuringPoint((MeasuringPoint) newValue);
            return;
        case MonitorRepositoryPackage.MONITOR__MONITOR_REPOSITORY:
            this.setMonitorRepository((MonitorRepository) newValue);
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
        case MonitorRepositoryPackage.MONITOR__MEASUREMENT_SPECIFICATIONS:
            this.getMeasurementSpecifications().clear();
            return;
        case MonitorRepositoryPackage.MONITOR__MEASURING_POINT:
            this.setMeasuringPoint((MeasuringPoint) null);
            return;
        case MonitorRepositoryPackage.MONITOR__MONITOR_REPOSITORY:
            this.setMonitorRepository((MonitorRepository) null);
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
        case MonitorRepositoryPackage.MONITOR__MEASUREMENT_SPECIFICATIONS:
            return !this.getMeasurementSpecifications().isEmpty();
        case MonitorRepositoryPackage.MONITOR__MEASURING_POINT:
            return this.basicGetMeasuringPoint() != null;
        case MonitorRepositoryPackage.MONITOR__MONITOR_REPOSITORY:
            return this.getMonitorRepository() != null;
        }
        return super.eIsSet(featureID);
    }

} // MonitorImpl
