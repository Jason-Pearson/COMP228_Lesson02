
public class Program {

	public static Person person; // reference (person) to the Person class
	
	public static void main(String[] args) {
		System.out.println("Program Started...");
		
		person = new Person(19); //instantiate person object - get age's int value via constructor
		person.set_name("Jason");
		System.out.println(person.get_name()); //get name in println?
		person.runs();//run the "runs" Method from Person class via the person object - this instantiated reference (person)
		
		/* person.gender = "Male"; /inherits from the Object Superclass when you type person.(insert here)
		   person.name = "Jason"; */
		
	}

}
