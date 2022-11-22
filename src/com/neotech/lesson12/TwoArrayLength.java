package com.neotech.lesson12;

public class TwoArrayLength {

	public static void main(String[] args) {
		
			String [][] months = {
					{ "December", "January", "February"},//row 0
					{"March", "April", "May"},//row 1
					{"June", "July", "August"},//row 2
					{"September", "October", "Novemver"}// row3
		};
			//System.out.println(months.length);
			
			int rowCount = months.length;
			System.out.println("There are a total of " + rowCount + " rows");
		
			int lengthOfRowIndex1 = months[1].length;
			System.out.println("row index 1 has " + lengthOfRowIndex1 + " columns");
			
}
		

	}


