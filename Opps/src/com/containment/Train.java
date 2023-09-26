package com.containment;

public class Train {

	private String tname;
	private int speed;
	private float time;
	private Passenger passenger;

	public String getTname() {
		return tname;
		
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

		
	Train()
	{
		
		
		
	}
	
	Train(String tname,int speed,float time,Passenger passenger)
	{
		this.tname=tname;
		this.speed=speed;
		this.time=time;
		this.passenger=passenger;
		
	}
	
	public String toString()
	{
		
		return "\nTrainName "+tname+"\nTrainSpeed "+speed+"\nTraintime "+time+"\nTrainPassenger "+passenger;
		
	}
	
	
	
	
	
	

}
