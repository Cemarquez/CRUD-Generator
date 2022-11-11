/**
 */
package ui_diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_diagram.CheckBox#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @see ui_diagram.Ui_diagramPackage#getCheckBox()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface CheckBox extends GraphicalIndividual {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see ui_diagram.Ui_diagramPackage#getCheckBox_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link ui_diagram.CheckBox#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // CheckBox
