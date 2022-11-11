/*
* 
*/
package ui_concrete.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Ui_concreteDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<ui_concrete.diagram.part.Ui_concreteNodeDescriptor> getSemanticChildren(View view) {
		switch (ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(view)) {
		case ui_concrete.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000SemanticChildren(view);
		case ui_concrete.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
			return getUserInterfaceUserInterfaceLstModelElementsCompartment_7001SemanticChildren(view);
		case ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
			return getGroupGroupLstChildModelElementsCompartment_7002SemanticChildren(view);
		case ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
			return getGroupGroupLstChildModelElementsCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ui_concrete.diagram.part.Ui_concreteNodeDescriptor> getUI_Diagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ui_concrete.UI_Diagram modelElement = (ui_concrete.UI_Diagram) view.getElement();
		LinkedList<ui_concrete.diagram.part.Ui_concreteNodeDescriptor> result = new LinkedList<ui_concrete.diagram.part.Ui_concreteNodeDescriptor>();
		{
			ui_concrete.UserInterface childElement = modelElement.getUserInterface();
			int visualID = ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_concrete.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getLtsButtonActions().iterator(); it.hasNext();) {
			ui_concrete.ButtonAction childElement = (ui_concrete.ButtonAction) it.next();
			int visualID = ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_concrete.diagram.edit.parts.ButtonActionEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_concrete.diagram.part.Ui_concreteNodeDescriptor> getUserInterfaceUserInterfaceLstModelElementsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ui_concrete.UserInterface modelElement = (ui_concrete.UserInterface) containerView.getElement();
		LinkedList<ui_concrete.diagram.part.Ui_concreteNodeDescriptor> result = new LinkedList<ui_concrete.diagram.part.Ui_concreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstModelElements().iterator(); it.hasNext();) {
			ui_concrete.ModelElement childElement = (ui_concrete.ModelElement) it.next();
			int visualID = ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_concrete.diagram.edit.parts.GroupEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.Button2EditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.Label2EditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.TextInput2EditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.Image2EditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.List2EditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_concrete.diagram.part.Ui_concreteNodeDescriptor> getGroupGroupLstChildModelElementsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ui_concrete.Group modelElement = (ui_concrete.Group) containerView.getElement();
		LinkedList<ui_concrete.diagram.part.Ui_concreteNodeDescriptor> result = new LinkedList<ui_concrete.diagram.part.Ui_concreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ui_concrete.ModelElement childElement = (ui_concrete.ModelElement) it.next();
			int visualID = ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_concrete.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_concrete.diagram.part.Ui_concreteNodeDescriptor> getGroupGroupLstChildModelElementsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ui_concrete.Group modelElement = (ui_concrete.Group) containerView.getElement();
		LinkedList<ui_concrete.diagram.part.Ui_concreteNodeDescriptor> result = new LinkedList<ui_concrete.diagram.part.Ui_concreteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLstChildModelElements().iterator(); it.hasNext();) {
			ui_concrete.ModelElement childElement = (ui_concrete.ModelElement) it.next();
			int visualID = ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ui_concrete.diagram.edit.parts.Group2EditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID) {
				result.add(new ui_concrete.diagram.part.Ui_concreteNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getContainedLinks(View view) {
		switch (ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(view)) {
		case ui_concrete.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
			return getUI_Diagram_1000ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.ButtonActionEditPart.VISUAL_ID:
			return getButtonAction_2002ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_3001ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3002ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3003ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			return getTextInput_3006ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3007ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID:
			return getList_3008ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3009ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3010ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3011ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3012ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			return getTextInput_3013ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.Image2EditPart.VISUAL_ID:
			return getImage_3014ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.List2EditPart.VISUAL_ID:
			return getList_3015ContainedLinks(view);
		case ui_concrete.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3016ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getIncomingLinks(View view) {
		switch (ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(view)) {
		case ui_concrete.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.ButtonActionEditPart.VISUAL_ID:
			return getButtonAction_2002IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_3001IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3002IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3003IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			return getTextInput_3006IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3007IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID:
			return getList_3008IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3009IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3010IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3011IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3012IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			return getTextInput_3013IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.Image2EditPart.VISUAL_ID:
			return getImage_3014IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.List2EditPart.VISUAL_ID:
			return getList_3015IncomingLinks(view);
		case ui_concrete.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3016IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getOutgoingLinks(View view) {
		switch (ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(view)) {
		case ui_concrete.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
			return getUserInterface_2001OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.ButtonActionEditPart.VISUAL_ID:
			return getButtonAction_2002OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.GroupEditPart.VISUAL_ID:
			return getGroup_3001OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.Group2EditPart.VISUAL_ID:
			return getGroup_3002OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
			return getButton_3003OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3004OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3005OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
			return getTextInput_3006OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3007OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID:
			return getList_3008OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
			return getRadioButton_3009OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.Button2EditPart.VISUAL_ID:
			return getButton_3010OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.Label2EditPart.VISUAL_ID:
			return getLabel_3011OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
			return getCheckBox_3012OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
			return getTextInput_3013OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.Image2EditPart.VISUAL_ID:
			return getImage_3014OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.List2EditPart.VISUAL_ID:
			return getList_3015OutgoingLinks(view);
		case ui_concrete.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
			return getRadioButton_3016OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getUI_Diagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getUserInterface_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getButtonAction_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getGroup_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getGroup_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getButton_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getLabel_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getCheckBox_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getTextInput_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getImage_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getList_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getRadioButton_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getButton_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getLabel_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getCheckBox_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getTextInput_3013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getImage_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getList_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getRadioButton_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getUserInterface_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getButtonAction_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getGroup_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getGroup_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getButton_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getLabel_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getCheckBox_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getTextInput_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getImage_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getList_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getRadioButton_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getButton_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getLabel_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getCheckBox_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getTextInput_3013IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getImage_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getList_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getRadioButton_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getUserInterface_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getButtonAction_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getGroup_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getGroup_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getButton_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getLabel_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getCheckBox_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getTextInput_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getImage_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getList_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getRadioButton_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getButton_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getLabel_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getCheckBox_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getTextInput_3013OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getImage_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getList_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getRadioButton_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<ui_concrete.diagram.part.Ui_concreteNodeDescriptor> getSemanticChildren(View view) {
			return Ui_concreteDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getContainedLinks(View view) {
			return Ui_concreteDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getIncomingLinks(View view) {
			return Ui_concreteDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<ui_concrete.diagram.part.Ui_concreteLinkDescriptor> getOutgoingLinks(View view) {
			return Ui_concreteDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
