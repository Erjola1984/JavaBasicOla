package com.neotech.lesson13;

public class RetrievingValuesUsingForEach {

	public static void main(String[] args) {
		
		String [][]animals = {
				{"cats", "dog", " bird"},
				{"lion", "tiger", "bear"},
				{"salmon", "seabass", "shrimp"},
		};	
				
				//how to get the rows's numbers
				int rows = animals.length;
				
				//how to get the number of columns for the first row
				
				int first_row_cols = animals[0].length;
				int second_row_cols = animals[1].length;
				int third_row_cols = animals[2].length;
				
				//how so we get a specific value; lion
				String lion = animals[1][1];
				
				//how do we print all values?
				for (int row = 0; row < animals.length; row++) //goes throught all rows
				{
					for (int col = 0; col < animals[row].length;col++ )
					{
						System.out.println(animals[row][col] + "'");
					}
					System.out.println();
					
				}
					
					System.out.println("Using a FOR NESTED LOOP");
				
				
				for (String[]row: animals) //	for each string array row of animals
				{
					
					for(String animal: row) // for each string in the current row
					{
						System.out.print(animal + " ");
					}
					System.out.println();
					
					//using for each in2d array:
					
					//first for loop:   (iD array : 2D array)
					//second nested loop:   string value:1D array
					
					//Nested
				//	for()
					//{
						//for()
					//	{
							
					//	}
				//	}
					
					
				int [][]grades = 	{
						{95, 78, 85},
						{100, 68, 89, 90},
						{75, 78},
						{55, 89, 76, 80, 50},
		};
					
			//2d array	
				
					for(int[]ro : grades)
					
					{
						for(int grade: ro)
						{
							System.out.println(grade + " ");
							
						}
						System.out.println();
					}
					
					
				}
				
	}

}
