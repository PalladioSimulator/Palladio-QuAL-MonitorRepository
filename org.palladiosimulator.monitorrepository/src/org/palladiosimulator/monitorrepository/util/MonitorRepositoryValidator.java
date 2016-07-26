/**
 */
package org.palladiosimulator.monitorrepository.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.palladiosimulator.monitorrepository.Aggregation;
import org.palladiosimulator.monitorrepository.ArithmeticMean;
import org.palladiosimulator.monitorrepository.FeedThrough;
import org.palladiosimulator.monitorrepository.FixedSizeAggregation;
import org.palladiosimulator.monitorrepository.GeometricMean;
import org.palladiosimulator.monitorrepository.HarmonicMean;
import org.palladiosimulator.monitorrepository.MeasurementDrivenAggregation;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Median;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.ProcessingType;
import org.palladiosimulator.monitorrepository.StatisticalCharacterization;
import org.palladiosimulator.monitorrepository.TimeDriven;
import org.palladiosimulator.monitorrepository.TimeDrivenAggregation;
import org.palladiosimulator.monitorrepository.VariableSizeAggregation;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage
 * @generated
 */
public class MonitorRepositoryValidator extends EObjectValidator {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static final MonitorRepositoryValidator INSTANCE = new MonitorRepositoryValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
     * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.monitorrepository";

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants in a derived class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MonitorRepositoryValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return MonitorRepositoryPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected boolean validate(final int classifierID, final Object value, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        switch (classifierID) {
        case MonitorRepositoryPackage.MONITOR_REPOSITORY:
            return this.validateMonitorRepository((MonitorRepository) value, diagnostics, context);
        case MonitorRepositoryPackage.MONITOR:
            return this.validateMonitor((Monitor) value, diagnostics, context);
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION:
            return this.validateMeasurementSpecification((MeasurementSpecification) value, diagnostics, context);
        case MonitorRepositoryPackage.STATISTICAL_CHARACTERIZATION:
            return this.validateStatisticalCharacterization((StatisticalCharacterization) value, diagnostics, context);
        case MonitorRepositoryPackage.ARITHMETIC_MEAN:
            return this.validateArithmeticMean((ArithmeticMean) value, diagnostics, context);
        case MonitorRepositoryPackage.HARMONIC_MEAN:
            return this.validateHarmonicMean((HarmonicMean) value, diagnostics, context);
        case MonitorRepositoryPackage.GEOMETRIC_MEAN:
            return this.validateGeometricMean((GeometricMean) value, diagnostics, context);
        case MonitorRepositoryPackage.MEDIAN:
            return this.validateMedian((Median) value, diagnostics, context);
        case MonitorRepositoryPackage.PROCESSING_TYPE:
            return this.validateProcessingType((ProcessingType) value, diagnostics, context);
        case MonitorRepositoryPackage.AGGREGATION:
            return this.validateAggregation((Aggregation) value, diagnostics, context);
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_AGGREGATION:
            return this.validateMeasurementDrivenAggregation((MeasurementDrivenAggregation) value, diagnostics,
                    context);
        case MonitorRepositoryPackage.FIXED_SIZE_AGGREGATION:
            return this.validateFixedSizeAggregation((FixedSizeAggregation) value, diagnostics, context);
        case MonitorRepositoryPackage.TIME_DRIVEN_AGGREGATION:
            return this.validateTimeDrivenAggregation((TimeDrivenAggregation) value, diagnostics, context);
        case MonitorRepositoryPackage.TIME_DRIVEN:
            return this.validateTimeDriven((TimeDriven) value, diagnostics, context);
        case MonitorRepositoryPackage.VARIABLE_SIZE_AGGREGATION:
            return this.validateVariableSizeAggregation((VariableSizeAggregation) value, diagnostics, context);
        case MonitorRepositoryPackage.FEED_THROUGH:
            return this.validateFeedThrough((FeedThrough) value, diagnostics, context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateMonitorRepository(final MonitorRepository monitorRepository,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(monitorRepository, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateMonitor(final Monitor monitor, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(monitor, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateMeasurementSpecification(final MeasurementSpecification measurementSpecification,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(measurementSpecification, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateStatisticalCharacterization(final StatisticalCharacterization statisticalCharacterization,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(statisticalCharacterization, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateArithmeticMean(final ArithmeticMean arithmeticMean, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(arithmeticMean, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateHarmonicMean(final HarmonicMean harmonicMean, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(harmonicMean, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateGeometricMean(final GeometricMean geometricMean, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(geometricMean, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateMedian(final Median median, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(median, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateProcessingType(final ProcessingType processingType, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(processingType, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateAggregation(final Aggregation aggregation, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(aggregation, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateMeasurementDrivenAggregation(final MeasurementDrivenAggregation measurementDrivenAggregation,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(measurementDrivenAggregation, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(measurementDrivenAggregation, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(measurementDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(measurementDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(measurementDrivenAggregation, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(measurementDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(measurementDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(measurementDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(measurementDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateMeasurementDrivenAggregation_frequency(measurementDrivenAggregation, diagnostics,
                    context);
        }
        return result;
    }

    /**
     * The cached validation expression for the frequency constraint of '
     * <em>Measurement Driven Aggregation</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static final String MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY__EEXPRESSION = "self.frequency > 0";

    /**
     * Validates the frequency constraint of '<em>Measurement Driven Aggregation</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateMeasurementDrivenAggregation_frequency(
            final MeasurementDrivenAggregation measurementDrivenAggregation, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate(MonitorRepositoryPackage.Literals.MEASUREMENT_DRIVEN_AGGREGATION,
                measurementDrivenAggregation, diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL",
                "frequency", MEASUREMENT_DRIVEN_AGGREGATION__FREQUENCY__EEXPRESSION, Diagnostic.ERROR,
                DIAGNOSTIC_SOURCE, 0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateFixedSizeAggregation(final FixedSizeAggregation fixedSizeAggregation,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(fixedSizeAggregation, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(fixedSizeAggregation, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(fixedSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(fixedSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(fixedSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(fixedSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(fixedSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(fixedSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(fixedSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateMeasurementDrivenAggregation_frequency(fixedSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateFixedSizeAggregation_measNum(fixedSizeAggregation, diagnostics, context);
        }
        return result;
    }

    /**
     * The cached validation expression for the measNum constraint of '
     * <em>Fixed Size Aggregation</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static final String FIXED_SIZE_AGGREGATION__MEAS_NUM__EEXPRESSION = "self.numberOfMeasurements > 0";

    /**
     * Validates the measNum constraint of '<em>Fixed Size Aggregation</em>'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateFixedSizeAggregation_measNum(final FixedSizeAggregation fixedSizeAggregation,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate(MonitorRepositoryPackage.Literals.FIXED_SIZE_AGGREGATION, fixedSizeAggregation,
                diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", "measNum",
                FIXED_SIZE_AGGREGATION__MEAS_NUM__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateTimeDrivenAggregation(final TimeDrivenAggregation timeDrivenAggregation,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(timeDrivenAggregation, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(timeDrivenAggregation, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(timeDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(timeDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(timeDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(timeDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(timeDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(timeDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(timeDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateTimeDriven_windowLength(timeDrivenAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateTimeDriven_windowIncrement(timeDrivenAggregation, diagnostics, context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateTimeDriven(final TimeDriven timeDriven, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(timeDriven, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(timeDriven, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(timeDriven, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(timeDriven, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(timeDriven, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(timeDriven, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(timeDriven, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(timeDriven, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(timeDriven, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateTimeDriven_windowLength(timeDriven, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateTimeDriven_windowIncrement(timeDriven, diagnostics, context);
        }
        return result;
    }

    /**
     * The cached validation expression for the windowLength constraint of '<em>Time Driven</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static final String TIME_DRIVEN__WINDOW_LENGTH__EEXPRESSION = "self.windowLength > 0.0";

    /**
     * Validates the windowLength constraint of '<em>Time Driven</em>'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public boolean validateTimeDriven_windowLength(final TimeDriven timeDriven, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate(MonitorRepositoryPackage.Literals.TIME_DRIVEN, timeDriven, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL", "windowLength", TIME_DRIVEN__WINDOW_LENGTH__EEXPRESSION,
                Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
    }

    /**
     * The cached validation expression for the windowIncrement constraint of '<em>Time Driven</em>
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static final String TIME_DRIVEN__WINDOW_INCREMENT__EEXPRESSION = "self.windowIncrement > 0.0";

    /**
     * Validates the windowIncrement constraint of '<em>Time Driven</em>'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateTimeDriven_windowIncrement(final TimeDriven timeDriven, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate(MonitorRepositoryPackage.Literals.TIME_DRIVEN, timeDriven, diagnostics, context,
                "http://www.eclipse.org/emf/2002/Ecore/OCL", "windowIncrement",
                TIME_DRIVEN__WINDOW_INCREMENT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateVariableSizeAggregation(final VariableSizeAggregation variableSizeAggregation,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(variableSizeAggregation, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(variableSizeAggregation, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(variableSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(variableSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(variableSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(variableSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(variableSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(variableSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(variableSizeAggregation, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateMeasurementDrivenAggregation_frequency(variableSizeAggregation, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validateVariableSizeAggregation_retroLength(variableSizeAggregation, diagnostics, context);
        }
        return result;
    }

    /**
     * The cached validation expression for the retroLength constraint of '
     * <em>Variable Size Aggregation</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static final String VARIABLE_SIZE_AGGREGATION__RETRO_LENGTH__EEXPRESSION = "self.retrospectionLength > 0.0";

    /**
     * Validates the retroLength constraint of '<em>Variable Size Aggregation</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateVariableSizeAggregation_retroLength(final VariableSizeAggregation variableSizeAggregation,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate(MonitorRepositoryPackage.Literals.VARIABLE_SIZE_AGGREGATION, variableSizeAggregation,
                diagnostics, context, "http://www.eclipse.org/emf/2002/Ecore/OCL", "retroLength",
                VARIABLE_SIZE_AGGREGATION__RETRO_LENGTH__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public boolean validateFeedThrough(final FeedThrough feedThrough, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(feedThrough, diagnostics, context);
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's
     * diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} // MonitorRepositoryValidator
