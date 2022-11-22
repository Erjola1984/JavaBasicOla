package com.neotech.review04;

public class World {

	public static void main(String[] args) {
		//declaring and initializing a variable
		Baby baby1 = new Baby();
		baby1.name = "Inva Vlora";
		baby1.wight = 6;
		baby1.hair = "Black";
		
	System.out.println("The name of the baby is " + baby1.name);	
	System.out.println("The hair color of the baby is " + baby1.hair);		
		
	System.out.println("-----------------");
	//declaring a variable of type baby
	
	 Baby baby2 = new Baby(); 
	 baby2.name = "Dajna";
	 baby2.gender = 'M';
	 baby2.wight = 5;
	 baby2.hair = "Brown";
	
	 System.out.println("The name of baby2 is " + baby2.name);
	 System.out.println("The hair color of baby2 is " + baby2.hair);
	 
	 baby1.cry();
	 baby2.cry();
	 
	 baby1.talk();
	 
	 System.out.println("-------------------");
	 
	 baby1.displayInfo();
	 baby2.displayInfo();
	 
	 
	 
	 
	 
	}

}
