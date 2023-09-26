package com.polymorphism;

class Shape2
{
	
	int area(int side)
	{
		
		return(side*side);
		
		
	}
	
	int area(int len,int br)
	{
		return (len*br);
		
		
		
	}
	float area(float radius)
	{
		float pi=3.14f;
		
		return (pi*radius*radius);
		
		
		
	}
	
	
	
	
	
}







public class Returnpoly {

	public static void main(String[] args) {
	Shape2 s1=new Shape2();
	System.out.println(s1.area(7));
	
	Shape2 s2=new Shape2();
	
	int area=s2.area(7,6);
	System.out.println("Area of rectangle "+area);
	
	System.out.println("area of circle is "+s1.area(4.5f));
	
	

	}

}
