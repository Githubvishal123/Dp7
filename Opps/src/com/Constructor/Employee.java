package com.Constructor;

public class Employee {

	private int id;
	String name;
	String designation;
	double salary;
	int total;

	Employee(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;

	}

	public double getSalary() {

		double totalsalary = salary + salary * 0.1;

		return totalsalary;

	}
	
	public String toString()
	{
		
		return id+" "+name+" "+designation+" "+salary;
		
	}
	
	
	
	
	

}
