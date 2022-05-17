package ai.jobiak.exception;
class UserException extends Exception {
	
	public UserException(String str) {
		super(str);
	}

	public static void main(String[] args) throws UserException {
		
		System.out.println("print your age");
		try {
			java.util.Scanner sc = new java.util.Scanner(System.in);
		    int age= sc.nextInt();
			if(age < 18) {
				
				throw new UserException("you are not eligible to vote");
				
			}
			else {
				
				System.out.println("you are eligible to vote");	
			}
		}
			catch(UserException u) {
				u.printStackTrace();
			}
		}
		
		
		
		

	}

