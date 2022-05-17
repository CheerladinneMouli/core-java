package ai.jobiak.exception;

public class ExceptionProgram3 {
	
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
		 
		 //ae.printStackTrace();//exception name,reason,line number,method,class,program
		// System.out.println(ae.toString());//exception name,reason
		 System.out.println(ae.getMessage());//it shows only reason
		 
		 
	 }
	 
	
	System.out.println("my name mouli");

	}
}
