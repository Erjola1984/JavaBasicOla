package com.neotech.lesson11;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		for (int i = 0; i <= num; i++)
		{
			
			for (int j = 0; j < 1; j++)
			{
				System.out.print(j + " ");
				
			}
			
		}	System.out.println();
		
		// will print the bottom patern
		//1 2 3 4
		//1 2 3
		//1 2
		//1
		
		for (int i =  num - 1; i >= 1; i--)
	
		{
			for(int j = i; j <= i; j++)
			
			{
				System.out.println(j + " ");
				
			}
			
			
			System.out.println();
		}
			
		
		
	}
	

}
