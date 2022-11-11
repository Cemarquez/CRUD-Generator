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
 *   <li>{@link ui_concrete.ButtonAction#getLtsGraphincalIndividual <em>Lts Graphincal Individual</em>}</li>
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
	 * Returns the value of the '<em><b>Lts Graphincal Individual</b></em>' reference list.
	 * The list contents are of type {@link ui_concrete.GraphicalIndividual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lts Graphincal Individual</em>' reference list.
	 * @see ui_concrete.Ui_concretePackage#getButtonAction_LtsGraphincalIndividual()
	 * @model
	 * @generated
	 */
	EList<GraphicalIndividual> getLtsGraphincalIndividual();

} // ButtonAction
