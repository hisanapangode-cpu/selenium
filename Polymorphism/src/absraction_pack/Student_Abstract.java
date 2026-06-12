package absraction_pack;

abstract class Student_Abstract {
	
	String name;
	int rollno;
	
	//constructor
	Student_Abstract (String name,int rollno){
		//this pointer is used to point the object of the current class
		this.name=name;
		this.rollno=rollno;
	}
	//abstract method
	abstract void displayDetails();
	//subclasses to implement it in their own way
	
	//normal method
	void showWelcome()
	{
		System.out.println("hello..Welcome student");
		
	}

}
