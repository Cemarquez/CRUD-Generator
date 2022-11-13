package generator.model;

import java.io.File;
import java.io.FileWriter;
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
	private String dbName;
	private File path;
	public TransformationM2T_UI(ModelFactory modelFactoryUI, File path) {
		this.path = path;
		this.modelFactoryUI = modelFactoryUI;
	}

	public void transformarM2T(  ) {
		
		StringBuilder sb = new StringBuilder();
	
		
		for(ButtonAction bt : modelFactoryUI.getLstUI_Diagrams().get(0).getLtsButtonActions()) {
			obtenerEntrys(bt);
		}
		sb.append(generarConexion());
		
		entrys.forEach((k,v) -> sb.append(v));
		sb.append("\n");
		for(ButtonAction bt : modelFactoryUI.getLstUI_Diagrams().get(0).getLtsButtonActions()) {
			sb.append(generarAction(bt));
		}
		sb.append("\n");
		sb.append("window.show_all\n"
				+ "Gtk.main\n");
	
		guardarArchivo(sb.toString(), path.getPath(), dbName+"Implementation");
	}
	
	public String generarConexion() {
		String text="";
		text+="require 'mysql2'\n";
		text+="host = String('localhost')\n" +
			  "database = String('" + dbName +"')\n" + 
			  "username = String('root')\n" + 
			  "password = String('root')\n" + 
			  "client = Mysql2::Client.new(:host => host, :username => username, :database => database, :password => password)\n" + 
			  "puts 'Successfully created connection to database.'" + "\n\n";
		
	
		return text;
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
			dbName = t.getColumnSQL().getDb();
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
		
		text+= "\tmd = Gtk::MessageDialog.new(window)\n" + "\tmd.text = \"Se ha guardado un nuevo profesor.\"\n" +
				"\tmd.run\n" + 
				"\tmd.destroy\n";
		
		
		
		return text;
	}
	
	
	private void guardarArchivo(String cadena, String ruta , String nombre) {
		try{
			File archivo=new File(ruta);
			FileWriter escribir=new FileWriter(archivo+"/"+nombre+".rb",true);
			escribir.write(cadena);
			escribir.close();
		}catch(Exception e){
			System.out.println("Error al Guardar");
		}

	}
	
	
}
