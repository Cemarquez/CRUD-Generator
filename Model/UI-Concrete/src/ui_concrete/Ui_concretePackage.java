/**
 */
package ui_concrete;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ui_concrete.Ui_concreteFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface Ui_concretePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui_concrete";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ui_concrete";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui_concrete";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ui_concretePackage eINSTANCE = ui_concrete.impl.Ui_concretePackageImpl.init();

	/**
	 * The meta object id for the '{@link ui_concrete.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.ModelFactoryImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getModelFactory()
	 * @generated
	 */
	int MODEL_FACTORY = 0;

	/**
	 * The feature id for the '<em><b>Lst UI Diagrams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY__LST_UI_DIAGRAMS = 0;

	/**
	 * The number of structural features of the '<em>Model Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FACTORY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.UI_DiagramImpl <em>UI Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.UI_DiagramImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getUI_Diagram()
	 * @generated
	 */
	int UI_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>User Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM__USER_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Lts Button Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM__LTS_BUTTON_ACTIONS = 1;

	/**
	 * The number of structural features of the '<em>UI Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.UserInterfaceImpl <em>User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.UserInterfaceImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getUserInterface()
	 * @generated
	 */
	int USER_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Lst Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__LST_MODEL_ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.ModelElementImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__POSITION_X = 1;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__POSITION_Y = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__HEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__BACKGROUND_COLOR = 5;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.GraphicalContainerImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getGraphicalContainer()
	 * @generated
	 */
	int GRAPHICAL_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__POSITION_X = MODEL_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__POSITION_Y = MODEL_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__WIDTH = MODEL_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__HEIGHT = MODEL_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__BACKGROUND_COLOR = MODEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graphical Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.GraphicalIndividualImpl <em>Graphical Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.GraphicalIndividualImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getGraphicalIndividual()
	 * @generated
	 */
	int GRAPHICAL_INDIVIDUAL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__NAME = MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__POSITION_X = MODEL_ELEMENT__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__POSITION_Y = MODEL_ELEMENT__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__WIDTH = MODEL_ELEMENT__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__HEIGHT = MODEL_ELEMENT__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR = MODEL_ELEMENT__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>Graphical Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.GroupImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = GRAPHICAL_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__POSITION_X = GRAPHICAL_CONTAINER__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__POSITION_Y = GRAPHICAL_CONTAINER__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WIDTH = GRAPHICAL_CONTAINER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__HEIGHT = GRAPHICAL_CONTAINER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BACKGROUND_COLOR = GRAPHICAL_CONTAINER__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Lst Child Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LST_CHILD_MODEL_ELEMENTS = GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE = GRAPHICAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = GRAPHICAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.ButtonImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGHT = GRAPHICAL_INDIVIDUAL__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__VISIBLE = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.LabelImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGHT = GRAPHICAL_INDIVIDUAL__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FOREGROUND_COLOR = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__STYLE = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Underline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__UNDERLINE = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Strikethrough</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__STRIKETHROUGH = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.CheckBoxImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getCheckBox()
	 * @generated
	 */
	int CHECK_BOX = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__HEIGHT = GRAPHICAL_INDIVIDUAL__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__SELECTED = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__TEXT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.TextInputImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getTextInput()
	 * @generated
	 */
	int TEXT_INPUT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__HEIGHT = GRAPHICAL_INDIVIDUAL__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TEXT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Place Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__PLACE_HOLDER = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.ImageImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGHT = GRAPHICAL_INDIVIDUAL__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PATH = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.ListImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getList()
	 * @generated
	 */
	int LIST = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__HEIGHT = GRAPHICAL_INDIVIDUAL__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ui_concrete.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.RadioButtonImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getRadioButton()
	 * @generated
	 */
	int RADIO_BUTTON = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__NAME = GRAPHICAL_INDIVIDUAL__NAME;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__POSITION_X = GRAPHICAL_INDIVIDUAL__POSITION_X;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__POSITION_Y = GRAPHICAL_INDIVIDUAL__POSITION_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__WIDTH = GRAPHICAL_INDIVIDUAL__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__HEIGHT = GRAPHICAL_INDIVIDUAL__HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__TEXT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__GROUP = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link ui_concrete.impl.ButtonActionImpl <em>Button Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_concrete.impl.ButtonActionImpl
	 * @see ui_concrete.impl.Ui_concretePackageImpl#getButtonAction()
	 * @generated
	 */
	int BUTTON_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_ACTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lts Graphincal Individual</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_ACTION__LTS_GRAPHINCAL_INDIVIDUAL = 1;

	/**
	 * The number of structural features of the '<em>Button Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_ACTION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link ui_concrete.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see ui_concrete.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link ui_concrete.ModelFactory#getLstUI_Diagrams <em>Lst UI Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst UI Diagrams</em>'.
	 * @see ui_concrete.ModelFactory#getLstUI_Diagrams()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_LstUI_Diagrams();

	/**
	 * Returns the meta object for class '{@link ui_concrete.UI_Diagram <em>UI Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Diagram</em>'.
	 * @see ui_concrete.UI_Diagram
	 * @generated
	 */
	EClass getUI_Diagram();

	/**
	 * Returns the meta object for the containment reference '{@link ui_concrete.UI_Diagram#getUserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Interface</em>'.
	 * @see ui_concrete.UI_Diagram#getUserInterface()
	 * @see #getUI_Diagram()
	 * @generated
	 */
	EReference getUI_Diagram_UserInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link ui_concrete.UI_Diagram#getLtsButtonActions <em>Lts Button Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lts Button Actions</em>'.
	 * @see ui_concrete.UI_Diagram#getLtsButtonActions()
	 * @see #getUI_Diagram()
	 * @generated
	 */
	EReference getUI_Diagram_LtsButtonActions();

	/**
	 * Returns the meta object for class '{@link ui_concrete.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interface</em>'.
	 * @see ui_concrete.UserInterface
	 * @generated
	 */
	EClass getUserInterface();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.UserInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ui_concrete.UserInterface#getName()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.UserInterface#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ui_concrete.UserInterface#getWidth()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Width();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.UserInterface#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ui_concrete.UserInterface#getHeight()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Height();

	/**
	 * Returns the meta object for the containment reference list '{@link ui_concrete.UserInterface#getLstModelElements <em>Lst Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Model Elements</em>'.
	 * @see ui_concrete.UserInterface#getLstModelElements()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_LstModelElements();

	/**
	 * Returns the meta object for class '{@link ui_concrete.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see ui_concrete.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ui_concrete.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see ui_concrete.ModelElement#getPositionX()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see ui_concrete.ModelElement#getPositionY()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ui_concrete.ModelElement#getWidth()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see ui_concrete.ModelElement#getHeight()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Height();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ModelElement#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see ui_concrete.ModelElement#getBackgroundColor()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_BackgroundColor();

	/**
	 * Returns the meta object for class '{@link ui_concrete.GraphicalContainer <em>Graphical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Container</em>'.
	 * @see ui_concrete.GraphicalContainer
	 * @generated
	 */
	EClass getGraphicalContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ui_concrete.GraphicalContainer#getLstChildModelElements <em>Lst Child Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Child Model Elements</em>'.
	 * @see ui_concrete.GraphicalContainer#getLstChildModelElements()
	 * @see #getGraphicalContainer()
	 * @generated
	 */
	EReference getGraphicalContainer_LstChildModelElements();

	/**
	 * Returns the meta object for class '{@link ui_concrete.GraphicalIndividual <em>Graphical Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Individual</em>'.
	 * @see ui_concrete.GraphicalIndividual
	 * @generated
	 */
	EClass getGraphicalIndividual();

	/**
	 * Returns the meta object for class '{@link ui_concrete.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see ui_concrete.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.Group#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ui_concrete.Group#getTitle()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Title();

	/**
	 * Returns the meta object for class '{@link ui_concrete.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see ui_concrete.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.Button#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ui_concrete.Button#getText()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Text();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.Button#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see ui_concrete.Button#isVisible()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Visible();

	/**
	 * Returns the meta object for class '{@link ui_concrete.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see ui_concrete.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ui_concrete.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.Label#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see ui_concrete.Label#getFont()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Font();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.Label#getForegroundColor <em>Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground Color</em>'.
	 * @see ui_concrete.Label#getForegroundColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_ForegroundColor();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.Label#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see ui_concrete.Label#getStyle()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Style();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.Label#isUnderline <em>Underline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underline</em>'.
	 * @see ui_concrete.Label#isUnderline()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Underline();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.Label#isStrikethrough <em>Strikethrough</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strikethrough</em>'.
	 * @see ui_concrete.Label#isStrikethrough()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Strikethrough();

	/**
	 * Returns the meta object for class '{@link ui_concrete.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see ui_concrete.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.CheckBox#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see ui_concrete.CheckBox#isSelected()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Selected();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.CheckBox#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ui_concrete.CheckBox#getText()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Text();

	/**
	 * Returns the meta object for class '{@link ui_concrete.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see ui_concrete.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.TextInput#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ui_concrete.TextInput#getText()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_Text();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.TextInput#getPlaceHolder <em>Place Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Place Holder</em>'.
	 * @see ui_concrete.TextInput#getPlaceHolder()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_PlaceHolder();

	/**
	 * Returns the meta object for class '{@link ui_concrete.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see ui_concrete.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.Image#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ui_concrete.Image#getPath()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Path();

	/**
	 * Returns the meta object for class '{@link ui_concrete.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see ui_concrete.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link ui_concrete.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see ui_concrete.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.RadioButton#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ui_concrete.RadioButton#getText()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Text();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.RadioButton#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see ui_concrete.RadioButton#getGroup()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Group();

	/**
	 * Returns the meta object for class '{@link ui_concrete.ButtonAction <em>Button Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Action</em>'.
	 * @see ui_concrete.ButtonAction
	 * @generated
	 */
	EClass getButtonAction();

	/**
	 * Returns the meta object for the attribute '{@link ui_concrete.ButtonAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ui_concrete.ButtonAction#getName()
	 * @see #getButtonAction()
	 * @generated
	 */
	EAttribute getButtonAction_Name();

	/**
	 * Returns the meta object for the reference list '{@link ui_concrete.ButtonAction#getLtsGraphincalIndividual <em>Lts Graphincal Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Lts Graphincal Individual</em>'.
	 * @see ui_concrete.ButtonAction#getLtsGraphincalIndividual()
	 * @see #getButtonAction()
	 * @generated
	 */
	EReference getButtonAction_LtsGraphincalIndividual();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ui_concreteFactory getUi_concreteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ui_concrete.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.ModelFactoryImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getModelFactory()
		 * @generated
		 */
		EClass MODEL_FACTORY = eINSTANCE.getModelFactory();

		/**
		 * The meta object literal for the '<em><b>Lst UI Diagrams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_FACTORY__LST_UI_DIAGRAMS = eINSTANCE.getModelFactory_LstUI_Diagrams();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.UI_DiagramImpl <em>UI Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.UI_DiagramImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getUI_Diagram()
		 * @generated
		 */
		EClass UI_DIAGRAM = eINSTANCE.getUI_Diagram();

		/**
		 * The meta object literal for the '<em><b>User Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_DIAGRAM__USER_INTERFACE = eINSTANCE.getUI_Diagram_UserInterface();

		/**
		 * The meta object literal for the '<em><b>Lts Button Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_DIAGRAM__LTS_BUTTON_ACTIONS = eINSTANCE.getUI_Diagram_LtsButtonActions();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.UserInterfaceImpl <em>User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.UserInterfaceImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getUserInterface()
		 * @generated
		 */
		EClass USER_INTERFACE = eINSTANCE.getUserInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__NAME = eINSTANCE.getUserInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__WIDTH = eINSTANCE.getUserInterface_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__HEIGHT = eINSTANCE.getUserInterface_Height();

		/**
		 * The meta object literal for the '<em><b>Lst Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__LST_MODEL_ELEMENTS = eINSTANCE.getUserInterface_LstModelElements();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.ModelElementImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__NAME = eINSTANCE.getModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__POSITION_X = eINSTANCE.getModelElement_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__POSITION_Y = eINSTANCE.getModelElement_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__WIDTH = eINSTANCE.getModelElement_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__HEIGHT = eINSTANCE.getModelElement_Height();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__BACKGROUND_COLOR = eINSTANCE.getModelElement_BackgroundColor();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.GraphicalContainerImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getGraphicalContainer()
		 * @generated
		 */
		EClass GRAPHICAL_CONTAINER = eINSTANCE.getGraphicalContainer();

		/**
		 * The meta object literal for the '<em><b>Lst Child Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHICAL_CONTAINER__LST_CHILD_MODEL_ELEMENTS = eINSTANCE.getGraphicalContainer_LstChildModelElements();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.GraphicalIndividualImpl <em>Graphical Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.GraphicalIndividualImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getGraphicalIndividual()
		 * @generated
		 */
		EClass GRAPHICAL_INDIVIDUAL = eINSTANCE.getGraphicalIndividual();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.GroupImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__TITLE = eINSTANCE.getGroup_Title();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.ButtonImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TEXT = eINSTANCE.getButton_Text();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__VISIBLE = eINSTANCE.getButton_Visible();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.LabelImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT = eINSTANCE.getLabel_Text();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FONT = eINSTANCE.getLabel_Font();

		/**
		 * The meta object literal for the '<em><b>Foreground Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FOREGROUND_COLOR = eINSTANCE.getLabel_ForegroundColor();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__STYLE = eINSTANCE.getLabel_Style();

		/**
		 * The meta object literal for the '<em><b>Underline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__UNDERLINE = eINSTANCE.getLabel_Underline();

		/**
		 * The meta object literal for the '<em><b>Strikethrough</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__STRIKETHROUGH = eINSTANCE.getLabel_Strikethrough();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.CheckBoxImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getCheckBox()
		 * @generated
		 */
		EClass CHECK_BOX = eINSTANCE.getCheckBox();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__SELECTED = eINSTANCE.getCheckBox_Selected();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_BOX__TEXT = eINSTANCE.getCheckBox_Text();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.TextInputImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getTextInput()
		 * @generated
		 */
		EClass TEXT_INPUT = eINSTANCE.getTextInput();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__TEXT = eINSTANCE.getTextInput_Text();

		/**
		 * The meta object literal for the '<em><b>Place Holder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__PLACE_HOLDER = eINSTANCE.getTextInput_PlaceHolder();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.ImageImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__PATH = eINSTANCE.getImage_Path();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.ListImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.RadioButtonImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__TEXT = eINSTANCE.getRadioButton_Text();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__GROUP = eINSTANCE.getRadioButton_Group();

		/**
		 * The meta object literal for the '{@link ui_concrete.impl.ButtonActionImpl <em>Button Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_concrete.impl.ButtonActionImpl
		 * @see ui_concrete.impl.Ui_concretePackageImpl#getButtonAction()
		 * @generated
		 */
		EClass BUTTON_ACTION = eINSTANCE.getButtonAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_ACTION__NAME = eINSTANCE.getButtonAction_Name();

		/**
		 * The meta object literal for the '<em><b>Lts Graphincal Individual</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON_ACTION__LTS_GRAPHINCAL_INDIVIDUAL = eINSTANCE.getButtonAction_LtsGraphincalIndividual();

	}

} //Ui_concretePackage
