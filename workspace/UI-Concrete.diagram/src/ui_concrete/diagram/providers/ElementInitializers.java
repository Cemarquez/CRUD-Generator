/*
 * 
 */
package ui_concrete.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ui_concrete.diagram.part.Ui_concreteDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ui_concrete.diagram.part.Ui_concreteDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
