package com.containment;

import java.util.Scanner;

public class MyconnectionUserInput {

	void enterlaptopdetails(Laptop l)
	{
		System.out.println("Enter laptop Congiguration");
		l.setConfig(sc.next());
		System.out.println("Enter laptop name ");
		l.setLpname(sc.next());
		System.out.println("Enter laptop price");
		l.setPrice(sc.nextInt());
		l.setP(new Printer());
		
		System.out.println("enter printer name ");
		l.getP().setPname(sc.next());
		
		System.out.println("enter Printer type ");
		l.getP().setType(sc.next());
		
		System.out.println("Enter printer price");
		l.getP().setPrice(sc.nextInt());
		
		
		
		
	}

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MyconnectionUserInput c = new MyconnectionUserInput();

		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();

		c.enterlaptopdetails(l1);
		c.enterlaptopdetails(l2);
		
		System.out.println(l1);
		System.out.println(l2);
	}

}

//public class MyStationUserInput {
//
//	static Scanner sc = new Scanner(System.in);
//
//	void entertrainDetails(Train t) {
//		System.out.println("Enter train name :");
//		t.setTname(sc.next());
//
//		System.out.println("Enter train speed");
//		t.setSpeed(sc.nextInt());
//
//		System.out.println("Enter train time");
//		t.setTime(sc.nextFloat());
//
//		t.setPassenger(new Passenger());
//
//		System.out.println("Enter passenger id");
//		t.getPassenger().setPid(sc.nextInt());
//
//		System.out.println("Enter passenger name");
//		t.getPassenger().setPname(sc.next());
//
//		System.out.println("Enter passenger age ");
//		t.getPassenger().setPage(sc.nextInt());
//
//	}
//
//	public static void main(String[] args) {
//		MyStationUserInput st = new MyStationUserInput();
//		Train t1 = new Train();
//		Train t2 = new Train();
//
//		st.entertrainDetails(t1);
//		st.entertrainDetails(t2);
//
//		System.out.println(t1);
//		System.out.println(t2);
//		
//	}
//
