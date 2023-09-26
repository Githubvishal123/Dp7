package com.StaticandFinalpractice;

public class Car {

	
	String model="BMW";
	static int totalCarSold=45;
	
	public static void main(String[] args) {
		
		Car c=new Car();
		String model="car";
		int totalCarSold=50;
		System.out.println(model);
		System.out.println(c.model);
		System.out.println(totalCarSold);
		System.out.println(Car.totalCarSold);
	
		
		
	
	
		

	}

}
