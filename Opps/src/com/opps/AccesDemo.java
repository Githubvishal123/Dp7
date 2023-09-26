package com.opps;

public class AccesDemo {

	private int  a;
	
	public int b;
	int c;
	
	
	private void show()
	{
		System.out.println("Hello");
		
		
	}
	void display()
	{
		System.out.println("Welcome");
		
	}
	
	public static void main(String[] args) {
	
		AccesDemo obj=new AccesDemo();
		obj.a=10;
		obj.b=5;
		obj.c=6;
		
		obj.show();
		obj.display();
		
		
		
		
	}

}
