/**
 */
package ui_diagram.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ui_diagram.UI_Diagram;
import ui_diagram.Ui_diagramPackage;
import ui_diagram.UserInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ui_diagram.impl.UI_DiagramImpl#getUserInterface <em>User Interface</em>}</li>
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
		return Ui_diagramPackage.Literals.UI_DIAGRAM;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ui_diagramPackage.UI_DIAGRAM__USER_INTERFACE, oldUserInterface, newUserInterface);
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
				msgs = ((InternalEObject)userInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ui_diagramPackage.UI_DIAGRAM__USER_INTERFACE, null, msgs);
			if (newUserInterface != null)
				msgs = ((InternalEObject)newUserInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ui_diagramPackage.UI_DIAGRAM__USER_INTERFACE, null, msgs);
			msgs = basicSetUserInterface(newUserInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ui_diagramPackage.UI_DIAGRAM__USER_INTERFACE, newUserInterface, newUserInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ui_diagramPackage.UI_DIAGRAM__USER_INTERFACE:
				return basicSetUserInterface(null, msgs);
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
			case Ui_diagramPackage.UI_DIAGRAM__USER_INTERFACE:
				return getUserInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ui_diagramPackage.UI_DIAGRAM__USER_INTERFACE:
				setUserInterface((UserInterface)newValue);
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
			case Ui_diagramPackage.UI_DIAGRAM__USER_INTERFACE:
				setUserInterface((UserInterface)null);
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
			case Ui_diagramPackage.UI_DIAGRAM__USER_INTERFACE:
				return userInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //UI_DiagramImpl
