package com.opps;

public class Book {

	private int bookId;
	private String bookname;
	private float price;
	
	
	 public void setBookId(int bookId)
	{
		this.bookId=bookId;
		
	}
	
	public int  getBookId( )
	
	{
		return bookId;
		
	}

	 public void setBookname(String bookname)
	{
		this.bookname=bookname;
		
	}
	 public String  getBookname( )
		
		{
			return bookname;
			
		}

	 public void setPrice(float price)
	{
		this.price=price;
		
	}
	 public float  getPrice( )
		
		{
			return price;
			
		}
	
	 
	 public String toString()
	 {
		 return "BookId " +bookId + " Bookname " +bookname + " Bookprice " +price;
		 
	 }
	
	
	
	}


