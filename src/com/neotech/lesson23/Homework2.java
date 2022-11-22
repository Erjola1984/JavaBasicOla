package com.neotech.lesson23;

public class Homework2 {
	
	
	static void info()
	{
		System.out.println("Today is Tuesday");
	}
	
	static void info(String day)
	
	{
		System.out.println("Today is " + day);
	}
	
	static void info(String day, String month)
	
	{
		System.out.println("Today is " + day + " and the month is " + month);
	}

	static void info(String [] strArr)
	{
		System.out.println("Today is " + strArr[0] +"  and the month is " + strArr[1]);
	}
	
	public static void main(String[] args) {
		info();
		info("Tuesday");
		info("Tuesday", "November");
		String[] strARR = {"Tuesday", "November"};
		info(strARR);

	}

}
