import java.util.Scanner;
public class ReverseString {
	
	public static void revStr(char ch[]) {
		
		if(ch.length > 0) 
		{
			
			System.out.println(ch.length[ch.length-1]);
			ch.length--;
			revStr(ch);
		}
		
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		//int length = ch.length;
		revStr(ch);
		 
		
	}

}
