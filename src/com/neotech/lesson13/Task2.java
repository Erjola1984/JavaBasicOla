package com.neotech.lesson13;

public class Task2 {

	public static void main(String[] args) {
		//Create a 2D array or integer type where you will store odd and even numbers in 3
		//rows and 4 columns. Develop a program which will identify/print the even
	   //	numbers only.
		
		
		int[][] N= {
			
			{ 2, 5, 7, 8},
			{ 1,4, 3},
			{0, 9, 6, 11},
			
		};

		//using indexed for loop
				for(int row = 0; row < N.length; row++)//0, 1, 2
				{
					for(int col1 = 0; col1 < N[row].length; col1++)//0, 1, 2, 3
						if(N[row][col1] %2 == 0)
					{
						//how do we access the elements --->   N[row][col1]
						//check if number is even before printing
						
							System.out.print(N[row][col1] + " ");
	}	
		
	System.out.println();
	System.out.println("++++++++++++++++++++++++++++");
	
	int[][] A = {
			{1, 3, 6, 8},
			{4, 7, 2, 10, 11},
			{5, 9,14},
					
	};
	
	for(int row1 = 0; row1 < N.length; row1++)
		
	{
		for(int col = 0; col < A[row1].length; col++)
			
			if (A[row1][col] % 2 == 0)
			
			{
				System.out.print(A[row1][col] + " ");
			}
		}
		
	}
		
	
			
			
		}	
		}
	


