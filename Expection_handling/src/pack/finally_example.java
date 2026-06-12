package pack;

public class finally_example {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub

try {
			int a=10;
			int b=0;
			int result=a/b;
			System.out.println("result"+result);
	}
	
		catch(NullPointerException e) {
		System.out.println("cannot devide by zero");
	}
		finally{                                       //runs everytime 
				
		System.out.println("Execution completed successfully...");
	
	}
		System.out.println("after finally...Execution completed successfully...");
		
		
	}

}
