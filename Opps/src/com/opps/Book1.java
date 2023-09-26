package com.opps;

public class Book1 {

	
	int b_id;
	String b_name;
	String a_name;
	String p_date;
	
	private float price;
	private char category;
	
	
	
	Book1(int b_id,String b_name,String a_name,String p_date,float price,char category )
	{
		this.b_id=b_id;
		this.b_name=b_name;
		this.a_name=a_name;
		this.p_date=p_date;
		this.price=price;
		this.category=category;
		
	}
	
	public int getB_id()
	{
		
		return b_id;
		
		
	}
	
	
	public  void setB_id(int b_id)
	{
		this.b_id=b_id;
		
	
	}
	
	

	public String getB_name()
	{
		
		return b_name;
		
		
	}
	
	
	public  void setB_name(String b_name)
	{
		this.b_name=b_name;
		
	
	}
	

	public String getA_name()
	{
		
		return a_name;
		
		
	}
	
	public  void setA_name(String a_name)
	{
		this.a_name=a_name;
		
	
	}
	
	public String getP_date()
	{
		
		return p_date;
		
		
	}
	
	public  void setP_date(String p_date)
	{
		this.p_date=p_date;
		
	
	}
	
	public float getPrice()
	{
		
		return price;
		
		
	}
	
	public  void setPrice(float price)
	{
		this.price=price;
		
	
	}
	
	
	
	public char getCategory()
	{
		return category;
		
	}
	
	
	
	public void setCategory(char category)
	{
		this.category=category;
		
		
	}
	
	
	
	
	public String toString()
	{
		return b_id+" "+ b_name+" "+a_name+" "+p_date+" "+ price +" "+category;
		
		
		
	}
	
	
	
	
	
}
