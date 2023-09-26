package com.staticdemo;

	
	
	
	













public class Staticvariabledemo {

	int x=20;
	static int y=20;
	
	void instanceMethod()
	{
		System.out.println(x);
		System.out.println(y);
		
	}
	
	
	static void staticMethod()
	{
		
		System.out.println("y :"+y);
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staticvariabledemo s1=new Staticvariabledemo();
		s1.instanceMethod();
		staticMethod();
		
		
		
		
		
		
		
		
		
	}
	

}
