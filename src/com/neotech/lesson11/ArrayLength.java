package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {
		
		//arrays are collections of same type of data
		
		//String name = "Sabah";
		//String name2 = new String("Sabah");
		
		String[] students = new String[5];
		//default value for string is null
		
		students[0] = "Ola";
		students[1] = "Inva";
		students[2] = "Hera";
		students[3] = "Qamile";
		students[4] = "Avni";
		
		//HOW CAN WE GET THE LENGTH OF AN ARRAY?
		
		int arrayLength = students.length;
		System.out.println("The length of the students arrau: " + arrayLength);
		
		//another way how to declare an array:
		
		int[] scores = {90, 86, 94, 88, 80};
		
		System.out.println("The length of scores arrayis: " + scores.length);
		
		
		

	}

}
