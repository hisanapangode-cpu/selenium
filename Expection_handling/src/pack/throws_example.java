package pack;

import java.io.IOException;

public class throws_example {
	

		void readData()throws IOException,ArithmeticException{
			throw new IOException("Data Not Found!!");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throws_example obj=new throws_example();
		try {
			obj.readData();
		}
		catch(IOException e){
			System.out.println("Exception handled");
			
		}
		System.out.println("After catch...message shown");

	}

}
