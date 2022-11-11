/*
 * 
 */
package ui_concrete.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		ui_concrete.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		ui_concrete.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		ui_concrete.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		ui_concrete.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		ui_concrete.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return ui_concrete.diagram.part.Ui_concreteDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
