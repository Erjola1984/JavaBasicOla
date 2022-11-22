package com.neotech.review04;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Pershendetje";
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str);
		
		boolean equal = str.equals("pershendetje");
		System.out.println(equal);
		
		System.out.println(str.equalsIgnoreCase("pershendetje"));
		
		System.out.println("+++++++++++++++++++++++++++=");
		
		System.out.println(str.contains("SH"));
		
		System.out.println("SH".toLowerCase());
		
		System.out.println(str.contains("SH".toLowerCase()));
		
		boolean starts = str.startsWith("p");
		System.out.println(starts);
		
		System.out.println("Does Pershendetje start with Per?");
		System.out.println(str.startsWith("Per"));
		
		
		
		
	}

}
