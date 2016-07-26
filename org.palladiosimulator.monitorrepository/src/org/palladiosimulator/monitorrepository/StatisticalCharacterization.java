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
     *        "org.palladiosimulator.monitorrepository.util.StatisticalCharacterizationAggregator"
     * @generated
     */
    StatisticalCharacterizationAggregator getAggregator(NumericalBaseMetricDescription expectedDataMetric);

} // StatisticalCharacterization
