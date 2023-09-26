package com.containment;

public class Machine {

	private String machinetype;
	private Engine e;
	
	
	Machine()
	{
		
		
	}
	

	Machine(String machinetype, Engine e) {
		this.machinetype = machinetype;
		this.e = e;

	}

	public String getMachinetype() {
		return machinetype;
	}

	public void setMachinetype(String machinetype) {
		this.machinetype = machinetype;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	
	public String toString ()
	{
		return machinetype+" "+e;
		
		
	}
	
	
	
	
	
	
}
