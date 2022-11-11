/**
 */
package ui_concrete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.Label#getText <em>Text</em>}</li>
 *   <li>{@link ui_concrete.Label#getFont <em>Font</em>}</li>
 *   <li>{@link ui_concrete.Label#getForegroundColor <em>Foreground Color</em>}</li>
 *   <li>{@link ui_concrete.Label#getStyle <em>Style</em>}</li>
 *   <li>{@link ui_concrete.Label#isUnderline <em>Underline</em>}</li>
 *   <li>{@link ui_concrete.Label#isStrikethrough <em>Strikethrough</em>}</li>
 * </ul>
 *
 * @see ui_concrete.Ui_concretePackage#getLabel()
 * @model annotation="gmf.node label='text' figure='rectangle' label.icon='false'"
 * @generated
 */
public interface Label extends GraphicalIndividual {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see ui_concrete.Ui_concretePackage#getLabel_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link ui_concrete.Label#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' attribute.
	 * @see #setFont(String)
	 * @see ui_concrete.Ui_concretePackage#getLabel_Font()
	 * @model
	 * @generated
	 */
	String getFont();

	/**
	 * Sets the value of the '{@link ui_concrete.Label#getFont <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' attribute.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(String value);

	/**
	 * Returns the value of the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground Color</em>' attribute.
	 * @see #setForegroundColor(String)
	 * @see ui_concrete.Ui_concretePackage#getLabel_ForegroundColor()
	 * @model
	 * @generated
	 */
	String getForegroundColor();

	/**
	 * Sets the value of the '{@link ui_concrete.Label#getForegroundColor <em>Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground Color</em>' attribute.
	 * @see #getForegroundColor()
	 * @generated
	 */
	void setForegroundColor(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see ui_concrete.Ui_concretePackage#getLabel_Style()
	 * @model
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link ui_concrete.Label#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Underline</em>' attribute.
	 * @see #setUnderline(boolean)
	 * @see ui_concrete.Ui_concretePackage#getLabel_Underline()
	 * @model
	 * @generated
	 */
	boolean isUnderline();

	/**
	 * Sets the value of the '{@link ui_concrete.Label#isUnderline <em>Underline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Underline</em>' attribute.
	 * @see #isUnderline()
	 * @generated
	 */
	void setUnderline(boolean value);

	/**
	 * Returns the value of the '<em><b>Strikethrough</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strikethrough</em>' attribute.
	 * @see #setStrikethrough(boolean)
	 * @see ui_concrete.Ui_concretePackage#getLabel_Strikethrough()
	 * @model
	 * @generated
	 */
	boolean isStrikethrough();

	/**
	 * Sets the value of the '{@link ui_concrete.Label#isStrikethrough <em>Strikethrough</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strikethrough</em>' attribute.
	 * @see #isStrikethrough()
	 * @generated
	 */
	void setStrikethrough(boolean value);

} // Label
