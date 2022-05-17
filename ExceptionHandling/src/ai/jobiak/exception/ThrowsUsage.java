package ai.jobiak.exception;

public class ThrowsUsage {
	
	static void display() throws ArithmeticException {
		
		int arr[]= {2,5};
		
		arr[3]=5/0;
		
	}

	public static void main(String[] args) {
		try {
		display();	
		}
		catch(ArithmeticException ae) {
			
			ae.printStackTrace();
			
		}
		
		System.out.println("program completed");
		

	}

}
