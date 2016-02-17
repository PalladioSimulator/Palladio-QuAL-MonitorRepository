/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.StatisticalCharacterizationAggregator;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.monitorrepository.GeometricMean;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Geometric Mean</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GeometricMeanImpl extends StatisticalCharacterizationImpl implements GeometricMean {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected GeometricMeanImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.GEOMETRIC_MEAN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StatisticalCharacterizationAggregator getAggregator(
            final NumericalBaseMetricDescription expectedWindowMetric) {
        return new org.palladiosimulator.experimentanalysis.statisticalcharacterization.aggregators.GeometricMeanAggregator(
                expectedWindowMetric);
    }

} // GeometricMeanImpl
