package com.containment;

public class Engine {

	private String enginetype;
	private int price;
	
	
	
	Engine()
	{
		
		
		
	}
	
	
	
	
	Engine(String enginetype,int price)
	{
		this.enginetype=enginetype;
		this.price=price;
		
		
	}
	
	
	
	public String getEnginetype() {
		return enginetype;
	}
	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String toString()
	{
		
		return enginetype+" "+price;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
