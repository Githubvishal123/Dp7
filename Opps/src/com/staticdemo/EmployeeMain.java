package com.staticdemo;

class Employee {
	private int id;
	private String name;
	private double Salary;
	private static String Companyname;
	static int count;

	Employee(int id, String name, double Salary) {
		this.id = id;
		this.name = name;
		this.Salary = Salary;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public static String getCompanyname() {
		return Companyname;
	}

	public static void setCompanyname(String companyname) {
		Companyname = companyname;
	}

	static {
		Companyname = "BAJAJ";
		count++;

	}

	static void changename(String changename) {
		changename = changename;

		System.out.println(changename);

	}

	{

		count++;

	}

	public String toString() {

		return id + " " + name + " " + Salary + " " + Companyname ;

	}

}
