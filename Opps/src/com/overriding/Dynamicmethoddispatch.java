package com.overriding;

class Vehicle {

	void display() {
		System.out.println("Vehicle of  four wheeler or two wheeler");

	}

}

class Twowheeler extends Vehicle {
	public void display() {	// we can make public protected and default but we cannot make private we cannot reduce the visibilty of our code
		super.display();
		System.out.println("Vehicle of Two wheeler");

	}

}

class Fourwheeler extends Vehicle {
	protected void display() {

		System.out.println("Vehicle of four wheeler");

	}

	void show()
	{
		System.out.println("four wheeler");
		
	}
	
	
	
}

public class Dynamicmethoddispatch {

	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.display();
		
		v=new Twowheeler();
		v.display();
		
		v=new Fourwheeler();
		v.display();
	//	v.show();this is not a overriden method so we cannot access this method

	}

}
