
/*
 * 
 */
package ui_concrete.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class Ui_concretePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(ui_concrete.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createButton1CreationTool());
		paletteContainer.add(createButtonAction2CreationTool());
		paletteContainer.add(createCheckBox3CreationTool());
		paletteContainer.add(createGroup4CreationTool());
		paletteContainer.add(createImage5CreationTool());
		paletteContainer.add(createLabel6CreationTool());
		paletteContainer.add(createList7CreationTool());
		paletteContainer.add(createRadioButton8CreationTool());
		paletteContainer.add(createTextInput9CreationTool());
		paletteContainer.add(createUserInterface10CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createButton1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.Button_3003);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.Button_3010);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concrete.diagram.part.Messages.Button1CreationTool_title,
				ui_concrete.diagram.part.Messages.Button1CreationTool_desc, types);
		entry.setId("createButton1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concrete.diagram.providers.Ui_concreteElementTypes
				.getImageDescriptor(ui_concrete.diagram.providers.Ui_concreteElementTypes.Button_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createButtonAction2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concrete.diagram.part.Messages.ButtonAction2CreationTool_title,
				ui_concrete.diagram.part.Messages.ButtonAction2CreationTool_desc,
				Collections.singletonList(ui_concrete.diagram.providers.Ui_concreteElementTypes.ButtonAction_2002));
		entry.setId("createButtonAction2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concrete.diagram.providers.Ui_concreteElementTypes
				.getImageDescriptor(ui_concrete.diagram.providers.Ui_concreteElementTypes.ButtonAction_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCheckBox3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.CheckBox_3005);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.CheckBox_3012);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concrete.diagram.part.Messages.CheckBox3CreationTool_title,
				ui_concrete.diagram.part.Messages.CheckBox3CreationTool_desc, types);
		entry.setId("createCheckBox3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concrete.diagram.providers.Ui_concreteElementTypes
				.getImageDescriptor(ui_concrete.diagram.providers.Ui_concreteElementTypes.CheckBox_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createGroup4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.Group_3001);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.Group_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concrete.diagram.part.Messages.Group4CreationTool_title,
				ui_concrete.diagram.part.Messages.Group4CreationTool_desc, types);
		entry.setId("createGroup4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concrete.diagram.providers.Ui_concreteElementTypes
				.getImageDescriptor(ui_concrete.diagram.providers.Ui_concreteElementTypes.Group_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImage5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.Image_3007);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.Image_3014);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concrete.diagram.part.Messages.Image5CreationTool_title,
				ui_concrete.diagram.part.Messages.Image5CreationTool_desc, types);
		entry.setId("createImage5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concrete.diagram.providers.Ui_concreteElementTypes
				.getImageDescriptor(ui_concrete.diagram.providers.Ui_concreteElementTypes.Image_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLabel6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.Label_3004);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.Label_3011);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concrete.diagram.part.Messages.Label6CreationTool_title,
				ui_concrete.diagram.part.Messages.Label6CreationTool_desc, types);
		entry.setId("createLabel6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concrete.diagram.providers.Ui_concreteElementTypes
				.getImageDescriptor(ui_concrete.diagram.providers.Ui_concreteElementTypes.Label_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createList7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.List_3008);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.List_3015);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(ui_concrete.diagram.part.Messages.List7CreationTool_title,
				ui_concrete.diagram.part.Messages.List7CreationTool_desc, types);
		entry.setId("createList7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concrete.diagram.providers.Ui_concreteElementTypes
				.getImageDescriptor(ui_concrete.diagram.providers.Ui_concreteElementTypes.List_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRadioButton8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.RadioButton_3009);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.RadioButton_3016);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concrete.diagram.part.Messages.RadioButton8CreationTool_title,
				ui_concrete.diagram.part.Messages.RadioButton8CreationTool_desc, types);
		entry.setId("createRadioButton8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concrete.diagram.providers.Ui_concreteElementTypes
				.getImageDescriptor(ui_concrete.diagram.providers.Ui_concreteElementTypes.RadioButton_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextInput9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.TextInput_3006);
		types.add(ui_concrete.diagram.providers.Ui_concreteElementTypes.TextInput_3013);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concrete.diagram.part.Messages.TextInput9CreationTool_title,
				ui_concrete.diagram.part.Messages.TextInput9CreationTool_desc, types);
		entry.setId("createTextInput9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concrete.diagram.providers.Ui_concreteElementTypes
				.getImageDescriptor(ui_concrete.diagram.providers.Ui_concreteElementTypes.TextInput_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUserInterface10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				ui_concrete.diagram.part.Messages.UserInterface10CreationTool_title,
				ui_concrete.diagram.part.Messages.UserInterface10CreationTool_desc,
				Collections.singletonList(ui_concrete.diagram.providers.Ui_concreteElementTypes.UserInterface_2001));
		entry.setId("createUserInterface10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ui_concrete.diagram.providers.Ui_concreteElementTypes
				.getImageDescriptor(ui_concrete.diagram.providers.Ui_concreteElementTypes.UserInterface_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
