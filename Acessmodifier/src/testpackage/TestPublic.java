package testpackage;
import mypackage.Student;        //importing from another package

public class TestPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(); //Acessing public class
		s.name="STC";            //Acessing public variable
		s.display();             //Acessing public method

	}

}
