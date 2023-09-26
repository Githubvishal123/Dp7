package com.Finalkeyword;

class Student {
	String sname;
	int age;
	int rollno;
	static String schoolname;
	final static String addharno = "Cuvpg988l";

//	
//	{
//		
//		addharno="PG4005l";// the final variable cannot assigned once it is initialized
//		
//		
//	}
//	
//	
	Student()
	{
		
		
		
	}
	
	
	
	static {
		schoolname = "stmary";

	}

	Student(String sname, int age, int rollno,String schoolname) {
		this.sname = sname;
		this.age = age;
		this.rollno = rollno;
		this.schoolname=schoolname;

	}

	public String toString() {
		return sname + " " + age + " " + rollno+" "+schoolname;

	}

}


class SchoolStudent extends Student
{
	
	
	
	
}










public class Studentdetails {

	public static void main(String[] args) {
		Student s1 = new Student("vishal", 26, 14,"littleflower");
		System.out.println(s1);

	}

}
