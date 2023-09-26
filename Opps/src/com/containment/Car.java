package com.containment;

public class Car {
	
	
	private int modelno;
	private String carName;
	private Machine m;
	
	
	Car()
	{
		
		
		
	}
	
		
	Car(int modelno,String carName, Machine m)
	{
		this.modelno=modelno;
		this.carName=carName;
		this.m=m;
		
		
	}
	
	
	
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Machine getM() {
		return m;
	}
	public void setM(Machine m) {
		this.m = m;
	}
	
		
	public String toString()	
	{
		return modelno+" "+carName+" "+m;
		
		
	}
		
		
		
		
		
		
	}


