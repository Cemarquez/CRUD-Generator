package generator.model;

import sql_abstracts.ModelFactory;
import ui_concrete.Column;
import ui_concrete.Ui_concreteFactory;

public class TransformationM2M_UI {
	
	private sql_abstracts.ModelFactory modelFactorySQL;
	private ui_concrete.ModelFactory modelFactoryUI;
	private String db;
	
	public TransformationM2M_UI(ModelFactory modelFactorySQL, ui_concrete.ModelFactory modelFactoryUI) {
		this.modelFactorySQL = modelFactorySQL;
		this.modelFactoryUI = modelFactoryUI;
		this.db = modelFactorySQL.getLstSchema().get(0).getName();
	}


	public void transformarM2MUI() {
		modelFactoryUI.getLstUI_Diagrams().get(0).getLstColumns().clear();
		for(sql_abstracts.Column c : modelFactorySQL.getLstSchema().get(0).getLstColumns() ) {
			Column cNew = Ui_concreteFactory.eINSTANCE.createColumn();
			cNew.setDb(db);
			cNew.setName(c.getName() + " - " + c.getTable());
			cNew.setColumnName(c.getName());
			cNew.setTable(c.getTable());
			modelFactoryUI.getLstUI_Diagrams().get(0).getLstColumns().add(cNew);
		}
		
		for(sql_abstracts.PrimaryKey c : modelFactorySQL.getLstSchema().get(0).getLstPrimaryKeys() ) {
			Column cNew = Ui_concreteFactory.eINSTANCE.createColumn();
			cNew.setDb(db);
			cNew.setName(c.getName() + " - " + c.getTable());
			cNew.setColumnName(c.getName());
			cNew.setTable(c.getTable());
			modelFactoryUI.getLstUI_Diagrams().get(0).getLstColumns().add(cNew);
		}
		
		for(sql_abstracts.ForeignKey c : modelFactorySQL.getLstSchema().get(0).getLstForeignKeys() ) {
			Column cNew = Ui_concreteFactory.eINSTANCE.createColumn();
			cNew.setDb(db);
			cNew.setName(c.getName() + " - " + c.getTable());
			cNew.setColumnName(c.getName());
			cNew.setTable(c.getTable());
			modelFactoryUI.getLstUI_Diagrams().get(0).getLstColumns().add(cNew);
		}
		
	}
	
}
