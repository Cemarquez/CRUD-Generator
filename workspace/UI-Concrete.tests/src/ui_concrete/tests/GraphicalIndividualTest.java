/**
 */
package ui_concrete.tests;

import junit.textui.TestRunner;

import ui_concrete.GraphicalIndividual;
import ui_concrete.Ui_concreteFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Graphical Individual</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicalIndividualTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GraphicalIndividualTest.class);
	}

	/**
	 * Constructs a new Graphical Individual test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalIndividualTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Graphical Individual test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GraphicalIndividual getFixture() {
		return (GraphicalIndividual)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Ui_concreteFactory.eINSTANCE.createGraphicalIndividual());
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

} //GraphicalIndividualTest
