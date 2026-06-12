package pack_parameterisedconstructor;

public class Main_test_param {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_parameteriside s1=new Student_parameteriside("Hisana" ,22,"xxx");
		s1.display();
		
		//each object get its own value during creation
		//no any need of repetative assingments like
		//s1."Hisana" //s1.age=21 etc...
		
		Student_parameteriside s2=new Student_parameteriside("Kavya" ,25,"xxx");
		s2.display();
		

	}

}
