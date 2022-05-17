package ai.jobiak.Strings;

import java.util.Scanner;

public class Gmailpage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String email = new String("cheerladinnemouli123@gmail.com");
		String phone = new String("6309136705");
		String password1 = new String("mouli@1234");
			
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
	}

}
