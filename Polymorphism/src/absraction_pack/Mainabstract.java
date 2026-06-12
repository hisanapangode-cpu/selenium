package absraction_pack;

public class Mainabstract {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Student_Abstract s1=new Schoolstudent("Anu",101,"12th grade");
		Student_Abstract s2=new Collegestudent("Anjali",102,"computer science");
		s1.showWelcome();
		s1.displayDetails();
		
		
		s2.showWelcome();
		s2.displayDetails();
	}

}
