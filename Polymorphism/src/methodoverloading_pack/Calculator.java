package methodoverloading_pack;

public class Calculator {
	//compile time polymorphism(static polymorphism)
	//2 parameters
	
	//method name same,different in parameters
	//depends on parameters
	int add(int a,int b)
	{
		return a+b;
	}
	//3 parameters
	int add(int a,int b,int c)
	{
		return a+b+c;
	}

}
