package com.opps;
import java.util.Scanner;
public class Item {
	
	int item_id;
	String item_name;
	float item_price;
	
	
	void display()
	{
		System.out.println(" Itemid "+item_id+" item_name "+item_name+" item_price "+item_price);
		
		
	}
	
	
	

	

	public static void main(String[] args) {
	
		Item obj=new Item();
	//	obj.display();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the item id ");
		int  item_id=sc.nextInt();
		System.out.println("Enter the itemname ");
		String item_name=sc.next();
		System.out.println("Enter the itemprice ");
		float price=sc.nextInt();
		obj.display();
		

	}

}
