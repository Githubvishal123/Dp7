package com.Constructor;

// Calling one constructor form another uctor

class Test {
	int a;
	int b;
	String name;

	Test() {
		System.out.println("Default Constructor");
		this.a = 10;
		this.b = 20;
		this.name = "Unknown";
		System.out.println("Task has to be done everytime");

	}
	
	Test(int a,int b)
	{
		
		this();
		System.out.println("param Constructor 1");
		this.a=a;
		this.b=b;
		
		
	}
	
	Test(int a,int b,String name)
	{
		this();
		System.out.println("param Constructor 2");
		this.a=a;
		this.b=b;
		this.name=name;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString()
	{
		
		return " a:"+a+" \n b:"+b+"\n name "+name;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

public class CostructorChaining2 {

	public static void main(String[] args) {
		System.out.println("----------------------");
		Test d1 = new Test();
		System.out.println(d1);
		
		System.out.println("------------------------------------");
		
		Test d2= new Test(30,40);
		System.out.println(d2);
		
		System.out.println("--------------------------------------");
		Test d3=new Test(100,200,"Vishal");
		System.out.println(d3);
		
		//to assign the task has to be done while each object creation
		

	}
}
