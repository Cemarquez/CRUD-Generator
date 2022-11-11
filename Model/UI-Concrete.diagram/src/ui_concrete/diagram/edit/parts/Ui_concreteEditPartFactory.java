/*
 * 
 */
package ui_concrete.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Ui_concreteEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(view)) {

			case ui_concrete.diagram.edit.parts.UI_DiagramEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.UI_DiagramEditPart(view);

			case ui_concrete.diagram.edit.parts.UserInterfaceEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.UserInterfaceEditPart(view);

			case ui_concrete.diagram.edit.parts.ButtonActionEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.ButtonActionEditPart(view);

			case ui_concrete.diagram.edit.parts.ButtonActionNameEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.ButtonActionNameEditPart(view);

			case ui_concrete.diagram.edit.parts.GroupEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.GroupEditPart(view);

			case ui_concrete.diagram.edit.parts.GroupTitleEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.GroupTitleEditPart(view);

			case ui_concrete.diagram.edit.parts.Group2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.Group2EditPart(view);

			case ui_concrete.diagram.edit.parts.GroupTitle2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.GroupTitle2EditPart(view);

			case ui_concrete.diagram.edit.parts.ButtonEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.ButtonEditPart(view);

			case ui_concrete.diagram.edit.parts.ButtonTextEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.ButtonTextEditPart(view);

			case ui_concrete.diagram.edit.parts.LabelEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.LabelEditPart(view);

			case ui_concrete.diagram.edit.parts.LabelTextEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.LabelTextEditPart(view);

			case ui_concrete.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.CheckBoxEditPart(view);

			case ui_concrete.diagram.edit.parts.CheckBoxTextEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.CheckBoxTextEditPart(view);

			case ui_concrete.diagram.edit.parts.TextInputEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.TextInputEditPart(view);

			case ui_concrete.diagram.edit.parts.TextInputPlaceHolderEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.TextInputPlaceHolderEditPart(view);

			case ui_concrete.diagram.edit.parts.ImageEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.ImageEditPart(view);

			case ui_concrete.diagram.edit.parts.ListEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.ListEditPart(view);

			case ui_concrete.diagram.edit.parts.ListNameEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.ListNameEditPart(view);

			case ui_concrete.diagram.edit.parts.RadioButtonEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.RadioButtonEditPart(view);

			case ui_concrete.diagram.edit.parts.RadioButtonTextEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.RadioButtonTextEditPart(view);

			case ui_concrete.diagram.edit.parts.Button2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.Button2EditPart(view);

			case ui_concrete.diagram.edit.parts.ButtonText2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.ButtonText2EditPart(view);

			case ui_concrete.diagram.edit.parts.Label2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.Label2EditPart(view);

			case ui_concrete.diagram.edit.parts.LabelText2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.LabelText2EditPart(view);

			case ui_concrete.diagram.edit.parts.CheckBox2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.CheckBox2EditPart(view);

			case ui_concrete.diagram.edit.parts.CheckBoxText2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.CheckBoxText2EditPart(view);

			case ui_concrete.diagram.edit.parts.TextInput2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.TextInput2EditPart(view);

			case ui_concrete.diagram.edit.parts.TextInputPlaceHolder2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.TextInputPlaceHolder2EditPart(view);

			case ui_concrete.diagram.edit.parts.Image2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.Image2EditPart(view);

			case ui_concrete.diagram.edit.parts.List2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.List2EditPart(view);

			case ui_concrete.diagram.edit.parts.ListName2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.ListName2EditPart(view);

			case ui_concrete.diagram.edit.parts.RadioButton2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.RadioButton2EditPart(view);

			case ui_concrete.diagram.edit.parts.RadioButtonText2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.RadioButtonText2EditPart(view);

			case ui_concrete.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.UserInterfaceUserInterfaceLstModelElementsCompartmentEditPart(
						view);

			case ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartmentEditPart(view);

			case ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart.VISUAL_ID:
				return new ui_concrete.diagram.edit.parts.GroupGroupLstChildModelElementsCompartment2EditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
