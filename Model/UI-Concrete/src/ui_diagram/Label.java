/**
 */
package ui_diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_diagram.Label#getText <em>Text</em>}</li>
 *   <li>{@link ui_diagram.Label#getTextFont <em>Text Font</em>}</li>
 *   <li>{@link ui_diagram.Label#getTextFontSize <em>Text Font Size</em>}</li>
 *   <li>{@link ui_diagram.Label#getTextFontColor <em>Text Font Color</em>}</li>
 * </ul>
 *
 * @see ui_diagram.Ui_diagramPackage#getLabel()
 * @model annotation="gmf.node label='text'"
 * @generated
 */
public interface Label extends GraphicalIndividual {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see ui_diagram.Ui_diagramPackage#getLabel_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link ui_diagram.Label#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Text Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Font</em>' attribute.
	 * @see #setTextFont(String)
	 * @see ui_diagram.Ui_diagramPackage#getLabel_TextFont()
	 * @model
	 * @generated
	 */
	String getTextFont();

	/**
	 * Sets the value of the '{@link ui_diagram.Label#getTextFont <em>Text Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Font</em>' attribute.
	 * @see #getTextFont()
	 * @generated
	 */
	void setTextFont(String value);

	/**
	 * Returns the value of the '<em><b>Text Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Font Size</em>' attribute.
	 * @see #setTextFontSize(String)
	 * @see ui_diagram.Ui_diagramPackage#getLabel_TextFontSize()
	 * @model
	 * @generated
	 */
	String getTextFontSize();

	/**
	 * Sets the value of the '{@link ui_diagram.Label#getTextFontSize <em>Text Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Font Size</em>' attribute.
	 * @see #getTextFontSize()
	 * @generated
	 */
	void setTextFontSize(String value);

	/**
	 * Returns the value of the '<em><b>Text Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Font Color</em>' attribute.
	 * @see #setTextFontColor(String)
	 * @see ui_diagram.Ui_diagramPackage#getLabel_TextFontColor()
	 * @model
	 * @generated
	 */
	String getTextFontColor();

	/**
	 * Sets the value of the '{@link ui_diagram.Label#getTextFontColor <em>Text Font Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Font Color</em>' attribute.
	 * @see #getTextFontColor()
	 * @generated
	 */
	void setTextFontColor(String value);

} // Label
