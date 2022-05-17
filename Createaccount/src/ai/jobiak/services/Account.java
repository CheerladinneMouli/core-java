package ai.jobiak.services;

public class Account implements AccountService {
	
	
	private String acctName;
	private String fullName;
	private double balance;
	
	public Account() {
		
	}

	public Account(String acctName, String fullName, double balance) {
		super();
		this.acctName = acctName;
		this.fullName = fullName;
		this.balance = balance;
	}
	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public double withdraw(double amount) {
		
		this.balance=balance-amount;
				return this.balance;
	}

	@Override
	public double deposit(double amount) {
		this.balance=balance+amount;
		return 0;
	}

	@Override
	public boolean transfer(Account account, double amount) {
		this.balance = balance-amount;
		account.setBalance(account.getBalance()+amount);
		
		return true;
	}

	@Override
	public double getBalance(String acctNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
