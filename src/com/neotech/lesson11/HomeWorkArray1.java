package com.neotech.lesson11;

public class HomeWorkArray1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements. Print all values 
		//from the array.
		
		
		String [] cars = new String[6];
		cars[0] = "GMC";
		cars[1] = "Benz";
		cars[2] = "Subaru";
		cars[3] = "Golf";
		cars[4] = "Kia";
		cars[5] = "Mazd";
		
		System.out.println(cars[0] + " " + cars[1] + " " + cars[2] + " " + 
		cars[3] + " " + cars[4] + " " + cars[5]);
		
		 
	System.out.println("--------------------------------------");
	
	// create an array on integers and calculate the sum of all elements in an array.
	

	
	int[]num1 = {10, 20, 30, 40, 50, 60};
	
	int sum = 0;
	
	for(int counter = 0; counter < num1.length; counter++) {
		
		sum += num1[counter];
		
		
		System.out.println("The sum of all the integers is: " + sum );
	}
	
	
	
	System.out.println("--------------------------------------");
	
	
	int[] ola = {100, 200, 300, 400, 500};
	int total = 0;
	
	for(int i = 0; i < ola.length; i++)
	total += ola[i];
	{
		System.out.println("The total of all the integers is: " + total);
	}
	
	}
	
	}
	
	
	
	
			
	


