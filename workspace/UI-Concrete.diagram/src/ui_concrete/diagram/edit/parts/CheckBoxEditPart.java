/*
 * 
 */
package ui_concrete.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.swt.graphics.Color;

import ui_concrete.Button;
import ui_concrete.CheckBox;

/**
 * @generated
 */
public class CheckBoxEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3005;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public CheckBoxEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ui_concrete.diagram.edit.policies.CheckBoxItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new CheckBoxFigure();
	}

	/**
	* @generated
	*/
	public CheckBoxFigure getPrimaryShape() {
		return (CheckBoxFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ui_concrete.diagram.edit.parts.CheckBoxTextEditPart) {
			((ui_concrete.diagram.edit.parts.CheckBoxTextEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureCheckBoxLabelFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ui_concrete.diagram.edit.parts.CheckBoxTextEditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ui_concrete.diagram.part.Ui_concreteVisualIDRegistry
				.getType(ui_concrete.diagram.edit.parts.CheckBoxTextEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class CheckBoxFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCheckBoxLabelFigure;

		/**
		 * @generated
		 */
		public CheckBoxFigure() {
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCheckBoxLabelFigure = new WrappingLabel();

			fFigureCheckBoxLabelFigure.setText("CheckBox");

			this.add(fFigureCheckBoxLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCheckBoxLabelFigure() {
			return fFigureCheckBoxLabelFigure;
		}

	}

	protected void handleNotificationEvent(Notification arg0) {

		if (arg0.getEventType() == Notification.SET) {
			// the notifier sends his new Bounds ...
			/**
			 	<property name="label" translatable="yes">Acepto los terminos y condiciones y autorizo el
				tratamiento de mis datos personales.</property>
			    <property name="width-request">300</property>
			    <property name="height-request">80</property>
			    <property name="visible">True</property>
			    <property name="can-focus">True</property>
			    <property name="receives-default">False</property>
			    <property name="draw-indicator">True</property>
			 **/
			if (arg0.getNotifier() instanceof BoundsImpl) {
				NodeImpl node = (NodeImpl) this.getModel();
				CheckBox model = (CheckBox) node.getElement();
				model.setSelected(true);
				BoundsImpl notifier = (BoundsImpl) arg0.getNotifier();

				// for my special coordinate mapping i also need the node,
				// so i save it in this variable ...

				if (arg0.getFeature() instanceof EAttributeImpl) {
					// Get the attribute that has changed
					EAttributeImpl attribute = (EAttributeImpl) arg0.getFeature();
					// set the values for x and y in the model
					if (notifier.getWidth() == -1) {
						model.setWidth(120);
					} else {
						model.setWidth(notifier.getWidth());
					}
					if (notifier.getHeight() == -1) {
						model.setHeight(20);
					} else {
						model.setHeight(notifier.getHeight());
					}

					model.setPositionX(notifier.getX());
					model.setPositionY(notifier.getY());

				}
			}

		}

		super.handleNotificationEvent(arg0);
	}

}
