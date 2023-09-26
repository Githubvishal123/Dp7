package com.containment;

public class MyConnectiongettersetter {

	public static void main(String[] args) {
		
		Printer p1=new Printer();
		p1.setPname("laserjet");
		p1.setType("Colorprinter");
		p1.setPrice(500000);
		Laptop l1=new Laptop();
		l1.setConfig("gaming");
		l1.setLpname("lenovo");
		l1.setPrice(465657);
		l1.setP(p1);
		
		System.out.println(l1);
		
		Laptop l2=new Laptop();
		l2.setConfig("gaming");
		l2.setLpname("lenovo");
		l2.setPrice(450000);
		l2.setP(new Printer());
		l2.getP().setPname("Hp");
		l2.getP().setType("color");
		l2.getP().setPrice(450000);
		
		System.out.println(l2);
		
		
		

		
		
		
		
	}

}
