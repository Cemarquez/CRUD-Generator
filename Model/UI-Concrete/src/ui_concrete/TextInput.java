/**
 */
package ui_concrete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.TextInput#getText <em>Text</em>}</li>
 *   <li>{@link ui_concrete.TextInput#getPlaceHolder <em>Place Holder</em>}</li>
 * </ul>
 *
 * @see ui_concrete.Ui_concretePackage#getTextInput()
 * @model annotation="gmf.node label='placeHolder' figure='rounded' label.icon='false'"
 * @generated
 */
public interface TextInput extends GraphicalIndividual {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see ui_concrete.Ui_concretePackage#getTextInput_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link ui_concrete.TextInput#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Place Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Holder</em>' attribute.
	 * @see #setPlaceHolder(String)
	 * @see ui_concrete.Ui_concretePackage#getTextInput_PlaceHolder()
	 * @model
	 * @generated
	 */
	String getPlaceHolder();

	/**
	 * Sets the value of the '{@link ui_concrete.TextInput#getPlaceHolder <em>Place Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place Holder</em>' attribute.
	 * @see #getPlaceHolder()
	 * @generated
	 */
	void setPlaceHolder(String value);

} // TextInput
