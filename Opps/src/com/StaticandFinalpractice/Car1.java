package com.StaticandFinalpractice;

public class Car1 {
	String name1;
	String name2;

	static int cars=0;//static variable
	 int  noofcars()    // we can write static variable inside instance method 
	{
		
		cars++;
		return cars;
	}
	

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		Car1 c2=new Car1();
		c1.noofcars();
	 System.out.println(c2.noofcars());

	}

	

}
