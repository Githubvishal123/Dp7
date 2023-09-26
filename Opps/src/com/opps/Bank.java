package com.opps;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Customer ID");
		int c_id=sc.nextInt();
		
		System.out.println("Enter Customer name");
		String c_name=sc.next();
		System.out.println("Enter Customer Account Balance");
		int acc_no=sc.nextInt();
		
		Customer c=new Customer();
			c.setC_id(101);
			c.setC_name("Vishal");
			c.setAcc_no(12345);
			c.setBalance(10000);
			
		
		
		
		System.out.println("-----------------------------------");
		
		System.out.println("What Transcation Do u Want Credited Or Debited ");
		char ch=sc.next().charAt(0);
		if(ch=='C')
		{
			
			System.out.println("amount credited ");
			
			int Credited=sc.nextInt();
			int Balance=+Credited;
			
			
			System.out.println("The credited amount and total Balance is " +Balance);
			
		}
		else
			
			{
			
			System.out.println("amount Debited ");
			int Debited=sc.nextInt();
			int Balance=+Debited;

	System.out.println("The debited amount and total Balance is "+Balance );
				
				
			}
		
		
	}

	
}
