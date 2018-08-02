/**
 */
package org.palladiosimulator.monitorrepository.map.util;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.palladiosimulator.monitorrepository.map.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.monitorrepository.map.MapPackage
 * @generated
 */
public class MapValidator extends EObjectValidator {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final MapValidator INSTANCE = new MapValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "org.palladiosimulator.monitorrepository.map";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Is Metric Numerical Base Metric' of 'Exponential Smoothing'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final int EXPONENTIAL_SMOOTHING__IS_METRIC_NUMERICAL_BASE_METRIC = 1;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MapValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
      return MapPackage.eINSTANCE;
    }

    /**
     * Calls <code>validateXXX</code> for the corresponding classifier of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
        switch (classifierID) {
            case MapPackage.MAP:
                return validateMap((org.palladiosimulator.monitorrepository.map.Map)value, diagnostics, context);
            case MapPackage.MAPPER:
                return validateMapper((Mapper)value, diagnostics, context);
            case MapPackage.EXPONENTIAL_SMOOTHING:
                return validateExponentialSmoothing((ExponentialSmoothing)value, diagnostics, context);
            default:
                return true;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMap(org.palladiosimulator.monitorrepository.map.Map map, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(map, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateMapper(Mapper mapper, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return validate_EveryDefaultConstraint(mapper, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateExponentialSmoothing(ExponentialSmoothing exponentialSmoothing, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (!validate_NoCircularContainment(exponentialSmoothing, diagnostics, context)) return false;
        boolean result = validate_EveryMultiplicityConforms(exponentialSmoothing, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exponentialSmoothing, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exponentialSmoothing, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(exponentialSmoothing, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryProxyResolves(exponentialSmoothing, diagnostics, context);
        if (result || diagnostics != null) result &= validate_UniqueID(exponentialSmoothing, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryKeyUnique(exponentialSmoothing, diagnostics, context);
        if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(exponentialSmoothing, diagnostics, context);
        if (result || diagnostics != null) result &= validateExponentialSmoothing_alpha(exponentialSmoothing, diagnostics, context);
        if (result || diagnostics != null) result &= validateExponentialSmoothing_mapping(exponentialSmoothing, diagnostics, context);
        if (result || diagnostics != null) result &= validateExponentialSmoothing_isMetricNumericalBaseMetric(exponentialSmoothing, diagnostics, context);
        return result;
    }

    /**
     * The cached validation expression for the alpha constraint of '<em>Exponential Smoothing</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String EXPONENTIAL_SMOOTHING__ALPHA__EEXPRESSION = "self.smoothingFactor >= 0 and self.smoothingFactor <=1";

    /**
     * Validates the alpha constraint of '<em>Exponential Smoothing</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateExponentialSmoothing_alpha(ExponentialSmoothing exponentialSmoothing, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (MapPackage.Literals.EXPONENTIAL_SMOOTHING,
                 exponentialSmoothing,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL",
                 "alpha",
                 EXPONENTIAL_SMOOTHING__ALPHA__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * The cached validation expression for the mapping constraint of '<em>Exponential Smoothing</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static final String EXPONENTIAL_SMOOTHING__MAPPING__EEXPRESSION = "self.map.outputMetricDescription.id = self.map.measurementSpecification.metricDescription.id";

    /**
     * Validates the mapping constraint of '<em>Exponential Smoothing</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateExponentialSmoothing_mapping(ExponentialSmoothing exponentialSmoothing, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return
            validate
                (MapPackage.Literals.EXPONENTIAL_SMOOTHING,
                 exponentialSmoothing,
                 diagnostics,
                 context,
                 "http://www.eclipse.org/emf/2002/Ecore/OCL",
                 "mapping",
                 EXPONENTIAL_SMOOTHING__MAPPING__EEXPRESSION,
                 Diagnostic.ERROR,
                 DIAGNOSTIC_SOURCE,
                 0);
    }

    /**
     * Validates the isMetricNumericalBaseMetric constraint of '<em>Exponential Smoothing</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean validateExponentialSmoothing_isMetricNumericalBaseMetric(ExponentialSmoothing exponentialSmoothing, DiagnosticChain diagnostics, Map<Object, Object> context) {
        return exponentialSmoothing.isMetricNumericalBaseMetric(diagnostics, context);
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        // TODO
        // Specialize this to return a resource locator for messages specific to this validator.
        // Ensure that you remove @generated or mark it @generated NOT
        return super.getResourceLocator();
    }

} //MapValidator
