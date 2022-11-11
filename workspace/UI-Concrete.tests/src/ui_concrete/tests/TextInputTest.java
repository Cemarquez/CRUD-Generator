/**
 */
package ui_concrete.tests;

import junit.textui.TestRunner;

import ui_concrete.TextInput;
import ui_concrete.Ui_concreteFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Input</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextInputTest extends GraphicalIndividualTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextInputTest.class);
	}

	/**
	 * Constructs a new Text Input test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextInputTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Input test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextInput getFixture() {
		return (TextInput)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ui_concreteFactory.eINSTANCE.createTextInput());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TextInputTest
