package com.polymorphism;

class Shape
{
	void area(int side)
	{
		
		System.out.println("Area of square is"+(side*side));
		
	}
	
	void area(int len,int br)
	{
		System.out.println("Area of rectangle is"+(len*br));
		
		
	}
	
	void area(float radius)
	
	{
		float pi=3.14f;
		System.out.println("Area of Circle is"+(pi*radius*radius));
		
	}
	
	
	
	
	
	
}













public class PolyDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape square=new Shape();
		
		square.area(4);
				
		Shape rec=new Shape();
		rec.area(5,6);
		
		Shape cir=new Shape();
		cir.area(7);
		
		
		
		
		
		
		
		
		
		
	}

}
