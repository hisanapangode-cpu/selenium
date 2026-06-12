package methodoverriding_pack;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student();  //DEPENDING ON THE OBJECTS
		s1.study();
		Student s2=new GraduateStudent();
		s2.study();

	}

}
