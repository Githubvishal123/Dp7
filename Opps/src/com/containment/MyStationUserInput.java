package com.containment;

import java.util.Scanner;

public class MyStationUserInput {

	static Scanner sc = new Scanner(System.in);

	void entertrainDetails(Train t) {
		System.out.println("Enter train name :");
		t.setTname(sc.next());

		System.out.println("Enter train speed");
		t.setSpeed(sc.nextInt());

		System.out.println("Enter train time");
		t.setTime(sc.nextFloat());

		t.setPassenger(new Passenger());

		System.out.println("Enter passenger id");
		t.getPassenger().setPid(sc.nextInt());

		System.out.println("Enter passenger name");
		t.getPassenger().setPname(sc.next());

		System.out.println("Enter passenger age ");
		t.getPassenger().setPage(sc.nextInt());

	}

	public static void main(String[] args) {
		MyStationUserInput st = new MyStationUserInput();
		Train t1 = new Train();
		Train t2 = new Train();

		st.entertrainDetails(t1);
		st.entertrainDetails(t2);

		System.out.println(t1);
		System.out.println(t2);
		
	}


}
