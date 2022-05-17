package ai.jobiak.services;

public class BankOfAndhra {

	public static void main(String[] args) {
		
		Account account = new Account("1011S","Ram",5000);
		Account account1 = new Account("1012S","syam",75000);
		Account account2 = new Account("1031S","mani",25000);
		
		AccountService service = account;
		double result = service.deposit(1000);
		System.out.println(result);
		
		service=account1;
		result = service.withdraw(25500);
		System.out.println(result);
		
		service = account2;
		boolean success = service.transfer(account1,25500);
		System.out.println(success);
		System.out.println(account1.getFullName()+"$"+account1.getBalance());
		System.out.println(account2.getFullName()+"$"+account2.getBalance());

	}

}
