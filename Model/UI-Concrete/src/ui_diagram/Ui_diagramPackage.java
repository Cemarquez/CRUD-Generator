/**
 */
package ui_diagram;

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
 * @see ui_diagram.Ui_diagramFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface Ui_diagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui_diagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ui_concrete";

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
	Ui_diagramPackage eINSTANCE = ui_diagram.impl.Ui_diagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link ui_diagram.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.ModelFactoryImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getModelFactory()
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
	 * The meta object id for the '{@link ui_diagram.impl.UI_DiagramImpl <em>UI Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.UI_DiagramImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getUI_Diagram()
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
	 * The number of structural features of the '<em>UI Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DIAGRAM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ui_diagram.impl.UserInterfaceImpl <em>User Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.UserInterfaceImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getUserInterface()
	 * @generated
	 */
	int USER_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Position X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POSITION_X = 1;

	/**
	 * The feature id for the '<em><b>Position Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__POSITION_Y = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__HEIGTH = 4;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__BACKGROUND_COLOR = 5;

	/**
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE_FONT = 6;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__TITLE_FONT_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Lst Model Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE__LST_MODEL_ELEMENTS = 8;

	/**
	 * The number of structural features of the '<em>User Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_INTERFACE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link ui_diagram.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.ModelElementImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getModelElement()
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
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__HEIGTH = 4;

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
	 * The meta object id for the '{@link ui_diagram.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.GraphicalContainerImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getGraphicalContainer()
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
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_CONTAINER__HEIGTH = MODEL_ELEMENT__HEIGTH;

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
	 * The meta object id for the '{@link ui_diagram.impl.GraphicalIndividualImpl <em>Graphical Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.GraphicalIndividualImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getGraphicalIndividual()
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
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_INDIVIDUAL__HEIGTH = MODEL_ELEMENT__HEIGTH;

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
	 * The meta object id for the '{@link ui_diagram.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.GroupImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getGroup()
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
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__HEIGTH = GRAPHICAL_CONTAINER__HEIGTH;

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
	 * The feature id for the '<em><b>Title Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE_FONT = GRAPHICAL_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE_FONT_SIZE = GRAPHICAL_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TITLE_FONT_COLOR = GRAPHICAL_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = GRAPHICAL_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ui_diagram.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.ButtonImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getButton()
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
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

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
	 * The feature id for the '<em><b>Text Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT_FONT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT_FONT_SIZE = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT_FONT_COLOR = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ui_diagram.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.LabelImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getLabel()
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
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

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
	 * The feature id for the '<em><b>Text Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_FONT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_FONT_SIZE = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_FONT_COLOR = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ui_diagram.impl.CheckBoxImpl <em>Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.CheckBoxImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getCheckBox()
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
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

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
	 * The number of structural features of the '<em>Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_BOX_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ui_diagram.impl.TextInputImpl <em>Text Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.TextInputImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getTextInput()
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
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

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
	 * The feature id for the '<em><b>Text Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TEXT_FONT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TEXT_FONT_SIZE = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT__TEXT_FONT_COLOR = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Text Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_INPUT_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ui_diagram.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.ImageImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getImage()
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
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

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
	 * The meta object id for the '{@link ui_diagram.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.ListImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getList()
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
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

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
	 * The meta object id for the '{@link ui_diagram.impl.RadioButtonImpl <em>Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ui_diagram.impl.RadioButtonImpl
	 * @see ui_diagram.impl.Ui_diagramPackageImpl#getRadioButton()
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
	 * The feature id for the '<em><b>Heigth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__HEIGTH = GRAPHICAL_INDIVIDUAL__HEIGTH;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__BACKGROUND_COLOR = GRAPHICAL_INDIVIDUAL__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON__PATH = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIO_BUTTON_FEATURE_COUNT = GRAPHICAL_INDIVIDUAL_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link ui_diagram.ModelFactory <em>Model Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Factory</em>'.
	 * @see ui_diagram.ModelFactory
	 * @generated
	 */
	EClass getModelFactory();

	/**
	 * Returns the meta object for the containment reference list '{@link ui_diagram.ModelFactory#getLstUI_Diagrams <em>Lst UI Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst UI Diagrams</em>'.
	 * @see ui_diagram.ModelFactory#getLstUI_Diagrams()
	 * @see #getModelFactory()
	 * @generated
	 */
	EReference getModelFactory_LstUI_Diagrams();

	/**
	 * Returns the meta object for class '{@link ui_diagram.UI_Diagram <em>UI Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Diagram</em>'.
	 * @see ui_diagram.UI_Diagram
	 * @generated
	 */
	EClass getUI_Diagram();

	/**
	 * Returns the meta object for the containment reference '{@link ui_diagram.UI_Diagram#getUserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Interface</em>'.
	 * @see ui_diagram.UI_Diagram#getUserInterface()
	 * @see #getUI_Diagram()
	 * @generated
	 */
	EReference getUI_Diagram_UserInterface();

	/**
	 * Returns the meta object for class '{@link ui_diagram.UserInterface <em>User Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Interface</em>'.
	 * @see ui_diagram.UserInterface
	 * @generated
	 */
	EClass getUserInterface();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.UserInterface#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ui_diagram.UserInterface#getTitle()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Title();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.UserInterface#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see ui_diagram.UserInterface#getPositionX()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.UserInterface#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see ui_diagram.UserInterface#getPositionY()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.UserInterface#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ui_diagram.UserInterface#getWidth()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Width();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.UserInterface#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see ui_diagram.UserInterface#getHeigth()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.UserInterface#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see ui_diagram.UserInterface#getBackgroundColor()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.UserInterface#getTitleFont <em>Title Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font</em>'.
	 * @see ui_diagram.UserInterface#getTitleFont()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_TitleFont();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.UserInterface#getTitleFontSize <em>Title Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font Size</em>'.
	 * @see ui_diagram.UserInterface#getTitleFontSize()
	 * @see #getUserInterface()
	 * @generated
	 */
	EAttribute getUserInterface_TitleFontSize();

	/**
	 * Returns the meta object for the containment reference list '{@link ui_diagram.UserInterface#getLstModelElements <em>Lst Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Model Elements</em>'.
	 * @see ui_diagram.UserInterface#getLstModelElements()
	 * @see #getUserInterface()
	 * @generated
	 */
	EReference getUserInterface_LstModelElements();

	/**
	 * Returns the meta object for class '{@link ui_diagram.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see ui_diagram.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.ModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ui_diagram.ModelElement#getName()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.ModelElement#getPositionX <em>Position X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position X</em>'.
	 * @see ui_diagram.ModelElement#getPositionX()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PositionX();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.ModelElement#getPositionY <em>Position Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position Y</em>'.
	 * @see ui_diagram.ModelElement#getPositionY()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_PositionY();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.ModelElement#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see ui_diagram.ModelElement#getWidth()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Width();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.ModelElement#getHeigth <em>Heigth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heigth</em>'.
	 * @see ui_diagram.ModelElement#getHeigth()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Heigth();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.ModelElement#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see ui_diagram.ModelElement#getBackgroundColor()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_BackgroundColor();

	/**
	 * Returns the meta object for class '{@link ui_diagram.GraphicalContainer <em>Graphical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Container</em>'.
	 * @see ui_diagram.GraphicalContainer
	 * @generated
	 */
	EClass getGraphicalContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ui_diagram.GraphicalContainer#getLstChildModelElements <em>Lst Child Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lst Child Model Elements</em>'.
	 * @see ui_diagram.GraphicalContainer#getLstChildModelElements()
	 * @see #getGraphicalContainer()
	 * @generated
	 */
	EReference getGraphicalContainer_LstChildModelElements();

	/**
	 * Returns the meta object for class '{@link ui_diagram.GraphicalIndividual <em>Graphical Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Individual</em>'.
	 * @see ui_diagram.GraphicalIndividual
	 * @generated
	 */
	EClass getGraphicalIndividual();

	/**
	 * Returns the meta object for class '{@link ui_diagram.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see ui_diagram.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Group#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see ui_diagram.Group#getTitle()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Title();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Group#getTitleFont <em>Title Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font</em>'.
	 * @see ui_diagram.Group#getTitleFont()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_TitleFont();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Group#getTitleFontSize <em>Title Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font Size</em>'.
	 * @see ui_diagram.Group#getTitleFontSize()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_TitleFontSize();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Group#getTitleFontColor <em>Title Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title Font Color</em>'.
	 * @see ui_diagram.Group#getTitleFontColor()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_TitleFontColor();

	/**
	 * Returns the meta object for class '{@link ui_diagram.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see ui_diagram.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Button#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ui_diagram.Button#getText()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Text();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Button#getTextFont <em>Text Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Font</em>'.
	 * @see ui_diagram.Button#getTextFont()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_TextFont();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Button#getTextFontSize <em>Text Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Font Size</em>'.
	 * @see ui_diagram.Button#getTextFontSize()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_TextFontSize();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Button#getTextFontColor <em>Text Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Font Color</em>'.
	 * @see ui_diagram.Button#getTextFontColor()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_TextFontColor();

	/**
	 * Returns the meta object for class '{@link ui_diagram.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see ui_diagram.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Label#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ui_diagram.Label#getText()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Text();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Label#getTextFont <em>Text Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Font</em>'.
	 * @see ui_diagram.Label#getTextFont()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextFont();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Label#getTextFontSize <em>Text Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Font Size</em>'.
	 * @see ui_diagram.Label#getTextFontSize()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextFontSize();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Label#getTextFontColor <em>Text Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Font Color</em>'.
	 * @see ui_diagram.Label#getTextFontColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextFontColor();

	/**
	 * Returns the meta object for class '{@link ui_diagram.CheckBox <em>Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Box</em>'.
	 * @see ui_diagram.CheckBox
	 * @generated
	 */
	EClass getCheckBox();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.CheckBox#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see ui_diagram.CheckBox#isSelected()
	 * @see #getCheckBox()
	 * @generated
	 */
	EAttribute getCheckBox_Selected();

	/**
	 * Returns the meta object for class '{@link ui_diagram.TextInput <em>Text Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Input</em>'.
	 * @see ui_diagram.TextInput
	 * @generated
	 */
	EClass getTextInput();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.TextInput#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see ui_diagram.TextInput#getText()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_Text();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.TextInput#getTextFont <em>Text Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Font</em>'.
	 * @see ui_diagram.TextInput#getTextFont()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_TextFont();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.TextInput#getTextFontSize <em>Text Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Font Size</em>'.
	 * @see ui_diagram.TextInput#getTextFontSize()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_TextFontSize();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.TextInput#getTextFontColor <em>Text Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Font Color</em>'.
	 * @see ui_diagram.TextInput#getTextFontColor()
	 * @see #getTextInput()
	 * @generated
	 */
	EAttribute getTextInput_TextFontColor();

	/**
	 * Returns the meta object for class '{@link ui_diagram.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see ui_diagram.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.Image#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ui_diagram.Image#getPath()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Path();

	/**
	 * Returns the meta object for class '{@link ui_diagram.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see ui_diagram.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for class '{@link ui_diagram.RadioButton <em>Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radio Button</em>'.
	 * @see ui_diagram.RadioButton
	 * @generated
	 */
	EClass getRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link ui_diagram.RadioButton#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ui_diagram.RadioButton#getPath()
	 * @see #getRadioButton()
	 * @generated
	 */
	EAttribute getRadioButton_Path();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ui_diagramFactory getUi_diagramFactory();

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
		 * The meta object literal for the '{@link ui_diagram.impl.ModelFactoryImpl <em>Model Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.ModelFactoryImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getModelFactory()
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
		 * The meta object literal for the '{@link ui_diagram.impl.UI_DiagramImpl <em>UI Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.UI_DiagramImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getUI_Diagram()
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
		 * The meta object literal for the '{@link ui_diagram.impl.UserInterfaceImpl <em>User Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.UserInterfaceImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getUserInterface()
		 * @generated
		 */
		EClass USER_INTERFACE = eINSTANCE.getUserInterface();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE = eINSTANCE.getUserInterface_Title();

		/**
		 * The meta object literal for the '<em><b>Position X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__POSITION_X = eINSTANCE.getUserInterface_PositionX();

		/**
		 * The meta object literal for the '<em><b>Position Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__POSITION_Y = eINSTANCE.getUserInterface_PositionY();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__WIDTH = eINSTANCE.getUserInterface_Width();

		/**
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__HEIGTH = eINSTANCE.getUserInterface_Heigth();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__BACKGROUND_COLOR = eINSTANCE.getUserInterface_BackgroundColor();

		/**
		 * The meta object literal for the '<em><b>Title Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE_FONT = eINSTANCE.getUserInterface_TitleFont();

		/**
		 * The meta object literal for the '<em><b>Title Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_INTERFACE__TITLE_FONT_SIZE = eINSTANCE.getUserInterface_TitleFontSize();

		/**
		 * The meta object literal for the '<em><b>Lst Model Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_INTERFACE__LST_MODEL_ELEMENTS = eINSTANCE.getUserInterface_LstModelElements();

		/**
		 * The meta object literal for the '{@link ui_diagram.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.ModelElementImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getModelElement()
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
		 * The meta object literal for the '<em><b>Heigth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__HEIGTH = eINSTANCE.getModelElement_Heigth();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__BACKGROUND_COLOR = eINSTANCE.getModelElement_BackgroundColor();

		/**
		 * The meta object literal for the '{@link ui_diagram.impl.GraphicalContainerImpl <em>Graphical Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.GraphicalContainerImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getGraphicalContainer()
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
		 * The meta object literal for the '{@link ui_diagram.impl.GraphicalIndividualImpl <em>Graphical Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.GraphicalIndividualImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getGraphicalIndividual()
		 * @generated
		 */
		EClass GRAPHICAL_INDIVIDUAL = eINSTANCE.getGraphicalIndividual();

		/**
		 * The meta object literal for the '{@link ui_diagram.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.GroupImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getGroup()
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
		 * The meta object literal for the '<em><b>Title Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__TITLE_FONT = eINSTANCE.getGroup_TitleFont();

		/**
		 * The meta object literal for the '<em><b>Title Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__TITLE_FONT_SIZE = eINSTANCE.getGroup_TitleFontSize();

		/**
		 * The meta object literal for the '<em><b>Title Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__TITLE_FONT_COLOR = eINSTANCE.getGroup_TitleFontColor();

		/**
		 * The meta object literal for the '{@link ui_diagram.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.ButtonImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getButton()
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
		 * The meta object literal for the '<em><b>Text Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TEXT_FONT = eINSTANCE.getButton_TextFont();

		/**
		 * The meta object literal for the '<em><b>Text Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TEXT_FONT_SIZE = eINSTANCE.getButton_TextFontSize();

		/**
		 * The meta object literal for the '<em><b>Text Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TEXT_FONT_COLOR = eINSTANCE.getButton_TextFontColor();

		/**
		 * The meta object literal for the '{@link ui_diagram.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.LabelImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getLabel()
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
		 * The meta object literal for the '<em><b>Text Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_FONT = eINSTANCE.getLabel_TextFont();

		/**
		 * The meta object literal for the '<em><b>Text Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_FONT_SIZE = eINSTANCE.getLabel_TextFontSize();

		/**
		 * The meta object literal for the '<em><b>Text Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_FONT_COLOR = eINSTANCE.getLabel_TextFontColor();

		/**
		 * The meta object literal for the '{@link ui_diagram.impl.CheckBoxImpl <em>Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.CheckBoxImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getCheckBox()
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
		 * The meta object literal for the '{@link ui_diagram.impl.TextInputImpl <em>Text Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.TextInputImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getTextInput()
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
		 * The meta object literal for the '<em><b>Text Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__TEXT_FONT = eINSTANCE.getTextInput_TextFont();

		/**
		 * The meta object literal for the '<em><b>Text Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__TEXT_FONT_SIZE = eINSTANCE.getTextInput_TextFontSize();

		/**
		 * The meta object literal for the '<em><b>Text Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_INPUT__TEXT_FONT_COLOR = eINSTANCE.getTextInput_TextFontColor();

		/**
		 * The meta object literal for the '{@link ui_diagram.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.ImageImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getImage()
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
		 * The meta object literal for the '{@link ui_diagram.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.ListImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '{@link ui_diagram.impl.RadioButtonImpl <em>Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ui_diagram.impl.RadioButtonImpl
		 * @see ui_diagram.impl.Ui_diagramPackageImpl#getRadioButton()
		 * @generated
		 */
		EClass RADIO_BUTTON = eINSTANCE.getRadioButton();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RADIO_BUTTON__PATH = eINSTANCE.getRadioButton_Path();

	}

} //Ui_diagramPackage
