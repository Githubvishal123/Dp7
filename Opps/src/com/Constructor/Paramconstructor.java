package com.Constructor;

class Student {

	private int id;
	private String name;
	private int age;

	Student(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;

	}

	Student() {

	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}
	
	public String toString()
	{
		return id+" "+name+" "+age;
		
		
	}
}
	

	public class Paramconstructor {

		public static void main(String[] args) 
		{
			Student s1 = new Student(101, "Vishal", 25);
			Student s2 = new Student(102, "kailash", 26);
			Student s3 = new Student(103, "Aditya", 27);

			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);

			Student s4 = new Student();
			s4.setId(104);
			s4.setName("Avinash");
			s4.setAge(24);

			System.out.println(s4);
		}

	}


