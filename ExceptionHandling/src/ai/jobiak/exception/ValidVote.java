package ai.jobiak.exception;

public class ValidVote {
	
	static void validate(int age) {

		if(age < 18) {
			 
			throw new ArithmeticException("you are not eligible to vote");
		}
		else {
			
			System.out.println("you are eligible to vote");
		}
	}
		
		public static void main(String[] args) {
			
			validate(16);
			
			System.out.println("program completed");
		}
	}
			 
		

	
