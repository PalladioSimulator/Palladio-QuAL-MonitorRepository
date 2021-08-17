package org.palladiosimulator.monitorrepository.map.impl;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.palladiosimulator.monitorrepository.map.MapPackage;
import org.palladiosimulator.monitorrepository.map.util.MapValidator;

public class ExponentialSmoothingImpl extends ExponentialSmoothingImplGen {
    @Override
    public boolean isMetricNumericalBaseMetric(final DiagnosticChain chain, final Map<?, ?> context) {
        org.palladiosimulator.metricspec.MetricDescription metric = this.getMap().getMeasurementSpecification()
                .getMetricDescription();

        if (metric == null
                || !org.palladiosimulator.metricspec.MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION
                        .isInstance(metric)) {
            if (chain != null) {
                chain.add(new BasicDiagnostic(Diagnostic.ERROR, MapValidator.DIAGNOSTIC_SOURCE,
                        MapValidator.EXPONENTIAL_SMOOTHING__IS_METRIC_NUMERICAL_BASE_METRIC,
                        "'" + MapPackage.Literals.EXPONENTIAL_SMOOTHING.getName() + "' (id: " + this.getId()
                                + ") can only be applied to measurements with a '"
                                + org.palladiosimulator.metricspec.MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION
                                        .getName()
                                + "'!",
                        new Object[] { this }));
            }
            return false;
        }
        return true;
    }
}
