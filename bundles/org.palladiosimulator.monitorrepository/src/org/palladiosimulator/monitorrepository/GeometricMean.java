/**
 */
package org.palladiosimulator.monitorrepository;

import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.monitorrepository.statisticalcharacterization.StatisticalCharacterizationAggregator;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Geometric Mean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> The StatisticalCharacterization 'GeometricMean' which computes the
 * geometric mean of a sequence of measurements. <!-- end-model-doc -->
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
     *        "http://www.eclipse.org/emf/2002/GenModel body='return new org.palladiosimulator.monitorrepository.statisticalcharacterization.GeometricMeanAggregator(expectedDataMetric);'"
     *        annotation="http://www.eclipse.org/emf/2002/Ecore suppressedSetVisibility='true'"
     * @generated
     */
    @Override
    StatisticalCharacterizationAggregator getAggregator(NumericalBaseMetricDescription expectedDataMetric);

} // GeometricMean
