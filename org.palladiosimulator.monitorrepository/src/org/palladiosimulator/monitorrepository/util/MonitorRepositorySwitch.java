/**
 */
package org.palladiosimulator.monitorrepository.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.monitorrepository.Aggregation;
import org.palladiosimulator.monitorrepository.ArithmeticMean;
import org.palladiosimulator.monitorrepository.FixedSizeAggregation;
import org.palladiosimulator.monitorrepository.GeometricMean;
import org.palladiosimulator.monitorrepository.HarmonicMean;
import org.palladiosimulator.monitorrepository.MeasurementDrivenVariableSizeAggregation;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.Median;
import org.palladiosimulator.monitorrepository.Monitor;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.RetrospectiveCharacterization;
import org.palladiosimulator.monitorrepository.SingleValue;
import org.palladiosimulator.monitorrepository.SpecificationKind;
import org.palladiosimulator.monitorrepository.StatisticalCharacterization;
import org.palladiosimulator.monitorrepository.TimeDriven;
import org.palladiosimulator.monitorrepository.TimeDrivenVariableSizeAggregation;
import org.palladiosimulator.monitorrepository.WindowCharacterization;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * 
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage
 * @generated
 */
public class MonitorRepositorySwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected static MonitorRepositoryPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public MonitorRepositorySwitch() {
        if (modelPackage == null) {
            modelPackage = MonitorRepositoryPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param ePackage
     *            the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID) {
        case MonitorRepositoryPackage.MONITOR_REPOSITORY: {
            final MonitorRepository monitorRepository = (MonitorRepository) theEObject;
            T result = this.caseMonitorRepository(monitorRepository);
            if (result == null) {
                result = this.caseEntity(monitorRepository);
            }
            if (result == null) {
                result = this.caseIdentifier(monitorRepository);
            }
            if (result == null) {
                result = this.caseNamedElement(monitorRepository);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.MONITOR: {
            final Monitor monitor = (Monitor) theEObject;
            T result = this.caseMonitor(monitor);
            if (result == null) {
                result = this.caseEntity(monitor);
            }
            if (result == null) {
                result = this.caseIdentifier(monitor);
            }
            if (result == null) {
                result = this.caseNamedElement(monitor);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION: {
            final MeasurementSpecification measurementSpecification = (MeasurementSpecification) theEObject;
            T result = this.caseMeasurementSpecification(measurementSpecification);
            if (result == null) {
                result = this.caseIdentifier(measurementSpecification);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.STATISTICAL_CHARACTERIZATION: {
            final StatisticalCharacterization statisticalCharacterization = (StatisticalCharacterization) theEObject;
            T result = this.caseStatisticalCharacterization(statisticalCharacterization);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.ARITHMETIC_MEAN: {
            final ArithmeticMean arithmeticMean = (ArithmeticMean) theEObject;
            T result = this.caseArithmeticMean(arithmeticMean);
            if (result == null) {
                result = this.caseStatisticalCharacterization(arithmeticMean);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.HARMONIC_MEAN: {
            final HarmonicMean harmonicMean = (HarmonicMean) theEObject;
            T result = this.caseHarmonicMean(harmonicMean);
            if (result == null) {
                result = this.caseStatisticalCharacterization(harmonicMean);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.GEOMETRIC_MEAN: {
            final GeometricMean geometricMean = (GeometricMean) theEObject;
            T result = this.caseGeometricMean(geometricMean);
            if (result == null) {
                result = this.caseStatisticalCharacterization(geometricMean);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.MEDIAN: {
            final Median median = (Median) theEObject;
            T result = this.caseMedian(median);
            if (result == null) {
                result = this.caseStatisticalCharacterization(median);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.SPECIFICATION_KIND: {
            final SpecificationKind specificationKind = (SpecificationKind) theEObject;
            T result = this.caseSpecificationKind(specificationKind);
            if (result == null) {
                result = this.caseIdentifier(specificationKind);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.AGGREGATION: {
            final Aggregation aggregation = (Aggregation) theEObject;
            T result = this.caseAggregation(aggregation);
            if (result == null) {
                result = this.caseSpecificationKind(aggregation);
            }
            if (result == null) {
                result = this.caseIdentifier(aggregation);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.FIXED_SIZE_AGGREGATION: {
            final FixedSizeAggregation fixedSizeAggregation = (FixedSizeAggregation) theEObject;
            T result = this.caseFixedSizeAggregation(fixedSizeAggregation);
            if (result == null) {
                result = this.caseAggregation(fixedSizeAggregation);
            }
            if (result == null) {
                result = this.caseSpecificationKind(fixedSizeAggregation);
            }
            if (result == null) {
                result = this.caseIdentifier(fixedSizeAggregation);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.TIME_DRIVEN_VARIABLE_SIZE_AGGREGATION: {
            final TimeDrivenVariableSizeAggregation timeDrivenVariableSizeAggregation = (TimeDrivenVariableSizeAggregation) theEObject;
            T result = this.caseTimeDrivenVariableSizeAggregation(timeDrivenVariableSizeAggregation);
            if (result == null) {
                result = this.caseTimeDriven(timeDrivenVariableSizeAggregation);
            }
            if (result == null) {
                result = this.caseAggregation(timeDrivenVariableSizeAggregation);
            }
            if (result == null) {
                result = this.caseSpecificationKind(timeDrivenVariableSizeAggregation);
            }
            if (result == null) {
                result = this.caseIdentifier(timeDrivenVariableSizeAggregation);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.TIME_DRIVEN: {
            final TimeDriven timeDriven = (TimeDriven) theEObject;
            T result = this.caseTimeDriven(timeDriven);
            if (result == null) {
                result = this.caseSpecificationKind(timeDriven);
            }
            if (result == null) {
                result = this.caseIdentifier(timeDriven);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.MEASUREMENT_DRIVEN_VARIABLE_SIZE_AGGREGATION: {
            final MeasurementDrivenVariableSizeAggregation measurementDrivenVariableSizeAggregation = (MeasurementDrivenVariableSizeAggregation) theEObject;
            T result = this.caseMeasurementDrivenVariableSizeAggregation(measurementDrivenVariableSizeAggregation);
            if (result == null) {
                result = this.caseAggregation(measurementDrivenVariableSizeAggregation);
            }
            if (result == null) {
                result = this.caseSpecificationKind(measurementDrivenVariableSizeAggregation);
            }
            if (result == null) {
                result = this.caseIdentifier(measurementDrivenVariableSizeAggregation);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.SINGLE_VALUE: {
            final SingleValue singleValue = (SingleValue) theEObject;
            T result = this.caseSingleValue(singleValue);
            if (result == null) {
                result = this.caseSpecificationKind(singleValue);
            }
            if (result == null) {
                result = this.caseIdentifier(singleValue);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.WINDOW_CHARACTERIZATION: {
            final WindowCharacterization windowCharacterization = (WindowCharacterization) theEObject;
            T result = this.caseWindowCharacterization(windowCharacterization);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case MonitorRepositoryPackage.RETROSPECTIVE_CHARACTERIZATION: {
            final RetrospectiveCharacterization retrospectiveCharacterization = (RetrospectiveCharacterization) theEObject;
            T result = this.caseRetrospectiveCharacterization(retrospectiveCharacterization);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Monitor Repository</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Monitor Repository</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMonitorRepository(final MonitorRepository object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Monitor</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Monitor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMonitor(final Monitor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Measurement Specification</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Measurement Specification</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurementSpecification(final MeasurementSpecification object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Statistical Characterization</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Statistical Characterization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStatisticalCharacterization(final StatisticalCharacterization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Arithmetic Mean</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Arithmetic Mean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArithmeticMean(final ArithmeticMean object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Harmonic Mean</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Harmonic Mean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHarmonicMean(final HarmonicMean object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Geometric Mean</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Geometric Mean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGeometricMean(final GeometricMean object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Median</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Median</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMedian(final Median object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Specification Kind</em>
     * '. <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Specification Kind</em>
     *         '.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSpecificationKind(final SpecificationKind object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAggregation(final Aggregation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Fixed Size Aggregation</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Fixed Size Aggregation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFixedSizeAggregation(final FixedSizeAggregation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Time Driven Variable Size Aggregation</em>'. <!-- begin-user-doc --> This implementation
     * returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Time Driven Variable Size Aggregation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeDrivenVariableSizeAggregation(final TimeDrivenVariableSizeAggregation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Driven</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Driven</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeDriven(final TimeDriven object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Measurement Driven Variable Size Aggregation</em>'. <!-- begin-user-doc --> This
     * implementation returns null; returning a non-null result will terminate the switch. <!--
     * end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Measurement Driven Variable Size Aggregation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasurementDrivenVariableSizeAggregation(final MeasurementDrivenVariableSizeAggregation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Single Value</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Single Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSingleValue(final SingleValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Window Characterization</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Window Characterization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindowCharacterization(final WindowCharacterization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Retrospective Characterization</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Retrospective Characterization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRetrospectiveCharacterization(final RetrospectiveCharacterization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     * 
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(final NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(final Entity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
     * begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(final EObject object) {
        return null;
    }

} // MonitorRepositorySwitch
