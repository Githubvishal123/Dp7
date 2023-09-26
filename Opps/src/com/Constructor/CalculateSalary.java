package com.Constructor;

public class CalculateSalary {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Vishal", "JavaDeveloper", 20000);
		Employee e2 = new Employee(101, "akshay", "JavaDeveloper", 30000);
		Employee e3 = new Employee(101, "suraj", "JavaDeveloper", 40000);
		Employee e4 = new Employee(101, "avinash", "JavaDeveloper", 50000);
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println("---------SALARY_AFTERCOMMISION");
		

		double Netsalary1 = e1.getSalary();
		double Netsalary2 = e2.getSalary();
		double Netsalary3 = e3.getSalary();
		double Netsalary4 = e4.getSalary();
		System.out.println("---------------------------------------------------------------------------");

		System.out.println("the Net Salary of an Empolyee1 is " + Netsalary1);
		System.out.println("the Net Salary of an Empolyee2 is " + Netsalary2);
		System.out.println("the Net Salary of an Empolyee3 is " + Netsalary3);
		System.out.println("the Net Salary of an Empolyee4 is " + Netsalary4);

	}

}
