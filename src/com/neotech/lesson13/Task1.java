package com.neotech.lesson13;

public class Task1 {

	public static void main(String[] args) {
		// create a 2d Array of integer type with 3 rows and 4 columns,
		//and print all values of the whole array
		
	int [][] numbers =  {
						{ 2, 4, 6, 8},
						{ 1, 3, 5, 7, 9, 11},
						{ 0, 10},
	};
	
	for (int row = 0; row < numbers.length; row++)
	{	
		for(int columns = 0; columns < numbers[row].length; columns++)	
			
		{
			if (numbers[row][columns] % 2 == 0)
			
			System.out.print(numbers[row][columns] + " ");
		}		
		
			System.out.println();
	}	
				
		
		
	}

}
