package com.polymorphism;

public class TypePromotion {

	static void display(float n) {
		System.out.println("in float");
		System.out.println(n);
	}

	static void display(long n) {

		System.out.println("in long :");
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(5); // here int got converted to float

		display('A'); // if float and int are present nearest

		// int flaot and long : promoted to long
	}

}
