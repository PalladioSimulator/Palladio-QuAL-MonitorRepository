/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.monitorrepository.HarmonicMean;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.statisticalcharacterization.StatisticalCharacterizationAggregator;

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
    public StatisticalCharacterizationAggregator getAggregator(
            final NumericalBaseMetricDescription expectedDataMetric) {
        return new org.palladiosimulator.monitorrepository.statisticalcharacterization.HarmonicMeanAggregator(
                expectedDataMetric);
    }

} // HarmonicMeanImpl
