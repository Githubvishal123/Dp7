package com.opps;

import java.util.Date;

class Patient {
	int id;
	String pname;
	String Doctor;
	static int count = 0;

	Patient(int id, String pname, String Doctor) {
		this.id = id;
		this.pname = pname;
		this.Doctor = Doctor;
		count++;

	}

	void PatientDetails() {

		System.out.println("patient id " + id);
		System.out.println("patient name " + pname);
		System.out.println("Doctor nmae " + Doctor);
	}

}

public class PatientMain {

	public static void main(String[] args) {
		Patient p1 = new Patient(101, "mahesh", "DR kiran");
		Patient p2 = new Patient(101, "mahesh", "DR Suraj");
		Patient p3 = new Patient(101, "mahesh", "DR kumar");
		Date d = new Date();
		System.out.println(d);

		p1.PatientDetails();
		p2.PatientDetails();
		p3.PatientDetails();

		System.out.println("Total no of patient is :" + Patient.count);
		System.out.println("Total no of doctors is :"+Patient.count);

	}

}
