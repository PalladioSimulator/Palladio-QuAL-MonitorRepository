/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.StatisticalCharacterizationAggregator;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.monitorrepository.Median;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Median</b></em>'. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class MedianImpl extends StatisticalCharacterizationImpl implements Median {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MedianImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.MEDIAN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StatisticalCharacterizationAggregator getAggregator(final MetricSetDescription expectedWindowMetric) {
        return new org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.MedianAggregator(
                expectedWindowMetric);
    }

} // MedianImpl
