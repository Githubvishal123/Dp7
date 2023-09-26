package com.polymorphism;

class Room {
	int len;
	int br;

	Room() {
		System.out.println("Default");
		len = 5;
		br = 5;

	}

	Room(int len, int br) {

		System.out.println("rectangle");
		this.len = len;
		this.br = br;

	}

	Room(int len) {
		System.out.println("square");
		this.len = len;
		this.br = len;

	}

	void area() {

		System.out.println("area of room is " + (len * br));
	}

}

public class RoomConstOverload {

	public static void main(String[] args) {
		Room r1 = new Room();
		r1.area();
		Room r2 = new Room(7);
		r2.area();

		Room r3 = new Room(12, 15);
		r3.area();

	}

}
