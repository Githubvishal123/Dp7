package com.overriding;

class Person {

	void display() {

		System.out.println("I am a person");

	}

}

class Employee extends Person {
	@Override
	void display() {

		
		//super.display();
		System.out.println("I am an employee");

	}

}

class Celebrity extends Person {
	@Override
	void display() {
		System.out.println("I am a Celebrity");

	}

}

public class MethodOverridingdemo {

	public static void main(String[] args) {
		Person p=new Person();
		p.display();
		
		Employee e=new Employee();
		e.display();
		
		Celebrity c=new Celebrity();
		c.display();
		

	}

}
