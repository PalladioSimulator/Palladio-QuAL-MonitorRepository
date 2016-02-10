/**
 */
package org.palladiosimulator.monitorrepository.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.monitorrepository.FixedSizeAggregation;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.monitorrepository.FixedSizeAggregation} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 *
 * @generated
 */
public class FixedSizeAggregationItemProvider extends AggregationItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public FixedSizeAggregationItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addNumberOfMeasurementsPropertyDescriptor(object);
            this.addFrequencyPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Number Of Measurements feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addNumberOfMeasurementsPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_FixedSizeAggregation_numberOfMeasurements_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_FixedSizeAggregation_numberOfMeasurements_feature", "_UI_FixedSizeAggregation_type"),
                MonitorRepositoryPackage.Literals.FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Frequency feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addFrequencyPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_FixedSizeAggregation_frequency_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_FixedSizeAggregation_frequency_feature",
                        "_UI_FixedSizeAggregation_type"),
                MonitorRepositoryPackage.Literals.FIXED_SIZE_AGGREGATION__FREQUENCY, true, false, false,
                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
    }

    /**
     * This returns FixedSizeAggregation.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/FixedSizeAggregation"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((FixedSizeAggregation) object).getId();
        return label == null || label.length() == 0 ? this.getString("_UI_FixedSizeAggregation_type")
                : this.getString("_UI_FixedSizeAggregation_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(FixedSizeAggregation.class)) {
        case MonitorRepositoryPackage.FIXED_SIZE_AGGREGATION__NUMBER_OF_MEASUREMENTS:
        case MonitorRepositoryPackage.FIXED_SIZE_AGGREGATION__FREQUENCY:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
