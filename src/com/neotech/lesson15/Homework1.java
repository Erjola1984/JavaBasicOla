package com.neotech.lesson15;

import java.util.Scanner;

public class Homework1 {
	
	//Create a method createEmail(). Based on provided users firstName, lastName and emailType, your method should return complete email address.
	//Example: //firstName -> john; lastName -> snow; emailType -> gmail; return -> johnsnow@gmail.com
			
	
	String createEmail(String firstName, String lastName, String emailType)
	{
		String email = firstName + lastName + "@" + emailType + ".com";
		
		
		return email;
		
		//we can do it also in 1 line:
		// return firstName + lastName + "@" + emailType + ".com";
	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String fName = scan.next();
		
		System.out.println("Please enter your last name: ");
		String flName = scan.next();
		
		System.out.println("Please enter your email type: ");
		String eType = scan.next();
		
		Homework1 hw = new Homework1();
		String fullEmail = hw.createEmail(fName, flName, eType);
		System.out.println("The full email is " + fullEmail);
		
	

		
		
		
		
		
		
		
		
		
	}

}
