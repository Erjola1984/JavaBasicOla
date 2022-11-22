package com.neotech.lesson22;

public class CalculatorTest {
	
	public static void main (String[] args ) {
		
	CalculateArea.area(5);	
	CalculateArea.area(6, 7);
	CalculateArea.area(5, 6, 7);
		
	//if these were instance methods we have 
	//to create an object
	
	CalculateArea ca = new CalculateArea();
	ca.area(5);
	ca.area(6, 7);
	ca.area(5, 6, 7);
	
	//instance method
	
	ca.area(5.5, 7.2);
	
		
	}

	
		
	}


