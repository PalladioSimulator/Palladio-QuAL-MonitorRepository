/**
 */
package org.palladiosimulator.monitorrepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
     * The number of structural features of the '<em>Monitor</em>' class. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MONITOR_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

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
     * The feature id for the '<em><b>Specification Kind</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Measurement Specification</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASUREMENT_SPECIFICATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 4;

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
     * {@link org.palladiosimulator.monitorrepository.impl.SpecificationKindImpl
     * <em>Specification Kind</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.SpecificationKindImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getSpecificationKind()
     * @generated
     */
    int SPECIFICATION_KIND = 8;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SPECIFICATION_KIND__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Specification Kind</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SPECIFICATION_KIND_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

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
    int AGGREGATION__ID = SPECIFICATION_KIND__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int AGGREGATION__MEASUREMENT_SPECIFICATION = SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Statistical Characterization</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGGREGATION__STATISTICAL_CHARACTERIZATION = SPECIFICATION_KIND_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Aggregation</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int AGGREGATION_FEATURE_COUNT = SPECIFICATION_KIND_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.FixedSizeAggregationImpl
     * <em>Fixed Size Aggregation</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.FixedSizeAggregationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getFixedSizeAggregation()
     * @generated
     */
    int FIXED_SIZE_AGGREGATION = 10;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION__ID = AGGREGATION__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION__MEASUREMENT_SPECIFICATION = AGGREGATION__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Statistical Characterization</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION__STATISTICAL_CHARACTERIZATION = AGGREGATION__STATISTICAL_CHARACTERIZATION;

    /**
     * The feature id for the '<em><b>Number Of Measurements</b></em>' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS = AGGREGATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Frequency</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION__FREQUENCY = AGGREGATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Fixed Size Aggregation</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int FIXED_SIZE_AGGREGATION_FEATURE_COUNT = AGGREGATION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.TimeDrivenImpl <em>Time Driven</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.TimeDrivenImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getTimeDriven()
     * @generated
     */
    int TIME_DRIVEN = 12;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN__ID = SPECIFICATION_KIND__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TIME_DRIVEN__MEASUREMENT_SPECIFICATION = SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Window Characterization</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TIME_DRIVEN__WINDOW_CHARACTERIZATION = SPECIFICATION_KIND_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Time Driven</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_FEATURE_COUNT = SPECIFICATION_KIND_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.TimeDrivenVariableSizeAggregationImpl
     * <em>Time Driven Variable Size Aggregation</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.TimeDrivenVariableSizeAggregationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getTimeDrivenVariableSizeAggregation()
     * @generated
     */
    int TIME_DRIVEN_VARIABLE_SIZE_AGGREGATION = 11;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_VARIABLE_SIZE_AGGREGATION__ID = TIME_DRIVEN__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_VARIABLE_SIZE_AGGREGATION__MEASUREMENT_SPECIFICATION = TIME_DRIVEN__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Window Characterization</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_VARIABLE_SIZE_AGGREGATION__WINDOW_CHARACTERIZATION = TIME_DRIVEN__WINDOW_CHARACTERIZATION;

    /**
     * The feature id for the '<em><b>Statistical Characterization</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_VARIABLE_SIZE_AGGREGATION__STATISTICAL_CHARACTERIZATION = TIME_DRIVEN_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Time Driven Variable Size Aggregation</em>'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int TIME_DRIVEN_VARIABLE_SIZE_AGGREGATION_FEATURE_COUNT = TIME_DRIVEN_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.MeasurementDrivenVariableSizeAggregationImpl
     * <em>Measurement Driven Variable Size Aggregation</em>}' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.
     *      MeasurementDrivenVariableSizeAggregationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMeasurementDrivenVariableSizeAggregation()
     * @generated
     */
    int MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION = 13;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__ID = AGGREGATION__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__MEASUREMENT_SPECIFICATION = AGGREGATION__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Statistical Characterization</b></em>' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__STATISTICAL_CHARACTERIZATION = AGGREGATION__STATISTICAL_CHARACTERIZATION;

    /**
     * The feature id for the '<em><b>Retrospection</b></em>' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION = AGGREGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '
     * <em>Measurement Driven Variable Size Aggregation</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION_FEATURE_COUNT = AGGREGATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.SingleValueImpl <em>Single Value</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.SingleValueImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getSingleValue()
     * @generated
     */
    int SINGLE_VALUE = 14;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SINGLE_VALUE__ID = SPECIFICATION_KIND__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int SINGLE_VALUE__MEASUREMENT_SPECIFICATION = SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION;

    /**
     * The number of structural features of the '<em>Single Value</em>' class. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int SINGLE_VALUE_FEATURE_COUNT = SPECIFICATION_KIND_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.WindowCharacterizationImpl
     * <em>Window Characterization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.impl.WindowCharacterizationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getWindowCharacterization()
     * @generated
     */
    int WINDOW_CHARACTERIZATION = 15;

    /**
     * The feature id for the '<em><b>Window Length</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WINDOW_CHARACTERIZATION__WINDOW_LENGTH = 0;

    /**
     * The feature id for the '<em><b>Window Increment</b></em>' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int WINDOW_CHARACTERIZATION__WINDOW_INCREMENT = 1;

    /**
     * The number of structural features of the '<em>Window Characterization</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WINDOW_CHARACTERIZATION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '
     * {@link org.palladiosimulator.monitorrepository.impl.RetrospectiveCharacterizationImpl
     * <em>Retrospective Characterization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see org.palladiosimulator.monitorrepository.impl.RetrospectiveCharacterizationImpl
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getRetrospectiveCharacterization()
     * @generated
     */
    int RETROSPECTIVE_CHARACTERIZATION = 16;

    /**
     * The feature id for the '<em><b>Retrospection Length</b></em>' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RETROSPECTIVE_CHARACTERIZATION__RETROSPECTION_LENGTH = 0;

    /**
     * The number of structural features of the '<em>Retrospective Characterization</em>' class.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     * @ordered
     */
    int RETROSPECTIVE_CHARACTERIZATION_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '<em>Statistical Characterization Aggregator</em>' data type. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.
     *      StatisticalCharacterizationAggregator
     * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getStatisticalCharacterizationAggregator()
     * @generated
     */
    int STATISTICAL_CHARACTERIZATION_AGGREGATOR = 17;

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
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification#getSpecificationKind
     * <em>Specification Kind</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Specification Kind</em>'.
     * @see org.palladiosimulator.monitorrepository.MeasurementSpecification#getSpecificationKind()
     * @see #getMeasurementSpecification()
     * @generated
     */
    EReference getMeasurementSpecification_SpecificationKind();

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
     * {@link org.palladiosimulator.monitorrepository.SpecificationKind <em>Specification Kind</em>}
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Specification Kind</em>'.
     * @see org.palladiosimulator.monitorrepository.SpecificationKind
     * @generated
     */
    EClass getSpecificationKind();

    /**
     * Returns the meta object for the container reference '
     * {@link org.palladiosimulator.monitorrepository.SpecificationKind#getMeasurementSpecification
     * <em>Measurement Specification</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the container reference '<em>Measurement Specification</em>'.
     * @see org.palladiosimulator.monitorrepository.SpecificationKind#getMeasurementSpecification()
     * @see #getSpecificationKind()
     * @generated
     */
    EReference getSpecificationKind_MeasurementSpecification();

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
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.FixedSizeAggregation#getFrequency
     * <em>Frequency</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Frequency</em>'.
     * @see org.palladiosimulator.monitorrepository.FixedSizeAggregation#getFrequency()
     * @see #getFixedSizeAggregation()
     * @generated
     */
    EAttribute getFixedSizeAggregation_Frequency();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.TimeDrivenVariableSizeAggregation
     * <em>Time Driven Variable Size Aggregation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for class '<em>Time Driven Variable Size Aggregation</em>'.
     * @see org.palladiosimulator.monitorrepository.TimeDrivenVariableSizeAggregation
     * @generated
     */
    EClass getTimeDrivenVariableSizeAggregation();

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
     * Returns the meta object for the containment reference '
     * {@link org.palladiosimulator.monitorrepository.TimeDriven#getWindowCharacterization
     * <em>Window Characterization</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Window Characterization</em>'.
     * @see org.palladiosimulator.monitorrepository.TimeDriven#getWindowCharacterization()
     * @see #getTimeDriven()
     * @generated
     */
    EReference getTimeDriven_WindowCharacterization();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.MeasurementDrivenVariableSizeAggregation
     * <em>Measurement Driven Variable Size Aggregation</em>}'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return the meta object for class '<em>Measurement Driven Variable Size Aggregation</em>'.
     * @see org.palladiosimulator.monitorrepository.MeasurementDrivenVariableSizeAggregation
     * @generated
     */
    EClass getMeasurementDrivenVariableSizeAggregation();

    /**
     * Returns the meta object for the containment reference '
     * {@link org.palladiosimulator.monitorrepository.MeasurementDrivenVariableSizeAggregation#getRetrospection
     * <em>Retrospection</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the containment reference '<em>Retrospection</em>'.
     * @see org.palladiosimulator.monitorrepository.MeasurementDrivenVariableSizeAggregation#getRetrospection()
     * @see #getMeasurementDrivenVariableSizeAggregation()
     * @generated
     */
    EReference getMeasurementDrivenVariableSizeAggregation_Retrospection();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.monitorrepository.SingleValue
     * <em>Single Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Single Value</em>'.
     * @see org.palladiosimulator.monitorrepository.SingleValue
     * @generated
     */
    EClass getSingleValue();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.WindowCharacterization
     * <em>Window Characterization</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Window Characterization</em>'.
     * @see org.palladiosimulator.monitorrepository.WindowCharacterization
     * @generated
     */
    EClass getWindowCharacterization();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.WindowCharacterization#getWindowLength
     * <em>Window Length</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Window Length</em>'.
     * @see org.palladiosimulator.monitorrepository.WindowCharacterization#getWindowLength()
     * @see #getWindowCharacterization()
     * @generated
     */
    EAttribute getWindowCharacterization_WindowLength();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.WindowCharacterization#getWindowIncrement
     * <em>Window Increment</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Window Increment</em>'.
     * @see org.palladiosimulator.monitorrepository.WindowCharacterization#getWindowIncrement()
     * @see #getWindowCharacterization()
     * @generated
     */
    EAttribute getWindowCharacterization_WindowIncrement();

    /**
     * Returns the meta object for class '
     * {@link org.palladiosimulator.monitorrepository.RetrospectiveCharacterization
     * <em>Retrospective Characterization</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for class '<em>Retrospective Characterization</em>'.
     * @see org.palladiosimulator.monitorrepository.RetrospectiveCharacterization
     * @generated
     */
    EClass getRetrospectiveCharacterization();

    /**
     * Returns the meta object for the attribute '
     * {@link org.palladiosimulator.monitorrepository.RetrospectiveCharacterization#getRetrospectionLength
     * <em>Retrospection Length</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for the attribute '<em>Retrospection Length</em>'.
     * @see org.palladiosimulator.monitorrepository.RetrospectiveCharacterization#getRetrospectionLength()
     * @see #getRetrospectiveCharacterization()
     * @generated
     */
    EAttribute getRetrospectiveCharacterization_RetrospectionLength();

    /**
     * Returns the meta object for data type '
     * {@link org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.StatisticalCharacterizationAggregator
     * <em>Statistical Characterization Aggregator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return the meta object for data type '<em>Statistical Characterization Aggregator</em>'.
     * @see org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.
     *      StatisticalCharacterizationAggregator
     * @model instanceClass=
     *        "org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.StatisticalCharacterizationAggregator"
     * @generated
     */
    EDataType getStatisticalCharacterizationAggregator();

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
         * The meta object literal for the '<em><b>Specification Kind</b></em>' containment
         * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference MEASUREMENT_SPECIFICATION__SPECIFICATION_KIND = eINSTANCE
                .getMeasurementSpecification_SpecificationKind();

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
         * {@link org.palladiosimulator.monitorrepository.impl.SpecificationKindImpl
         * <em>Specification Kind</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.SpecificationKindImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getSpecificationKind()
         * @generated
         */
        EClass SPECIFICATION_KIND = eINSTANCE.getSpecificationKind();

        /**
         * The meta object literal for the '<em><b>Measurement Specification</b></em>' container
         * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference SPECIFICATION_KIND__MEASUREMENT_SPECIFICATION = eINSTANCE
                .getSpecificationKind_MeasurementSpecification();

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
         * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute FIXED_SIZE_AGGREGATION__FREQUENCY = eINSTANCE.getFixedSizeAggregation_Frequency();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.TimeDrivenVariableSizeAggregationImpl
         * <em>Time Driven Variable Size Aggregation</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.TimeDrivenVariableSizeAggregationImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getTimeDrivenVariableSizeAggregation()
         * @generated
         */
        EClass TIME_DRIVEN_VARIABLE_SIZE_AGGREGATION = eINSTANCE.getTimeDrivenVariableSizeAggregation();

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
         * The meta object literal for the '<em><b>Window Characterization</b></em>' containment
         * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EReference TIME_DRIVEN__WINDOW_CHARACTERIZATION = eINSTANCE.getTimeDriven_WindowCharacterization();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.MeasurementDrivenVariableSizeAggregationImpl
         * <em>Measurement Driven Variable Size Aggregation</em>}' class. <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.
         *      MeasurementDrivenVariableSizeAggregationImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getMeasurementDrivenVariableSizeAggregation()
         * @generated
         */
        EClass MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION = eINSTANCE.getMeasurementDrivenVariableSizeAggregation();

        /**
         * The meta object literal for the '<em><b>Retrospection</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION__RETROSPECTION = eINSTANCE
                .getMeasurementDrivenVariableSizeAggregation_Retrospection();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.SingleValueImpl <em>Single Value</em>
         * }' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.SingleValueImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getSingleValue()
         * @generated
         */
        EClass SINGLE_VALUE = eINSTANCE.getSingleValue();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.WindowCharacterizationImpl
         * <em>Window Characterization</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.WindowCharacterizationImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getWindowCharacterization()
         * @generated
         */
        EClass WINDOW_CHARACTERIZATION = eINSTANCE.getWindowCharacterization();

        /**
         * The meta object literal for the '<em><b>Window Length</b></em>' attribute feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EAttribute WINDOW_CHARACTERIZATION__WINDOW_LENGTH = eINSTANCE.getWindowCharacterization_WindowLength();

        /**
         * The meta object literal for the '<em><b>Window Increment</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute WINDOW_CHARACTERIZATION__WINDOW_INCREMENT = eINSTANCE.getWindowCharacterization_WindowIncrement();

        /**
         * The meta object literal for the '
         * {@link org.palladiosimulator.monitorrepository.impl.RetrospectiveCharacterizationImpl
         * <em>Retrospective Characterization</em>}' class. <!-- begin-user-doc --> <!--
         * end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.impl.RetrospectiveCharacterizationImpl
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getRetrospectiveCharacterization()
         * @generated
         */
        EClass RETROSPECTIVE_CHARACTERIZATION = eINSTANCE.getRetrospectiveCharacterization();

        /**
         * The meta object literal for the '<em><b>Retrospection Length</b></em>' attribute feature.
         * <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @generated
         */
        EAttribute RETROSPECTIVE_CHARACTERIZATION__RETROSPECTION_LENGTH = eINSTANCE
                .getRetrospectiveCharacterization_RetrospectionLength();

        /**
         * The meta object literal for the '<em>Statistical Characterization Aggregator</em>' data
         * type. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.
         *      StatisticalCharacterizationAggregator
         * @see org.palladiosimulator.monitorrepository.impl.MonitorRepositoryPackageImpl#getStatisticalCharacterizationAggregator()
         * @generated
         */
        EDataType STATISTICAL_CHARACTERIZATION_AGGREGATOR = eINSTANCE.getStatisticalCharacterizationAggregator();

    }

} // MonitorRepositoryPackage
