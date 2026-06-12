package looping;
import java.util.Scanner;

public class whileloopexample {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int number=0;
	System.out.println("enter numbers(enter a negative number to stop)");
	while (number>=0) {
		number=scanner.nextInt();
		
		if(number>=0)
		{
			System.out.println("you have entered "+number);
			
		}
		else
		{
			System.out.println("negative number entered..loop ends..");
		}}
	scanner.close();
		}
}
	


