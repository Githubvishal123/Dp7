package com.opps;

public class Car {
	//INSTANCE VARIABLE
	int carId;
	String brand;
	float price;
	String carName;
	
	//INSTANCE METHOD
	void displayCarDetails()
	{
		System.out.println(carId+" "+carName);
		System.out.println("Brand"+brand);
		System.out.println("Price"+price);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.carId=101;
		c1.carName="Ferrari Roma";
		c1.brand="ferrari";
		c1.price=890000.0f;
		
		c1.displayCarDetails();
		
		Car c2=new Car();
		c2.carId=102;
		c2.carName="Fortuner";
		c2.brand="Toyota";
		c2.price=75000.0f;
		
		c2.displayCarDetails();
		
		
		
	}

}
