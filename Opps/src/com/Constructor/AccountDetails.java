package com.Constructor;

class Accountinfo {
	int accid;
	String accname;
	double accbalance;

	Accountinfo() {
		this(101, "avinash", 250000);

	}

	Accountinfo(int accid, String accname) {

	}

	Accountinfo(int accid, String accname, double accbalance) {

		this(234, "akshay");
		this.accid = accid;
		this.accname = accname;
		this.accbalance = accbalance;

	}

	void display() {

		String name = "akshay";
		System.out.println(accname);
		System.out.println(this.accname);

	}

	void show() {

		System.out.println(this.accid + " " + this.accname + " " + this.accbalance);

	}

	Accountinfo obj()
	{
			obj.name;
		
		
		
	}

}

public class AccountDetails {

	public static void main(String[] args) {
		Accountinfo a = new Accountinfo(101, "Vishal", 20000);
		Accountinfo a1 = new Accountinfo(102, "suraj");
		a.display();

	}

}
