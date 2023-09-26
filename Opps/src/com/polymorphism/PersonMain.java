package com.polymorphism;

class Person {
	int salary;
	String name;
	String role;
	String games;
	double annualsalary;

	void activity(int salary) {

		System.out.println("Person is in Office");
		this.salary = salary;
		System.out.println("Salary of a person is " + salary);
		this.annualsalary = salary*12;
		System.out.println("annnual Salary of person is" + annualsalary);
	}

	void activity(String name, String role) {

		System.out.println("Person is at Home");
		this.name = name;
		this.role = role;
		System.out.println("Person name is " + name);
		System.out.println("person role is " + role);
	}

	String activity(String games) {

		System.out.println("Person is with friends ");
		this.games = games;
		return games;
	}

}

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.activity(1000);
		p1.activity("akshay", "son");
		System.out.println("Perosn loves to play games like " + p1.activity("table-tennis"));
	}

}
