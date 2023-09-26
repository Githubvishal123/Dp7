package com.Constructor;

public class Testify {

	String name;

	Testify() {

	}

	Testify(String name) {

		this.name = name;
	}

	void display() {
		System.out.println("Hi " + name);
		this.show();

	}

	void show() {
		System.out.println("Welcome to thinkQuotient :" + name);

	}

	Testify changeName() {
		name = name + "ThinkQ";
		return this;

	}

	public static void main(String[] args) {
		Testify t1 = new Testify("Vishal");
		t1.display();
		//ti.show();
		
		Testify dummy;
	dummy=t1.changeName();

	System.out.println(dummy.name);
	
	}

}
