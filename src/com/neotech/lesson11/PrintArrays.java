package com.neotech.lesson11;

public class PrintArrays {

	public static void main(String[] args) {
		
		int[] points = {90, 85, 95, 75, 93, 95, 100};
		//printing one by one .......
		
		
		System.out.println();
		
		int size = points.length;
		
		for (int i = 0; i < size; i++)
		{
			System.out.print(points[i] + " ");
		}
	}

}
