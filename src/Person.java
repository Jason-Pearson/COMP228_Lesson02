public class Person {
	//Private Properties - Instance Variables
	private String _gender;
	private String _name;
	private int age;

	//Getter/Setter Method for _gender - make them via clicking/right click on variable - Source - gen. Getter/Setter
	public String getGender() {
		return this._gender;
	}
	public void setGender(String gender) {
		this._gender = gender;
	}
	//Getter/Setter Method for _name
	public String get_name() {
		return this._name;
	}
	public void set_name(String name) {
		this._name = name;
	}
	//Constructor~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public Person(int age) //local variable/argument for constructor method
	{
		this.age = age; //set private age variable in constructor - get age input from constructor in Program class
	}
	//Public Methods~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void runs(){
		System.out.println(this._name + " Runs Like The Wind!"); // or printf("%s Runs", this._name) - for better formatting
	}
	
}
