/**
 */
package org.palladiosimulator.monitorrepository;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Monitor Repository</b></em>
 * '. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Base class representing the monitor repository model. <!-- end-model-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.monitorrepository.MonitorRepository#getMonitors <em>Monitors
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.monitorrepository.MonitorrepositoryPackage#getMonitorRepository()
 * @model
 * @generated
 */
public interface MonitorRepository extends EObject, Entity {
    /**
     * Returns the value of the '<em><b>Monitors</b></em>' containment reference list. The list
     * contents are of type {@link org.palladiosimulator.monitorrepository.Monitor}. It is
     * bidirectional and its opposite is '
     * {@link org.palladiosimulator.monitorrepository.Monitor#getMonitorRepository
     * <em>Monitor Repository</em>}'. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitors</em>' containment reference list isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Monitors</em>' containment reference list.
     * @see org.palladiosimulator.monitorrepository.MonitorrepositoryPackage#getMonitorRepository_Monitors()
     * @see org.palladiosimulator.monitorrepository.Monitor#getMonitorRepository
     * @model opposite="monitorRepository" containment="true"
     * @generated
     */
    EList<Monitor> getMonitors();

} // MonitorRepository