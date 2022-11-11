/*
 * 
 */
package ui_concrete.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Ui_concreteParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser buttonActionName_5015Parser;

	/**
	* @generated
	*/
	private IParser getButtonActionName_5015Parser() {
		if (buttonActionName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getButtonAction_Name() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			buttonActionName_5015Parser = parser;
		}
		return buttonActionName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser groupTitle_5008Parser;

	/**
	* @generated
	*/
	private IParser getGroupTitle_5008Parser() {
		if (groupTitle_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getGroup_Title() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			groupTitle_5008Parser = parser;
		}
		return groupTitle_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser groupTitle_5007Parser;

	/**
	* @generated
	*/
	private IParser getGroupTitle_5007Parser() {
		if (groupTitle_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getGroup_Title() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			groupTitle_5007Parser = parser;
		}
		return groupTitle_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonText_5001Parser;

	/**
	* @generated
	*/
	private IParser getButtonText_5001Parser() {
		if (buttonText_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getButton_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			buttonText_5001Parser = parser;
		}
		return buttonText_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser labelText_5002Parser;

	/**
	* @generated
	*/
	private IParser getLabelText_5002Parser() {
		if (labelText_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getLabel_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			labelText_5002Parser = parser;
		}
		return labelText_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxText_5003Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxText_5003Parser() {
		if (checkBoxText_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getCheckBox_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			checkBoxText_5003Parser = parser;
		}
		return checkBoxText_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputPlaceHolder_5004Parser;

	/**
	* @generated
	*/
	private IParser getTextInputPlaceHolder_5004Parser() {
		if (textInputPlaceHolder_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getTextInput_PlaceHolder() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			textInputPlaceHolder_5004Parser = parser;
		}
		return textInputPlaceHolder_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser listName_5005Parser;

	/**
	* @generated
	*/
	private IParser getListName_5005Parser() {
		if (listName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getModelElement_Name() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			listName_5005Parser = parser;
		}
		return listName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonText_5006Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonText_5006Parser() {
		if (radioButtonText_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getRadioButton_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			radioButtonText_5006Parser = parser;
		}
		return radioButtonText_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser buttonText_5009Parser;

	/**
	* @generated
	*/
	private IParser getButtonText_5009Parser() {
		if (buttonText_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getButton_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			buttonText_5009Parser = parser;
		}
		return buttonText_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser labelText_5010Parser;

	/**
	* @generated
	*/
	private IParser getLabelText_5010Parser() {
		if (labelText_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getLabel_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			labelText_5010Parser = parser;
		}
		return labelText_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser checkBoxText_5011Parser;

	/**
	* @generated
	*/
	private IParser getCheckBoxText_5011Parser() {
		if (checkBoxText_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getCheckBox_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			checkBoxText_5011Parser = parser;
		}
		return checkBoxText_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser textInputPlaceHolder_5012Parser;

	/**
	* @generated
	*/
	private IParser getTextInputPlaceHolder_5012Parser() {
		if (textInputPlaceHolder_5012Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getTextInput_PlaceHolder() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			textInputPlaceHolder_5012Parser = parser;
		}
		return textInputPlaceHolder_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser listName_5013Parser;

	/**
	* @generated
	*/
	private IParser getListName_5013Parser() {
		if (listName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ui_concrete.Ui_concretePackage.eINSTANCE.getModelElement_Name() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			listName_5013Parser = parser;
		}
		return listName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser radioButtonText_5014Parser;

	/**
	* @generated
	*/
	private IParser getRadioButtonText_5014Parser() {
		if (radioButtonText_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ui_concrete.Ui_concretePackage.eINSTANCE.getRadioButton_Text() };
			ui_concrete.diagram.parsers.MessageFormatParser parser = new ui_concrete.diagram.parsers.MessageFormatParser(
					features);
			radioButtonText_5014Parser = parser;
		}
		return radioButtonText_5014Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case ui_concrete.diagram.edit.parts.ButtonActionNameEditPart.VISUAL_ID:
			return getButtonActionName_5015Parser();
		case ui_concrete.diagram.edit.parts.GroupTitleEditPart.VISUAL_ID:
			return getGroupTitle_5008Parser();
		case ui_concrete.diagram.edit.parts.GroupTitle2EditPart.VISUAL_ID:
			return getGroupTitle_5007Parser();
		case ui_concrete.diagram.edit.parts.ButtonTextEditPart.VISUAL_ID:
			return getButtonText_5001Parser();
		case ui_concrete.diagram.edit.parts.LabelTextEditPart.VISUAL_ID:
			return getLabelText_5002Parser();
		case ui_concrete.diagram.edit.parts.CheckBoxTextEditPart.VISUAL_ID:
			return getCheckBoxText_5003Parser();
		case ui_concrete.diagram.edit.parts.TextInputPlaceHolderEditPart.VISUAL_ID:
			return getTextInputPlaceHolder_5004Parser();
		case ui_concrete.diagram.edit.parts.ListNameEditPart.VISUAL_ID:
			return getListName_5005Parser();
		case ui_concrete.diagram.edit.parts.RadioButtonTextEditPart.VISUAL_ID:
			return getRadioButtonText_5006Parser();
		case ui_concrete.diagram.edit.parts.ButtonText2EditPart.VISUAL_ID:
			return getButtonText_5009Parser();
		case ui_concrete.diagram.edit.parts.LabelText2EditPart.VISUAL_ID:
			return getLabelText_5010Parser();
		case ui_concrete.diagram.edit.parts.CheckBoxText2EditPart.VISUAL_ID:
			return getCheckBoxText_5011Parser();
		case ui_concrete.diagram.edit.parts.TextInputPlaceHolder2EditPart.VISUAL_ID:
			return getTextInputPlaceHolder_5012Parser();
		case ui_concrete.diagram.edit.parts.ListName2EditPart.VISUAL_ID:
			return getListName_5013Parser();
		case ui_concrete.diagram.edit.parts.RadioButtonText2EditPart.VISUAL_ID:
			return getRadioButtonText_5014Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ui_concrete.diagram.providers.Ui_concreteElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
