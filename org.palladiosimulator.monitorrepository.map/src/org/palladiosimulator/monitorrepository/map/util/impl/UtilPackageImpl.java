/**
 */
package org.palladiosimulator.monitorrepository.map.util.impl;

import java.util.function.UnaryOperator;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.measurementframework.TupleMeasurement;

import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

import org.palladiosimulator.monitorrepository.map.MapPackage;

import org.palladiosimulator.monitorrepository.map.impl.MapPackageImpl;

import org.palladiosimulator.monitorrepository.map.util.UtilFactory;
import org.palladiosimulator.monitorrepository.map.util.UtilPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilPackageImpl extends EPackageImpl implements UtilPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType measuringValueEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType tupleMeasurementEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType funcEDataType = null;

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
     * @see org.palladiosimulator.monitorrepository.map.util.UtilPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private UtilPackageImpl() {
        super(eNS_URI, UtilFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link UtilPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static UtilPackage init() {
        if (isInited) return (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

        // Obtain or create and register package
        UtilPackageImpl theUtilPackage = (UtilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UtilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UtilPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        MonitorRepositoryPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        MapPackageImpl theMapPackage = (MapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MapPackage.eNS_URI) instanceof MapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MapPackage.eNS_URI) : MapPackage.eINSTANCE);

        // Create package meta-data objects
        theUtilPackage.createPackageContents();
        theMapPackage.createPackageContents();

        // Initialize created meta-data
        theUtilPackage.initializePackageContents();
        theMapPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theUtilPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(UtilPackage.eNS_URI, theUtilPackage);
        return theUtilPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMeasuringValue() {
        return measuringValueEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTupleMeasurement() {
        return tupleMeasurementEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getFunc() {
        return funcEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UtilFactory getUtilFactory() {
        return (UtilFactory)getEFactoryInstance();
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

        // Create data types
        measuringValueEDataType = createEDataType(MEASURING_VALUE);
        tupleMeasurementEDataType = createEDataType(TUPLE_MEASUREMENT);
        funcEDataType = createEDataType(FUNC);
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

        // Initialize data types
        initEDataType(measuringValueEDataType, MeasuringValue.class, "MeasuringValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(tupleMeasurementEDataType, TupleMeasurement.class, "TupleMeasurement", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(funcEDataType, UnaryOperator.class, "Func", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    }

} //UtilPackageImpl
