package com.overriding;

class Student {
	private int sid;
	private String sname;
	protected float sfees;

	Student(int sid, String sname, float sfees) {
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;

	}

	public int getSid() {
		return sid;

	}

	public void setSid(int sid) {

		this.sid = sid;

	}

	public String getSname() {
		return sname;

	}

	public void setSname(String sname) {
		this.sname = sname;

	}

	public float getSfees() {
		return sfees;
	}

	public void setFees(float sfees) {
		this.sfees = sfees;

	}

	public void payfees() {
		System.out.println("Monthly fees to be paid " + sfees);

	}

	public char[] getSchoolName() {
		// TODO Auto-generated method stub
		return null;
	}

}

class SchoolStudent extends Student {
	private int std;
	private String schoolName;

	SchoolStudent(int sid, String sname, float sfees, int std, String schoolName) {
		super(sid, sname, sfees);
		this.std = std;
		this.schoolName = schoolName;
	}

	private int getStd() {
		return std;

	}

	private void setStd(int std) {
		this.std = std;

	}

	public String getSchoolName() {
		return schoolName;

	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;

	}

	public void payfees() {
		System.out.println("half yearly fees to be paid " + (sfees * 6));

	}

}

class CollegeStudent extends Student {

	private int semno;
	private String collegename;

	CollegeStudent(int sid, String sname, float sfees, int semno, String collegename) {
		super(sid, sname, sfees);
		this.semno = semno;
		this.collegename = collegename;

	}

	public int getSemno()
	{
		return semno;
		
	}
	
	public void setSemno(int semno)
	{
		this.semno=semno;
		
	}
	
	public String getCollegename()
	{
		return collegename;
		
		
	}
		
	public void setCollegename(String collegename)
	{
		this.collegename=collegename;
		
	}
	
	public void payfees()
	{
		System.out.println("Quartely fees to be paid "+(sfees*3));
		
	}
	
	
}

public class Overridingmain {

	public static void main(String[] args) {

		Student s=new Student(101,"Vishal",10000);
		System.out.println(s.getSname()+" ");
		s.payfees();
		
		s=new SchoolStudent(102,"akshay",20000,23,"StMary");
		
	}

}
