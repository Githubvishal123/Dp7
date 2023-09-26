package com.opps;
import java.util.Scanner;
public class Library {

	public static void main(String[] args) {
	Book b1=new Book();
/*	
	b1.setBookId(101);
	b1.setBookname("Harry potter");
	b1.setPrice(657);
*/	
//	System.out.println(b1.getBookId()+" "+b1.getBookname()+" "+b1.getPrice());
	//System.out.println(b1);
	
	Book b2=new Book();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter book id");
	b2.setBookId(sc.nextInt());
	
	System.out.println("Enter book name");
	b2.setBookname(sc.next());
	
	System.out.println("Enter book price");
	b2.setPrice(sc.nextFloat());
	
	System.out.println(b2);
	
	
	
	}
	//ctrl+shift+t----open any class
	//ctrl+shift+a----open any method

}
