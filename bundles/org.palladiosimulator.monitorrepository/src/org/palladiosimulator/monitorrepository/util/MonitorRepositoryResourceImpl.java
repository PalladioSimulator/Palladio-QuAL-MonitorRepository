/**
 */
package org.palladiosimulator.monitorrepository.util;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.MonitorRepository;
import org.palladiosimulator.monitorrepository.MonitorRepositoryFactory;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.monitorrepository.util.MonitorRepositoryResourceFactoryImpl
 * @generated
 */
public class MonitorRepositoryResourceImpl extends XMLResourceImpl {
    /**
     * Creates an instance of the resource. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param uri
     *            the URI of the new resource.
     * @generated
     */
    public MonitorRepositoryResourceImpl(final URI uri) {
        super(uri);
    }
    
    /**
     * @generated NOT
     */
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

} // MonitorRepositoryResourceImpl
