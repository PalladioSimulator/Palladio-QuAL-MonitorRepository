/**
 */
package org.palladiosimulator.monitorrepository.util;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.palladiosimulator.monitorrepository.util.UtilFactory
 * @model kind="package"
 * @generated
 */
public interface UtilPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNAME = "util";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    String eNS_URI = "http://palladiosimulator.org/MonitorRepository/Util/1.0";

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
    UtilPackage eINSTANCE = org.palladiosimulator.monitorrepository.util.impl.UtilPackageImpl.init();

    /**
     * The meta object id for the '<em>Duration</em>' data type. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see javax.measure.quantity.Duration
     * @see org.palladiosimulator.monitorrepository.util.impl.UtilPackageImpl#getDuration()
     * @generated
     */
    int DURATION = 0;

    /**
     * The meta object id for the '<em>Statistical Characterization Aggregator</em>' data type. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.palladiosimulator.monitorrepository.statisticalcharacterization.StatisticalCharacterizationAggregator
     * @see org.palladiosimulator.monitorrepository.util.impl.UtilPackageImpl#getStatisticalCharacterizationAggregator()
     * @generated
     */
    int STATISTICAL_CHARACTERIZATION_AGGREGATOR = 1;

    /**
     * Returns the meta object for data type '{@link javax.measure.quantity.Duration
     * <em>Duration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the meta object for data type '<em>Duration</em>'.
     * @see javax.measure.quantity.Duration
     * @model instanceClass="javax.measure.quantity.Duration"
     * @generated
     */
    EDataType getDuration();

    /**
     * Returns the meta object for data type '
     * {@link org.palladiosimulator.monitorrepository.statisticalcharacterization.StatisticalCharacterizationAggregator
     * <em>Statistical Characterization Aggregator</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @return the meta object for data type '<em>Statistical Characterization Aggregator</em>'.
     * @see org.palladiosimulator.monitorrepository.statisticalcharacterization.StatisticalCharacterizationAggregator
     * @model instanceClass=
     *        "org.palladiosimulator.monitorrepository.statisticalcharacterization.StatisticalCharacterizationAggregator"
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
    UtilFactory getUtilFactory();

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
         * The meta object literal for the '<em>Duration</em>' data type. <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * 
         * @see javax.measure.quantity.Duration
         * @see org.palladiosimulator.monitorrepository.util.impl.UtilPackageImpl#getDuration()
         * @generated
         */
        EDataType DURATION = eINSTANCE.getDuration();

        /**
         * The meta object literal for the '<em>Statistical Characterization Aggregator</em>' data
         * type. <!-- begin-user-doc --> <!-- end-user-doc -->
         * 
         * @see org.palladiosimulator.monitorrepository.statisticalcharacterization.StatisticalCharacterizationAggregator
         * @see org.palladiosimulator.monitorrepository.util.impl.UtilPackageImpl#getStatisticalCharacterizationAggregator()
         * @generated
         */
        EDataType STATISTICAL_CHARACTERIZATION_AGGREGATOR = eINSTANCE.getStatisticalCharacterizationAggregator();

    }

} // UtilPackage
