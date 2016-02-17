/**
 */
package org.palladiosimulator.monitorrepository.util.impl;

import javax.measure.quantity.Duration;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.StatisticalCharacterizationAggregator;
import org.palladiosimulator.monitorrepository.util.UtilFactory;
import org.palladiosimulator.monitorrepository.util.UtilPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class UtilFactoryImpl extends EFactoryImpl implements UtilFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static UtilFactory init() {
        try {
            final UtilFactory theUtilFactory = (UtilFactory) EPackage.Registry.INSTANCE
                    .getEFactory(UtilPackage.eNS_URI);
            if (theUtilFactory != null) {
                return theUtilFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new UtilFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public UtilFactoryImpl() {
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
        case UtilPackage.DURATION:
            return this.createDurationFromString(eDataType, initialValue);
        case UtilPackage.STATISTICAL_CHARACTERIZATION_AGGREGATOR:
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
        case UtilPackage.DURATION:
            return this.convertDurationToString(eDataType, instanceValue);
        case UtilPackage.STATISTICAL_CHARACTERIZATION_AGGREGATOR:
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
    public Duration createDurationFromString(final EDataType eDataType, final String initialValue) {
        return (Duration) super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertDurationToString(final EDataType eDataType, final Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
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
    public UtilPackage getUtilPackage() {
        return (UtilPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static UtilPackage getPackage() {
        return UtilPackage.eINSTANCE;
    }

} // UtilFactoryImpl
