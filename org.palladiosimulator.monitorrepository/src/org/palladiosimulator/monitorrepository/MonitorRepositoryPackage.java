/**
 */
package org.palladiosimulator.monitorrepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryFactory
 * @model kind="package" annotation=
 *        "http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' edp2='../../../plugin/org.palladiosimulator.edp2/model/EDP2.ecore#//measuringpoint' entity='../../../plugin/org.palladiosimulator.pcm/model/pcm.ecore#//core/entity' identifier='../../../plugin/de.uka.ipd.sdq.identifier/model/identifier.ecore#/' metricspec='../../../plugin/org.palladiosimulator.metricspec/model/metricspec.ecore#/'"
 *        annotation=
 *        "http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface MonitorRepositoryPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNAME = "monitorrepository";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/MonitorRepository/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_PREFIX = "monitorrepository";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    MonitorRepositoryPackage eINSTANCE = org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl
            .init();

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.MonitorRepositoryImpl
     * <em>Monitor Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMonitorRepository()
     * @generated
     */
    int MONITOR_REPOSITORY = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR_REPOSITORY__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR_REPOSITORY__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Monitors</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR_REPOSITORY__MONITORS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Monitor Repository</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR_REPOSITORY_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.monitorrepository.impl.MonitorImpl
     * <em>Monitor</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.MonitorImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMonitor()
     * @generated
     */
    int MONITOR = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Measurement Specifications</b></em>' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR__MEASUREMENT_SPECIFICATIONS = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Measuring Point</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR__MEASURING_POINT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Monitor Repository</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR__MONITOR_REPOSITORY = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Activated</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR__ACTIVATED = EntityPackage.ENTITY_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Monitor</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl
     * <em>Measurement Specification</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMeasurementSpecification()
     * @generated
     */
    int MEASUREMENT_SPECIFICATION = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_SPECIFICATION__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Metric Description</b></em>' reference. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Monitor</b></em>' container reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_SPECIFICATION__MONITOR = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_SPECIFICATION__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Processing Type</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_SPECIFICATION__PROCESSING_TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Triggers Self Adaptations</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Measurement Specification</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_SPECIFICATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.StatisticalCharacterizationImpl
     * <em>Statistical Characterization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.StatisticalCharacterizationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getStatisticalCharacterization()
     * @generated
     */
    int STATISTICAL_CHARACTERIZATION = 3;

    /**
     * The number of structural features of the '<em>Statistical Characterization</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int STATISTICAL_CHARACTERIZATION_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.ArithmeticMeanImpl
     * <em>Arithmetic Mean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.ArithmeticMeanImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getArithmeticMean()
     * @generated
     */
    int ARITHMETIC_MEAN = 4;

    /**
     * The number of structural features of the '<em>Arithmetic Mean</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int ARITHMETIC_MEAN_FEATURE_COUNT = STATISTICAL_CHARACTERIZATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.HarmonicMeanImpl <em>Harmonic Mean</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.HarmonicMeanImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getHarmonicMean()
     * @generated
     */
    int HARMONIC_MEAN = 5;

    /**
     * The number of structural features of the '<em>Harmonic Mean</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int HARMONIC_MEAN_FEATURE_COUNT = STATISTICAL_CHARACTERIZATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.GeometricMeanImpl <em>Geometric Mean</em>
     * }' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.GeometricMeanImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getGeometricMean()
     * @generated
     */
    int GEOMETRIC_MEAN = 6;

    /**
     * The number of structural features of the '<em>Geometric Mean</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int GEOMETRIC_MEAN_FEATURE_COUNT = STATISTICAL_CHARACTERIZATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.palladiosimulator.monitorrepository.impl.MedianImpl
     * <em>Median</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.MedianImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMedian()
     * @generated
     */
    int MEDIAN = 7;

    /**
     * The number of structural features of the '<em>Median</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEDIAN_FEATURE_COUNT = STATISTICAL_CHARACTERIZATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.ProcessingTypeImpl
     * <em>Processing Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.ProcessingTypeImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getProcessingType()
     * @generated
     */
    int PROCESSING_TYPE = 8;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROCESSING_TYPE__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROCESSING_TYPE__MEASUREMENT_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Processing Type</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int PROCESSING_TYPE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.AggregationImpl <em>Aggregation</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.AggregationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getAggregation()
     * @generated
     */
    int AGGREGATION = 9;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGGREGATION__ID = PROCESSING_TYPE__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGGREGATION__MEASUREMENT_SPECIFICATION = PROCESSING_TYPE__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Statistical Characterization</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGGREGATION__STATISTICAL_CHARACTERIZATION = PROCESSING_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Aggregation</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGGREGATION_FEATURE_COUNT = PROCESSING_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.MeasurementDrivenAggregationImpl
     * <em>Measurement Driven Aggregation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.MeasurementDrivenAggregationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMeasurementDrivenAggregation()
     * @generated
     */
    int MEASUREMENT_DRIVEN_AGGREGATION = 10;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_DRIVEN_AGGREGATION__ID = AGGREGATION__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_DRIVEN_AGGREGATION__MEASUREMENT_SPECIFICATION = AGGREGATION__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Statistical Characterization</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION = AGGREGATION__STATISTICAL_CHARACTERIZATION;

    /**
     * The feature id for the '<em><b>Frequency</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY = AGGREGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Measurement Driven Aggregation</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_DRIVEN_AGGREGATION_FEATURE_COUNT = AGGREGATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.FixedSizeAggregationImpl
     * <em>Fixed Size Aggregation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.FixedSizeAggregationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getFixedSizeAggregation()
     * @generated
     */
    int FIXED_SIZE_AGGREGATION = 11;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION__ID = MEASUREMENT_DRIVEN_AGGREGATION__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION__MEASUREMENT_SPECIFICATION = MEASUREMENT_DRIVEN_AGGREGATION__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Statistical Characterization</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION__STATISTICAL_CHARACTERIZATION = MEASUREMENT_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION;

    /**
     * The feature id for the '<em><b>Frequency</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION__FREQUENCY = MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY;

    /**
     * The feature id for the '<em><b>Number Of Measurements</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS = MEASUREMENT_DRIVEN_AGGREGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Fixed Size Aggregation</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION_FEATURE_COUNT = MEASUREMENT_DRIVEN_AGGREGATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.TimeDrivenImpl <em>Time Driven</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.TimeDrivenImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getTimeDriven()
     * @generated
     */
    int TIME_DRIVEN = 13;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN__ID = PROCESSING_TYPE__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN__MEASUREMENT_SPECIFICATION = PROCESSING_TYPE__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Window Length</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN__WINDOW_LENGTH = PROCESSING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Window Increment</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN__WINDOW_INCREMENT = PROCESSING_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Time Driven</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_FEATURE_COUNT = PROCESSING_TYPE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.TimeDrivenAggregationImpl
     * <em>Time Driven Aggregation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.TimeDrivenAggregationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getTimeDrivenAggregation()
     * @generated
     */
    int TIME_DRIVEN_AGGREGATION = 12;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_AGGREGATION__ID = TIME_DRIVEN__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_AGGREGATION__MEASUREMENT_SPECIFICATION = TIME_DRIVEN__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Window Length</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_AGGREGATION__WINDOW_LENGTH = TIME_DRIVEN__WINDOW_LENGTH;

    /**
     * The feature id for the '<em><b>Window Increment</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_AGGREGATION__WINDOW_INCREMENT = TIME_DRIVEN__WINDOW_INCREMENT;

    /**
     * The feature id for the '<em><b>Statistical Characterization</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION = TIME_DRIVEN_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Time Driven Aggregation</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_AGGREGATION_FEATURE_COUNT = TIME_DRIVEN_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.VariableSizeAggregationImpl
     * <em>Variable Size Aggregation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.VariableSizeAggregationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getVariableSizeAggregation()
     * @generated
     */
    int VARIABLE_SIZE_AGGREGATION = 14;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_SIZE_AGGREGATION__ID = MEASUREMENT_DRIVEN_AGGREGATION__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_SIZE_AGGREGATION__MEASUREMENT_SPECIFICATION = MEASUREMENT_DRIVEN_AGGREGATION__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Statistical Characterization</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_SIZE_AGGREGATION__STATISTICAL_CHARACTERIZATION = MEASUREMENT_DRIVEN_AGGREGATION__STATISTICAL_CHARACTERIZATION;

    /**
     * The feature id for the '<em><b>Frequency</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_SIZE_AGGREGATION__FREQUENCY = MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY;

    /**
     * The feature id for the '<em><b>Retrospection Length</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_SIZE_AGGREGATION__RETROSPECTION_LENGTH = MEASUREMENT_DRIVEN_AGGREGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Variable Size Aggregation</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int VARIABLE_SIZE_AGGREGATION_FEATURE_COUNT = MEASUREMENT_DRIVEN_AGGREGATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.FeedThroughImpl <em>Feed Through</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.FeedThroughImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getFeedThrough()
     * @generated
     */
    int FEED_THROUGH = 15;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FEED_THROUGH__ID = PROCESSING_TYPE__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FEED_THROUGH__MEASUREMENT_SPECIFICATION = PROCESSING_TYPE__MEASUREMENT_SPECIFICATION;

    /**
     * The number of structural features of the '<em>Feed Through</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FEED_THROUGH_FEATURE_COUNT = PROCESSING_TYPE_FEATURE_COUNT + 0;

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.MonitorRepository <em>Monitor Repository</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Monitor Repository</em>'.
     * @see org.palladiosimulator.monitorrepository.MonitorRepository
     * @generated
     */
    EClass getMonitorRepository();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.palladiosimulator.monitorrepository.MonitorRepository#getMonitors
     * <em>Monitors</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '<em>Monitors</em>'.
     * @see org.palladiosimulator.monitorrepository.MonitorRepository#getMonitors()
     * @see #getMonitorRepository()
     * @generated
     */
    EReference getMonitorRepository_Monitors();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.monitorrepository.Monitor
     * <em>Monitor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Monitor</em>'.
     * @see org.palladiosimulator.monitorrepository.Monitor
     * @generated
     */
    EClass getMonitor();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.palladiosimulator.monitorrepository.Monitor#getMeasurementSpecifications
     * <em>Measurement Specifications</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference list '
     *         <em>Measurement Specifications</em>'.
     * @see org.palladiosimulator.monitorrepository.Monitor#getMeasurementSpecifications()
     * @see #getMonitor()
     * @generated
     */
    EReference getMonitor_MeasurementSpecifications();

    /**
     * Returns the meta object for the reference '
     * {@link org.palladiosimulator.monitorrepository.Monitor#getMeasuringPoint
     * <em>Measuring Point</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Measuring Point</em>'.
     * @see org.palladiosimulator.monitorrepository.Monitor#getMeasuringPoint()
     * @see #getMonitor()
     * @generated
     */
    EReference getMonitor_MeasuringPoint();

    /**
     * Returns the meta object for the container reference '
     * {@link org.palladiosimulator.monitorrepository.Monitor#getMonitorRepository
     * <em>Monitor Repository</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Monitor Repository</em>'.
     * @see org.palladiosimulator.monitorrepository.Monitor#getMonitorRepository()
     * @see #getMonitor()
     * @generated
     */
    EReference getMonitor_MonitorRepository();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.Monitor#isActivated <em>Activated</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Activated</em>'.
     * @see org.palladiosimulator.monitorrepository.Monitor#isActivated()
     * @see #getMonitor()
     * @generated
     */
    EAttribute getMonitor_Activated();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification
     * <em>Measurement Specification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Measurement Specification</em>'.
     * @see org.palladiosimulator.monitorrepository.MeasurementSpecification
     * @generated
     */
    EClass getMeasurementSpecification();

    /**
     * Returns the meta object for the reference '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getMetricDescription
     * <em>Metric Description</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the reference '<em>Metric Description</em>'.
     * @see org.palladiosimulator.monitorrepository.MeasurementSpecification#getMetricDescription()
     * @see #getMeasurementSpecification()
     * @generated
     */
    EReference getMeasurementSpecification_MetricDescription();

    /**
     * Returns the meta object for the container reference '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getMonitor
     * <em>Monitor</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Monitor</em>'.
     * @see org.palladiosimulator.monitorrepository.MeasurementSpecification#getMonitor()
     * @see #getMeasurementSpecification()
     * @generated
     */
    EReference getMeasurementSpecification_Monitor();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getName <em>Name</em>
     * }'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.palladiosimulator.monitorrepository.MeasurementSpecification#getName()
     * @see #getMeasurementSpecification()
     * @generated
     */
    EAttribute getMeasurementSpecification_Name();

    /**
     * Returns the meta object for the containment reference '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getProcessingType
     * <em>Processing Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Processing Type</em>'.
     * @see org.palladiosimulator.monitorrepository.MeasurementSpecification#getProcessingType()
     * @see #getMeasurementSpecification()
     * @generated
     */
    EReference getMeasurementSpecification_ProcessingType();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#isTriggersSelfAdaptations
     * <em>Triggers Self Adaptations</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Triggers Self Adaptations</em>'.
     * @see org.palladiosimulator.monitorrepository.MeasurementSpecification#isTriggersSelfAdaptations()
     * @see #getMeasurementSpecification()
     * @generated
     */
    EAttribute getMeasurementSpecification_TriggersSelfAdaptations();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.StatisticalCharacterization
     * <em>Statistical Characterization</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Statistical Characterization</em>'.
     * @see org.palladiosimulator.monitorrepository.StatisticalCharacterization
     * @generated
     */
    EClass getStatisticalCharacterization();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.ArithmeticMean <em>Arithmetic Mean</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Arithmetic Mean</em>'.
     * @see org.palladiosimulator.monitorrepository.ArithmeticMean
     * @generated
     */
    EClass getArithmeticMean();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.HarmonicMean <em>Harmonic Mean</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Harmonic Mean</em>'.
     * @see org.palladiosimulator.monitorrepository.HarmonicMean
     * @generated
     */
    EClass getHarmonicMean();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.GeometricMean <em>Geometric Mean</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Geometric Mean</em>'.
     * @see org.palladiosimulator.monitorrepository.GeometricMean
     * @generated
     */
    EClass getGeometricMean();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.monitorrepository.Median
     * <em>Median</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Median</em>'.
     * @see org.palladiosimulator.monitorrepository.Median
     * @generated
     */
    EClass getMedian();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.ProcessingType <em>Processing Type</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Processing Type</em>'.
     * @see org.palladiosimulator.monitorrepository.ProcessingType
     * @generated
     */
    EClass getProcessingType();

    /**
     * Returns the meta object for the container reference '
     * {@link org.palladiosimulator.monitorrepository.ProcessingType#getMeasurementSpecification
     * <em>Measurement Specification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Measurement Specification</em>'.
     * @see org.palladiosimulator.monitorrepository.ProcessingType#getMeasurementSpecification()
     * @see #getProcessingType()
     * @generated
     */
    EReference getProcessingType_MeasurementSpecification();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.monitorrepository.Aggregation
     * <em>Aggregation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Aggregation</em>'.
     * @see org.palladiosimulator.monitorrepository.Aggregation
     * @generated
     */
    EClass getAggregation();

    /**
     * Returns the meta object for the containment reference '
     * {@link org.palladiosimulator.monitorrepository.Aggregation#getStatisticalCharacterization
     * <em>Statistical Characterization</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Statistical Characterization</em>
     *         '.
     * @see org.palladiosimulator.monitorrepository.Aggregation#getStatisticalCharacterization()
     * @see #getAggregation()
     * @generated
     */
    EReference getAggregation_StatisticalCharacterization();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.MeasurementDrivenAggregation
     * <em>Measurement Driven Aggregation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Measurement Driven Aggregation</em>'.
     * @see org.palladiosimulator.monitorrepository.MeasurementDrivenAggregation
     * @generated
     */
    EClass getMeasurementDrivenAggregation();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.MeasurementDrivenAggregation#getFrequency
     * <em>Frequency</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Frequency</em>'.
     * @see org.palladiosimulator.monitorrepository.MeasurementDrivenAggregation#getFrequency()
     * @see #getMeasurementDrivenAggregation()
     * @generated
     */
    EAttribute getMeasurementDrivenAggregation_Frequency();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.FixedSizeAggregation
     * <em>Fixed Size Aggregation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Fixed Size Aggregation</em>'.
     * @see org.palladiosimulator.monitorrepository.FixedSizeAggregation
     * @generated
     */
    EClass getFixedSizeAggregation();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.FixedSizeAggregation#getNumberOfMeasurements
     * <em>Number Of Measurements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Number Of Measurements</em>'.
     * @see org.palladiosimulator.monitorrepository.FixedSizeAggregation#getNumberOfMeasurements()
     * @see #getFixedSizeAggregation()
     * @generated
     */
    EAttribute getFixedSizeAggregation_NumberOfMeasurements();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.TimeDrivenAggregation
     * <em>Time Driven Aggregation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Time Driven Aggregation</em>'.
     * @see org.palladiosimulator.monitorrepository.TimeDrivenAggregation
     * @generated
     */
    EClass getTimeDrivenAggregation();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.monitorrepository.TimeDriven
     * <em>Time Driven</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Time Driven</em>'.
     * @see org.palladiosimulator.monitorrepository.TimeDriven
     * @generated
     */
    EClass getTimeDriven();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.TimeDriven#getWindowLength
     * <em>Window Length</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Window Length</em>'.
     * @see org.palladiosimulator.monitorrepository.TimeDriven#getWindowLength()
     * @see #getTimeDriven()
     * @generated
     */
    EAttribute getTimeDriven_WindowLength();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.TimeDriven#getWindowIncrement
     * <em>Window Increment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Window Increment</em>'.
     * @see org.palladiosimulator.monitorrepository.TimeDriven#getWindowIncrement()
     * @see #getTimeDriven()
     * @generated
     */
    EAttribute getTimeDriven_WindowIncrement();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.VariableSizeAggregation
     * <em>Variable Size Aggregation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Variable Size Aggregation</em>'.
     * @see org.palladiosimulator.monitorrepository.VariableSizeAggregation
     * @generated
     */
    EClass getVariableSizeAggregation();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.VariableSizeAggregation#getRetrospectionLength
     * <em>Retrospection Length</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Retrospection Length</em>'.
     * @see org.palladiosimulator.monitorrepository.VariableSizeAggregation#getRetrospectionLength()
     * @see #getVariableSizeAggregation()
     * @generated
     */
    EAttribute getVariableSizeAggregation_RetrospectionLength();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.monitorrepository.FeedThrough
     * <em>Feed Through</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Feed Through</em>'.
     * @see org.palladiosimulator.monitorrepository.FeedThrough
     * @generated
     */
    EClass getFeedThrough();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MonitorRepositoryFactory getMonitorRepositoryFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.MonitorRepositoryImpl
         * <em>Monitor Repository</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMonitorRepository()
         * @generated
         */
        EClass MONITOR_REPOSITORY = eINSTANCE.getMonitorRepository();

        /**
         * The meta object literal for the '<em><b>Monitors</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MONITOR_REPOSITORY__MONITORS = eINSTANCE.getMonitorRepository_Monitors();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.MonitorImpl <em>Monitor</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.MonitorImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMonitor()
         * @generated
         */
        EClass MONITOR = eINSTANCE.getMonitor();

        /**
         * The meta object literal for the '<em><b>Measurement Specifications</b></em>' containment
         * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MONITOR__MEASUREMENT_SPECIFICATIONS = eINSTANCE.getMonitor_MeasurementSpecifications();

        /**
         * The meta object literal for the '<em><b>Measuring Point</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MONITOR__MEASURING_POINT = eINSTANCE.getMonitor_MeasuringPoint();

        /**
         * The meta object literal for the '<em><b>Monitor Repository</b></em>' container reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MONITOR__MONITOR_REPOSITORY = eINSTANCE.getMonitor_MonitorRepository();

        /**
         * The meta object literal for the '<em><b>Activated</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute MONITOR__ACTIVATED = eINSTANCE.getMonitor_Activated();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl
         * <em>Measurement Specification</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.MeasurementSpecificationImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMeasurementSpecification()
         * @generated
         */
        EClass MEASUREMENT_SPECIFICATION = eINSTANCE.getMeasurementSpecification();

        /**
         * The meta object literal for the '<em><b>Metric Description</b></em>' reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION = eINSTANCE
                .getMeasurementSpecification_MetricDescription();

        /**
         * The meta object literal for the '<em><b>Monitor</b></em>' container reference feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MEASUREMENT_SPECIFICATION__MONITOR = eINSTANCE.getMeasurementSpecification_Monitor();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute MEASUREMENT_SPECIFICATION__NAME = eINSTANCE.getMeasurementSpecification_Name();

        /**
         * The meta object literal for the '<em><b>Processing Type</b></em>' containment reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MEASUREMENT_SPECIFICATION__PROCESSING_TYPE = eINSTANCE.getMeasurementSpecification_ProcessingType();

        /**
         * The meta object literal for the '<em><b>Triggers Self Adaptations</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS = eINSTANCE
                .getMeasurementSpecification_TriggersSelfAdaptations();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.StatisticalCharacterizationImpl
         * <em>Statistical Characterization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
         * -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.StatisticalCharacterizationImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getStatisticalCharacterization()
         * @generated
         */
        EClass STATISTICAL_CHARACTERIZATION = eINSTANCE.getStatisticalCharacterization();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.ArithmeticMeanImpl
         * <em>Arithmetic Mean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.ArithmeticMeanImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getArithmeticMean()
         * @generated
         */
        EClass ARITHMETIC_MEAN = eINSTANCE.getArithmeticMean();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.HarmonicMeanImpl
         * <em>Harmonic Mean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.HarmonicMeanImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getHarmonicMean()
         * @generated
         */
        EClass HARMONIC_MEAN = eINSTANCE.getHarmonicMean();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.GeometricMeanImpl
         * <em>Geometric Mean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.GeometricMeanImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getGeometricMean()
         * @generated
         */
        EClass GEOMETRIC_MEAN = eINSTANCE.getGeometricMean();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.MedianImpl <em>Median</em>}' class.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.MedianImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMedian()
         * @generated
         */
        EClass MEDIAN = eINSTANCE.getMedian();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.ProcessingTypeImpl
         * <em>Processing Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.ProcessingTypeImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getProcessingType()
         * @generated
         */
        EClass PROCESSING_TYPE = eINSTANCE.getProcessingType();

        /**
         * The meta object literal for the '<em><b>Measurement Specification</b></em>' container
         * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference PROCESSING_TYPE__MEASUREMENT_SPECIFICATION = eINSTANCE.getProcessingType_MeasurementSpecification();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.AggregationImpl <em>Aggregation</em>}
         * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.AggregationImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getAggregation()
         * @generated
         */
        EClass AGGREGATION = eINSTANCE.getAggregation();

        /**
         * The meta object literal for the '<em><b>Statistical Characterization</b></em>'
         * containment reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference AGGREGATION__STATISTICAL_CHARACTERIZATION = eINSTANCE.getAggregation_StatisticalCharacterization();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.MeasurementDrivenAggregationImpl
         * <em>Measurement Driven Aggregation</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.MeasurementDrivenAggregationImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMeasurementDrivenAggregation()
         * @generated
         */
        EClass MEASUREMENT_DRIVEN_AGGREGATION = eINSTANCE.getMeasurementDrivenAggregation();

        /**
         * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY = eINSTANCE.getMeasurementDrivenAggregation_Frequency();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.FixedSizeAggregationImpl
         * <em>Fixed Size Aggregation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.FixedSizeAggregationImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getFixedSizeAggregation()
         * @generated
         */
        EClass FIXED_SIZE_AGGREGATION = eINSTANCE.getFixedSizeAggregation();

        /**
         * The meta object literal for the '<em><b>Number Of Measurements</b></em>' attribute
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS = eINSTANCE
                .getFixedSizeAggregation_NumberOfMeasurements();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.TimeDrivenAggregationImpl
         * <em>Time Driven Aggregation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.TimeDrivenAggregationImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getTimeDrivenAggregation()
         * @generated
         */
        EClass TIME_DRIVEN_AGGREGATION = eINSTANCE.getTimeDrivenAggregation();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.TimeDrivenImpl <em>Time Driven</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.TimeDrivenImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getTimeDriven()
         * @generated
         */
        EClass TIME_DRIVEN = eINSTANCE.getTimeDriven();

        /**
         * The meta object literal for the '<em><b>Window Length</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute TIME_DRIVEN__WINDOW_LENGTH = eINSTANCE.getTimeDriven_WindowLength();

        /**
         * The meta object literal for the '<em><b>Window Increment</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute TIME_DRIVEN__WINDOW_INCREMENT = eINSTANCE.getTimeDriven_WindowIncrement();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.VariableSizeAggregationImpl
         * <em>Variable Size Aggregation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.VariableSizeAggregationImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getVariableSizeAggregation()
         * @generated
         */
        EClass VARIABLE_SIZE_AGGREGATION = eINSTANCE.getVariableSizeAggregation();

        /**
         * The meta object literal for the '<em><b>Retrospection Length</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute VARIABLE_SIZE_AGGREGATION__RETROSPECTION_LENGTH = eINSTANCE
                .getVariableSizeAggregation_RetrospectionLength();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.FeedThroughImpl <em>Feed Through</em>
         * }' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.FeedThroughImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getFeedThrough()
         * @generated
         */
        EClass FEED_THROUGH = eINSTANCE.getFeedThrough();

    }

} // MonitorRepositoryPackage
