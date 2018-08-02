/**
 */
package org.palladiosimulator.monitorrepository.map.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.measurementframework.MeasuringValue;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.monitorrepository.impl.ProcessingTypeImpl;
import org.palladiosimulator.monitorrepository.map.Map;
import org.palladiosimulator.monitorrepository.map.MapPackage;
import org.palladiosimulator.monitorrepository.map.Mapper;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Map</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.monitorrepository.map.impl.MapImpl#getEntityName <em>Entity Name</em>}</li>
 *   <li>{@link org.palladiosimulator.monitorrepository.map.impl.MapImpl#getOutputMetricDescription <em>Output Metric Description</em>}</li>
 *   <li>{@link org.palladiosimulator.monitorrepository.map.impl.MapImpl#getMapper <em>Mapper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends ProcessingTypeImpl implements Map {
    /**
     * The default value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getEntityName()
     * @generated
     * @ordered
     */
    protected static final String ENTITY_NAME_EDEFAULT = "aName";

    /**
     * The cached value of the '{@link #getEntityName() <em>Entity Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getEntityName()
     * @generated
     * @ordered
     */
    protected String entityName = ENTITY_NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getOutputMetricDescription() <em>Output Metric Description</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getOutputMetricDescription()
     * @generated
     * @ordered
     */
    protected MetricDescription outputMetricDescription;

    /**
     * The cached value of the '{@link #getMapper() <em>Mapper</em>}' containment reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getMapper()
     * @generated
     * @ordered
     */
    protected Mapper mapper;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MapImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MapPackage.Literals.MAP;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEntityName() {
        return entityName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEntityName(String newEntityName) {
        String oldEntityName = entityName;
        entityName = newEntityName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.MAP__ENTITY_NAME, oldEntityName, entityName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MetricDescription getOutputMetricDescription() {
        if (outputMetricDescription != null && ((EObject)outputMetricDescription).eIsProxy()) {
            InternalEObject oldOutputMetricDescription = (InternalEObject)outputMetricDescription;
            outputMetricDescription = (MetricDescription)eResolveProxy(oldOutputMetricDescription);
            if (outputMetricDescription != oldOutputMetricDescription) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, MapPackage.MAP__OUTPUT_METRIC_DESCRIPTION, oldOutputMetricDescription, outputMetricDescription));
            }
        }
        return outputMetricDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public MetricDescription basicGetOutputMetricDescription() {
        return outputMetricDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOutputMetricDescription(MetricDescription newOutputMetricDescription) {
        MetricDescription oldOutputMetricDescription = outputMetricDescription;
        outputMetricDescription = newOutputMetricDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.MAP__OUTPUT_METRIC_DESCRIPTION, oldOutputMetricDescription, outputMetricDescription));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Mapper getMapper() {
        return mapper;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMapper(Mapper newMapper, NotificationChain msgs) {
        Mapper oldMapper = mapper;
        mapper = newMapper;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MapPackage.MAP__MAPPER, oldMapper, newMapper);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMapper(Mapper newMapper) {
        if (newMapper != mapper) {
            NotificationChain msgs = null;
            if (mapper != null)
                msgs = ((InternalEObject)mapper).eInverseRemove(this, MapPackage.MAPPER__MAP, Mapper.class, msgs);
            if (newMapper != null)
                msgs = ((InternalEObject)newMapper).eInverseAdd(this, MapPackage.MAPPER__MAP, Mapper.class, msgs);
            msgs = basicSetMapper(newMapper, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MapPackage.MAP__MAPPER, newMapper, newMapper));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MeasuringValue apply(final MeasuringValue newMeasurement) {
        return this.getMapper().getMappingFunction().apply(newMeasurement);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case MapPackage.MAP__MAPPER:
                if (mapper != null)
                    msgs = ((InternalEObject)mapper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MapPackage.MAP__MAPPER, null, msgs);
                return basicSetMapper((Mapper)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case MapPackage.MAP__MAPPER:
                return basicSetMapper(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MapPackage.MAP__ENTITY_NAME:
                return getEntityName();
            case MapPackage.MAP__OUTPUT_METRIC_DESCRIPTION:
                if (resolve) return getOutputMetricDescription();
                return basicGetOutputMetricDescription();
            case MapPackage.MAP__MAPPER:
                return getMapper();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MapPackage.MAP__ENTITY_NAME:
                setEntityName((String)newValue);
                return;
            case MapPackage.MAP__OUTPUT_METRIC_DESCRIPTION:
                setOutputMetricDescription((MetricDescription)newValue);
                return;
            case MapPackage.MAP__MAPPER:
                setMapper((Mapper)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MapPackage.MAP__ENTITY_NAME:
                setEntityName(ENTITY_NAME_EDEFAULT);
                return;
            case MapPackage.MAP__OUTPUT_METRIC_DESCRIPTION:
                setOutputMetricDescription((MetricDescription)null);
                return;
            case MapPackage.MAP__MAPPER:
                setMapper((Mapper)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MapPackage.MAP__ENTITY_NAME:
                return ENTITY_NAME_EDEFAULT == null ? entityName != null : !ENTITY_NAME_EDEFAULT.equals(entityName);
            case MapPackage.MAP__OUTPUT_METRIC_DESCRIPTION:
                return outputMetricDescription != null;
            case MapPackage.MAP__MAPPER:
                return mapper != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == NamedElement.class) {
            switch (derivedFeatureID) {
                case MapPackage.MAP__ENTITY_NAME: return EntityPackage.NAMED_ELEMENT__ENTITY_NAME;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == NamedElement.class) {
            switch (baseFeatureID) {
                case EntityPackage.NAMED_ELEMENT__ENTITY_NAME: return MapPackage.MAP__ENTITY_NAME;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (entityName: ");
        result.append(entityName);
        result.append(')');
        return result.toString();
    }

} // MapImpl
