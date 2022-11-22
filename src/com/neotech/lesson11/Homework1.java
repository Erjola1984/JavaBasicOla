package com.neotech.lesson11;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		
		for(int i = 1; i <= num; i++)//as many rows as the number user enters
		{
			//when i = 1; there are 0 spaces
			//when i = 2; there 1 space
			for(int j = 1; j <= i; j++)//this is for columns, be careful of new lines
			{
				System.out.print("-");
			}
			
			//what about stars
			//when i = 1 we have 2 * 5 - 1
			//when i = 2 we have 2 * 4 - 1
			//when i = 3 we have 2 * 3 -1
			
			for(int k = 1; k <= 2*(num - i) + 1; k++)
				
			{
				System.out.print("-");
			}
				
			System.out.println();
			
			
			
			
			
			
		}
	}

}
