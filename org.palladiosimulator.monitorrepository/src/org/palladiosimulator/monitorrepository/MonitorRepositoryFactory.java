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
     * Returns a new object of class '<em>Time Driven Aggregation</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Time Driven Aggregation</em>'.
     * @generated
     */
    TimeDrivenAggregation createTimeDrivenAggregation();

    /**
     * Returns a new object of class '<em>Time Driven</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Time Driven</em>'.
     * @generated
     */
    TimeDriven createTimeDriven();

    /**
     * Returns a new object of class '<em>Variable Size Aggregation</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @return a new object of class '<em>Variable Size Aggregation</em>'.
     * @generated
     */
    VariableSizeAggregation createVariableSizeAggregation();

    /**
     * Returns a new object of class '<em>Feed Through</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return a new object of class '<em>Feed Through</em>'.
     * @generated
     */
    FeedThrough createFeedThrough();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the package supported by this factory.
     * @generated
     */
    MonitorRepositoryPackage getMonitorRepositoryPackage();

} // MonitorRepositoryFactory
