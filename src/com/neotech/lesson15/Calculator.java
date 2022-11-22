package com.neotech.lesson15;

public class Calculator {

	// we want to add 2 numbers
	
	void add(int a, int b)
	{
		int sum = a + b;
		System.out.println(sum);
	}
	
	//multiply 2 numbers
	void multiply(int a, int b)
	{
		System.out.println(a*b);
	}
	
	//division
	void division(double a, double b)
	{
		System.out.println("the divison of " + a + " by " + b + " is " + (a/b));
	}
	
	
	
	
	public static void main(String[] args) {
		

	}

}
