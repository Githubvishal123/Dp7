package com.inheritance;

class Vehicle1 {
	private int id;
	private int model;
	protected float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Vehicle1() {
		super();

	}

	public Vehicle1(int id, int model, float price) {
		super();

		this.id = id;
		this.model = model;
		this.price =price;

	}

	public String toString() {

		return id + " " + model + " " + price;

	}

}

class Car1 extends Vehicle1 {

	private String name;
	private int noofgears;
	private String fueltype;

	Car1() {

	}

	Car1(int id, int model, float price, String name, int noofgears, String fueltype)

	{
		super(id, model, price);
		this.name = name;
		this.noofgears = noofgears;
		this.fueltype = fueltype;

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public int getNoofgears() {

		return noofgears;

	}

	public void setNoofgears(int noofgears) {
		this.noofgears = noofgears;

	}

	public String getFueltype() {
		return fueltype;

	}

	public void setFueltype(String fueltype) {

		this.fueltype = fueltype;

	}

	public String toString() {

		return name + " " + noofgears + " " + fueltype;

	}

}

class Racingcar extends Car1 {
	int maxspeed;
	int milege;

	Racingcar(int id,int model,float price,String name,int noofgears,String fueltype,int maxspeed,int milege)
	{
		super( id, model, price,name, noofgears,fueltype);
		this.maxspeed=maxspeed;
		this.milege=milege;
	}

	public int getMaxspeed() {

		return maxspeed;

	}

	public void setMaxspeed() {
		this.maxspeed = maxspeed;

	}

	public int getMilege() {

		return maxspeed;

	}

	public void setMilege() {
		this.milege = milege;

	}

	public String toString() {
		return maxspeed + " " + milege;

	}

}



public class Multilevel {

	public static void main(String[] args) {
		
		Car1 c=new Car1(1,2020,45670f,"BMW",6,"Diesel");
		System.out.println(c);
		
		
		
		
		
		
	}

}
