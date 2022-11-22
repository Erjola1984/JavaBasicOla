package com.neotech.lesson11;

public class IntroToArrays {

	public static void main(String[] args) {
		
		//1st way
		//data type identifier assignment op    value
		int  num  =  5 ;
		
		int num2;
		//2nd way
		//initializie
		num2 = 5;
		
		
		
		//1st way
		int[] array1 = new int[5];
		
		//2nd way
		int[] array2;
		array2 = new int[8];
		
		//array1; [10] [15] [ ] [ ] [ ]
		
		//How do we store values in array?
		
		array1[0] = 10;
		//array1; [15] [ ] [ ] [ ] [ ]
		array1[2] = 20;
		//array1; [15] [ ] [ ] [ ] [ ]
		array1[3] = 25;
		//array1; [15] [ ] [ ] [ ] [ ]
		
		
	//how do we access values:
		System.out.println(array1[2]);
		
		//string array
		String[] strArray = new String[4];//create a string array with 4 el
		
		strArray[0] = "New York";
		strArray[1] = "New jersey";
		strArray[2] = "Atlanta";
		strArray[3] = "Colorado";
		
		System.out.println("i live in " + strArray[0]);
		
		//strArray[4] = "Alabama"; //our bonds 0-3 and 4 is out of that
		
		char[] letters = new char[6];
		
		letters[3] = 'C';
		letters[5] = 'A';
		letters[0] = 'B';
		letters[1] = 'X';
		
		System.out.println("The letter ate index 4 is: " + letters[5]);
		
		letters[5] = 'Y';//reassigning
		
		System.out.println("The letter ate index 4 is: " + letters[5]);
		
		
		System.out.println(letters[4]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
