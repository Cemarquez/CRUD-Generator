/**
 */
package ui_concrete.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ui_concrete.ButtonAction;
import ui_concrete.Column;
import ui_concrete.UI_Diagram;
import ui_concrete.Ui_concretePackage;
import ui_concrete.UserInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.impl.UI_DiagramImpl#getUserInterface <em>User Interface</em>}</li>
 *   <li>{@link ui_concrete.impl.UI_DiagramImpl#getLtsButtonActions <em>Lts Button Actions</em>}</li>
 *   <li>{@link ui_concrete.impl.UI_DiagramImpl#getLstColumns <em>Lst Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UI_DiagramImpl extends EObjectImpl implements UI_Diagram {
	/**
	 * The cached value of the '{@link #getUserInterface() <em>User Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserInterface()
	 * @generated
	 * @ordered
	 */
	protected UserInterface userInterface;

	/**
	 * The cached value of the '{@link #getLtsButtonActions() <em>Lts Button Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtsButtonActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ButtonAction> ltsButtonActions;

	/**
	 * The cached value of the '{@link #getLstColumns() <em>Lst Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLstColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> lstColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UI_DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ui_concretePackage.Literals.UI_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserInterface getUserInterface() {
		return userInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserInterface(UserInterface newUserInterface, NotificationChain msgs) {
		UserInterface oldUserInterface = userInterface;
		userInterface = newUserInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ui_concretePackage.UI_DIAGRAM__USER_INTERFACE, oldUserInterface, newUserInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserInterface(UserInterface newUserInterface) {
		if (newUserInterface != userInterface) {
			NotificationChain msgs = null;
			if (userInterface != null)
				msgs = ((InternalEObject)userInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ui_concretePackage.UI_DIAGRAM__USER_INTERFACE, null, msgs);
			if (newUserInterface != null)
				msgs = ((InternalEObject)newUserInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ui_concretePackage.UI_DIAGRAM__USER_INTERFACE, null, msgs);
			msgs = basicSetUserInterface(newUserInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_concretePackage.UI_DIAGRAM__USER_INTERFACE, newUserInterface, newUserInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ButtonAction> getLtsButtonActions() {
		if (ltsButtonActions == null) {
			ltsButtonActions = new EObjectContainmentEList<ButtonAction>(ButtonAction.class, this, Ui_concretePackage.UI_DIAGRAM__LTS_BUTTON_ACTIONS);
		}
		return ltsButtonActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Column> getLstColumns() {
		if (lstColumns == null) {
			lstColumns = new EObjectContainmentEList<Column>(Column.class, this, Ui_concretePackage.UI_DIAGRAM__LST_COLUMNS);
		}
		return lstColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ui_concretePackage.UI_DIAGRAM__USER_INTERFACE:
				return basicSetUserInterface(null, msgs);
			case Ui_concretePackage.UI_DIAGRAM__LTS_BUTTON_ACTIONS:
				return ((InternalEList<?>)getLtsButtonActions()).basicRemove(otherEnd, msgs);
			case Ui_concretePackage.UI_DIAGRAM__LST_COLUMNS:
				return ((InternalEList<?>)getLstColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ui_concretePackage.UI_DIAGRAM__USER_INTERFACE:
				return getUserInterface();
			case Ui_concretePackage.UI_DIAGRAM__LTS_BUTTON_ACTIONS:
				return getLtsButtonActions();
			case Ui_concretePackage.UI_DIAGRAM__LST_COLUMNS:
				return getLstColumns();
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
			case Ui_concretePackage.UI_DIAGRAM__USER_INTERFACE:
				setUserInterface((UserInterface)newValue);
				return;
			case Ui_concretePackage.UI_DIAGRAM__LTS_BUTTON_ACTIONS:
				getLtsButtonActions().clear();
				getLtsButtonActions().addAll((Collection<? extends ButtonAction>)newValue);
				return;
			case Ui_concretePackage.UI_DIAGRAM__LST_COLUMNS:
				getLstColumns().clear();
				getLstColumns().addAll((Collection<? extends Column>)newValue);
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
			case Ui_concretePackage.UI_DIAGRAM__USER_INTERFACE:
				setUserInterface((UserInterface)null);
				return;
			case Ui_concretePackage.UI_DIAGRAM__LTS_BUTTON_ACTIONS:
				getLtsButtonActions().clear();
				return;
			case Ui_concretePackage.UI_DIAGRAM__LST_COLUMNS:
				getLstColumns().clear();
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
			case Ui_concretePackage.UI_DIAGRAM__USER_INTERFACE:
				return userInterface != null;
			case Ui_concretePackage.UI_DIAGRAM__LTS_BUTTON_ACTIONS:
				return ltsButtonActions != null && !ltsButtonActions.isEmpty();
			case Ui_concretePackage.UI_DIAGRAM__LST_COLUMNS:
				return lstColumns != null && !lstColumns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UI_DiagramImpl
