package com.Constructor;

class Item {

	private int Itemid;
	private String Itemname;
	private float price;

	Item() {

	}

	Item(int Itemid, String Itemname, float price) {
		this.Itemid = Itemid;
		this.Itemname = Itemname;
		this.price = price;

	}

	public String toString() {

		return Itemid + " " + Itemname + " " + price;

	}

	public float getPrice() {
		return price;

	}

	public void setPrice(float price) {
		this.price = price;

	}

}

public class ParamConstructoritem {

	static void giveDiscount( Item i) {
		if (i.getPrice()>200) {
			float p = i.getPrice();
			p = (p - (0.1f*p));
			i.setPrice(p);
			

		}

	}



	public static void main(String[] args) {

		Item i1 = new Item(101, "Chips", 300f);
		Item i2 = new Item(102, "Soap", 270f);
		Item i3 = new Item(103, "Milk", 300f);
		
		
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		giveDiscount(i1);
		giveDiscount(i2);
		giveDiscount(i3);

		System.out.println("----------After Discount-----------------");
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		
	}

}
