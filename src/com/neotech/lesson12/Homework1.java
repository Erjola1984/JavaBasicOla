package com.neotech.lesson12;

public class Homework1 {

	public static void main(String[] args) {
//		1. Create a 2D array where you will store the following values:
//			- Mr, Mrs, Ms, Miss//row
//			-Smith, Jordan, Jackson, Obama.
//
//			After storing values print the following:
//			Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
//
//			* Be careful because they are mixed.
//
//
//		2. Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
//			Then you program should print name of the students that has A and B grade

				//Ex nr.1
		
		String [][] words = {
			{"Mr", "Mrs", "Ms", "Miss"},
			{"Smith", "Jordan", "Jackson", "Obama"},
		};
		System.out.println(words[0][1] + " " + words[1][0]);//Mrs Smith
		System.out.println(words[0][0] + " " + words[1][3]);//Mr Obama
		System.out.println(words[0][2] + " " + words[1][2]);//Ms Jackson
		System.out.println(words[0][3] + " " + words[1][1]);//Miss Jordan

	
	System.out.println(" +++++++++++++++++++++++++++++++++++ ");
	
	String names [][]= {
			{"Hera", "Inva Vlora", "Dajna", "Ola"}, 
			{"A", "B", "B", "C"},
		};
	
	System.out.println(names[0][0] + " " + names[1][0]);
	System.out.println(names[0][1] + " " + names[1][1]);
	System.out.println(names[0][2] + " " + names[1][2]);

	System.out.println(" +++++++++++++++++++++++++++++++++++ ");
	
	String[][]students = {
			{"Elmira", "Mustafa", "Dardan", "Oktay" },//row 0
			{"A",       "B",        "C",     "B"}, };//row1
	
	 for (int i = 0; i < students[1].length; i++)
	 {
		 if(students[1][i].equals("A") || students[1][i].equals("B"))
		 {
			 System.out.println(students[0][i] + " " + students[1][i]);
		 }
	 }
		 
		 
	
	}
	
	

}
