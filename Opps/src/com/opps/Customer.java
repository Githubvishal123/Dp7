package com.opps;

public class Customer {

	private int c_id;
	private String c_name;
	private  int acc_no;
	private int Balance;
	private  int Credited;
	private int Debited;
	public  void setC_id(int c_id)
	{
		this.c_id=c_id;
		
		
	}
	
	public int getC_id()
	
	{
		return c_id;
	}
	
	public void setC_name (String c_name)
	
	{
		this.c_name=c_name;
		
	}
	
	public String getC_name()
	{
		return c_name;
		
	}
	public void setAcc_no(int acc_no)
	{
		this.acc_no=acc_no;
		
	}
	public int getAcc_no()
	{
		return acc_no;
		
		
	}
	public void setBalance(int Balance)
	
	{
		this.Balance=Balance;
		
	}
	public double getBalance()
	{
		return Balance;
		
	}
	
public void setCredited(int Credited)
	
	{
		this.Credited=Credited;
		
	}
	public double getCredited()
	{
		return Credited;
	}	
	

	public void setDebited(int Debited)
	
	{
		this.Debited=Debited;
		
	}
	public double getDebited()
	{
		return Debited;
		
	}
	


}
