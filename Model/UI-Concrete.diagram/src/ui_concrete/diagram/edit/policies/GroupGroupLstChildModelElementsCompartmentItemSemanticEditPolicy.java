/*
* 
*/
package ui_concrete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class GroupGroupLstChildModelElementsCompartmentItemSemanticEditPolicy
		extends ui_concrete.diagram.edit.policies.Ui_concreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public GroupGroupLstChildModelElementsCompartmentItemSemanticEditPolicy() {
		super(ui_concrete.diagram.providers.Ui_concreteElementTypes.Group_3001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.Group_3002 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.Group2CreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.Button_3003 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.ButtonCreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.Label_3004 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.LabelCreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.CheckBox_3005 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.CheckBoxCreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.TextInput_3006 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.TextInputCreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.Image_3007 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.ImageCreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.List_3008 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.ListCreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.RadioButton_3009 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.RadioButtonCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
