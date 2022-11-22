package com.neotech.lesson15;

public class TestCalculatorWithReturn {

	public static void main(String[] args) {
	CalculatorWithReturn obj = new CalculatorWithReturn();	
	
	int res = obj.add(6, 4);
	System.out.println(res);
		
	int res2 = obj.add(5, 3);	
	System.out.println(res2);
		
	int res3 = obj.multiply(3, 3);	
	System.out.println(res3);
	
	//we are printing the result directly
	System.out.println(obj.multiply(6, 2));
		
		obj.giveBackSmth();
		obj.dontGiveBackAnything();
		
	double res4 = obj.divide(4.5, 1.5);	
		System.out.println(res4);
		
	double avg = obj.average(4, 6, 5);
	}

}
