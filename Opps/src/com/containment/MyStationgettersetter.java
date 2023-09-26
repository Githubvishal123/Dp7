package com.containment;

public class MyStationgettersetter {

	public static void main(String[] args) {
		Passenger p1=new Passenger();
		p1.setPid(101);
		p1.setPname("vishal");
		p1.setPage(25);
		
		Train t1=new Train();
		t1.setTname("hutatmaExpress");
		t1.setSpeed(250);
		t1.setTime(6.3f);
		t1.setPassenger(p1);
		
		System.out.println(t1);
		
		//2nd way
		
		Train t2=new Train();
		t2.setTname("ChennaiExpress");
		t2.setSpeed(300);
		t2.setTime(7.3f);
		t2.setPassenger(new Passenger());
		t2.getPassenger().setPid(102);
		t2.getPassenger().setPname("akshay");
		t2.getPassenger().setPage(26);
		
		System.out.println(t2);
	}

}
