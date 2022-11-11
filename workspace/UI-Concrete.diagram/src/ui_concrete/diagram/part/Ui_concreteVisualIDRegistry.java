/*
* 
*/
package ui_concrete.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Ui_concreteVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "UI-Concrete.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ui_concrete.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ui_concrete.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				ui_concrete.diagram.part.Ui_concreteDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ui_concrete.Ui_concretePackage.eINSTANCE.getUI_Diagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ui_concrete.UI_Diagram) domainElement)) {
			return ui_concrete.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getModelID(containerView);
		if (!ui_concrete.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"ui_concrete".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ui_concrete.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ui_concrete.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ui_concrete.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getUserInterface().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getButtonAction().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.ButtonActionEditPart.VISUAL_ID;
			}
			break;
		case ui_concrete.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.GroupEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.Button2EditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.Label2EditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.TextInput2EditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.Image2EditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getList().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.List2EditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID;
			}
			break;
		case ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getList().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID;
			}
			break;
		case ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getGroup().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.Group2EditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getTextInput().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getList().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID;
			}
			if (ui_concrete.Ui_concretePackage.eINSTANCE.getRadioButton().isSuperTypeOf(domainElement.eClass())) {
				return ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getModelID(containerView);
		if (!ui_concrete.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)
				&& !"ui_concrete".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ui_concrete.diagram.edit.parts.UI_DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ui_concrete.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ui_concrete.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.ButtonActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.ButtonActionEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.ButtonActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.GroupTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.GroupTitle2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.ButtonTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.LabelTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.CheckBoxTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.TextInputPlaceHolderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.ListNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.RadioButtonTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.ButtonText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.LabelText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.CheckBoxText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.TextInputPlaceHolder2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.List2EditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.ListName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.RadioButtonText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.Button2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.Label2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.TextInput2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.Image2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.List2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			if (ui_concrete.diagram.edit.parts.Group2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ui_concrete.UI_Diagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ui_concrete.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ui_concrete.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return false;
		case ui_concrete.diagram.edit.parts.ButtonActionEditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.ImageEditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.Button2EditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.Label2EditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.Image2EditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.List2EditPart.VISUAL_ID:
		case ui_concrete.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
