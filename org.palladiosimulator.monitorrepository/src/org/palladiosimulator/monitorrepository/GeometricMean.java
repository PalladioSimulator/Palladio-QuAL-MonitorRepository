/**
 */
package org.palladiosimulator.monitorrepository;

import org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.StatisticalCharacterizationAggregator;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Geometric Mean</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getGeometricMean()
 * @model
 * @generated
 */
public interface GeometricMean extends StatisticalCharacterization {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @model dataType=
     *        "org.palladiosimulator.monitorrepository.util.StatisticalCharacterizationAggregator"
     *        annotation=
     *        "http://www.eclipse.org/emf/2002/GenModel body='return new org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.GeometricMeanAggregator(expectedWindowMetric);'"
     *        annotation="http://www.eclipse.org/emf/2002/Ecore suppressedSetVisibility='true'"
     * @generated
     */
    @Override
    StatisticalCharacterizationAggregator getAggregator(NumericalBaseMetricDescription expectedWindowMetric);

} // GeometricMean
