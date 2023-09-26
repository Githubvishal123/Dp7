package com.containment;

public class Transport {

	public static void main(String[] args) {
		Engine e1=new Engine("diesel",450000);
		Engine e2=new Engine("petrol",500000);	
		
		Machine m1=new Machine("Automatic",e1);
		Machine m2=new Machine("Manual",e2);
		
		
		Car c1=new Car(1999,"audi",m1);
		Car c2=new Car(1997,"MarutiSuzuki",m2);
		
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
