package com.containment;

public class Connectionmain {

	public static void main(String[] args) {
		
		Printer p1=new Printer("LaserZ","Colorprinter",50000);
		Printer p2=new Printer("hp","BlackWHite",550000);
		
		Laptop l1=new Laptop("gaming","lenovo",60000,p1);
		Laptop l2=new Laptop("Office","HP",70000,p2);
		
		
		System.out.println(l1);
		System.out.println("--------------------------------------------------------");
		System.out.println(l2);
		
		
	}

}
