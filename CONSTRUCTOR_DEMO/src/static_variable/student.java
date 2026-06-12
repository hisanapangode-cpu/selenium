package static_variable;

public class student {
	String name;
	static String college="ABC"; //COMMON FOR ALL OBJECT
	
	//PARAMETERIZED CONSTRUCTOR
	student(String n) {
		name=n;
	}
	
	void display() {
		System.out.println("name"+name+ "college" +college);
	}

}
