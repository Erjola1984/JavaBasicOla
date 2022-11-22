package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {
		// 1st constructor is used
		
		Student st1 = new Student();
		st1.displayInfo();
		
		st1.name = "Ola";
		st1.address = "2375 fox Chase";
		st1.displayInfo();
		
		
		System.out.println("++++++++++++++++++++++++");
		
		//using second constructor
		Student st2 = new Student("Dajna", "123 Main Street" );
		st2.displayInfo();
		
		
		//using second constructor
		Student st3 = new Student("Hera");
		st3.displayInfo();
		
				
	}

}
