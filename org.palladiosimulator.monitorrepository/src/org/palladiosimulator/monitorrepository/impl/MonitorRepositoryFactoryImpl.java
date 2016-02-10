/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.StatisticalCharacterizationAggregator;
import org.palladiosimulator.monitorrepository.ArithmeticMean;
import org.palladiosimulator.monitorrepository.FixedSizeAggregation;
import org.palladiosimulator.monitorrepository.GeometricMean;
import org.palladiosimulator.monitorrepository.HarmonicMean;
import org.palladiosimulator.monitorrepository.MeasurementDrivenVariableSizeAggregation;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Median;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryFactory;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.RetrospectiveCharacterization;
import org.palladiosimulator.monitorrepository.SingleValue;
import org.palladiosimulator.monitorrepository.TimeDriven;
import org.palladiosimulator.monitorrepository.TimeDrivenVariableSizeAggregation;
import org.palladiosimulator.monitorrepository.WindowCharacterization;

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
        case MonitorRepositoryPackage.TIME_DRIVEN_VARIABLE_SIZE_AGGREGATION:
            return this.createTimeDrivenVariableSizeAggregation();
        case MonitorRepositoryPackage.TIME_DRIVEN:
            return this.createTimeDriven();
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION:
            return this.createMeasurementDrivenVariableSizeAggregation();
        case MonitorRepositoryPackage.SINGLE_VALUE:
            return this.createSingleValue();
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION:
            return this.createWindowCharacterization();
        case MonitorRepositoryPackage.RETROSPECTIVE_CHARACTERIZATION:
            return this.createRetrospectiveCharacterization();
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
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID()) {
        case MonitorRepositoryPackage.STATISTICAL_CHARACTERIZATION_AGGREGATOR:
            return this.createStatisticalCharacterizationAggregatorFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case MonitorRepositoryPackage.STATISTICAL_CHARACTERIZATION_AGGREGATOR:
            return this.convertStatisticalCharacterizationAggregatorToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
    public TimeDrivenVariableSizeAggregation createTimeDrivenVariableSizeAggregation() {
        final TimeDrivenVariableSizeAggregationImpl timeDrivenVariableSizeAggregation = new TimeDrivenVariableSizeAggregationImpl();
        return timeDrivenVariableSizeAggregation;
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
    public MeasurementDrivenVariableSizeAggregation createMeasurementDrivenVariableSizeAggregation() {
        final MeasurementDrivenVariableSizeAggregationImpl measurementDrivenVariableSizeAggregation = new MeasurementDrivenVariableSizeAggregationImpl();
        return measurementDrivenVariableSizeAggregation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public SingleValue createSingleValue() {
        final SingleValueImpl singleValue = new SingleValueImpl();
        return singleValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public WindowCharacterization createWindowCharacterization() {
        final WindowCharacterizationImpl windowCharacterization = new WindowCharacterizationImpl();
        return windowCharacterization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public RetrospectiveCharacterization createRetrospectiveCharacterization() {
        final RetrospectiveCharacterizationImpl retrospectiveCharacterization = new RetrospectiveCharacterizationImpl();
        return retrospectiveCharacterization;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public StatisticalCharacterizationAggregator createStatisticalCharacterizationAggregatorFromString(
            final EDataType eDataType, final String initialValue) {
        return (StatisticalCharacterizationAggregator) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String convertStatisticalCharacterizationAggregatorToString(final EDataType eDataType,
            final Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
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
