package com.opps;


class MovieDetails{
	
	private int m_id;
	private String m_name;
	float rating;
	
	
	MovieDetails(int m_id,String m_name,float rating)
	{
		this.m_id=m_id;
		this.m_name=m_name;
		this.rating=rating;
		
		
	}
	
	
	public int getm_id()
	{
		
		
		return m_id;
		
	}
	 public void setm_id(int m_id)
	 {
		 
		 this.m_id=m_id;
		 
		 
	 }
	
	 public String getm_name()
		{
			
			
			return m_name;
			
		}
			public void setm_id(String m_name)
			{
				this.m_name=m_name;
				
				
			}
			
			public float getRating()
			{
				
				
				return rating;
			}
				
				public void setRating(float rating)
				{
					this.rating=rating;
					
					
				}
			
		public	String toString()
			{
				
				return m_id+" "+m_name+" "+rating;
				
				
				
			}
			
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

























