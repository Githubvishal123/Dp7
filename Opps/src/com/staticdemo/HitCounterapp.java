package com.staticdemo;

class Counter
{
	int x;
	static int count=0;
	
	{
		System.out.println("in Instance Block");
		count++;
		
	}
	
	
	
	
	Counter()
	{
		System.out.println("default Constructor");
		x=10;
		count++;
		
		
		
	}
	
	
	Counter(int x)
	{
		this();
		this.x=x;
		
		
	}
	
}









public class HitCounterapp {

	public static void main(String[] args) {
		Counter c1=new Counter ();
		System.out.println(Counter.count);
		
		Counter c2=new Counter();
		System.out.println(Counter.count);
		
		Counter c3=new Counter();
		System.out.println(Counter.count);
		
		Counter c4=new Counter(80);
		System.out.println(Counter.count);
		


	}

}
