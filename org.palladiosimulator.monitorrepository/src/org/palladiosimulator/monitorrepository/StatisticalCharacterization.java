/**
 */
package org.palladiosimulator.monitorrepository;

import org.eclipse.emf.cdo.CDOObject;
import org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.StatisticalCharacterizationAggregator;
import org.palladiosimulator.metricspec.MetricSetDescription;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Statistical Characterization</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.palladiosimulator.monitorrepository.MonitorRepositoryPackage#getStatisticalCharacterization()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface StatisticalCharacterization extends CDOObject {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @model dataType=
     *        "org.palladiosimulator.monitorrepository.StatisticalCharacterizationAggregator"
     * @generated
     */
    StatisticalCharacterizationAggregator getAggregator(MetricSetDescription expectedWindowMetric);

} // StatisticalCharacterization
