package com.neotech.lesson24;

public class OverloadingMainMethod {
	
		// - overloading = same methods name different signatures, in the same class
		
	
	private static void main (String arg1, String arg2)
	{
		System.out.println("Main method with two string parameters.");
		}
	private void main(int arg1, int arg2) 
	{
		System.out.println("Main method with two integers parameters.");
	}
	
	public static void main (int[]array)
	{
		System.out.println("The main method with integer array.");
	}
	
	public static void main (String[] jenn)
	{
		//java looks for a main method signature
		System.out.println("Main method with string array parameters.");
		
		//do i need a class name to call the methods? - no
		main("Hi", "Bye");
		int[] intArray = { 1, 2, 3, 4 };
	
		
		main(intArray);
	}
			 	
	
}


