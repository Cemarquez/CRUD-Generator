/**
 */
package ui_concrete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.CheckBox#isSelected <em>Selected</em>}</li>
 *   <li>{@link ui_concrete.CheckBox#getText <em>Text</em>}</li>
 *   <li>{@link ui_concrete.CheckBox#getColumnSQL <em>Column SQL</em>}</li>
 * </ul>
 *
 * @see ui_concrete.Ui_concretePackage#getCheckBox()
 * @model annotation="gmf.node label='text' figure='rectangle'"
 * @generated
 */
public interface CheckBox extends GraphicalIndividual {
	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see ui_concrete.Ui_concretePackage#getCheckBox_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link ui_concrete.CheckBox#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see ui_concrete.Ui_concretePackage#getCheckBox_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link ui_concrete.CheckBox#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Column SQL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column SQL</em>' reference.
	 * @see #setColumnSQL(Column)
	 * @see ui_concrete.Ui_concretePackage#getCheckBox_ColumnSQL()
	 * @model
	 * @generated
	 */
	Column getColumnSQL();

	/**
	 * Sets the value of the '{@link ui_concrete.CheckBox#getColumnSQL <em>Column SQL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column SQL</em>' reference.
	 * @see #getColumnSQL()
	 * @generated
	 */
	void setColumnSQL(Column value);

} // CheckBox
