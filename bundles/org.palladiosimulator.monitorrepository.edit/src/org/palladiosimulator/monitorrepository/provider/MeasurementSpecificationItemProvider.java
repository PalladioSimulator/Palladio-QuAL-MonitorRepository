/**
 */
package org.palladiosimulator.monitorrepository.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.monitorrepository.MeasurementSpecification;
import org.palladiosimulator.monitorrepository.MonitorRepositoryFactory;
import org.palladiosimulator.monitorrepository.MonitorRepositoryPackage;

import de.uka.ipd.sdq.identifier.provider.IdentifierItemProvider;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.monitorrepository.MeasurementSpecification} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class MeasurementSpecificationItemProvider extends IdentifierItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public MeasurementSpecificationItemProvider(final AdapterFactory adapterFactory) {
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

            this.addMetricDescriptionPropertyDescriptor(object);
            this.addNamePropertyDescriptor(object);
            this.addTriggersSelfAdaptationsPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Metric Description feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addMetricDescriptionPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_MeasurementSpecification_metricDescription_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_MeasurementSpecification_metricDescription_feature", "_UI_MeasurementSpecification_type"),
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__METRIC_DESCRIPTION, true, false, true,
                null, null, null));
    }

    /**
     * This adds a property descriptor for the Name feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addNamePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_MeasurementSpecification_name_feature"),
                this.getString("_UI_PropertyDescriptor_description", "_UI_MeasurementSpecification_name_feature",
                        "_UI_MeasurementSpecification_type"),
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__NAME, false, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Triggers Self Adaptations feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addTriggersSelfAdaptationsPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_MeasurementSpecification_triggersSelfAdaptations_feature"),
                this.getString("_UI_PropertyDescriptor_description",
                        "_UI_MeasurementSpecification_triggersSelfAdaptations_feature",
                        "_UI_MeasurementSpecification_type"),
                MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS, true, false,
                false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
     * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
     * {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(final Object object) {
        if (this.childrenFeatures == null) {
            super.getChildrenFeatures(object);
            this.childrenFeatures.add(MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__PROCESSING_TYPE);
        }
        return this.childrenFeatures;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(final Object object, final Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns MeasurementSpecification.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/MeasurementSpecification"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((MeasurementSpecification) object).getName();
        return label == null || label.length() == 0 ? this.getString("_UI_MeasurementSpecification_type")
                : this.getString("_UI_MeasurementSpecification_type") + " " + label;
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

        switch (notification.getFeatureID(MeasurementSpecification.class)) {
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__NAME:
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__TRIGGERS_SELF_ADAPTATIONS:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case MonitorRepositoryPackage.MEASUREMENT_SPECIFICATION__PROCESSING_TYPE:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add(
                this.createChildParameter(MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__PROCESSING_TYPE,
                        MonitorRepositoryFactory.eINSTANCE.createFixedSizeAggregation()));

        newChildDescriptors.add(
                this.createChildParameter(MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__PROCESSING_TYPE,
                        MonitorRepositoryFactory.eINSTANCE.createTimeDriven()));

        newChildDescriptors.add(
                this.createChildParameter(MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__PROCESSING_TYPE,
                        MonitorRepositoryFactory.eINSTANCE.createTimeDrivenAggregation()));

        newChildDescriptors.add(
                this.createChildParameter(MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__PROCESSING_TYPE,
                        MonitorRepositoryFactory.eINSTANCE.createVariableSizeAggregation()));

        newChildDescriptors.add(
                this.createChildParameter(MonitorRepositoryPackage.Literals.MEASUREMENT_SPECIFICATION__PROCESSING_TYPE,
                        MonitorRepositoryFactory.eINSTANCE.createFeedThrough()));
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ((IChildCreationExtender) this.adapterFactory).getResourceLocator();
    }

}
