/**
 */
package org.palladiosimulator.monitorrepository.map;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.monitorrepository.map.MapFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import metricspec='../../../plugin/org.palladiosimulator.metricspec/model/metricspec.ecore#/' monitorrepository='../../../plugin/org.palladiosimulator.monitorrepository/model/monitorrepository.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface MapPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "map";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/MonitorRepository/Map/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "map";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    MapPackage eINSTANCE = org.palladiosimulator.monitorrepository.map.impl.MapPackageImpl.init();

    /**
     * The meta object id for the '{@link org.palladiosimulator.monitorrepository.map.impl.MapImpl <em>Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.monitorrepository.map.impl.MapImpl
     * @see org.palladiosimulator.monitorrepository.map.impl.MapPackageImpl#getMap()
     * @generated
     */
    int MAP = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAP__ID = MonitorRepositoryPackage.PROCESSING_TYPE__ID;

    /**
     * The feature id for the '<em><b>Measurement Specification</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAP__MEASUREMENT_SPECIFICATION = MonitorRepositoryPackage.PROCESSING_TYPE__MEASUREMENT_SPECIFICATION;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAP__ENTITY_NAME = MonitorRepositoryPackage.PROCESSING_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Output Metric Description</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAP__OUTPUT_METRIC_DESCRIPTION = MonitorRepositoryPackage.PROCESSING_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Mapper</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAP__MAPPER = MonitorRepositoryPackage.PROCESSING_TYPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Map</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAP_FEATURE_COUNT = MonitorRepositoryPackage.PROCESSING_TYPE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.palladiosimulator.monitorrepository.map.impl.MapperImpl <em>Mapper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.monitorrepository.map.impl.MapperImpl
     * @see org.palladiosimulator.monitorrepository.map.impl.MapPackageImpl#getMapper()
     * @generated
     */
    int MAPPER = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPER__ID = IdentifierPackage.IDENTIFIER__ID;

    /**
     * The feature id for the '<em><b>Map</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPER__MAP = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Mapper</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAPPER_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.palladiosimulator.monitorrepository.map.impl.ExponentialSmoothingImpl <em>Exponential Smoothing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.monitorrepository.map.impl.ExponentialSmoothingImpl
     * @see org.palladiosimulator.monitorrepository.map.impl.MapPackageImpl#getExponentialSmoothing()
     * @generated
     */
    int EXPONENTIAL_SMOOTHING = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPONENTIAL_SMOOTHING__ID = MAPPER__ID;

    /**
     * The feature id for the '<em><b>Map</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPONENTIAL_SMOOTHING__MAP = MAPPER__MAP;

    /**
     * The feature id for the '<em><b>Smoothing Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPONENTIAL_SMOOTHING__SMOOTHING_FACTOR = MAPPER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Smoothed Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPONENTIAL_SMOOTHING__SMOOTHED_VALUE = MAPPER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Exponential Smoothing</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXPONENTIAL_SMOOTHING_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 2;

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.monitorrepository.map.Map <em>Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Map</em>'.
     * @see org.palladiosimulator.monitorrepository.map.Map
     * @generated
     */
    EClass getMap();

    /**
     * Returns the meta object for the reference '{@link org.palladiosimulator.monitorrepository.map.Map#getOutputMetricDescription <em>Output Metric Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Output Metric Description</em>'.
     * @see org.palladiosimulator.monitorrepository.map.Map#getOutputMetricDescription()
     * @see #getMap()
     * @generated
     */
    EReference getMap_OutputMetricDescription();

    /**
     * Returns the meta object for the containment reference '{@link org.palladiosimulator.monitorrepository.map.Map#getMapper <em>Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Mapper</em>'.
     * @see org.palladiosimulator.monitorrepository.map.Map#getMapper()
     * @see #getMap()
     * @generated
     */
    EReference getMap_Mapper();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.monitorrepository.map.Mapper <em>Mapper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mapper</em>'.
     * @see org.palladiosimulator.monitorrepository.map.Mapper
     * @generated
     */
    EClass getMapper();

    /**
     * Returns the meta object for the container reference '{@link org.palladiosimulator.monitorrepository.map.Mapper#getMap <em>Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Map</em>'.
     * @see org.palladiosimulator.monitorrepository.map.Mapper#getMap()
     * @see #getMapper()
     * @generated
     */
    EReference getMapper_Map();

    /**
     * Returns the meta object for class '{@link org.palladiosimulator.monitorrepository.map.ExponentialSmoothing <em>Exponential Smoothing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exponential Smoothing</em>'.
     * @see org.palladiosimulator.monitorrepository.map.ExponentialSmoothing
     * @generated
     */
    EClass getExponentialSmoothing();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.monitorrepository.map.ExponentialSmoothing#getSmoothingFactor <em>Smoothing Factor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Smoothing Factor</em>'.
     * @see org.palladiosimulator.monitorrepository.map.ExponentialSmoothing#getSmoothingFactor()
     * @see #getExponentialSmoothing()
     * @generated
     */
    EAttribute getExponentialSmoothing_SmoothingFactor();

    /**
     * Returns the meta object for the attribute '{@link org.palladiosimulator.monitorrepository.map.ExponentialSmoothing#getSmoothedValue <em>Smoothed Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Smoothed Value</em>'.
     * @see org.palladiosimulator.monitorrepository.map.ExponentialSmoothing#getSmoothedValue()
     * @see #getExponentialSmoothing()
     * @generated
     */
    EAttribute getExponentialSmoothing_SmoothedValue();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    MapFactory getMapFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.palladiosimulator.monitorrepository.map.impl.MapImpl <em>Map</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.monitorrepository.map.impl.MapImpl
         * @see org.palladiosimulator.monitorrepository.map.impl.MapPackageImpl#getMap()
         * @generated
         */
        EClass MAP = eINSTANCE.getMap();

        /**
         * The meta object literal for the '<em><b>Output Metric Description</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MAP__OUTPUT_METRIC_DESCRIPTION = eINSTANCE.getMap_OutputMetricDescription();

        /**
         * The meta object literal for the '<em><b>Mapper</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MAP__MAPPER = eINSTANCE.getMap_Mapper();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.monitorrepository.map.impl.MapperImpl <em>Mapper</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.monitorrepository.map.impl.MapperImpl
         * @see org.palladiosimulator.monitorrepository.map.impl.MapPackageImpl#getMapper()
         * @generated
         */
        EClass MAPPER = eINSTANCE.getMapper();

        /**
         * The meta object literal for the '<em><b>Map</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MAPPER__MAP = eINSTANCE.getMapper_Map();

        /**
         * The meta object literal for the '{@link org.palladiosimulator.monitorrepository.map.impl.ExponentialSmoothingImpl <em>Exponential Smoothing</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.monitorrepository.map.impl.ExponentialSmoothingImpl
         * @see org.palladiosimulator.monitorrepository.map.impl.MapPackageImpl#getExponentialSmoothing()
         * @generated
         */
        EClass EXPONENTIAL_SMOOTHING = eINSTANCE.getExponentialSmoothing();

        /**
         * The meta object literal for the '<em><b>Smoothing Factor</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXPONENTIAL_SMOOTHING__SMOOTHING_FACTOR = eINSTANCE.getExponentialSmoothing_SmoothingFactor();

        /**
         * The meta object literal for the '<em><b>Smoothed Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EXPONENTIAL_SMOOTHING__SMOOTHED_VALUE = eINSTANCE.getExponentialSmoothing_SmoothedValue();

    }

} //MapPackage
