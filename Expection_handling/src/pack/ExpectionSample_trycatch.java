package pack;

public class ExpectionSample_trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=10;
			int b=0;
			int result=a/b;
			System.out.println("result" +result);
		}
		catch(ArithmeticException e) {
			System.out.println("cannot divide by zero");
			
		
		}
		System.out.println("Execution completed successfully...");

	}

}
