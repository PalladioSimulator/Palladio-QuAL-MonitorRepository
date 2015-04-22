/**
 */
package org.palladiosimulator.monitorrepository.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.pcm.PcmPackage;

import de.uka.ipd.sdq.pcm.core.entity.EntityPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;

import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;

import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;

import org.palladiosimulator.metricspec.MetricSpecPackage;

import org.palladiosimulator.monitorrepository.DelayedIntervall;
import org.palladiosimulator.monitorrepository.Intervall;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryFactory;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.StatisticalCharacterizationEnum;
import org.palladiosimulator.monitorrepository.TemporalCharacterization;
import org.palladiosimulator.monitorrepository.TimeFrame;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonitorRepositoryPackageImpl extends EPackageImpl implements MonitorRepositoryPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass monitorRepositoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass monitorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass measurementSpecificationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass temporalCharacterizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intervallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass delayedIntervallEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeFrameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum statisticalCharacterizationEnumEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MonitorRepositoryPackageImpl() {
        super(eNS_URI, MonitorRepositoryFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link MonitorRepositoryPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MonitorRepositoryPackage init() {
        if (isInited)
            return (MonitorRepositoryPackage) EPackage.Registry.INSTANCE.getEPackage(MonitorRepositoryPackage.eNS_URI);

        // Obtain or create and register package
        MonitorRepositoryPackageImpl theMonitorRepositoryPackage = (MonitorRepositoryPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof MonitorRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                : new MonitorRepositoryPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PcmPackage.eINSTANCE.eClass();
        ExperimentDataPackage.eINSTANCE.eClass();
        RepositoryPackage.eINSTANCE.eClass();
        MeasuringpointPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theMonitorRepositoryPackage.createPackageContents();

        // Initialize created meta-data
        theMonitorRepositoryPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMonitorRepositoryPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MonitorRepositoryPackage.eNS_URI, theMonitorRepositoryPackage);
        return theMonitorRepositoryPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMonitorRepository() {
        return monitorRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMonitorRepository_Monitors() {
        return (EReference) monitorRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMonitor() {
        return monitorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMonitor_MeasurementSpecifications() {
        return (EReference) monitorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMonitor_MeasuringPoint() {
        return (EReference) monitorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMonitor_MonitorRepository() {
        return (EReference) monitorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMeasurementSpecification() {
        return measurementSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMeasurementSpecification_TemporalRestriction() {
        return (EReference) measurementSpecificationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMeasurementSpecification_StatisticalCharacterization() {
        return (EAttribute) measurementSpecificationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMeasurementSpecification_MetricDescription() {
        return (EReference) measurementSpecificationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMeasurementSpecification_Monitor() {
        return (EReference) measurementSpecificationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMeasurementSpecification_Name() {
        return (EAttribute) measurementSpecificationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTemporalCharacterization() {
        return temporalCharacterizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntervall() {
        return intervallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIntervall_Intervall() {
        return (EAttribute) intervallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDelayedIntervall() {
        return delayedIntervallEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDelayedIntervall_Delay() {
        return (EAttribute) delayedIntervallEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeFrame() {
        return timeFrameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimeFrame_Start() {
        return (EAttribute) timeFrameEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTimeFrame_Stop() {
        return (EAttribute) timeFrameEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getStatisticalCharacterizationEnum() {
        return statisticalCharacterizationEnumEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonitorRepositoryFactory getMonitorRepositoryFactory() {
        return (MonitorRepositoryFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        monitorRepositoryEClass = createEClass(MONITOR_REPOSITORY);
        createEReference(monitorRepositoryEClass, MONITOR_REPOSITORY__MONITORS);

        monitorEClass = createEClass(MONITOR);
        createEReference(monitorEClass, MONITOR__MEASUREMENT_SPECIFICATIONS);
        createEReference(monitorEClass, MONITOR__MEASURING_POINT);
        createEReference(monitorEClass, MONITOR__MONITOR_REPOSITORY);

        measurementSpecificationEClass = createEClass(MEASUREMENT_SPECIFICATION);
        createEReference(measurementSpecificationEClass, MEASUREMENT_SPECIFICATION__TEMPORAL_RESTRICTION);
        createEAttribute(measurementSpecificationEClass, MEASUREMENT_SPECIFICATION__STATISTICAL_CHARACTERIZATION);
        createEReference(measurementSpecificationEClass, MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION);
        createEReference(measurementSpecificationEClass, MEASUREMENT_SPECIFICATION__MONITOR);
        createEAttribute(measurementSpecificationEClass, MEASUREMENT_SPECIFICATION__NAME);

        temporalCharacterizationEClass = createEClass(TEMPORAL_CHARACTERIZATION);

        intervallEClass = createEClass(INTERVALL);
        createEAttribute(intervallEClass, INTERVALL__INTERVALL);

        delayedIntervallEClass = createEClass(DELAYED_INTERVALL);
        createEAttribute(delayedIntervallEClass, DELAYED_INTERVALL__DELAY);

        timeFrameEClass = createEClass(TIME_FRAME);
        createEAttribute(timeFrameEClass, TIME_FRAME__START);
        createEAttribute(timeFrameEClass, TIME_FRAME__STOP);

        // Create enums
        statisticalCharacterizationEnumEEnum = createEEnum(STATISTICAL_CHARACTERIZATION_ENUM);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
        MeasuringpointPackage theMeasuringpointPackage = (MeasuringpointPackage) EPackage.Registry.INSTANCE
                .getEPackage(MeasuringpointPackage.eNS_URI);
        IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
                .getEPackage(IdentifierPackage.eNS_URI);
        MetricSpecPackage theMetricSpecPackage = (MetricSpecPackage) EPackage.Registry.INSTANCE
                .getEPackage(MetricSpecPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        monitorRepositoryEClass.getESuperTypes().add(theEntityPackage.getEntity());
        monitorEClass.getESuperTypes().add(theEntityPackage.getEntity());
        measurementSpecificationEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        temporalCharacterizationEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        intervallEClass.getESuperTypes().add(this.getTemporalCharacterization());
        delayedIntervallEClass.getESuperTypes().add(this.getIntervall());
        timeFrameEClass.getESuperTypes().add(this.getTemporalCharacterization());

        // Initialize classes and features; add operations and parameters
        initEClass(monitorRepositoryEClass, MonitorRepository.class, "MonitorRepository", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMonitorRepository_Monitors(), this.getMonitor(), this.getMonitor_MonitorRepository(),
                "monitors", null, 0, -1, MonitorRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(monitorEClass, Monitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMonitor_MeasurementSpecifications(), this.getMeasurementSpecification(),
                this.getMeasurementSpecification_Monitor(), "measurementSpecifications", null, 1, -1, Monitor.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMonitor_MeasuringPoint(), theMeasuringpointPackage.getMeasuringPoint(), null,
                "measuringPoint", null, 1, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMonitor_MonitorRepository(), this.getMonitorRepository(),
                this.getMonitorRepository_Monitors(), "monitorRepository", null, 1, 1, Monitor.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(measurementSpecificationEClass, MeasurementSpecification.class, "MeasurementSpecification",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMeasurementSpecification_TemporalRestriction(), this.getTemporalCharacterization(), null,
                "temporalRestriction", null, 0, 1, MeasurementSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMeasurementSpecification_StatisticalCharacterization(),
                this.getStatisticalCharacterizationEnum(), "statisticalCharacterization", "None", 1, 1,
                MeasurementSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMeasurementSpecification_MetricDescription(), theMetricSpecPackage.getMetricDescription(),
                null, "metricDescription", null, 1, 1, MeasurementSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMeasurementSpecification_Monitor(), this.getMonitor(),
                this.getMonitor_MeasurementSpecifications(), "monitor", null, 1, 1, MeasurementSpecification.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getMeasurementSpecification_Name(), ecorePackage.getEString(), "name", "", 0, 1,
                MeasurementSpecification.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(temporalCharacterizationEClass, TemporalCharacterization.class, "TemporalCharacterization",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(intervallEClass, Intervall.class, "Intervall", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIntervall_Intervall(), ecorePackage.getEDouble(), "intervall", "0.0", 1, 1, Intervall.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(delayedIntervallEClass, DelayedIntervall.class, "DelayedIntervall", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDelayedIntervall_Delay(), ecorePackage.getEDouble(), "delay", "0.0", 1, 1,
                DelayedIntervall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(timeFrameEClass, TimeFrame.class, "TimeFrame", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTimeFrame_Start(), ecorePackage.getEDouble(), "start", "0.0", 1, 1, TimeFrame.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTimeFrame_Stop(), ecorePackage.getEDouble(), "stop", "0.0", 1, 1, TimeFrame.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(statisticalCharacterizationEnumEEnum, StatisticalCharacterizationEnum.class,
                "StatisticalCharacterizationEnum");
        addEEnumLiteral(statisticalCharacterizationEnumEEnum, StatisticalCharacterizationEnum.NONE);
        addEEnumLiteral(statisticalCharacterizationEnumEEnum, StatisticalCharacterizationEnum.MEDIAN);
        addEEnumLiteral(statisticalCharacterizationEnumEEnum, StatisticalCharacterizationEnum.ARITHMETIC_MEAN);
        addEEnumLiteral(statisticalCharacterizationEnumEEnum, StatisticalCharacterizationEnum.GEOMETRIC_MEAN);
        addEEnumLiteral(statisticalCharacterizationEnumEEnum, StatisticalCharacterizationEnum.HARMONIC_MEAN);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.eclipse.org/OCL/Import
        createImportAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore
        createEcoreAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore/OCL
        createOCLAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createImportAnnotations() {
        String source = "http://www.eclipse.org/OCL/Import";
        addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore", "edp2",
                "../../../plugin/org.palladiosimulator.edp2/model/EDP2.ecore#//measuringpoint", "entity",
                "../../../plugin/de.uka.ipd.sdq.pcm/model/pcm.ecore#//core/entity", "identifier",
                "../../../plugin/de.uka.ipd.sdq.identifier/model/identifier.ecore#/", "metricspec",
                "../../../plugin/org.palladiosimulator.metricspec/model/metricspec.ecore#/" });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore";
        addAnnotation(this, source, new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
                "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL", "validationDelegates",
                "http://www.eclipse.org/emf/2002/Ecore/OCL" });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createOCLAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
        addAnnotation(
                getMeasurementSpecification_Name(),
                source,
                new String[] {
                        "derivation",
                        "if self.temporalRestriction->notEmpty() then self.monitor.entityName + \': \' + self.statisticalCharacterization.toString() + \' of \' + self.temporalRestriction.oclAsType(ecore::EObject).eClass().name else self.monitor.entityName + \': \' + self.statisticalCharacterization.toString() endif" });
    }

} //MonitorRepositoryPackageImpl
