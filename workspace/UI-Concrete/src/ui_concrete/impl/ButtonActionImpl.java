/**
 */
package ui_concrete.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ui_concrete.Action;
import ui_concrete.Button;
import ui_concrete.ButtonAction;
import ui_concrete.GraphicalIndividual;
import ui_concrete.Ui_concretePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.impl.ButtonActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link ui_concrete.impl.ButtonActionImpl#getLtsGraphicalIndividual <em>Lts Graphical Individual</em>}</li>
 *   <li>{@link ui_concrete.impl.ButtonActionImpl#getButtonAction <em>Button Action</em>}</li>
 *   <li>{@link ui_concrete.impl.ButtonActionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonActionImpl extends EObjectImpl implements ButtonAction {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLtsGraphicalIndividual() <em>Lts Graphical Individual</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtsGraphicalIndividual()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicalIndividual> ltsGraphicalIndividual;

	/**
	 * The cached value of the '{@link #getButtonAction() <em>Button Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonAction()
	 * @generated
	 * @ordered
	 */
	protected Button buttonAction;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final Action ACTION_EDEFAULT = Action.CREATE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action = ACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ui_concretePackage.Literals.BUTTON_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_concretePackage.BUTTON_ACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphicalIndividual> getLtsGraphicalIndividual() {
		if (ltsGraphicalIndividual == null) {
			ltsGraphicalIndividual = new EObjectResolvingEList<GraphicalIndividual>(GraphicalIndividual.class, this, Ui_concretePackage.BUTTON_ACTION__LTS_GRAPHICAL_INDIVIDUAL);
		}
		return ltsGraphicalIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Button getButtonAction() {
		if (buttonAction != null && buttonAction.eIsProxy()) {
			InternalEObject oldButtonAction = (InternalEObject)buttonAction;
			buttonAction = (Button)eResolveProxy(oldButtonAction);
			if (buttonAction != oldButtonAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ui_concretePackage.BUTTON_ACTION__BUTTON_ACTION, oldButtonAction, buttonAction));
			}
		}
		return buttonAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button basicGetButtonAction() {
		return buttonAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setButtonAction(Button newButtonAction) {
		Button oldButtonAction = buttonAction;
		buttonAction = newButtonAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_concretePackage.BUTTON_ACTION__BUTTON_ACTION, oldButtonAction, buttonAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(Action newAction) {
		Action oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_concretePackage.BUTTON_ACTION__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ui_concretePackage.BUTTON_ACTION__NAME:
				return getName();
			case Ui_concretePackage.BUTTON_ACTION__LTS_GRAPHICAL_INDIVIDUAL:
				return getLtsGraphicalIndividual();
			case Ui_concretePackage.BUTTON_ACTION__BUTTON_ACTION:
				if (resolve) return getButtonAction();
				return basicGetButtonAction();
			case Ui_concretePackage.BUTTON_ACTION__ACTION:
				return getAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ui_concretePackage.BUTTON_ACTION__NAME:
				setName((String)newValue);
				return;
			case Ui_concretePackage.BUTTON_ACTION__LTS_GRAPHICAL_INDIVIDUAL:
				getLtsGraphicalIndividual().clear();
				getLtsGraphicalIndividual().addAll((Collection<? extends GraphicalIndividual>)newValue);
				return;
			case Ui_concretePackage.BUTTON_ACTION__BUTTON_ACTION:
				setButtonAction((Button)newValue);
				return;
			case Ui_concretePackage.BUTTON_ACTION__ACTION:
				setAction((Action)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ui_concretePackage.BUTTON_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Ui_concretePackage.BUTTON_ACTION__LTS_GRAPHICAL_INDIVIDUAL:
				getLtsGraphicalIndividual().clear();
				return;
			case Ui_concretePackage.BUTTON_ACTION__BUTTON_ACTION:
				setButtonAction((Button)null);
				return;
			case Ui_concretePackage.BUTTON_ACTION__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ui_concretePackage.BUTTON_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Ui_concretePackage.BUTTON_ACTION__LTS_GRAPHICAL_INDIVIDUAL:
				return ltsGraphicalIndividual != null && !ltsGraphicalIndividual.isEmpty();
			case Ui_concretePackage.BUTTON_ACTION__BUTTON_ACTION:
				return buttonAction != null;
			case Ui_concretePackage.BUTTON_ACTION__ACTION:
				return action != ACTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", action: ");
		result.append(action);
		result.append(')');
		return result.toString();
	}

} //ButtonActionImpl
