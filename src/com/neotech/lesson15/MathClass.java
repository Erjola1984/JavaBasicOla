package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		System.out.println("Adition");
		cal.add(6, 5);
		cal.add(10, 1);
		cal.add(16, 55);
		
		
		System.out.println("Multiply");
		cal.multiply(6, 5);
		cal.multiply(10, 1);
		
		
		System.out.println("Division");
		cal.division(60, 5);
		cal.division(100, 3);
		cal.division(3.5, 1.2);
		//cal.division(3.5,0) the most common issue when divide.
		
		System.out.println("Adition");
		cal.add(4, 100);
	
		System.out.println("Multiply");
		cal.multiply(33, 2);
		
		
		
	}

}
