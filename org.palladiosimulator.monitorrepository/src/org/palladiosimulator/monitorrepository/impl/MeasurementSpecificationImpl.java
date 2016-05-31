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
import org.palladiosimulator.monitorrepository.StatisticalCharacterizationEnum;
import org.palladiosimulator.monitorrepository.TemporalCharacterization;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Measurement Specification</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl#getTemporalRestriction
 * <em>Temporal Restriction</em>}</li>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl#getStatisticalCharacterization
 * <em>Statistical Characterization</em>}</li>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl#getMetricDescription
 * <em>Metric Description</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl#getMonitor
 * <em>Monitor</em>}</li>
 * <li>{@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl#getName
 * <em>Name</em>}</li>
 * <li>
 * {@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl#isTriggersSelfAdaptations
 * <em>Triggers Self Adaptations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementSpecificationImpl extends IdentifierImpl implements MeasurementSpecification {

    /**
     * The default value of the '{@link #getStatisticalCharacterization()
     * <em>Statistical Characterization</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getStatisticalCharacterization()
     * @generated
     * @ordered
     */
    protected static final StatisticalCharacterizationEnum STATISTICAL_CHARACTERIZATION_EDEFAULT = StatisticalCharacterizationEnum.NONE;

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
     * The default value of the '{@link #isTriggersSelfAdaptations()
     * <em>Triggers Self Adaptations</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isTriggersSelfAdaptations()
     * @generated
     * @ordered
     */
    protected static final boolean TRIGGERS_SELF_ADAPTATIONS_EDEFAULT = true;

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
    public TemporalCharacterization getTemporalRestriction() {
        return (TemporalCharacterization) this.eDynamicGet(
                MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TEMPORAL_RESTRICTION,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__TEMPORAL_RESTRICTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetTemporalRestriction(final TemporalCharacterization newTemporalRestriction,
            NotificationChain msgs) {
        msgs = this.eDynamicInverseAdd((InternalEObject) newTemporalRestriction,
                MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TEMPORAL_RESTRICTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTemporalRestriction(final TemporalCharacterization newTemporalRestriction) {
        this.eDynamicSet(MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TEMPORAL_RESTRICTION,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__TEMPORAL_RESTRICTION,
                newTemporalRestriction);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StatisticalCharacterizationEnum getStatisticalCharacterization() {
        return (StatisticalCharacterizationEnum) this.eDynamicGet(
                MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__STATISTICAL_CHARACTERIZATION,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__STATISTICAL_CHARACTERIZATION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setStatisticalCharacterization(final StatisticalCharacterizationEnum newStatisticalCharacterization) {
        this.eDynamicSet(MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__STATISTICAL_CHARACTERIZATION,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__STATISTICAL_CHARACTERIZATION,
                newStatisticalCharacterization);
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
    public boolean isTriggersSelfAdaptations() {
        return (Boolean) this.eDynamicGet(MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTriggersSelfAdaptations(final boolean newTriggersSelfAdaptations) {
        this.eDynamicSet(MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS,
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS,
                newTriggersSelfAdaptations);
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
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TEMPORAL_RESTRICTION:
            return this.basicSetTemporalRestriction(null, msgs);
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            return this.basicSetMonitor(null, msgs);
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
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TEMPORAL_RESTRICTION:
            return this.getTemporalRestriction();
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__STATISTICAL_CHARACTERIZATION:
            return this.getStatisticalCharacterization();
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION:
            if (resolve) {
                return this.getMetricDescription();
            }
            return this.basicGetMetricDescription();
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            return this.getMonitor();
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__NAME:
            return this.getName();
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS:
            return this.isTriggersSelfAdaptations();
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
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TEMPORAL_RESTRICTION:
            this.setTemporalRestriction((TemporalCharacterization) newValue);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__STATISTICAL_CHARACTERIZATION:
            this.setStatisticalCharacterization((StatisticalCharacterizationEnum) newValue);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION:
            this.setMetricDescription((MetricDescription) newValue);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            this.setMonitor((Monitor) newValue);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__NAME:
            this.setName((String) newValue);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS:
            this.setTriggersSelfAdaptations((Boolean) newValue);
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
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TEMPORAL_RESTRICTION:
            this.setTemporalRestriction((TemporalCharacterization) null);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__STATISTICAL_CHARACTERIZATION:
            this.setStatisticalCharacterization(STATISTICAL_CHARACTERIZATION_EDEFAULT);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION:
            this.setMetricDescription((MetricDescription) null);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            this.setMonitor((Monitor) null);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__NAME:
            this.NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS:
            this.setTriggersSelfAdaptations(TRIGGERS_SELF_ADAPTATIONS_EDEFAULT);
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
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TEMPORAL_RESTRICTION:
            return this.getTemporalRestriction() != null;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__STATISTICAL_CHARACTERIZATION:
            return this.getStatisticalCharacterization() != STATISTICAL_CHARACTERIZATION_EDEFAULT;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION:
            return this.basicGetMetricDescription() != null;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__MONITOR:
            return this.getMonitor() != null;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__NAME:
            return this.NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS:
            return this.isTriggersSelfAdaptations() != TRIGGERS_SELF_ADAPTATIONS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // MeasurementSpecificationImpl
