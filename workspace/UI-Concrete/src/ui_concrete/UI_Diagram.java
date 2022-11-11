/**
 */
package ui_concrete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.UI_Diagram#getUserInterface <em>User Interface</em>}</li>
 *   <li>{@link ui_concrete.UI_Diagram#getLtsButtonActions <em>Lts Button Actions</em>}</li>
 *   <li>{@link ui_concrete.UI_Diagram#getLstColumns <em>Lst Columns</em>}</li>
 * </ul>
 *
 * @see ui_concrete.Ui_concretePackage#getUI_Diagram()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface UI_Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>User Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Interface</em>' containment reference.
	 * @see #setUserInterface(UserInterface)
	 * @see ui_concrete.Ui_concretePackage#getUI_Diagram_UserInterface()
	 * @model containment="true"
	 * @generated
	 */
	UserInterface getUserInterface();

	/**
	 * Sets the value of the '{@link ui_concrete.UI_Diagram#getUserInterface <em>User Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Interface</em>' containment reference.
	 * @see #getUserInterface()
	 * @generated
	 */
	void setUserInterface(UserInterface value);

	/**
	 * Returns the value of the '<em><b>Lts Button Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ui_concrete.ButtonAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lts Button Actions</em>' containment reference list.
	 * @see ui_concrete.Ui_concretePackage#getUI_Diagram_LtsButtonActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ButtonAction> getLtsButtonActions();

	/**
	 * Returns the value of the '<em><b>Lst Columns</b></em>' containment reference list.
	 * The list contents are of type {@link ui_concrete.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Columns</em>' containment reference list.
	 * @see ui_concrete.Ui_concretePackage#getUI_Diagram_LstColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getLstColumns();

} // UI_Diagram
