/**
 */
package org.palladiosimulator.monitorrepository.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class MonitorRepositoryXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MonitorRepositoryXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        MonitorRepositoryPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the MonitorRepositoryResourceFactoryImpl factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (this.registrations == null)
        {
            super.getRegistrations();
            this.registrations.put(XML_EXTENSION, new MonitorRepositoryResourceFactoryImpl());
            this.registrations.put(STAR_EXTENSION, new MonitorRepositoryResourceFactoryImpl());
        }
        return this.registrations;
    }

} // MonitorRepositoryXMLProcessor
