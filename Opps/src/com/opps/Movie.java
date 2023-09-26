package com.opps;

public class Movie {

	
	
	
	
	

	static void	checkRatings(MovieDetails m)
		{
			if(m.getRating()>6)
			{
				
				System.out.println("High rated Movie"+m);
				
			}
			
			
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MovieDetails m1=new MovieDetails(101,"RRR",8);
		MovieDetails m2=new MovieDetails(102,"OMG",7);
		MovieDetails m3=new MovieDetails(103,"Rocky",9);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println("------------------AfterRatings-------------");
		
		
		checkRatings(m1);
		checkRatings(m2);
		checkRatings(m3);
}

}


