package generator.model;

public class Const {

	public static String path;
	public static Const instance;
	
	public static Const getInstance() {
		if(instance==null)
			instance = new Const();
			
		return instance;
	}
}
