/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.monitorrepository.DelayedIntervall;
import org.palladiosimulator.monitorrepository.Intervall;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryFactory;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.StatisticalCharacterizationEnum;
import org.palladiosimulator.monitorrepository.TimeFrame;

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
        try
        {
            final MonitorRepositoryFactory theMonitorRepositoryFactory = (MonitorRepositoryFactory) EPackage.Registry.INSTANCE
                    .getEFactory(MonitorRepositoryPackage.eNS_URI);
            if (theMonitorRepositoryFactory != null)
            {
                return theMonitorRepositoryFactory;
            }
        } catch (final Exception exception)
        {
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
        switch (eClass.getClassifierID())
        {
        case MonitorRepositoryPackage.MONITOR_REPOSITORY:
            return this.createMonitorRepository();
        case MonitorRepositoryPackage.MONITOR:
            return this.createMonitor();
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION:
            return this.createMeasurementSpecification();
        case MonitorRepositoryPackage.INTERVALL:
            return this.createIntervall();
        case MonitorRepositoryPackage.DELAYED_INTERVALL:
            return this.createDelayedIntervall();
        case MonitorRepositoryPackage.TIME_FRAME:
            return this.createTimeFrame();
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
        switch (eDataType.getClassifierID())
        {
        case MonitorRepositoryPackage.STATISTICAL_CHARACTERIZATION_ENUM:
            return this.createStatisticalCharacterizationEnumFromString(eDataType, initialValue);
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
        switch (eDataType.getClassifierID())
        {
        case MonitorRepositoryPackage.STATISTICAL_CHARACTERIZATION_ENUM:
            return this.convertStatisticalCharacterizationEnumToString(eDataType, instanceValue);
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
    public Intervall createIntervall() {
        final IntervallImpl intervall = new IntervallImpl();
        return intervall;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DelayedIntervall createDelayedIntervall() {
        final DelayedIntervallImpl delayedIntervall = new DelayedIntervallImpl();
        return delayedIntervall;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TimeFrame createTimeFrame() {
        final TimeFrameImpl timeFrame = new TimeFrameImpl();
        return timeFrame;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public StatisticalCharacterizationEnum createStatisticalCharacterizationEnumFromString(final EDataType eDataType,
            final String initialValue) {
        final StatisticalCharacterizationEnum result = StatisticalCharacterizationEnum.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertStatisticalCharacterizationEnumToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
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
