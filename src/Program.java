
public class Program {

	private static String _name = ""; //private instance variable outside main method
	
	public static void main(String[] args) {
		System.out.println("Program Started...");
		_name = "Tom"; //can't instantiate object in static main method - must initialize private static variable
		System.out.println(_name);
	}

}
