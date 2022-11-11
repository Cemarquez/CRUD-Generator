/**
 */
package ui_concrete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.Image#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see ui_concrete.Ui_concretePackage#getImage()
 * @model annotation="gmf.node label.placement='none' label.icon='false' figure='svg' svg.uri='platform:/plugin/UI-Concrete/resources/Image.svg'"
 * @generated
 */
public interface Image extends GraphicalIndividual {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see ui_concrete.Ui_concretePackage#getImage_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link ui_concrete.Image#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // Image
