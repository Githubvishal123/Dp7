package com.Wrapperclass;

public class WrapperclassDemo {

	public static void main(String[] args) {
		//autoboxing
		//primitive to wrapper class
		//method:valueof
		
		
		int num=23;
		
		Integer i=new Integer(45);
		
		//convert
		Integer j=new Integer(num);
		//conversion -auto
		
		Integer k=num;
		
		System.out.println(num+" "+i+" "+j+" "+k);
		
		//unboxing
		//wrapper to primitive
		//intvalue
		
		Float f1=new Float(23.4f);
		Float f2=f1.floatValue();
		
		//unboxing-auto
		
		float f3=f1;//compiler adds it .floatvalue(
		
		System.out.println(f1+" "+f2+" "+f3);
		

	}

}
