package com.opps;

import java.util.Scanner;

class Student1 {

	private int studentid;
	private String studentName;
	private String studentAddress;
	private String collegename;

	Student1(int studentid, String studentName, String studentAddress) {
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegename = "TQ";

	}

	Student1(int studentid, String studentName, String studentAddress, String collegename)

	{
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegename = collegename;

	}

	public int getStudentid() {
		return studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public String getCollegename() {
		return collegename;
	}

}

public class Studentmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the User Input");
		int input = sc.nextInt();

		Student1 s1=null;
		if (input == 1) {

			System.out.println("Enter studentid ");
			int studentid = sc.nextInt();
			System.out.println("Enter student name ");
			String studentName = sc.next();
			System.out.println("Enter studentAddress ");
			String studentAddress = sc.next();

			s1 = new Student1(studentid, studentName, studentAddress);

		} else if (input == 0) {
			System.out.println("Enter studentid");
			int studentid = sc.nextInt();
			System.out.println("Enter student name");
			String studentName = sc.next();
			System.out.println("Enter studentAddress");
			String studentAddress = sc.next();
			System.out.println("Enter Student college name");
			String collegename = sc.next();
			
			s1=new Student1(studentid,studentName,studentAddress,collegename);

		} else {
			System.out.println("Wrong Input Please Enter Again");

		}
		System.out.println("Studentid :" + s1.getStudentid());
		System.out.println("Studentname :"+s1.getStudentName());
		System.out.println("StudentAddress :"+s1.getStudentAddress());
		System.out.println("Studentcollegename :"+s1.getCollegename());

	}

}
