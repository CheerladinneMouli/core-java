package ai.jobiak.Strings;
import java.util.Scanner;

public class Loginpage {

	public static void main(String[] args) {

		int option=0;
		
		
		Scanner scanner = new Scanner(System.in);		
		String email = new String("cheerladinnemouli123@gmail.com");
		String phone = new String("6309136705");
		String password1 = new String("mouli@1234");
		
		while(item) {
		      System.out.println("Enter a choice ");
             Scanner scanner1 = new Scanner(System.in);
             int option = scanner.nextInt();
		}
        switch(option) {
             
		case 1: {
		System.out.println("Login");	
		System.out.println("Enter emial or phone :  ");
		String username = scanner.nextLine();
		System.out.println("Enter your password :  ");
		String password = scanner.nextLine();
		
		
		if((email.equals(username)) && (password1.equals(password)) && (phone.equals(phone)) ) {
			System.out.println("login successfully");
		}
		else {
			
			System.out.println("invalid user name or password");
		}
		break;
		}
		
		case 2: {
			System.out.println("Don't you have an account yet?");
			Scanner scanner0 = new Scanner(System.in);
			    System.out.println("Create account");
			    System.out.println("Email Address");
				String username1 = scanner.nextLine();
				System.out.println("Enter your password :  ");
				String password = scanner.nextLine();
				System.out.println("must contain at least one special character ");
				
				
				String pass = scanner.nextLine();
				System.out.println("Re-enter your password :  ");
				String password2 = scanner.nextLine();
				break;
		}
		  case 3: {
			  System.out.println("forgot email id or password?");
		  }
			  
			  break;
		  case 4: {
			  System.out.println("i dont know my password");
			  System.out.println("Enter email asscoiated with your account");
			  String username2 = scanner.nextLine();
			  System.out.println("Send passcode to my mail : ********************@gmail.com");
			  break;
		  }
		 default: System.out.println("out of selection");
		 break;
             }
		}
}


			  
			 
			  
			  
				
				
			
		
		
	
