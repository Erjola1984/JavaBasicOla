package com.neotech.lesson21;

public class Usa {
	//instance variables
	
	String state, stateCapital;
	
	//constructor
	
	public Usa (String State, String stateCapital)
	{
		this.state = state;
		this.stateCapital = stateCapital;
	}
	
	public Usa ()
	{
		
	
	}
	//methods
	
	public void displayState()
	{
		System.out.println(state);
	}

	public void displayStateCapital()
	{
		System.out.println(stateCapital);
	}
	
	public void displayInfo() {
		this.displayState();
		this.displayStateCapital();
	}
	public static void main(String[] args) {
		Usa us1 = new Usa ("New Jersey", "Florida");
		us1.displayInfo();
		
		System.out.println("+++++++++++++++++++++++");
		Usa us2 = new Usa ("Delaware", "Dover");
		us2.displayInfo();
		
	}
}


