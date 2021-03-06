/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.edp2.models.Repository.RepositoryPackage;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointPackage;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.monitorrepository.Aggregation;
import org.palladiosimulator.monitorrepository.ArithmeticMean;
import org.palladiosimulator.monitorrepository.FeedThrough;
import org.palladiosimulator.monitorrepository.FixedSizeAggregation;
import org.palladiosimulator.monitorrepository.GeometricMean;
import org.palladiosimulator.monitorrepository.HarmonicMean;
import org.palladiosimulator.monitorrepository.MeasurementDrivenAggregation;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Median;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryFactory;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.ProcessingType;
import org.palladiosimulator.monitorrepository.StatisticalCharacterization;
import org.palladiosimulator.monitorrepository.TimeDriven;
import org.palladiosimulator.monitorrepository.TimeDrivenAggregation;
import org.palladiosimulator.monitorrepository.VariableSizeAggregation;
import org.palladiosimulator.monitorrepository.util.MonitorRepositoryValidator;
import org.palladiosimulator.monitorrepository.util.UtilPackage;
import org.palladiosimulator.monitorrepository.util.impl.UtilPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class MonitorRepositoryPackageImpl extends EPackageImpl implements MonitorRepositoryPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass monitorRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass monitorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass measurementSpecificationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass statisticalCharacterizationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass arithmeticMeanEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass harmonicMeanEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass geometricMeanEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass medianEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass processingTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass aggregationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass measurementDrivenAggregationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass fixedSizeAggregationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass timeDrivenAggregationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass timeDrivenEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass variableSizeAggregationEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass feedThroughEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MonitorRepositoryPackageImpl() {
        super(eNS_URI, MonitorRepositoryFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link MonitorRepositoryPackage#eINSTANCE} when that field
     * is accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MonitorRepositoryPackage init() {
        if (isInited) {
            return (MonitorRepositoryPackage) EPackage.Registry.INSTANCE.getEPackage(MonitorRepositoryPackage.eNS_URI);
        }

        // Obtain or create and register package
        final MonitorRepositoryPackageImpl theMonitorRepositoryPackage = (MonitorRepositoryPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof MonitorRepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new MonitorRepositoryPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PcmPackage.eINSTANCE.eClass();
        ExperimentDataPackage.eINSTANCE.eClass();
        RepositoryPackage.eINSTANCE.eClass();
        MeasuringpointPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final UtilPackageImpl theUtilPackage = (UtilPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);

        // Create package meta-data objects
        theMonitorRepositoryPackage.createPackageContents();
        theUtilPackage.createPackageContents();

        // Initialize created meta-data
        theMonitorRepositoryPackage.initializePackageContents();
        theUtilPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put(theMonitorRepositoryPackage, new EValidator.Descriptor() {
            @Override
            public EValidator getEValidator() {
                return MonitorRepositoryValidator.INSTANCE;
            }
        });

        // Mark meta-data to indicate it can't be changed
        theMonitorRepositoryPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MonitorRepositoryPackage.eNS_URI, theMonitorRepositoryPackage);
        return theMonitorRepositoryPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMonitorRepository() {
        return this.monitorRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMonitorRepository_Monitors() {
        return (EReference) this.monitorRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMonitor() {
        return this.monitorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMonitor_MeasurementSpecifications() {
        return (EReference) this.monitorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMonitor_MeasuringPoint() {
        return (EReference) this.monitorEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMonitor_MonitorRepository() {
        return (EReference) this.monitorEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getMonitor_Activated() {
        return (EAttribute) this.monitorEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMeasurementSpecification() {
        return this.measurementSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMeasurementSpecification_MetricDescription() {
        return (EReference) this.measurementSpecificationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMeasurementSpecification_Monitor() {
        return (EReference) this.measurementSpecificationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getMeasurementSpecification_Name() {
        return (EAttribute) this.measurementSpecificationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getMeasurementSpecification_ProcessingType() {
        return (EReference) this.measurementSpecificationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getMeasurementSpecification_TriggersSelfAdaptations() {
        return (EAttribute) this.measurementSpecificationEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStatisticalCharacterization() {
        return this.statisticalCharacterizationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getArithmeticMean() {
        return this.arithmeticMeanEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getHarmonicMean() {
        return this.harmonicMeanEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getGeometricMean() {
        return this.geometricMeanEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMedian() {
        return this.medianEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getProcessingType() {
        return this.processingTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getProcessingType_MeasurementSpecification() {
        return (EReference) this.processingTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAggregation() {
        return this.aggregationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAggregation_StatisticalCharacterization() {
        return (EReference) this.aggregationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMeasurementDrivenAggregation() {
        return this.measurementDrivenAggregationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getMeasurementDrivenAggregation_Frequency() {
        return (EAttribute) this.measurementDrivenAggregationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFixedSizeAggregation() {
        return this.fixedSizeAggregationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getFixedSizeAggregation_NumberOfMeasurements() {
        return (EAttribute) this.fixedSizeAggregationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTimeDrivenAggregation() {
        return this.timeDrivenAggregationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getTimeDriven() {
        return this.timeDrivenEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTimeDriven_WindowLength() {
        return (EAttribute) this.timeDrivenEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getTimeDriven_WindowIncrement() {
        return (EAttribute) this.timeDrivenEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getVariableSizeAggregation() {
        return this.variableSizeAggregationEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getVariableSizeAggregation_RetrospectionLength() {
        return (EAttribute) this.variableSizeAggregationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFeedThrough() {
        return this.feedThroughEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MonitorRepositoryFactory getMonitorRepositoryFactory() {
        return (MonitorRepositoryFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.monitorRepositoryEClass = this.createEClass(MONITOR_REPOSITORY);
        this.createEReference(this.monitorRepositoryEClass, MONITOR_REPOSITORY__MONITORS);

        this.monitorEClass = this.createEClass(MONITOR);
        this.createEReference(this.monitorEClass, MONITOR__MEASUREMENT_SPECIFICATIONS);
        this.createEReference(this.monitorEClass, MONITOR__MEASURING_POINT);
        this.createEReference(this.monitorEClass, MONITOR__MONITOR_REPOSITORY);
        this.createEAttribute(this.monitorEClass, MONITOR__ACTIVATED);

        this.measurementSpecificationEClass = this.createEClass(MEASUREMENT_SPECIFICATION);
        this.createEReference(this.measurementSpecificationEClass, MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION);
        this.createEReference(this.measurementSpecificationEClass, MEASUREMENT_SPECIFICATION__MONITOR);
        this.createEAttribute(this.measurementSpecificationEClass, MEASUREMENT_SPECIFICATION__NAME);
        this.createEReference(this.measurementSpecificationEClass, MEASUREMENT_SPECIFICATION__PROCESSING_TYPE);
        this.createEAttribute(this.measurementSpecificationEClass,
                MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS);

        this.statisticalCharacterizationEClass = this.createEClass(STATISTICAL_CHARACTERIZATION);

        this.arithmeticMeanEClass = this.createEClass(ARITHMETIC_MEAN);

        this.harmonicMeanEClass = this.createEClass(HARMONIC_MEAN);

        this.geometricMeanEClass = this.createEClass(GEOMETRIC_MEAN);

        this.medianEClass = this.createEClass(MEDIAN);

        this.processingTypeEClass = this.createEClass(PROCESSING_TYPE);
        this.createEReference(this.processingTypeEClass, PROCESSING_TYPE__MEASUREMENT_SPECIFICATION);

        this.aggregationEClass = this.createEClass(AGGREGATION);
        this.createEReference(this.aggregationEClass, AGGREGATION__STATISTICAL_CHARACTERIZATION);

        this.measurementDrivenAggregationEClass = this.createEClass(MEASUREMENT_DRIVEN_AGGREGATION);
        this.createEAttribute(this.measurementDrivenAggregationEClass, MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY);

        this.fixedSizeAggregationEClass = this.createEClass(FIXED_SIZE_AGGREGATION);
        this.createEAttribute(this.fixedSizeAggregationEClass, FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS);

        this.timeDrivenAggregationEClass = this.createEClass(TIME_DRIVEN_AGGREGATION);

        this.timeDrivenEClass = this.createEClass(TIME_DRIVEN);
        this.createEAttribute(this.timeDrivenEClass, TIME_DRIVEN__WINDOW_LENGTH);
        this.createEAttribute(this.timeDrivenEClass, TIME_DRIVEN__WINDOW_INCREMENT);

        this.variableSizeAggregationEClass = this.createEClass(VARIABLE_SIZE_AGGREGATION);
        this.createEAttribute(this.variableSizeAggregationEClass, VARIABLE_SIZE_AGGREGATION__RETROSPECTION_LENGTH);

        this.feedThroughEClass = this.createEClass(FEED_THROUGH);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final UtilPackage theUtilPackage = (UtilPackage) EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
        final EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE
                .getEPackage(EntityPackage.eNS_URI);
        final MeasuringpointPackage theMeasuringpointPackage = (MeasuringpointPackage) EPackage.Registry.INSTANCE
                .getEPackage(MeasuringpointPackage.eNS_URI);
        final IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
                .getEPackage(IdentifierPackage.eNS_URI);
        final MetricSpecPackage theMetricSpecPackage = (MetricSpecPackage) EPackage.Registry.INSTANCE
                .getEPackage(MetricSpecPackage.eNS_URI);
        final ExperimentDataPackage theExperimentDataPackage = (ExperimentDataPackage) EPackage.Registry.INSTANCE
                .getEPackage(ExperimentDataPackage.eNS_URI);

        // Add subpackages
        this.getESubpackages().add(theUtilPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.monitorRepositoryEClass.getESuperTypes().add(theEntityPackage.getEntity());
        this.monitorEClass.getESuperTypes().add(theEntityPackage.getEntity());
        this.measurementSpecificationEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.arithmeticMeanEClass.getESuperTypes().add(this.getStatisticalCharacterization());
        this.harmonicMeanEClass.getESuperTypes().add(this.getStatisticalCharacterization());
        this.geometricMeanEClass.getESuperTypes().add(this.getStatisticalCharacterization());
        this.medianEClass.getESuperTypes().add(this.getStatisticalCharacterization());
        this.processingTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.aggregationEClass.getESuperTypes().add(this.getProcessingType());
        this.measurementDrivenAggregationEClass.getESuperTypes().add(this.getAggregation());
        this.fixedSizeAggregationEClass.getESuperTypes().add(this.getMeasurementDrivenAggregation());
        this.timeDrivenAggregationEClass.getESuperTypes().add(this.getTimeDriven());
        this.timeDrivenAggregationEClass.getESuperTypes().add(this.getAggregation());
        this.timeDrivenEClass.getESuperTypes().add(this.getProcessingType());
        this.variableSizeAggregationEClass.getESuperTypes().add(this.getMeasurementDrivenAggregation());
        this.feedThroughEClass.getESuperTypes().add(this.getProcessingType());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.monitorRepositoryEClass, MonitorRepository.class, "MonitorRepository", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMonitorRepository_Monitors(), this.getMonitor(),
                this.getMonitor_MonitorRepository(), "monitors", null, 0, -1, MonitorRepository.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        this.initEClass(this.monitorEClass, Monitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMonitor_MeasurementSpecifications(), this.getMeasurementSpecification(),
                this.getMeasurementSpecification_Monitor(), "measurementSpecifications", null, 1, -1, Monitor.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getMonitor_MeasuringPoint(), theMeasuringpointPackage.getMeasuringPoint(), null,
                "measuringPoint", null, 1, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getMonitor_MonitorRepository(), this.getMonitorRepository(),
                this.getMonitorRepository_Monitors(), "monitorRepository", null, 1, 1, Monitor.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);
        this.initEAttribute(this.getMonitor_Activated(), this.ecorePackage.getEBoolean(), "activated", "true", 0, 1,
                Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.measurementSpecificationEClass, MeasurementSpecification.class, "MeasurementSpecification",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getMeasurementSpecification_MetricDescription(),
                theMetricSpecPackage.getMetricDescription(), null, "metricDescription", null, 1, 1,
                MeasurementSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getMeasurementSpecification_Monitor(), this.getMonitor(),
                this.getMonitor_MeasurementSpecifications(), "monitor", null, 1, 1, MeasurementSpecification.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getMeasurementSpecification_Name(), this.ecorePackage.getEString(), "name", "", 0, 1,
                MeasurementSpecification.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getMeasurementSpecification_ProcessingType(), this.getProcessingType(),
                this.getProcessingType_MeasurementSpecification(), "processingType", null, 1, 1,
                MeasurementSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getMeasurementSpecification_TriggersSelfAdaptations(), this.ecorePackage.getEBoolean(),
                "triggersSelfAdaptations", "true", 0, 1, MeasurementSpecification.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.statisticalCharacterizationEClass, StatisticalCharacterization.class,
                "StatisticalCharacterization", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        EOperation op = this.addEOperation(this.statisticalCharacterizationEClass,
                theUtilPackage.getStatisticalCharacterizationAggregator(), "getAggregator", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        this.addEParameter(op, theMetricSpecPackage.getNumericalBaseMetricDescription(), "expectedDataMetric", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.arithmeticMeanEClass, ArithmeticMean.class, "ArithmeticMean", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        op = this.addEOperation(this.arithmeticMeanEClass, theUtilPackage.getStatisticalCharacterizationAggregator(),
                "getAggregator", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theMetricSpecPackage.getNumericalBaseMetricDescription(), "expectedDataMetric", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.harmonicMeanEClass, HarmonicMean.class, "HarmonicMean", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        op = this.addEOperation(this.harmonicMeanEClass, theUtilPackage.getStatisticalCharacterizationAggregator(),
                "getAggregator", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theMetricSpecPackage.getNumericalBaseMetricDescription(), "expectedDataMetric", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.geometricMeanEClass, GeometricMean.class, "GeometricMean", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        op = this.addEOperation(this.geometricMeanEClass, theUtilPackage.getStatisticalCharacterizationAggregator(),
                "getAggregator", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theMetricSpecPackage.getNumericalBaseMetricDescription(), "expectedDataMetric", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.medianEClass, Median.class, "Median", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        op = this.addEOperation(this.medianEClass, theUtilPackage.getStatisticalCharacterizationAggregator(),
                "getAggregator", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, theMetricSpecPackage.getNumericalBaseMetricDescription(), "expectedDataMetric", 0, 1,
                IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.processingTypeEClass, ProcessingType.class, "ProcessingType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getProcessingType_MeasurementSpecification(), this.getMeasurementSpecification(),
                this.getMeasurementSpecification_ProcessingType(), "measurementSpecification", null, 1, 1,
                ProcessingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.aggregationEClass, Aggregation.class, "Aggregation", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAggregation_StatisticalCharacterization(), this.getStatisticalCharacterization(),
                null, "statisticalCharacterization", null, 1, 1, Aggregation.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.measurementDrivenAggregationEClass, MeasurementDrivenAggregation.class,
                "MeasurementDrivenAggregation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getMeasurementDrivenAggregation_Frequency(), this.ecorePackage.getEInt(), "frequency",
                "1", 1, 1, MeasurementDrivenAggregation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.fixedSizeAggregationEClass, FixedSizeAggregation.class, "FixedSizeAggregation",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getFixedSizeAggregation_NumberOfMeasurements(), this.ecorePackage.getEInt(),
                "numberOfMeasurements", "10", 1, 1, FixedSizeAggregation.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.timeDrivenAggregationEClass, TimeDrivenAggregation.class, "TimeDrivenAggregation",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.timeDrivenEClass, TimeDriven.class, "TimeDriven", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getTimeDriven_WindowLength(), this.ecorePackage.getEDouble(), "windowLength", "10.0",
                0, 1, TimeDriven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        this.initEAttribute(this.getTimeDriven_WindowIncrement(), this.ecorePackage.getEDouble(), "windowIncrement",
                "10.0", 0, 1, TimeDriven.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = this.addEOperation(this.timeDrivenEClass, null, "getWindowLengthAsMeasure", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = this.createEGenericType(theExperimentDataPackage.getEJSMeasure());
        EGenericType g2 = this.createEGenericType(this.ecorePackage.getEDoubleObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(theUtilPackage.getDuration());
        g1.getETypeArguments().add(g2);
        this.initEOperation(op, g1);

        op = this.addEOperation(this.timeDrivenEClass, null, "getWindowIncrementAsMeasure", 0, 1, IS_UNIQUE,
                IS_ORDERED);
        g1 = this.createEGenericType(theExperimentDataPackage.getEJSMeasure());
        g2 = this.createEGenericType(this.ecorePackage.getEDoubleObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(theUtilPackage.getDuration());
        g1.getETypeArguments().add(g2);
        this.initEOperation(op, g1);

        this.initEClass(this.variableSizeAggregationEClass, VariableSizeAggregation.class, "VariableSizeAggregation",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getVariableSizeAggregation_RetrospectionLength(), this.ecorePackage.getEDouble(),
                "retrospectionLength", "10.0", 1, 1, VariableSizeAggregation.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = this.addEOperation(this.variableSizeAggregationEClass, null, "getRetrospectionLengthAsMeasure", 0, 1,
                IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(theExperimentDataPackage.getEJSMeasure());
        g2 = this.createEGenericType(this.ecorePackage.getEDoubleObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(theUtilPackage.getDuration());
        g1.getETypeArguments().add(g2);
        this.initEOperation(op, g1);

        this.initEClass(this.feedThroughEClass, FeedThrough.class, "FeedThrough", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        this.createResource(eNS_URI);

        // Create annotations
        // http://www.eclipse.org/OCL/Import
        this.createImportAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore
        this.createEcoreAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore/OCL
        this.createOCLAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void createImportAnnotations() {
        final String source = "http://www.eclipse.org/OCL/Import";
        this.addAnnotation(this, source,
                new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore", "edp2",
                        "../../../plugin/org.palladiosimulator.edp2/model/EDP2.ecore#//measuringpoint", "entity",
                        "../../../plugin/org.palladiosimulator.pcm/model/pcm.ecore#//core/entity", "identifier",
                        "../../../plugin/de.uka.ipd.sdq.identifier/model/identifier.ecore#/", "metricspec",
                        "../../../plugin/org.palladiosimulator.metricspec/model/metricspec.ecore#/" });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void createEcoreAnnotations() {
        final String source = "http://www.eclipse.org/emf/2002/Ecore";
        this.addAnnotation(this, source,
                new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL", "settingDelegates",
                        "http://www.eclipse.org/emf/2002/Ecore/OCL", "validationDelegates",
                        "http://www.eclipse.org/emf/2002/Ecore/OCL" });
        this.addAnnotation(this.arithmeticMeanEClass.getEOperations().get(0), source,
                new String[] { "suppressedSetVisibility", "true" });
        this.addAnnotation(this.harmonicMeanEClass.getEOperations().get(0), source,
                new String[] { "suppressedSetVisibility", "true" });
        this.addAnnotation(this.geometricMeanEClass.getEOperations().get(0), source,
                new String[] { "suppressedSetVisibility", "true" });
        this.addAnnotation(this.medianEClass.getEOperations().get(0), source,
                new String[] { "suppressedSetVisibility", "true" });
        this.addAnnotation(this.measurementDrivenAggregationEClass, source,
                new String[] { "constraints", "frequency" });
        this.addAnnotation(this.fixedSizeAggregationEClass, source, new String[] { "constraints", "measNum" });
        this.addAnnotation(this.timeDrivenEClass, source,
                new String[] { "constraints", "windowLength windowIncrement" });
        this.addAnnotation(this.variableSizeAggregationEClass, source, new String[] { "constraints", "retroLength" });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void createOCLAnnotations() {
        final String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
        this.addAnnotation(this.getMeasurementSpecification_Name(), source, new String[] { "derivation",
                "if self.processingType.oclIsKindOf(Aggregation) then self.monitor.entityName + \':\' +self.processingType.toString()+\'(\' + self.processingType.oclAsType(Aggregation).statisticalCharacterization.toString() +\')\' else self.monitor.entityName + \': \' + self.processingType.toString() endif" });
        this.addAnnotation(this.measurementDrivenAggregationEClass, source,
                new String[] { "frequency", "self.frequency > 0" });
        this.addAnnotation(this.fixedSizeAggregationEClass, source,
                new String[] { "measNum", "self.numberOfMeasurements > 0" });
        this.addAnnotation(this.timeDrivenEClass, source, new String[] { "windowLength", "self.windowLength > 0.0",
                "windowIncrement", "self.windowIncrement > 0.0" });
        this.addAnnotation(this.variableSizeAggregationEClass, source,
                new String[] { "retroLength", "self.retrospectionLength > 0.0" });
    }

} // MonitorRepositoryPackageImpl
