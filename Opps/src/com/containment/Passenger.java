package com.containment;

public class Passenger {

	private int pid;
	private String  pname;
	private int page;
	
	
	Passenger()
	{
		
		
	}
	
	Passenger(int pid,String pname,int page)
	{
		this.pid=pid;
		this.pname=pname;
		this.page=page;
		
		
		
		
	}
	
	public int getPid()
	{
		return pid;
	}
	
	
	public void setPid(int pid)
	{
		
		this.pid=pid;
	}
	
	public String getPname()
	{
		
		return pname;
	}
	
	public void setPname(String pname)
	{
		this.pname=pname;
		
		
	}
	
	
	public int getPage()
	{
		return page;
		
	}
	
	public void setPage(int page)
	{
		this.page=page;
		
	}
	
	public String toString()
	{
		return "\nPassengerid "+pid+"\nPassengername "+pname+"\nPassengerage "+page;
		
		
	}
	
	
	

}
