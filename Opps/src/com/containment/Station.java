package com.containment;

public class Station {

	public static void main(String[] args) {
		
		Passenger p1=new Passenger(101,"vishal",25);
		Passenger p2=new Passenger(102,"akshay",26);
		
		Train t1=new Train("hutatamaExpress",250,6.3f,p1);
		
		Train t2=new Train("ChennaiExpress",300,7.30f,p2);
		
		System.out.println(t1);
		System.out.println("-----------------------------------------------------");
		System.out.println(t2);

	}

}
