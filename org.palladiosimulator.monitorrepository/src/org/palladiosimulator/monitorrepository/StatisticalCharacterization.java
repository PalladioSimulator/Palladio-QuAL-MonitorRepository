/**
 */
package org.palladiosimulator.monitorrepository;

import org.eclipse.emf.cdo.CDOObject;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.monitorrepository.statisticalcharacterization.StatisticalCharacterizationAggregator;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Statistical Characterization</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> A {@link StatisticalCharacterization} defines the way a sequence of
 * measurements is to be aggregated. <!-- end-model-doc -->
 *
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getStatisticalCharacterization()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface StatisticalCharacterization extends CDOObject {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Gets the
     * {@link org.palladiosimulator.monitorrepository.statisticalcharacterization.StatisticalCharacterizationAggregator}
     * performing the measurement aggregation defined by this instance. <!-- end-model-doc -->
     *
     * @model dataType=
     *        "org.palladiosimulator.monitorrepository.util.StatisticalCharacterizationAggregator"
     * @generated
     */
    StatisticalCharacterizationAggregator getAggregator(NumericalBaseMetricDescription expectedDataMetric);

} // StatisticalCharacterization
