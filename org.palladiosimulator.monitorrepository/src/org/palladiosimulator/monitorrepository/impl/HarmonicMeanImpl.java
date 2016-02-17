/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.StatisticalCharacterizationAggregator;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.monitorrepository.HarmonicMean;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Harmonic Mean</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HarmonicMeanImpl extends StatisticalCharacterizationImpl implements HarmonicMean {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected HarmonicMeanImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.HARMONIC_MEAN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StatisticalCharacterizationAggregator getAggregator(final MetricSetDescription expectedWindowMetric) {
        return new org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.HarmonicMeanAggregator(
                expectedWindowMetric);
    }

} // HarmonicMeanImpl
