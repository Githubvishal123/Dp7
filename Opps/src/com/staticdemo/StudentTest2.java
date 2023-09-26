package com.staticdemo;

class Student1 {
	private int id;
	String name;
	float marks;
	static String scName;
	static int sCount=0;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	
	{
		
		sCount++;
	}
	
	
	
	Student1() {
		scName = "St joseph";

	}

	Student1(int id,String name,float marks)
	{
		this();
		this.id=id;
		this.name=name;
		this.marks=marks;
		
		
	}

}

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student1 s1 = new Student1();
		System.out.println(s1.scName);

		Student1 s2 = new Student1();
		System.out.println(s2.scName);

		System.out.println(Student1.sCount);
	}

}
