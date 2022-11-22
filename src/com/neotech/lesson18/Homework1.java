package com.neotech.lesson18;

public class Homework1 {

	public static void main(String[] args) {
		
		String str = "Sunday";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			System.out.print(c);
			
		}
		System.out.println();
		
		// 2nd using toCharArray
		
		char[] charArray = str.toCharArray();
		for (int i = str.length() - 1; i >= 0; i-- ) {
			char c = charArray[i];
			System.out.println(c);
			
		}
		System.out.println();
		
		//3rd way, using reverse() method of StringBuffer.
		
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.reverse();
		System.out.print(strBuffer);
		
		//4rth method, StringBuilder
		
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.reverse();
		System.out.print(strBuilder);
		
		//String immutible, calling the toUpperCase() method
		 str.toUpperCase();
		 System.out.println(str);
		 
		 String strUpper = str.toUpperCase();
		System.out.println(strUpper);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
