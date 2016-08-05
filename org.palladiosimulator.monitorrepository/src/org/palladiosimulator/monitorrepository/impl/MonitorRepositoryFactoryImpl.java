/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.monitorrepository.ArithmeticMean;
import org.palladiosimulator.monitorrepository.FeedThrough;
import org.palladiosimulator.monitorrepository.FixedSizeAggregation;
import org.palladiosimulator.monitorrepository.GeometricMean;
import org.palladiosimulator.monitorrepository.HarmonicMean;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Median;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryFactory;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.TimeDriven;
import org.palladiosimulator.monitorrepository.TimeDrivenAggregation;
import org.palladiosimulator.monitorrepository.VariableSizeAggregation;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class MonitorRepositoryFactoryImpl extends EFactoryImpl implements MonitorRepositoryFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static MonitorRepositoryFactory init() {
        try {
            final MonitorRepositoryFactory theMonitorRepositoryFactory = (MonitorRepositoryFactory) EPackage.Registry.INSTANCE
                    .getEFactory(MonitorRepositoryPackage.eNS_URI);
            if (theMonitorRepositoryFactory != null) {
                return theMonitorRepositoryFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MonitorRepositoryFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MonitorRepositoryFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case MonitorRepositoryPackage.MONITOR_REPOSITORY:
            return this.createMonitorRepository();
        case MonitorRepositoryPackage.MONITOR:
            return this.createMonitor();
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION:
            return this.createMeasurementSpecification();
        case MonitorRepositoryPackage.ARITHMETIC_MEAN:
            return this.createArithmeticMean();
        case MonitorRepositoryPackage.HARMONIC_MEAN:
            return this.createHarmonicMean();
        case MonitorRepositoryPackage.GEOMETRIC_MEAN:
            return this.createGeometricMean();
        case MonitorRepositoryPackage.MEDIAN:
            return this.createMedian();
        case MonitorRepositoryPackage.FIXED_SIZE_AGGREGATION:
            return this.createFixedSizeAggregation();
        case MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION:
            return this.createTimeDrivenAggregation();
        case MonitorRepositoryPackage.TIME_DRIVEN:
            return this.createTimeDriven();
        case MonitorRepositoryPackage.VARIABLE_SIZE_AGGREGATION:
            return this.createVariableSizeAggregation();
        case MonitorRepositoryPackage.FEED_THROUGH:
            return this.createFeedThrough();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MonitorRepository createMonitorRepository() {
        final MonitorRepositoryImpl monitorRepository = new MonitorRepositoryImpl();
        return monitorRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Monitor createMonitor() {
        final MonitorImpl monitor = new MonitorImpl();
        return monitor;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MeasurementSpecification createMeasurementSpecification() {
        final MeasurementSpecificationImpl measurementSpecification = new MeasurementSpecificationImpl();
        return measurementSpecification;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ArithmeticMean createArithmeticMean() {
        final ArithmeticMeanImpl arithmeticMean = new ArithmeticMeanImpl();
        return arithmeticMean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public HarmonicMean createHarmonicMean() {
        final HarmonicMeanImpl harmonicMean = new HarmonicMeanImpl();
        return harmonicMean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public GeometricMean createGeometricMean() {
        final GeometricMeanImpl geometricMean = new GeometricMeanImpl();
        return geometricMean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Median createMedian() {
        final MedianImpl median = new MedianImpl();
        return median;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public FixedSizeAggregation createFixedSizeAggregation() {
        final FixedSizeAggregationImpl fixedSizeAggregation = new FixedSizeAggregationImpl();
        return fixedSizeAggregation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public TimeDrivenAggregation createTimeDrivenAggregation() {
        final TimeDrivenAggregationImpl timeDrivenAggregation = new TimeDrivenAggregationImpl();
        return timeDrivenAggregation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public TimeDriven createTimeDriven() {
        final TimeDrivenImpl timeDriven = new TimeDrivenImpl();
        return timeDriven;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public VariableSizeAggregation createVariableSizeAggregation() {
        final VariableSizeAggregationImpl variableSizeAggregation = new VariableSizeAggregationImpl();
        return variableSizeAggregation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public FeedThrough createFeedThrough() {
        final FeedThroughImpl feedThrough = new FeedThroughImpl();
        return feedThrough;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public MonitorRepositoryPackage getMonitorRepositoryPackage() {
        return (MonitorRepositoryPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MonitorRepositoryPackage getPackage() {
        return MonitorRepositoryPackage.eINSTANCE;
    }

} // MonitorRepositoryFactoryImpl
