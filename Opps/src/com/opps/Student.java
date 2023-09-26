package com.opps;
import java.util.Scanner;
public class Student {

	int std;
	String name;
	float marks1;
	float marks2;
	float marks3;
	float per;
	char grade;
	
	
	void calPercentage()
	{
		per=((marks1+marks2+marks3)/300)*100;
		
		
		
	}
	
	void calcGrade()
	{
		if(per>=90)
			grade='A';
		else if(per>=75)
			grade='B';
		else if(per>=60)
			grade='C';
		else if(per>=40)
			grade='D';
		else 
		grade = 'F';
			
			
		
		
	}
	
	
	
	
	
	
	void display()
	{
		
		System.out.println("Id:"+std+"Name :"+name+ "Percentage:" +per+"%");
		if(grade=='F')
		System.out.println("You have failed.....Try hard next time ");
		else
		{
			System.out.println("Congratulations !! You have passed with grade :"+grade);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		System.out.println("Enter Student id ");
		s1.std=sc.nextInt();
		System.out.println("Enter Student name ");
		s1.name=sc.next();
		System.out.println("Enter marks of subject 1");
		s1.marks1=sc.nextInt();
		System.out.println("Enter marks of subject 2");
		s1.marks2=sc.nextInt();
		System.out.println("Enter marks of Subject 3");
		s1.marks3=sc.nextInt();
		
		s1.calPercentage();
		s1.calcGrade();
		System.out.println();
		System.out.println("-----------------------------------------------");
		s1.display();
	}

}
