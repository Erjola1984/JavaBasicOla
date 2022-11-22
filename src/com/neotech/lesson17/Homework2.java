package com.neotech.lesson17;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String str = "Hello123456@#$%^%*";
		
		//[abc]
		//[a-c]
		//[^a-c]
	
		String str2 = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str2);
		
		System.out.println("How many alpha characters are there? " + str2.length());
		
		//how many nr are there?
		
		System.out.println(str.replaceAll("[^0-9]", "").length());
		
		//issues:
		
		String str3 = str.replaceAll("a-z", "-");//this is not a regular
	}

}
