/**
 */
package ui_concrete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.ButtonAction#getName <em>Name</em>}</li>
 *   <li>{@link ui_concrete.ButtonAction#getLtsGraphicalIndividual <em>Lts Graphical Individual</em>}</li>
 *   <li>{@link ui_concrete.ButtonAction#getButtonAction <em>Button Action</em>}</li>
 *   <li>{@link ui_concrete.ButtonAction#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see ui_concrete.Ui_concretePackage#getButtonAction()
 * @model annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface ButtonAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ui_concrete.Ui_concretePackage#getButtonAction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ui_concrete.ButtonAction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lts Graphical Individual</b></em>' reference list.
	 * The list contents are of type {@link ui_concrete.GraphicalIndividual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lts Graphical Individual</em>' reference list.
	 * @see ui_concrete.Ui_concretePackage#getButtonAction_LtsGraphicalIndividual()
	 * @model
	 * @generated
	 */
	EList<GraphicalIndividual> getLtsGraphicalIndividual();

	/**
	 * Returns the value of the '<em><b>Button Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button Action</em>' reference.
	 * @see #setButtonAction(Button)
	 * @see ui_concrete.Ui_concretePackage#getButtonAction_ButtonAction()
	 * @model
	 * @generated
	 */
	Button getButtonAction();

	/**
	 * Sets the value of the '{@link ui_concrete.ButtonAction#getButtonAction <em>Button Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button Action</em>' reference.
	 * @see #getButtonAction()
	 * @generated
	 */
	void setButtonAction(Button value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link ui_concrete.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see ui_concrete.Action
	 * @see #setAction(Action)
	 * @see ui_concrete.Ui_concretePackage#getButtonAction_Action()
	 * @model
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link ui_concrete.ButtonAction#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see ui_concrete.Action
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // ButtonAction
