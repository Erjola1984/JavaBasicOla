package com.neotech.lesson23;

public class Degree {
	
	void getPrerequisite()
	{
		System.out.println("To get a degree you need high school diploma");
		
	}

	}

 class Bachelors extends Degree {	
	 
	 void getPrerequisite()
	 {
	 System.out.println("To get a Bachelor you need 60 credits");
 }
 
 }	 
 
 class Master extends Degree {
	 void getPrerequisite()
	 {
	 System.out.println("To get a Master you need a Bachelor");
 }
 
 }	 
	 
 