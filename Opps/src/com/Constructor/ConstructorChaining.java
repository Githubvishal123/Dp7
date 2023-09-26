package com.Constructor;

//Calling one constructor from another constructor with respect to current object

//done through this()...wihtin the class

class Demo {
	int a;
	int b;
	String name;

//	Demo() {
//		a = 10;
//		b = 20;
//		name = "Unknown";
//
//	}
//	
//	Demo(int a,int b)
//	{
//		this.a=a;
//		this.b=b;
//		name="Unknown";
//		
//		
//	}
	
	Demo()
	{
		this(10,20);//always has to be first Statement
		
	
		System.out.println("Default Constructor");
		
	}
	
	Demo(int a,int b)
	{
		System.out.println("param constructor 1");
		this.a=a;
		this.b=b;
		this.name="Unknown";
		
	}
	
	Demo(int a,int b,String name)
	{
		
		System.out.println("param Constructor 2");
		this.a=a;
		this.b=b;
		this.name=name;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public String toString() 
		{
		return " a :" + a + "\n b :" + b + "\n name :" + name;

		}
		
	}

	public class ConstructorChaining {

		public static void main(String[] args) {

			System.out.println("---------------------------------------------");
			Demo d1 = new Demo();
			System.out.println(d1);
			
			System.out.println("--------------------------------------");
			Demo d2=new Demo(30,40);
			System.out.println(d2);
			
			System.out.println("------------------------------");
			Demo d3=new Demo(100,200,"Vishal");
			System.out.println(d3);
			

		}

	}


