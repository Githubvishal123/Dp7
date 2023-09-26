package com.Constructor;

class Vehicle {

	private int id;
	private String name;
	private float price;

	Vehicle(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	//	System.out.println(this);
		
	}

	void display() {
		
		this.show();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(price);

	}
	
	
	void show()
	{
		this.showDetails();
		System.out.println(" this is a  current class object");
		System.out.println("this is used to differiante between local and Instance Varaible");
		
		
	}
	
	void showDetails()
	{
		
		System.out.println("this is used to call one method from other method");
		
		
		
	}

}

public class Vehiclemain {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle(101, "Marauti_Suzuki", 75000f);
	
	//	System.out.println(v1);
	//	Vehicle v2 = new Vehicle(102, "Honda", 65000f);
	//	System.out.println(v2);
		v1.display();
	//	v2.display();
		
		
		

	}

}
