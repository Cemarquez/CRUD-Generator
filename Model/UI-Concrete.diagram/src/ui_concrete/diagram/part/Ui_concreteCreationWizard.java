/*
 * 
 */
package ui_concrete.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class Ui_concreteCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected ui_concrete.diagram.part.Ui_concreteCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected ui_concrete.diagram.part.Ui_concreteCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ui_concrete.diagram.part.Messages.Ui_concreteCreationWizardTitle);
		setDefaultPageImageDescriptor(ui_concrete.diagram.part.Ui_concreteDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewUi_concreteWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new ui_concrete.diagram.part.Ui_concreteCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "ui_concrete_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(ui_concrete.diagram.part.Messages.Ui_concreteCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				ui_concrete.diagram.part.Messages.Ui_concreteCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new ui_concrete.diagram.part.Ui_concreteCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "ui_concrete") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".ui_concrete_diagram".length()); //$NON-NLS-1$
					setFileName(ui_concrete.diagram.part.Ui_concreteDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "ui_concrete")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(ui_concrete.diagram.part.Messages.Ui_concreteCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				ui_concrete.diagram.part.Messages.Ui_concreteCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = ui_concrete.diagram.part.Ui_concreteDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						ui_concrete.diagram.part.Ui_concreteDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								ui_concrete.diagram.part.Messages.Ui_concreteCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						ui_concrete.diagram.part.Messages.Ui_concreteCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				ui_concrete.diagram.part.Ui_concreteDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
