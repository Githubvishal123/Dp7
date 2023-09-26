package com.opps;

public class BookMain {

	
	static void getDiscount(Book1 b)
	{
		if(b.getCategory()=='S')
		{
			float price=b.getPrice();
			
		float	fprice=(price-(0.1f*price));
			
			 b.setPrice(fprice);
			 System.out.println("After Discount Price is "+b);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Book1 b1=new Book1(101,"harrypotter","uewyri","21/09/1999",400f,'S');
		Book1 b2=new Book1(102,"dracula","uewy","21/08/1998",500f,'P');
		Book1 b3=new Book1(103,"pocketdaires","uewyri","21/09/1996",600f,'P');
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		
		getDiscount(b1);
		getDiscount(b2);
		getDiscount(b3);
		

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		
		
		
		
		
		
		
		
		

	}

}
