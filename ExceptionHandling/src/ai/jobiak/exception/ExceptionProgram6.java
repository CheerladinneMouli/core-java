package ai.jobiak.exception;

public class ExceptionProgram6 {
	
	public static void main(String args[]) {
		
	System.out.println("welcome to programming");
	 try {
		 int a=10;
		  int b=0;
	      int c=a/b;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
	 
       catch(ArithmeticException ae) {
		 
		 ae.printStackTrace();
       }
	 
	 finally {
		 
		 System.out.println("jobiak is my company");
		 
		 
	 }
	 
	
	System.out.println("my name mouli");

	}
}
