/**
 */
package ui_concrete.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ui_concrete.Ui_concreteFactory;
import ui_concrete.Ui_concretePackage;
import ui_concrete.UserInterface;

/**
 * This is the item provider adapter for a {@link ui_concrete.UserInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UserInterfaceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserInterfaceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_name_feature", "_UI_UserInterface_type"),
				 Ui_concretePackage.Literals.USER_INTERFACE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_width_feature", "_UI_UserInterface_type"),
				 Ui_concretePackage.Literals.USER_INTERFACE__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UserInterface_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UserInterface_height_feature", "_UI_UserInterface_type"),
				 Ui_concretePackage.Literals.USER_INTERFACE__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns UserInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UserInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UserInterface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UserInterface_type") :
			getString("_UI_UserInterface_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(UserInterface.class)) {
			case Ui_concretePackage.USER_INTERFACE__NAME:
			case Ui_concretePackage.USER_INTERFACE__WIDTH:
			case Ui_concretePackage.USER_INTERFACE__HEIGHT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Ui_concretePackage.USER_INTERFACE__LST_MODEL_ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createModelElement()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createGraphicalContainer()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createGraphicalIndividual()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createButton()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createImage()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createList()));

		newChildDescriptors.add
			(createChildParameter
				(Ui_concretePackage.Literals.USER_INTERFACE__LST_MODEL_ELEMENTS,
				 Ui_concreteFactory.eINSTANCE.createRadioButton()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Ui_concreteEditPlugin.INSTANCE;
	}

}
