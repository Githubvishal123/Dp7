package com.ObjectPassing;
import java.util.Scanner;

import com.opps.Book;
public class Mylibrary {
	static Scanner sc=new Scanner(System.in);
	
	static void insertBook(Book b)
	{
		System.out.println("Enter book Id ");
		b.setBookId(sc.nextInt());
		
		System.out.println("Enter book Name ");
		b.setBookname(sc.next());
		
		System.out.println("Enter book price");
		b.setPrice(sc.nextFloat());
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Book b1=new Book();
		insertBook(b1);
		
		Book b2=new Book();
		insertBook(b2);
		b2.setPrice(250);
	
		
		Book b3=new Book();
		insertBook(b3);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
