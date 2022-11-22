package com.neotech.lesson19;

public class Task2 {

	
		//create a method that will take String as a parameter and returns a reversed String.
		//Method should be available to all classes within your project
		//and accessible by class name.
		
		//method
		//input (parameter) : String
		//access modifier : public
		//is it static? Yes, accessible by class name
		//internal logic : reverse the string
		
		
	public static String reverse (String str) 
	{	
		//many ways how we can do this
		//first way
			String reversed = "";
		for (int i = 0; i <= str.length() - 1; i++ )	
		{
			reversed += str.charAt(i);
		}
		
			//return the reversed string
			return reversed;
			
	}
		
			//we learned strings are immutable. so creating the string all the time 
			//is not very optimal. so we can use mutable string
			//StringBuffer or String builder; second way
	
	public static StringBuffer reverse2 (String str)
	
	{
		StringBuffer sb = new StringBuffer(str);
		
		return sb.reverse();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
		
	}


