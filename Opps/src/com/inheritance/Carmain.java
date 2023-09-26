package com.inheritance;

class Vehicle {
	String carname;
	String color;
	int price;

	Vehicle() {

	}

	Vehicle(String carname, String color, int price) {
		this.carname = carname;
		this.color = color;
		this.price = price;

	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return carname + " " + color + " " + price;

	}
}

class Car extends Vehicle

{
	String cartype;
	int wheels;

	Car(String carname, String color, int price, String cartype, int wheels)

	{
		super(carname, color, price);
		this.cartype = cartype;
		this.wheels = wheels;

	}

	public String toString() {
		return carname + " " + color + " " + price + " " + cartype + " " + wheels;
	}

}

class Carmain {

	public static void main(String args[])

	{
		Vehicle v = new Vehicle("Marauti Suzuki", "red", 45000);
		System.out.println(v);
		Car c = new Car("ferrari", "yellow", 56698, "racing", 4);
		System.out.println(c);

	}

}
