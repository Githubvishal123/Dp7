package com.containment;

public class Author {
	private int authorid;
	private String authorname;
	
	Author()
	{
		
		
	}
	
	Author(int authorid,String authorname)
	{
		this.authorid=authorid;
		this.authorname=authorname;
		
	}
	
	public int getAuthorid()
	{
		
		return authorid;
	}
	
	public void setAuthorid(int authorid)
	
	{
		this.authorid=authorid;
		
	}
	
	public String getAuthorname()
	{
		return authorname;
		
		
	}
	
	public void setAuthorname(String authorname)
	{
		this.authorname=authorname;
		
		
	}
	
	
	public String toString()
	{
		
		return "\nAuthorID "+authorid+"\nAuthorname "+authorname;
	}
	
	
	
}
