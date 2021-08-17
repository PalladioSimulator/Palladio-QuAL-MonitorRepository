package org.palladiosimulator.monitorrepository.util;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryFactory;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

public class MonitorRepositoryResourceImpl extends MonitorRepositoryResourceImplGen {
	public MonitorRepositoryResourceImpl(URI uri)
	{
		super(uri);
	}
	
    @Override
    public void save(final Map<?, ?> options) throws IOException {
        Collection<MonitorRepository> repos = EcoreUtil.<MonitorRepository>getObjectsByType(this.getContents(), 
                MonitorRepositoryPackage.eINSTANCE.getMonitorRepository());
        Stream<MeasurementSpecification> flatMap = repos.stream().flatMap(r -> r.getMonitors().stream()
                                                    .flatMap(m -> m.getMeasurementSpecifications().stream()
                                                            .filter(ms -> ms.getProcessingType() == null)));
        flatMap.forEach(m -> m.setProcessingType(MonitorRepositoryFactory.eINSTANCE.createFeedThrough()));
        super.save(options);
    }
}
