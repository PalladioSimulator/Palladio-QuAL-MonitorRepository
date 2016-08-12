/**
 */
package org.palladiosimulator.monitorrepository.map.util;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.monitorrepository.map.util.UtilFactory
 * @model kind="package"
 * @generated
 */
public interface UtilPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "util";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/MonitorRepository/Map/Util/1.0";

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
    UtilPackage eINSTANCE = org.palladiosimulator.monitorrepository.map.util.impl.UtilPackageImpl.init();

    /**
     * The meta object id for the '<em>Measuring Value</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.measurementframework.MeasuringValue
     * @see org.palladiosimulator.monitorrepository.map.util.impl.UtilPackageImpl#getMeasuringValue()
     * @generated
     */
    int MEASURING_VALUE = 0;

    /**
     * The meta object id for the '<em>Tuple Measurement</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.palladiosimulator.measurementframework.TupleMeasurement
     * @see org.palladiosimulator.monitorrepository.map.util.impl.UtilPackageImpl#getTupleMeasurement()
     * @generated
     */
    int TUPLE_MEASUREMENT = 1;

    /**
     * The meta object id for the '<em>Func</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.util.function.UnaryOperator
     * @see org.palladiosimulator.monitorrepository.map.util.impl.UtilPackageImpl#getFunc()
     * @generated
     */
    int FUNC = 2;


    /**
     * Returns the meta object for data type '{@link org.palladiosimulator.measurementframework.MeasuringValue <em>Measuring Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Measuring Value</em>'.
     * @see org.palladiosimulator.measurementframework.MeasuringValue
     * @model instanceClass="org.palladiosimulator.measurementframework.MeasuringValue"
     * @generated
     */
    EDataType getMeasuringValue();

    /**
     * Returns the meta object for data type '{@link org.palladiosimulator.measurementframework.TupleMeasurement <em>Tuple Measurement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Tuple Measurement</em>'.
     * @see org.palladiosimulator.measurementframework.TupleMeasurement
     * @model instanceClass="org.palladiosimulator.measurementframework.TupleMeasurement"
     * @generated
     */
    EDataType getTupleMeasurement();

    /**
     * Returns the meta object for data type '{@link java.util.function.UnaryOperator <em>Func</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Func</em>'.
     * @see java.util.function.UnaryOperator
     * @model instanceClass="java.util.function.UnaryOperator" typeParameters="T"
     * @generated
     */
    EDataType getFunc();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    UtilFactory getUtilFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '<em>Measuring Value</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.measurementframework.MeasuringValue
         * @see org.palladiosimulator.monitorrepository.map.util.impl.UtilPackageImpl#getMeasuringValue()
         * @generated
         */
        EDataType MEASURING_VALUE = eINSTANCE.getMeasuringValue();

        /**
         * The meta object literal for the '<em>Tuple Measurement</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.palladiosimulator.measurementframework.TupleMeasurement
         * @see org.palladiosimulator.monitorrepository.map.util.impl.UtilPackageImpl#getTupleMeasurement()
         * @generated
         */
        EDataType TUPLE_MEASUREMENT = eINSTANCE.getTupleMeasurement();

        /**
         * The meta object literal for the '<em>Func</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.util.function.UnaryOperator
         * @see org.palladiosimulator.monitorrepository.map.util.impl.UtilPackageImpl#getFunc()
         * @generated
         */
        EDataType FUNC = eINSTANCE.getFunc();

    }

} //UtilPackage
