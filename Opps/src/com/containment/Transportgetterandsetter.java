package com.containment;

public class Transportgetterandsetter {

	public static void main(String[] args) {
		Engine e1=new Engine();
		e1.setEnginetype("Diesel");
		e1.setPrice(64448);
		
		Machine m1=new Machine();
		m1.setMachinetype("petrol");
		m1.setE(e1);
		
		Car c1=new Car();
		c1.setModelno(1650);
		c1.setCarName("audi");
		c1.setM(m1);
		
		System.out.println(c1);
		 
		//2nd way
		
		Car c2=new Car(); 
		c2.setModelno(1899);
		c2.setCarName("audi");
		c2.setM(new Machine());
		c2.getM().setMachinetype("petrol");
		System.out.println(c2);
		
		Machine m2=new Machine();
		m2.setMachinetype("automatic");
		m2.setE(new Engine());
		m2.getE().setEnginetype("petrol");
		m2.getE().setPrice(6554);
		
		System.out.println(m2);

	}

}
