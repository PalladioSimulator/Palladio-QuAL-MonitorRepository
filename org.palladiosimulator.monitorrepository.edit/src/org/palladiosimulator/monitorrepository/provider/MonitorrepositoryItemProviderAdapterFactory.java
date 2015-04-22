/**
 */
package org.palladiosimulator.monitorrepository.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.palladiosimulator.monitorrepository.util.MonitorrepositoryAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers. The
 * adapters generated by this factory convert EMF adapter notifications into calls to
 * {@link #fireNotifyChanged fireNotifyChanged}. The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class MonitorrepositoryItemProviderAdapterFactory extends MonitorrepositoryAdapterFactory implements
        ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType
     * isFactoryForType}. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public MonitorrepositoryItemProviderAdapterFactory() {
        this.supportedTypes.add(IEditingDomainItemProvider.class);
        this.supportedTypes.add(IStructuredItemContentProvider.class);
        this.supportedTypes.add(ITreeItemContentProvider.class);
        this.supportedTypes.add(IItemLabelProvider.class);
        this.supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.monitorrepository.MonitorRepository} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MonitorRepositoryItemProvider monitorRepositoryItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.monitorrepository.MonitorRepository}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createMonitorRepositoryAdapter() {
        if (this.monitorRepositoryItemProvider == null) {
            this.monitorRepositoryItemProvider = new MonitorRepositoryItemProvider(this);
        }

        return this.monitorRepositoryItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.monitorrepository.Monitor} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected MonitorItemProvider monitorItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.monitorrepository.Monitor}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createMonitorAdapter() {
        if (this.monitorItemProvider == null) {
            this.monitorItemProvider = new MonitorItemProvider(this);
        }

        return this.monitorItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MeasurementSpecificationItemProvider measurementSpecificationItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification}. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createMeasurementSpecificationAdapter() {
        if (this.measurementSpecificationItemProvider == null) {
            this.measurementSpecificationItemProvider = new MeasurementSpecificationItemProvider(this);
        }

        return this.measurementSpecificationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.monitorrepository.Intervall} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected IntervallItemProvider intervallItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.monitorrepository.Intervall}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createIntervallAdapter() {
        if (this.intervallItemProvider == null) {
            this.intervallItemProvider = new IntervallItemProvider(this);
        }

        return this.intervallItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.monitorrepository.DelayedIntervall} instances. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DelayedIntervallItemProvider delayedIntervallItemProvider;

    /**
     * This creates an adapter for a
     * {@link org.palladiosimulator.monitorrepository.DelayedIntervall}. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createDelayedIntervallAdapter() {
        if (this.delayedIntervallItemProvider == null) {
            this.delayedIntervallItemProvider = new DelayedIntervallItemProvider(this);
        }

        return this.delayedIntervallItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all
     * {@link org.palladiosimulator.monitorrepository.TimeFrame} instances. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected TimeFrameItemProvider timeFrameItemProvider;

    /**
     * This creates an adapter for a {@link org.palladiosimulator.monitorrepository.TimeFrame}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter createTimeFrameAdapter() {
        if (this.timeFrameItemProvider == null) {
            this.timeFrameItemProvider = new TimeFrameItemProvider(this);
        }

        return this.timeFrameItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return this.parentAdapterFactory == null ? this : this.parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setParentAdapterFactory(final ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object type) {
        return this.supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Adapter adapt(final Notifier notifier, final Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object adapt(final Object object, final Object type) {
        if (this.isFactoryForType(type)) {
            final Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void addListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void removeListener(final INotifyChangedListener notifyChangedListener) {
        this.changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void fireNotifyChanged(final Notification notification) {
        this.changeNotifier.fireNotifyChanged(notification);

        if (this.parentAdapterFactory != null) {
            this.parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public void dispose() {
        if (this.monitorRepositoryItemProvider != null) {
            this.monitorRepositoryItemProvider.dispose();
        }
        if (this.monitorItemProvider != null) {
            this.monitorItemProvider.dispose();
        }
        if (this.measurementSpecificationItemProvider != null) {
            this.measurementSpecificationItemProvider.dispose();
        }
        if (this.intervallItemProvider != null) {
            this.intervallItemProvider.dispose();
        }
        if (this.delayedIntervallItemProvider != null) {
            this.delayedIntervallItemProvider.dispose();
        }
        if (this.timeFrameItemProvider != null) {
            this.timeFrameItemProvider.dispose();
        }
    }

}
