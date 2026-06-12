package java;

public class java_final_variable {
		final int speedlimit=90;//final variable
		void run() {
			speedlimit=400;
		}
		public static void main(String args[]) {
			java_final_variable obj=new java_final_variable();
			obj.run();
		}
	}



