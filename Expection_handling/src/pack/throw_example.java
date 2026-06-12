package pack;

public class throw_example {
	//throw example
	
	static void validate(int age) {
		if(age<18)
			throw new ArithmeticException("age is less than 18");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(13);
		System.out.println("rest of the code...");

	}

}
