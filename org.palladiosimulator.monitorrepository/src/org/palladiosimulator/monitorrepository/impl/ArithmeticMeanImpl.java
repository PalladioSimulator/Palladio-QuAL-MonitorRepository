/**
 */
package org.palladiosimulator.monitorrepository.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.monitorrepository.ArithmeticMean;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;
import org.palladiosimulator.monitorrepository.statisticalcharacterization.StatisticalCharacterizationAggregator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Arithmetic Mean</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ArithmeticMeanImpl extends StatisticalCharacterizationImpl implements ArithmeticMean {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ArithmeticMeanImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MonitorRepositoryPackage.Literals.ARITHMETIC_MEAN;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StatisticalCharacterizationAggregator getAggregator(
            final NumericalBaseMetricDescription expectedDataMetric) {
        return new org.palladiosimulator.monitorrepository.statisticalcharacterization.ArithmeticMeanAggregator(
                expectedDataMetric);
    }

} // ArithmeticMeanImpl
