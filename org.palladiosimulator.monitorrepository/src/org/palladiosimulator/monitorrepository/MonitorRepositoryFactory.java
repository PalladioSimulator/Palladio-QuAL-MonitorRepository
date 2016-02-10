/**
 */
package org.palladiosimulator.monitorrepository;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each
 * non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage
 * @generated
 */
public interface MonitorRepositoryFactory extends EFactory {
    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    MonitorRepositoryFactory eINSTANCE = org.palladiosimulator.monitorrepository.impl.MonitorRepositoryFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Monitor Repository</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Monitor Repository</em>'.
     * @generated
     */
    MonitorRepository createMonitorRepository();

    /**
     * Returns a new object of class '<em>Monitor</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return a new object of class '<em>Monitor</em>'.
     * @generated
     */
    Monitor createMonitor();

    /**
     * Returns a new object of class '<em>Measurement Specification</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Measurement Specification</em>'.
     * @generated
     */
    MeasurementSpecification createMeasurementSpecification();

    /**
     * Returns a new object of class '<em>Arithmetic Mean</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Arithmetic Mean</em>'.
     * @generated
     */
    ArithmeticMean createArithmeticMean();

    /**
     * Returns a new object of class '<em>Harmonic Mean</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Harmonic Mean</em>'.
     * @generated
     */
    HarmonicMean createHarmonicMean();

    /**
     * Returns a new object of class '<em>Geometric Mean</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Geometric Mean</em>'.
     * @generated
     */
    GeometricMean createGeometricMean();

    /**
     * Returns a new object of class '<em>Median</em>'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @return a new object of class '<em>Median</em>'.
     * @generated
     */
    Median createMedian();

    /**
     * Returns a new object of class '<em>Fixed Size Aggregation</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Fixed Size Aggregation</em>'.
     * @generated
     */
    FixedSizeAggregation createFixedSizeAggregation();

    /**
     * Returns a new object of class '<em>Time Driven Variable Size Aggregation</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Time Driven Variable Size Aggregation</em>'.
     * @generated
     */
    TimeDrivenVariableSizeAggregation createTimeDrivenVariableSizeAggregation();

    /**
     * Returns a new object of class '<em>Time Driven</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Time Driven</em>'.
     * @generated
     */
    TimeDriven createTimeDriven();

    /**
     * Returns a new object of class '<em>Measurement Driven Variable Size Aggregation</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Measurement Driven Variable Size Aggregation</em>'.
     * @generated
     */
    MeasurementDrivenVariableSizeAggregation createMeasurementDrivenVariableSizeAggregation();

    /**
     * Returns a new object of class '<em>Single Value</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @return a new object of class '<em>Single Value</em>'.
     * @generated
     */
    SingleValue createSingleValue();

    /**
     * Returns a new object of class '<em>Window Characterization</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Window Characterization</em>'.
     * @generated
     */
    WindowCharacterization createWindowCharacterization();

    /**
     * Returns a new object of class '<em>Retrospective Characterization</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Retrospective Characterization</em>'.
     * @generated
     */
    RetrospectiveCharacterization createRetrospectiveCharacterization();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    MonitorRepositoryPackage getMonitorRepositoryPackage();

} // MonitorRepositoryFactory
