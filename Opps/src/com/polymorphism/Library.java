package com.polymorphism;

public class Library {

	public static void main(String[] args) {
		
		Author a1=new Author(101,"JKRowling");
		Author a2=new Author(102,"SudhaMurthy");
		
		Book b1=new Book(1,"Harrypotter",1000f,a1);
		Book b2=new Book(2,"sjash",20000f,a2);
		

	}

}
