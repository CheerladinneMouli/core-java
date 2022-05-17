package ai.jobiak.exception;

public class ExceptionProgram5 {
	
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
		 
		 System.out.println("you can not divide a number with zero");	 
		 
	 }
	 
	
	System.out.println("my name mouli");

	}
}
