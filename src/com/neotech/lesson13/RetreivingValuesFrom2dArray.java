package com.neotech.lesson13;

public class RetreivingValuesFrom2dArray {

	public static void main(String[] args) {
		
		String[][] months = {
				{"December", "January", "February"},
				{"March",    "April",    "May"},
				{"June",      "July",    "August"},
				{"Sept",      "Oct",     "Nov"},
		};
		//this shows us how many rows we have
		int rows = months.length;
		//this shows us how many columns we have in row 2
		int cols = months[1].length;
		
		System.out.println("NUmber of rows are " + rows + "and number of col for the 2nd "
				+ "el is " +  cols);
		for(int row = 0; row < rows; row++) //month [0] = dec, jan, feb
		{
			for ( int col = 0; col < cols; col++)
			
			{
				System.out.println(months[rows][cols] + " ");
			}
		System.out.println();
		
		
		int[] [] numbers = {
				{3,4,6},
				{5,7,3,2,6,8,4,2},
				{8},
		};
		int row_size = numbers.length;
		int col_size = numbers.length;
		
		for(int r = 0; r < numbers.length; r++)
		{
			for (int col = 0; col < numbers[r].length; col++)
			{
				System.out.println(numbers[r][col] + " ");
			}
		
		}
			
		}
	}
	

}
