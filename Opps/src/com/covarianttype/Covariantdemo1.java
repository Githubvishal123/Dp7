package com.covarianttype;

class Person {
	int id;
	String name;

	Person() {

	}

	Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	Person showDetails() {
		name = name + " -India ";
		return this;
	}

	public String display() {
		return id + " " + name;

	}

}

class Employee extends Person {

	float salary;

	Employee() {

	}

	Employee(int id, String name, float salary) {

		super(id, name);
		this.salary = salary;

	}

//		Person showDetails()
//		{
//			name=name+" ThinkQ";
//			salary=salary+1000;
//			return this;
//		}
//		
	Employee showDetails() {
		name = name + "-Thinkq";
		salary = salary + 1000;
		return this;
	}

	public String show() {
		return id + " " + name + " " + salary;

	}

}

public class Covariantdemo1 {

	public static void main(String[] args) {
		Person ref;
		Employee eref;

		Person p = new Person(101, "gaurav");
		ref = p.showDetails();
		System.out.println(ref.display());

		Employee e = new Employee(1001, "sneha", 4500f);
		ref = e.showDetails();
		System.out.println(ref.display());
		// System.out.println(ref.show());

//		
//		Employee e1=new Employee(1002,"pratik",5500f);
//		eref=(Employee)e.showDetails();//casting
//		System.out.println(eref.show());
//		

		Employee e1 = new Employee(1002, "pratik", 5500f);
		eref = e.showDetails();// no type casting required now
		System.out.println(eref.show());

	}

}
