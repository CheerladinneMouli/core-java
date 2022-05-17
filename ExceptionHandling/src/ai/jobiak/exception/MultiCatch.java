package ai.jobiak.exception;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
		
			int arr[]= {2,5};
			arr[2]= 5;
			arr[3]=5/0;	
		}
		catch(ArithmeticException mm) {
			
			mm.printStackTrace();
			
		}
		
		catch(ArrayIndexOutOfBoundsException ae) {
			
			ae.printStackTrace();
		}
		
		System.out.println("my name mouli");
			
		}
	}

