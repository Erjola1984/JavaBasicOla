package com.neotech.lesson19;

public class Task1 {
	//create a method that will accept an array as a parameter and will return a sum of all elements from
	//that array. Method should be visible only within the same package and accessible 
	//by the creating an instance of the class
	
	
	//method:
	//return type (output) : int (the sum)
	//parameters (input): int[] (array of integers)
	//access modifiers: default
	//static method? : No, we have to create an instance
	
	public int sum(int [] arr)
	{
		int sum = 0;
		
		//indexed for loop
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		//using enhanced for loop
		for (int el: arr)
		sum += el;	
		
		return sum;
	}
	
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
