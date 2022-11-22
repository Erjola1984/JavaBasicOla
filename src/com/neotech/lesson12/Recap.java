package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {
		// lets create a basic integer array
		
		int[] grades = new int[5];
		
		//lets print the size of this array;
		System.out.println("The size of the array is: " + grades.length);
		
		//element with index #2;
		System.out.println("The third element of the array is: " + grades[2]);
		
		grades[3] = 85;
		grades[1] = 90;
		//error: index 5 doesn't exist.
		//grades[5] = 100;
		//error: can't assign a string;
		//grades[2] = "hello";
		
		grades[2] = 100;
		grades[0] = 93;
		grades[4] = 78;
		
		//reassign the value of an element
		grades[4] = 98;
		
		int size = grades.length;
		
		System.out.println("The size of the array after assigning the value is " + size);
		//element with index #2;
		System.out.println("The third element of the array is: " + grades[2]);
		
			//lets find the total
		
		int total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
			System.out.println("The total is: " + total);	
			
			//find the average of array
			
			int average = total/5;
			
			System.out.println("The average is " + average);
			
			System.out.println("----------------------------");
			
			// 2nd wayLets find the total using for loop:
			
			int sum = 0;
			for (int i = 0; 0 < 5; i++) {
				 sum+= grades[i]; //sum = sum + grades
				 System.out.println("The total is: " + sum);
				 
			int avg = sum/ grades.length;
			System.out.println("The average is " + avg);
			
			System.out.println("------------------------");
			
			String[] cities = {"Paris", "New York", "London", "Istanbul", "Tokyo", "Dushanmbe"};
			
			System.out.println(cities[3]);
			
			System.out.println("The size of my string array is " + cities.length);
			
			//lets print the names of the cities on the screen
			for(int b = 0; b< cities.length; b++) {
			System.out.println(cities[b]);
			
			
			
			}
	}

	}
}
