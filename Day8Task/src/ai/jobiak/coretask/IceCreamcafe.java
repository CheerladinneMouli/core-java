package ai.jobiak.coretask;
import java.util.Scanner;
public class IceCreamcafe {
	
	public static Scanner input = new Scanner(System.in);
	public static int quantity;
	public static double total,pay;
	public static String again;
	public static String choose;
	public static void menu() {
		System.out.println("*******************************************************************************************************************");
		System.out.println("\t\t\tWELCOME TO ICE CREAM DESERT      ");
		System.out.println("\n");
		System.out.println("\t\t 1.Choclatecustord         price : 60.00  ");
		System.out.println("\t\t 2. Honeydrew              price : 100.00  ");
		System.out.println("\t\t 3.lemonchiffon            price : 130.00");
		System.out.println("\t\t 4.Craramel pralinre       price : 250.50 ");
		System.out.println("\t\t 5.Choclatecustord         price : 99.00  ");
		System.out.println("\t\t 6.Butterland              price : 69.00 ");
		System.out.println("\t\t 7.Safron pistachio        price : 59.50  ");
		System.out.println("\t\t 8.Vannila                 price : 79.00 ");
		System.out.println("*******************************************************************************************************************");
	}
	
	public static String fullname;
	public static String contactdetsails;
	public static double price;
	public static double fullprice=0;
	
	//Specials
	/*public static double Choclatecustord = $5;
	public static double Honeydrew= $6;
	public static double lemonchiffon = $5;
	public static double Craramel pralinre= $5;
	public static double Choclatecustord = $5;
	public static double Choclatecustord = $5;
	*/
	
	
	
	
	
	public static void order() {
				System.out.println("press 1 to Choclate custord ,"
				+ "press 2 to Honeydrew ,"
				+ "press 3 to lemon chiffon ,"
				+ "press 4 to Craramel pralinre,"
				+ "press 5 to Choclate custord,"
				+ "press 6 to Butterland,"
				+ "press 7 to Safron pistachio, "
				+ "press 8 to Vannila");
		System.out.println("Press what you want to buy : ");
		choose = input.next();
		System.out.println("How many you want to buy : ");
		choose = input.next();
		
	if(choose=="a") {
		System.out.println("You choose Choclate custord ");
		quantity=input.nextInt();
		total = total+(quantity*60);
		System.out.println("your total payment is  " +total);
		
		System.out.println("Are you interest to buy again : ");
		System.out.println("choose yes for y and No for n : ");
		choose = input.next();
		if(choose.equals("y")) {
		order();
	}
	}
	else if(again.equalsIgnoreCase("n")) {
		System.out.println("Enter your payment : ");
		pay = input.nextDouble();
		if(pay<=total)
		{
			System.out.println("Not enough money train again................");
		
		}
		else {
			System.out.println("your total payment is : "+total);
			total=total-pay;
			System.out.println("your change  is : "+total);
			System.out.println("HAVE A NICE DAY (: ");
		}
	}
		if(choose=="b") {
			System.out.println("You choose Choclate Honeydrew ");
			quantity=input.nextInt();
			total = total+(quantity*100);
			
			System.out.println("Are you interest to buy again : ");
			System.out.println("choose yes for y and No for n : ");
			if(choose.equals("y")) {
			order();
		}
		}
		else if(choose.equals("n")){
			System.out.println("Enter your payment : ");
			pay = input.nextDouble();
			if(pay<=total)
			{
				System.out.println("Not enough money train again................");
			
			}
			else {
				System.out.println("your total payment is  " +total);
				total=total-pay;
				System.out.println("your change is  " +total);
				System.out.println("HAVE A NICE DAY (: ");
			}
		}
			if(choose=="c") {
				System.out.println("You choose Choclate lemonchiffon ");
				quantity=input.nextInt();
				total = total+(quantity*130);
				
				System.out.println("Are you interest to buy again : ");
				System.out.println("choose yes for Y and No for N : ");
				if(again.equalsIgnoreCase("y")) {
				order();
			}
			else {
				System.out.println("Enter your payment : ");
				pay = input.nextDouble();
				if(pay<=total)
				{
					System.out.println("Not enough money train again................");
				
				}
				else {
					System.out.println("your total payment is  " +total);
					total=total-pay;
					System.out.println("your change is  " +total);
					System.out.println("HAVE A NICE DAY (: ");
				}
			}
				
				if(choose=="d") {
					System.out.println("You choose Choclate Craramel pralinre ");
					quantity=input.nextInt();
					total = total+(quantity*250.50);
					
					System.out.println("Are you interest to buy again : ");
					System.out.println("choose yes for Y and No for N : ");
					if(again.equalsIgnoreCase("y")) {
					order();
				}
				else {
					System.out.println("Enter your payment : ");
					pay = input.nextDouble();
					if(pay<=total)
					{
						System.out.println("Not enough money train again................");
					
					}
					else {
						System.out.println("your total payment is  " +total);
						total=total-pay;
						System.out.println("your change is  " +total);
						System.out.println("HAVE A NICE DAY (: ");
					}
				}
					
					if(choose=="e") {
						System.out.println("You choose Choclate Choclatecustord ");
						quantity=input.nextInt();
						total = total+(quantity*99);
						
						System.out.println("Are you interest to buy again : ");
						System.out.println("choose yes for Y and No for N : ");
						if(again.equalsIgnoreCase("y")) {
						order();
					}
					}
					else {
						System.out.println("Enter your payment : ");
						pay = input.nextDouble();
						if(pay<=total)
						{
							System.out.println("Not enough money train again................");
						
						}
						else {
							System.out.println("your total payment is  " +total);
							total=total-pay;
							System.out.println("your change is  " +total);
							System.out.println("HAVE A NICE DAY (: ");
						}
					}
					}
				}
			}
					
					
			
	
	public static void main(String[] args) {
		menu();
		order(); 
	}
	
}
			



