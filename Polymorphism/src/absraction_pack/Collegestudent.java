package absraction_pack;

public class Collegestudent extends Student_Abstract {
	String course;
	
	Collegestudent(String name,int rollno,String course) {
		super(name,rollno);
		this.course=course;
		//TODO Auto-generated constructor stub
	}
	
	@Override
	void displayDetails() {
		//TODO Auto-generated method stub
		System.out.println("college student"+name+"roll no"+rollno+"course"+course);
	}

}
