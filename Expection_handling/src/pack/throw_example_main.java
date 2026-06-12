package pack;

public class throw_example_main {
	
	public void display() {
		 throw new NullPointerException("not valid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=10/0;
		throw_example_main obj=new throw_example_main();
		obj.display();
		System.out.println("hello");

	}

}
