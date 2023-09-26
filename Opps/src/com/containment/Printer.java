package com.containment;

public class Printer {

	private String pname;
	private String type;
	private int price;

	Printer() {

	}

	Printer(String pname, String type, int price) {
		this.pname = pname;
		this.type = type;
		this.price = price;

	}

	public String getPname() {

		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;

	}

	public String getType() {

		return type;

	}

	public void setType(String type) {

		this.type = type;

	}

	public int getPrice() {
		return price;

	}

	public void setPrice(int price) {
		this.price = price;

	}

	public String toString() {
		return pname + " " + type + " " + price;

	}

}
