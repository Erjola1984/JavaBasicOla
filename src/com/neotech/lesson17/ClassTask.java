package com.neotech.lesson17;

public class ClassTask {

	public static void main(String[] args) {
		// You have a String a = "Is it saturday? Is it raining? Do we have
		//a Java Class today?" How would you find out how many
		//sentences are in that String?

		//If you find this easy: 
		//"Is it saturday! Is it raining? Do we have
		//a Java Class today."
		
		//" \ ? n t; they have a special meaning in java === use this way  \\ :
		//
		
		
		String  sentence = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array = sentence.split("\\?");
		System.out.println("Array length is " + array.length);
		
		String s2 = sentence.replaceAll("[?]", "+");
		System.out.println(s2);
		
		//"Is it saturday! Is it raining? Do we have a Java Class today."
		
		String sentence2 = "Is it saturday! Is it raining? Do we have a Java Class today.";
		String [] array2 = sentence2.split("[!?.]");
		for (String str : array2)
		{
			System.out.print(str);
		}
		
		
	}
}
