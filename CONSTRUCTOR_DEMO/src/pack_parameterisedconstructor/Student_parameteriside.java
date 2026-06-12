package pack_parameterisedconstructor;

public class Student_parameteriside {
	String name;
	int age;
	String email;
	
	Student_parameteriside(String n,int a,String e){
		name=n;
		age=a;
		email=e;
		//assigning values...
		
	}
	void display() {
		System.out.println("name is "+name+" age is "+age);
	}

}
