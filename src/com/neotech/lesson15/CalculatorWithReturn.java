package com.neotech.lesson15;

public class CalculatorWithReturn {
	// add 2 numbers:
	
	int add(int a, int b)
	{
		int sum = a + b;
	//add the numbers and turn the sum back(don't print)
		return sum;
	}
	//we are writing a multiply method which
	//takes 2 numbers as parameters and returns their products
	
	int multiply(int a, int b)
	{
		int multiply = a * b;
		return a * b;
	}
	
	double divide(double a, double b)
	{
		double res = a/b;
		return res;
	}
	  int giveBackSmth()
	  {
		  return 5;
	  }
	void dontGiveBackAnything()
	{
		System.out.println("Nothing is send back!");
	}
	// create a method that get the average
	
	double average(double a, double b, double c)
	{
		double res5 = (a + b + c)/3;
				return res5;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
	}

}