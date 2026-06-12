package pack;

public class Demo_method_try {
	
	int z;
	
	public void display() {
		System.out.println("login successfull");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo_method_try obj=new Demo_method_try();
		
		obj.z=35;
		System.out.println(obj.z);
		
		//to call a method
		obj.display();

	}

}
