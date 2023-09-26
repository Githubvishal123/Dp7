package com.staticdemo;

public class Company {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"tata",10000);
		System.out.println(e1);
		
		Employee.changename("Tesla");
		Employee.changename("paypal");
		System.out.println("The number of times company change is :");
		System.out.println(Employee.count);

	}

}
