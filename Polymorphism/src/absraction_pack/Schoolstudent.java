package absraction_pack;

public class Schoolstudent extends Student_Abstract {
	String Standard;
	
	Schoolstudent(String name,int rollno,String standard){
		super(name,rollno);
		this.Standard=standard;
	}
	@Override
	void displayDetails() {
		//TODO Auto-generated method stub
		System.out.println("School student"+name+"roll no"+rollno+"standard"+Standard);
		
	}

}
