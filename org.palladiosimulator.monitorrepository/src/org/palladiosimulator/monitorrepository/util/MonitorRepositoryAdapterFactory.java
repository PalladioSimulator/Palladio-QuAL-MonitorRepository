/**
 */
package org.palladiosimulator.monitorrepository.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage
 * @generated
 */
public class MonitorRepositoryAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static MonitorRepositoryPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MonitorRepositoryAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = MonitorRepositoryPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected MonitorRepositorySwitch<Adapter> modelSwitch = new MonitorRepositorySwitch<Adapter>() {
        @Override
        public Adapter caseMonitorRepository(final MonitorRepository object) {
            return MonitorRepositoryAdapterFactory.this.createMonitorRepositoryAdapter();
        }

        @Override
        public Adapter caseMonitor(final Monitor object) {
            return MonitorRepositoryAdapterFactory.this.createMonitorAdapter();
        }

        @Override
        public Adapter caseMeasurementSpecification(final MeasurementSpecification object) {
            return MonitorRepositoryAdapterFactory.this.createMeasurementSpecificationAdapter();
        }

        @Override
        public Adapter caseStatisticalCharacterization(final StatisticalCharacterization object) {
            return MonitorRepositoryAdapterFactory.this.createStatisticalCharacterizationAdapter();
        }

        @Override
        public Adapter caseArithmeticMean(final ArithmeticMean object) {
            return MonitorRepositoryAdapterFactory.this.createArithmeticMeanAdapter();
        }

        @Override
        public Adapter caseHarmonicMean(final HarmonicMean object) {
            return MonitorRepositoryAdapterFactory.this.createHarmonicMeanAdapter();
        }

        @Override
        public Adapter caseGeometricMean(final GeometricMean object) {
            return MonitorRepositoryAdapterFactory.this.createGeometricMeanAdapter();
        }

        @Override
        public Adapter caseMedian(final Median object) {
            return MonitorRepositoryAdapterFactory.this.createMedianAdapter();
        }

        @Override
        public Adapter caseProcessingType(final ProcessingType object) {
            return MonitorRepositoryAdapterFactory.this.createProcessingTypeAdapter();
        }

        @Override
        public Adapter caseAggregation(final Aggregation object) {
            return MonitorRepositoryAdapterFactory.this.createAggregationAdapter();
        }

        @Override
        public Adapter caseMeasurementDrivenAggregation(final MeasurementDrivenAggregation object) {
            return MonitorRepositoryAdapterFactory.this.createMeasurementDrivenAggregationAdapter();
        }

        @Override
        public Adapter caseFixedSizeAggregation(final FixedSizeAggregation object) {
            return MonitorRepositoryAdapterFactory.this.createFixedSizeAggregationAdapter();
        }

        @Override
        public Adapter caseTimeDrivenAggregation(final TimeDrivenAggregation object) {
            return MonitorRepositoryAdapterFactory.this.createTimeDrivenAggregationAdapter();
        }

        @Override
        public Adapter caseTimeDriven(final TimeDriven object) {
            return MonitorRepositoryAdapterFactory.this.createTimeDrivenAdapter();
        }

        @Override
        public Adapter caseVariableSizeAggregation(final VariableSizeAggregation object) {
            return MonitorRepositoryAdapterFactory.this.createVariableSizeAggregationAdapter();
        }

        @Override
        public Adapter caseFeedThrough(final FeedThrough object) {
            return MonitorRepositoryAdapterFactory.this.createFeedThroughAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object) {
            return MonitorRepositoryAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object) {
            return MonitorRepositoryAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object) {
            return MonitorRepositoryAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object) {
            return MonitorRepositoryAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.MonitorRepository <em>Monitor Repository</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.MonitorRepository
     * @generated
     */
    public Adapter createMonitorRepositoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.Monitor <em>Monitor</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.Monitor
     * @generated
     */
    public Adapter createMonitorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification
     * <em>Measurement Specification</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.MeasurementSpecification
     * @generated
     */
    public Adapter createMeasurementSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.StatisticalCharacterization
     * <em>Statistical Characterization</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.StatisticalCharacterization
     * @generated
     */
    public Adapter createStatisticalCharacterizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.ArithmeticMean <em>Arithmetic Mean</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.ArithmeticMean
     * @generated
     */
    public Adapter createArithmeticMeanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.HarmonicMean <em>Harmonic Mean</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.HarmonicMean
     * @generated
     */
    public Adapter createHarmonicMeanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.GeometricMean <em>Geometric Mean</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.GeometricMean
     * @generated
     */
    public Adapter createGeometricMeanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.Median <em>Median</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.Median
     * @generated
     */
    public Adapter createMedianAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.ProcessingType <em>Processing Type</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.ProcessingType
     * @generated
     */
    public Adapter createProcessingTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.Aggregation <em>Aggregation</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.Aggregation
     * @generated
     */
    public Adapter createAggregationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.MeasurementDrivenAggregation
     * <em>Measurement Driven Aggregation</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.MeasurementDrivenAggregation
     * @generated
     */
    public Adapter createMeasurementDrivenAggregationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.FixedSizeAggregation
     * <em>Fixed Size Aggregation</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.FixedSizeAggregation
     * @generated
     */
    public Adapter createFixedSizeAggregationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.TimeDrivenAggregation
     * <em>Time Driven Aggregation</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.TimeDrivenAggregation
     * @generated
     */
    public Adapter createTimeDrivenAggregationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.TimeDriven <em>Time Driven</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.TimeDriven
     * @generated
     */
    public Adapter createTimeDrivenAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.VariableSizeAggregation
     * <em>Variable Size Aggregation</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.VariableSizeAggregation
     * @generated
     */
    public Adapter createVariableSizeAggregationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.monitorrepository.FeedThrough <em>Feed Through</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.monitorrepository.FeedThrough
     * @generated
     */
    public Adapter createFeedThroughAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see de.uka.ipd.sdq.identifier.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // MonitorRepositoryAdapterFactory
