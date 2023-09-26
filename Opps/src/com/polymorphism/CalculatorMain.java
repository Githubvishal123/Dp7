package com.polymorphism;

class Calculator
{
	void square(int a)
	
	{
		System.out.println("Square of number "+(a*a));
		
	}
	
	
	void add(int a,int b)
	{
		System.out.println("Addition of number "+(a+b));
		
	}
	
	
	void mul(float a,float b)
	
	{
		System.out.println("Multiplication of number is "+(a*b));
		
	}
	
	
	
	
}










public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator sq=new Calculator();
		sq.square(5);
		
		Calculator add=new Calculator();
		add.add(4,5);
		
		Calculator mult=new Calculator();
		mult.mul(6, 4.5f);
		
	}

}
