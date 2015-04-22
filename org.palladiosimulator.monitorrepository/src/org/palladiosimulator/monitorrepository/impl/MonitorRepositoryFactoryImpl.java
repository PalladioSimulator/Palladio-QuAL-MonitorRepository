/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.monitorrepository.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonitorRepositoryFactoryImpl extends EFactoryImpl implements MonitorRepositoryFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static MonitorRepositoryFactory init() {
        try {
            MonitorRepositoryFactory theMonitorRepositoryFactory = (MonitorRepositoryFactory) EPackage.Registry.INSTANCE
                    .getEFactory(MonitorRepositoryPackage.eNS_URI);
            if (theMonitorRepositoryFactory != null) {
                return theMonitorRepositoryFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new MonitorRepositoryFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonitorRepositoryFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case MonitorRepositoryPackage.MONITOR_REPOSITORY:
            return createMonitorRepository();
        case MonitorRepositoryPackage.MONITOR:
            return createMonitor();
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION:
            return createMeasurementSpecification();
        case MonitorRepositoryPackage.INTERVALL:
            return createIntervall();
        case MonitorRepositoryPackage.DELAYED_INTERVALL:
            return createDelayedIntervall();
        case MonitorRepositoryPackage.TIME_FRAME:
            return createTimeFrame();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case MonitorRepositoryPackage.STATISTICAL_CHARACTERIZATION_ENUM:
            return createStatisticalCharacterizationEnumFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case MonitorRepositoryPackage.STATISTICAL_CHARACTERIZATION_ENUM:
            return convertStatisticalCharacterizationEnumToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonitorRepository createMonitorRepository() {
        MonitorRepositoryImpl monitorRepository = new MonitorRepositoryImpl();
        return monitorRepository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Monitor createMonitor() {
        MonitorImpl monitor = new MonitorImpl();
        return monitor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasurementSpecification createMeasurementSpecification() {
        MeasurementSpecificationImpl measurementSpecification = new MeasurementSpecificationImpl();
        return measurementSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Intervall createIntervall() {
        IntervallImpl intervall = new IntervallImpl();
        return intervall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DelayedIntervall createDelayedIntervall() {
        DelayedIntervallImpl delayedIntervall = new DelayedIntervallImpl();
        return delayedIntervall;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeFrame createTimeFrame() {
        TimeFrameImpl timeFrame = new TimeFrameImpl();
        return timeFrame;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StatisticalCharacterizationEnum createStatisticalCharacterizationEnumFromString(EDataType eDataType,
            String initialValue) {
        StatisticalCharacterizationEnum result = StatisticalCharacterizationEnum.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertStatisticalCharacterizationEnumToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MonitorRepositoryPackage getMonitorRepositoryPackage() {
        return (MonitorRepositoryPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static MonitorRepositoryPackage getPackage() {
        return MonitorRepositoryPackage.eINSTANCE;
    }

} //MonitorRepositoryFactoryImpl
