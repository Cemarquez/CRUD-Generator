/**
 */
package ui_concrete.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
 *   <li>{@link ui_concrete.impl.ButtonActionImpl#getLtsGraphincalIndividual <em>Lts Graphincal Individual</em>}</li>
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
	 * The cached value of the '{@link #getLtsGraphincalIndividual() <em>Lts Graphincal Individual</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLtsGraphincalIndividual()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphicalIndividual> ltsGraphincalIndividual;

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
	public EList<GraphicalIndividual> getLtsGraphincalIndividual() {
		if (ltsGraphincalIndividual == null) {
			ltsGraphincalIndividual = new EObjectResolvingEList<GraphicalIndividual>(GraphicalIndividual.class, this, Ui_concretePackage.BUTTON_ACTION__LTS_GRAPHINCAL_INDIVIDUAL);
		}
		return ltsGraphincalIndividual;
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
			case Ui_concretePackage.BUTTON_ACTION__LTS_GRAPHINCAL_INDIVIDUAL:
				return getLtsGraphincalIndividual();
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
			case Ui_concretePackage.BUTTON_ACTION__LTS_GRAPHINCAL_INDIVIDUAL:
				getLtsGraphincalIndividual().clear();
				getLtsGraphincalIndividual().addAll((Collection<? extends GraphicalIndividual>)newValue);
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
			case Ui_concretePackage.BUTTON_ACTION__LTS_GRAPHINCAL_INDIVIDUAL:
				getLtsGraphincalIndividual().clear();
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
			case Ui_concretePackage.BUTTON_ACTION__LTS_GRAPHINCAL_INDIVIDUAL:
				return ltsGraphincalIndividual != null && !ltsGraphincalIndividual.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ButtonActionImpl
