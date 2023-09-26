package com.overriding;

class Account {
	private int accno;
	private String accname;
	protected float balance;
	protected float rateofinterest;

	Account() {

	}

	Account(int accno, String accname, float balance) {
		this.accno = accno;
		this.accname = accname;
		this.balance = balance;

	}

	public int getAccno() {

		return accno;

	}

	public void setAccno(int accno) {
		this.accno = accno;

	}

	public String getAccname() {

		return accname;

	}

	public void setAccname(String accname) {

		this.accname = accname;

	}

	public float getBalance() {

		return balance;
	}

	public float getRateofinterest() {
		rateofinterest = 5f;
		return rateofinterest;

	}

	void deposit(float amount) {
		balance += amount;

	}

	void withdraw(float amount) {
		if ((balance - amount) > 0) {
			balance -= amount;
		} else {
			System.out.println("insufficient balnce");

		}

	}

}

class SavingsAccount extends Account {
	private String pannumber;

	public SavingsAccount() {
		super();

	}

	SavingsAccount(int accno, String name, float balance) {

	}

	SavingsAccount(int accno, String accname, float balance, float rateofinterest, String pannumber) {
		super(accno, accname, balance);

		this.pannumber = pannumber;

	}

	public String getPannumber() {
		return pannumber;

	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;

	}

	void deposit(float amount) {
		float b = balance + amount;
		if (b > 50000) {
			if (pannumber != null) {
				balance = b;

			} else {
				System.out.println("ur balance is getting above 50000 please enter ur pan number");
			}

		}

	}

	void withdraw(float amount) {
		if ((balance - amount) > 1000) {
			balance -= amount;

		}

		else {
			System.out.println("insufficent Balance" + balance);

		}

	}
	
	public float getRateofinterest()
	{
		rateofinterest=8.5f;
		return rateofinterest;
	}
	
	
	
	
	
	
	

}

public class Bank {

	public static void main(String[] args) {

		Account a1 = new Account(101, "vishal", 40000);
		System.out.println("Account Details " + a1.getAccno() + " Balance " + a1.getBalance());

		System.out.println("Rate" + a1.getRateofinterest());

		a1.withdraw(900);
		System.out.println("balance" + a1.getBalance());

		a1.deposit(67700);
		System.out.println("balance" + a1.getBalance());

		System.out.println("----------------------------------------");

		SavingsAccount s1 = new SavingsAccount(1022,"akshay",34000);
		System.out.println("account details "+s1.getAccno()+" Balance "+s1.getBalance());
		
		System.out.println(" Rate "+s1.getRateofinterest());
		
		s1.withdraw(19500);
		System.out.println("balance"+s1.getBalance());
		
		s1.setPannumber("ACG789H");
		
		s1.deposit(76000);
		System.out.println("Balance "+s1.getBalance());
		
		
	}

}
