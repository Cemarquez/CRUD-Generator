/*
* 
*/
package ui_concrete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class UserInterfaceUserInterfaceLstModelElementsCompartmentItemSemanticEditPolicy
		extends ui_concrete.diagram.edit.policies.Ui_concreteBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserInterfaceUserInterfaceLstModelElementsCompartmentItemSemanticEditPolicy() {
		super(ui_concrete.diagram.providers.Ui_concreteElementTypes.UserInterface_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.Group_3001 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.GroupCreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.Button_3010 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.Button2CreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.Label_3011 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.Label2CreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.CheckBox_3012 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.CheckBox2CreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.TextInput_3013 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.TextInput2CreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.Image_3014 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.Image2CreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.List_3015 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.List2CreateCommand(req));
		}
		if (ui_concrete.diagram.providers.Ui_concreteElementTypes.RadioButton_3016 == req.getElementType()) {
			return getGEFWrapper(new ui_concrete.diagram.edit.commands.RadioButton2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
