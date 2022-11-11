/*
* 
*/
package ui_concrete.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class Ui_concreteNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7005;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7004;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof ui_concrete.diagram.navigator.Ui_concreteNavigatorItem) {
			ui_concrete.diagram.navigator.Ui_concreteNavigatorItem item = (ui_concrete.diagram.navigator.Ui_concreteNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ui_concrete.diagram.part.Ui_concreteVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
