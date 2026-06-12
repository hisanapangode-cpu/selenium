package static_method;

public class staticvar_change {

static String college="ABC College";    //static variable
	
	String name;
	
	
	staticvar_change(String n){
		name=n;
		
	}
	void display() {

			System.out.println("name "+name+" college "+college);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticvar_change s1=new staticvar_change("Arun");
	staticvar_change s2=new staticvar_change("Anu");
s1.display();
s2.display();

staticvar_change.college="XYZ";

System.out.println("After changing college-static variable");
s1.display();
s2.display();

}
}
