package org.palladiosimulator.monitorrepository.presentation;

import java.io.IOException;
import java.util.HashMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Customized version of {@link MonitorRepositoryEditorGen}.
 */
public class MonitorRepositoryEditor extends MonitorRepositoryEditorGen {
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void createModel() {
		super.createModel();
		this.addExtraResource("pathmap://METRIC_SPEC_MODELS/models/commonMetrics.metricspec");
	}
	
    /**
     * Adds the extra resource.
     *
     * @param uri
     *            the uri
     */
    private void addExtraResource(final String uri) {
        final Resource extraResource = this.editingDomain.getResourceSet().getResource(URI.createURI(uri), true);
        try {
            extraResource.load(new HashMap<Object, Object>());
        } catch (final IOException e) {
            // since this is only a convenience feature, we do not need
            // to escalate in case the resource cannot be loaded.
        }
    }
}
