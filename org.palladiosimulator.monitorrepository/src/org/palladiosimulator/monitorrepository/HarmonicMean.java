/**
 */
package org.palladiosimulator.monitorrepository;

import org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.StatisticalCharacterizationAggregator;
import org.palladiosimulator.metricspec.MetricSetDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Harmonic Mean</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getHarmonicMean()
 * @model
 * @generated
 */
public interface HarmonicMean extends StatisticalCharacterization {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @model dataType=
     *        "org.palladiosimulator.monitorrepository.StatisticalCharacterizationAggregator"
     *        annotation=
     *        "http://www.eclipse.org/emf/2002/GenModel body='return new org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.HarmonicMeanAggregator(expectedWindowMetric);'"
     *        annotation="http://www.eclipse.org/emf/2002/Ecore suppressedSetVisibility='true'"
     * @generated
     */
    @Override
    StatisticalCharacterizationAggregator getAggregator(MetricSetDescription expectedWindowMetric);

} // HarmonicMean
