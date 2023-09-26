package com.covarianttype;

class Covariant {

	Object show() {

		System.out.println("This is my object");

		return new Object();
	}

}

class Subcovariant extends Covariant {

	Integer show() {
		System.out.println("This is my Integer");

		return 10;
	}

}

class Subcovariant1 extends Covariant

{
	String show() {

		System.out.println("this is my Integer");
		return "Vishal";

	}

}

public class Covariantdemo2 {

	public static void main(String[] args) {
		Covariant c1 = new Covariant();
		c1.show();
		Subcovariant s1 = new Subcovariant();
		System.out.println(s1.show());
		c1=new Subcovariant1();
		
		System.out.println(c1.show());
		
		
		

	}

}
