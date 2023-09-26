package com.containment;

public class Library {

	public static void main(String[] args) {
		Author a1=new Author(101,"jkRowling" );
		Author a2=new Author(102,"Sudhamurthy");
		
		
		Book b1=new Book(104,"harrypotter",25000f,a1);
		Book b2=new Book(105,"SudhaMurthy",36000f,a2);
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		System.out.println(new Author(103,"WilliamShakespeare"));
		
		
		Book b3=new Book(3,"hamlet",560f,new Author(103,"williamshakespeare"));
		
		
		
	}

}
