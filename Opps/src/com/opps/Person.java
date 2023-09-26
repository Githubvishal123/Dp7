package com.opps;

public class Person {

	int id;
	String  name;
	int age;
	
	
	
	
	Person()
	{
		this(102,"Vishal");
		System.out.println("default Constructor");
		
		
		
	}
	
	Person(int id,String name)
	{	
		this(103,"anuj",25);
		this.id=id;
		this.name=name;
		System.out.println("Parametrized Constructor 1");
		System.out.println(id);
		System.out.println(name);
		
	}
	Person(int id,String name,int age)
	{
		System.out.println("parametrized Constructor 2");
		this.id=id;
		this.name=name;
		this.age=age;
		System.out.println(id+" "+name+" "+age);
		
		
	}
	
//	public String toString()
//	{
//		return id+" "+name+" "+age;
//		
//		
//		
//	}
//	
//	
//	
	
	
	
	
}
