package com.neotech.lesson13;

public class LargestElement {

	public static void main(String[] args) {
		// find the largest number in an array
		
		int[] numbers = { 45, 34, 87, -33, 15, 92, -13, 55 };
		
		
		//int largest = -99999
		
		int largest = numbers[0];
		
		for(int i = 1;i < numbers.length; i++)
		
		{
			//compare the current largest number with the new
			//that the loop gives us
			
			if(largest < numbers[i]) {
				
				largest = numbers[i];
				
		}
		
			System.out.println();	
		}
		System.out.println("The largest number is : " + largest);
		
		
		
	}

}
