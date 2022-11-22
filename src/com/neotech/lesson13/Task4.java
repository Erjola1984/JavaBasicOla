package com.neotech.lesson13;

public class Task4 {

	public static void main(String[] args) {
		
		String[][] cars = {
				{"ford", "Tesla", "Chevy"},
				{"MB", "BMW", "AUDI"},
				{"KIA", "Hyundai"},
				{"Fiat", "Lambo", ":Ferrari"},
		};

		//index for loop
		
		for(int row = 0; row < cars.length; row++)
		{
			for (int col = 0; col < cars[row].length; col++);
			{
				//System.out.print(cars [row][col] + " ");
			}
			
			System.out.println();
			
		}
	// using for each
		
		for (String[]row : cars)
		{
			for (String car : row)
			{
				System.out.print(car + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
