/**
 */
package org.palladiosimulator.monitorrepository.map.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.edp2.models.ExperimentData.ExperimentDataPackage;
import org.palladiosimulator.metricspec.MetricSpecPackage;

import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

import org.palladiosimulator.monitorrepository.map.ExponentialSmoothing;
import org.palladiosimulator.monitorrepository.map.Map;
import org.palladiosimulator.monitorrepository.map.MapFactory;
import org.palladiosimulator.monitorrepository.map.MapPackage;

import org.palladiosimulator.monitorrepository.map.Mapper;
import org.palladiosimulator.monitorrepository.map.util.MapValidator;
import org.palladiosimulator.monitorrepository.map.util.UtilPackage;
import org.palladiosimulator.monitorrepository.map.util.impl.UtilPackageImpl;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MapPackageImpl extends EPackageImpl implements MapPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mapEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mapperEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exponentialSmoothingEClass = null;

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
     * @see org.palladiosimulator.monitorrepository.map.MapPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private MapPackageImpl() {
        super(eNS_URI, MapFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link MapPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static MapPackage init() {
        if (isInited) return (MapPackage)EPackage.Registry.INSTANCE.getEPackage(MapPackage.eNS_URI);

        // Obtain or create and register package
        MapPackageImpl theMapPackage = (MapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MapPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        MonitorRepositoryPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI) : UtilPackage.eINSTANCE);

        // Create package meta-data objects
        theMapPackage.createPackageContents();
        theUtilPackage.createPackageContents();

        // Initialize created meta-data
        theMapPackage.initializePackageContents();
        theUtilPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theMapPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return MapValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theMapPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MapPackage.eNS_URI, theMapPackage);
        return theMapPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMap() {
        return mapEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMap_OutputMetricDescription() {
        return (EReference)mapEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMap_Mapper() {
        return (EReference)mapEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMapper() {
        return mapperEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMapper_Map() {
        return (EReference)mapperEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExponentialSmoothing() {
        return exponentialSmoothingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExponentialSmoothing_SmoothingFactor() {
        return (EAttribute)exponentialSmoothingEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExponentialSmoothing_SmoothedValue() {
        return (EAttribute)exponentialSmoothingEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MapFactory getMapFactory() {
        return (MapFactory)getEFactoryInstance();
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
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        mapEClass = createEClass(MAP);
        createEReference(mapEClass, MAP__OUTPUT_METRIC_DESCRIPTION);
        createEReference(mapEClass, MAP__MAPPER);

        mapperEClass = createEClass(MAPPER);
        createEReference(mapperEClass, MAPPER__MAP);

        exponentialSmoothingEClass = createEClass(EXPONENTIAL_SMOOTHING);
        createEAttribute(exponentialSmoothingEClass, EXPONENTIAL_SMOOTHING__SMOOTHING_FACTOR);
        createEAttribute(exponentialSmoothingEClass, EXPONENTIAL_SMOOTHING__SMOOTHED_VALUE);
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
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);
        MonitorRepositoryPackage theMonitorRepositoryPackage = (MonitorRepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(MonitorRepositoryPackage.eNS_URI);
        EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
        MetricSpecPackage theMetricSpecPackage = (MetricSpecPackage)EPackage.Registry.INSTANCE.getEPackage(MetricSpecPackage.eNS_URI);
        IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
        ExperimentDataPackage theExperimentDataPackage = (ExperimentDataPackage)EPackage.Registry.INSTANCE.getEPackage(ExperimentDataPackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theUtilPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        mapEClass.getESuperTypes().add(theMonitorRepositoryPackage.getProcessingType());
        mapEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
        mapperEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        exponentialSmoothingEClass.getESuperTypes().add(this.getMapper());

        // Initialize classes and features; add operations and parameters
        initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMap_OutputMetricDescription(), theMetricSpecPackage.getMetricDescription(), null, "outputMetricDescription", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMap_Mapper(), this.getMapper(), this.getMapper_Map(), "mapper", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        EOperation op = addEOperation(mapEClass, theUtilPackage.getMeasuringValue(), "apply", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, theUtilPackage.getMeasuringValue(), "newMeasurement", 0, 1, IS_UNIQUE, IS_ORDERED);

        initEClass(mapperEClass, Mapper.class, "Mapper", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMapper_Map(), this.getMap(), this.getMap_Mapper(), "map", null, 0, 1, Mapper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = addEOperation(mapperEClass, null, "getMappingFunction", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = createEGenericType(theUtilPackage.getFunc());
        EGenericType g2 = createEGenericType(theUtilPackage.getMeasuringValue());
        g1.getETypeArguments().add(g2);
        initEOperation(op, g1);

        initEClass(exponentialSmoothingEClass, ExponentialSmoothing.class, "ExponentialSmoothing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getExponentialSmoothing_SmoothingFactor(), ecorePackage.getEDouble(), "smoothingFactor", "0.5", 1, 1, ExponentialSmoothing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        g1 = createEGenericType(theExperimentDataPackage.getEJSMeasure());
        g2 = createEGenericType(ecorePackage.getEDoubleObject());
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType(theMetricSpecPackage.getIJSQuantity());
        g1.getETypeArguments().add(g2);
        initEAttribute(getExponentialSmoothing_SmoothedValue(), g1, "smoothedValue", "", 0, 1, ExponentialSmoothing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        op = addEOperation(exponentialSmoothingEClass, null, "getMappingFunction", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(theUtilPackage.getFunc());
        g2 = createEGenericType(theUtilPackage.getMeasuringValue());
        g1.getETypeArguments().add(g2);
        initEOperation(op, g1);

        op = addEOperation(exponentialSmoothingEClass, ecorePackage.getEBoolean(), "isMetricNumericalBaseMetric", 0, 1, IS_UNIQUE, IS_ORDERED);
        addEParameter(op, ecorePackage.getEDiagnosticChain(), "chain", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = createEGenericType(ecorePackage.getEMap());
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        g2 = createEGenericType();
        g1.getETypeArguments().add(g2);
        addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

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
        addAnnotation
          (this, 
           source, 
           new String[] {
             "metricspec", "../../../plugin/org.palladiosimulator.metricspec/model/metricspec.ecore#/",
             "monitorrepository", "../../../plugin/org.palladiosimulator.monitorrepository/model/monitorrepository.ecore#/"
           });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore";	
        addAnnotation
          (this, 
           source, 
           new String[] {
             "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
             "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
             "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
           });	
        addAnnotation
          (exponentialSmoothingEClass, 
           source, 
           new String[] {
             "constraints", "alpha mapping"
           });	
        addAnnotation
          (exponentialSmoothingEClass.getEOperations().get(0), 
           source, 
           new String[] {
             "suppressedSetVisibility", "true"
           });
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createOCLAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
        addAnnotation
          (exponentialSmoothingEClass, 
           source, 
           new String[] {
             "alpha", "self.smoothingFactor >= 0 and self.smoothingFactor <=1",
             "mapping", "self.map.outputMetricDescription.id = self.map.measurementSpecification.metricDescription.id"
           });
    }

} //MapPackageImpl
