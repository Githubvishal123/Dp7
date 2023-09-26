package com.containment;

public class MyCollege {

	public static void main(String[] args) {
		Course c1=new Course(101,"java",45000f);
		Course c2=new Course(102,"paython",3600f);
		Course c3=new Course(103,".net",23000f);
		
		Student s1=new Student(1,"anuj",c1);
		Student s2=new Student(2,"akshay",c2);
		Student s3=new Student(3,"suraj",c3);
		
		
		System.out.println(s1);
		System.out.println("-----------------------------------");
		System.out.println(s2);
		System.out.println("------------------------------------");
		System.out.println(s3);
		
		
		
		
		
		

	}

}
