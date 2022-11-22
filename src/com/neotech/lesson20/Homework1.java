package com.neotech.lesson20;

public class Homework1 {

	//create a method that will accept a String as a parameter and return a new String that consist 
	//only of vowels Method should be available inside the class where it is declared 
	//and executed by calling it is name.
	
	//method 
			//input (parameter) : String
			//output: String str
			//access modifier : default
			//is it static? Yes, accessible by class name
			//internal logic : return a new String, but only vowels.
			
	
	
	private static String getVowels(String str)
	{
		//regex: [a-f] range; [sndt] only thiese letters
		String result = str.replaceAll("[^aeiouAEIOU]", "");
		
		
		
		return result;
	}
	public static void main(String[] args) {
		
		System.out.println(getVowels("Today is a sunny day!"));
	}
	
	


}
