/**
 */
package ui_concrete;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ui_concrete.GraphicalContainer#getLstChildModelElements <em>Lst Child Model Elements</em>}</li>
 * </ul>
 *
 * @see ui_concrete.Ui_concretePackage#getGraphicalContainer()
 * @model
 * @generated
 */
public interface GraphicalContainer extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * The list contents are of type {@link ui_concrete.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Child Model Elements</em>' containment reference list.
	 * @see ui_concrete.Ui_concretePackage#getGraphicalContainer_LstChildModelElements()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<ModelElement> getLstChildModelElements();

} // GraphicalContainer
