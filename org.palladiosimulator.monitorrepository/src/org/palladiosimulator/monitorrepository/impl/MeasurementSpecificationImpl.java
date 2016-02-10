/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.SpecificationKind;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Measurement Specification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl#getMetricDescription
 * <em>Metric Description</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl#getMonitor
 * <em>Monitor</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl#getSpecificationKind
 * <em>Specification Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementSpecificationImpl extends IdentifierImpl implements MeasurementSpecification {
    /**
     * The cached setting delegate for the '{@link #getName() <em>Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getName()
     * @generated
     * @ordered
     */
    protected EStructuralFeature.Internal.SettingDelegate NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal) MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__NAME)
            .getSettingDelegate();

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MeasurementSpecificationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MetricDescription getMetricDescription() {
        return (MetricDescription) this.eDynamicGet(
                MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MetricDescription basicGetMetricDescription() {
        return (MetricDescription) this.eDynamicGet(
                MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION, false, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMetricDescription(final MetricDescription newMetricDescription) {
        this.eDynamicSet(MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION, newMetricDescription);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Monitor getMonitor() {
        return (Monitor) this.eDynamicGet(MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__MONITOR, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetMonitor(final Monitor newMonitor, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newMonitor,
                MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setMonitor(final Monitor newMonitor) {
        this.eDynamicSet(MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__MONITOR, newMonitor);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getName() {
        return (String) this.eDynamicGet(MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__NAME,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setName(final String newName) {
        this.eDynamicSet(MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__NAME,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__NAME, newName);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SpecificationKind getSpecificationKind() {
        return (SpecificationKind) this.eDynamicGet(
                MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetSpecificationKind(final SpecificationKind newSpecificationKind,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newSpecificationKind,
                MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setSpecificationKind(final SpecificationKind newSpecificationKind) {
        this.eDynamicSet(MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND, newSpecificationKind);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetMonitor((Monitor) otherEnd, msgs);
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND:
            final SpecificationKind specificationKind = this.getSpecificationKind();
            if (specificationKind != null) {
                msgs = ((InternalEObject) specificationKind).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND,
                        null, msgs);
            }
            return this.basicSetSpecificationKind((SpecificationKind) otherEnd, msgs);
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
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            return this.basicSetMonitor(null, msgs);
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND:
            return this.basicSetSpecificationKind(null, msgs);
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
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            return this.eInternalContainer().eInverseRemove(this,
                    MonitorRepositoryPackage.MONITOR__MEASUREMENT_SPECIFICATIONS, Monitor.class, msgs);
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
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION:
            if (resolve) {
                return this.getMetricDescription();
            }
            return this.basicGetMetricDescription();
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            return this.getMonitor();
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__NAME:
            return this.getName();
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND:
            return this.getSpecificationKind();
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
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION:
            this.setMetricDescription((MetricDescription) newValue);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            this.setMonitor((Monitor) newValue);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__NAME:
            this.setName((String) newValue);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND:
            this.setSpecificationKind((SpecificationKind) newValue);
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
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION:
            this.setMetricDescription((MetricDescription) null);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            this.setMonitor((Monitor) null);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__NAME:
            this.NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND:
            this.setSpecificationKind((SpecificationKind) null);
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
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION:
            return this.basicGetMetricDescription() != null;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            return this.getMonitor() != null;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__NAME:
            return this.NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND:
            return this.getSpecificationKind() != null;
        }
        return super.eIsSet(featureID);
    }

} // MeasurementSpecificationImpl
