package com.neotech.lesson23;

public class Shape {

	int radius;
	
	 public Shape(int radius)
	 {
		 this.radius = radius;
	 }
	 
	}
	 class Circle extends Shape 
	 
	 {
	  
		Circle (int radius) 
		
	{
	  super(radius);
	  
	}
	 
	 void calculateArea()
	 {
		 System.out.println("The are of the circle is " + 3* radius* radius);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
