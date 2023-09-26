package com.containment;

public class Laptop {

	 String Config;
	String lpname;
	 int price;
	 Printer p;
	
	
	Laptop()
	{
		
	}
	
	Laptop(String Config,String lpname,int price,Printer p)
	{
		this.Config=Config;
		this.lpname=lpname;
		this.price=price;
		this.p=p;
	}
	
	
	
	public String getConfig() {
		return Config;
	}
	public void setConfig(String config) {
		Config = config;
	}
	public String getLpname() {
		return lpname;
	}
	public void setLpname(String lpname) {
		this.lpname = lpname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Printer getP() {
		return p;
	}
	public void setP(Printer p) {
		this.p = p;
	}
	
	public String toString()
	{
		
		return Config+" "+lpname+" "+price+" "+p;
		
	}
	
	
	
	

}
