package com.opps;

class Building {
	int flatno;
	int floor;
	int noofmembers;
	char wing;
	static String b_name = "Royal_Society";

	static {
		b_name = "SkyHighSociety";

	}

	Building(int flatno, int floor, int noofmembers, char wing) {

		this.flatno = flatno;
		this.floor = floor;
		this.noofmembers = noofmembers;
		this.wing = wing;

	}

	static void playarea() {

		System.out.println("Playarea belongs to " + b_name);

	}

	static void swimmingpool() {
		System.out.println("Swimmingpool belongs to " + b_name);

	}

	void display() {
		System.out.println("Flatno of building :" + flatno);
		System.out.println("No of floors " + floor);
		System.out.println("No of members in Building " + noofmembers);
		System.out.println("Wing no " + wing);

	}

	public String toString() {

		return flatno + " " + floor + " " + noofmembers + " " + wing + " " + b_name;

	}

}

public class Buildingmain {

	public static void main(String[] args) {
		Building b1 = new Building(101, 15, 400, 'B');
		System.out.println(b1);
		b1.display();
		Building.swimmingpool();
		Building.playarea();
		System.out.println(Building.b_name);

	}

}
