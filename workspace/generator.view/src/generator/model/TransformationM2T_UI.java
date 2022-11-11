package generator.model;

import java.util.HashMap;
import java.util.HashSet;

import ui_concrete.Action;
import ui_concrete.ButtonAction;
import ui_concrete.GraphicalIndividual;
import ui_concrete.ModelFactory;
import ui_concrete.TextInput;

public class TransformationM2T_UI {

	private ModelFactory modelFactoryUI;
	private HashMap<String, String> entrys = new HashMap<>();
	public TransformationM2T_UI(ModelFactory modelFactoryUI) {
		this.modelFactoryUI = modelFactoryUI;
	}

	public void transformarM2T() {
		StringBuilder sb = new StringBuilder();
		
		for(ButtonAction bt : modelFactoryUI.getLstUI_Diagrams().get(0).getLtsButtonActions()) {
			obtenerEntrys(bt);
		}
		
		entrys.forEach((k,v) -> sb.append(v));
		for(ButtonAction bt : modelFactoryUI.getLstUI_Diagrams().get(0).getLtsButtonActions()) {
			sb.append(generarAction(bt));
		}
		
	
		System.out.println(sb.toString());
	}
	
	
	public String generarAction(ButtonAction bt) {
		String text="";
		
		text+= "button"+bt.getButtonAction().getName() +" = builder.get_object(\"" +"button"+ bt.getButtonAction().getName() + "\");\n" ; 
		text+= "button"+bt.getButtonAction().getName() + ".signal_connect(\"clicked\") do \n";
		text+="\t" + generarQueryAction(bt);
		text+="end";
		return text;
	}
	
	public String obtenerEntrys(ButtonAction bt) {
		String text="";
//		entrynombretext = builder.get_object("entrynombretext");
		for(int i=0;i<bt.getLtsGraphicalIndividual().size();i++) {
			GraphicalIndividual gi = bt.getLtsGraphicalIndividual().get(i); 
			TextInput t = (TextInput) gi;
			text+="entry" + t.getName() + " = " + "builder.get_object(\"entry" + t.getName() + "\");\n";
			if(!entrys.containsKey(t.getName()))
				entrys.put(t.getName(), text);
			
			text="";
		}
		return text;
	}
	public String generarQueryAction(ButtonAction bt) {
		String text="client.query(\"";
		if(bt.getAction() == Action.CREATE) {
			text+= "INSERT INTO " + ((TextInput) bt.getLtsGraphicalIndividual().get(0)).getColumnSQL().getTable() +"(";
		}
		
		for(int i=0;i<bt.getLtsGraphicalIndividual().size();i++) {
			GraphicalIndividual gi = bt.getLtsGraphicalIndividual().get(i); 
			TextInput t = (TextInput) gi;
			if(i==bt.getLtsGraphicalIndividual().size()-1)
				text += t.getColumnSQL().getColumnName() +") VALUES(";
			else
				text += t.getColumnSQL().getColumnName() +", ";
				
		}
		
		for(int i=0;i<bt.getLtsGraphicalIndividual().size();i++) {
			GraphicalIndividual gi = bt.getLtsGraphicalIndividual().get(i); 
			TextInput t = (TextInput) gi;
			if(i==bt.getLtsGraphicalIndividual().size()-1)
				text += "'\"+" +"entry"+ t.getName()+".text"+ "+\"'"+");";
			else
				text += "'\"+" +"entry"+ t.getName()+".text"+ "+\"'"+", ";
				
		}
		text+="\")\n";
		
		return text;
	}
	
	
}
