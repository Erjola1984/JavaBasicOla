package com.neotech.lesson26;

public  class Circle implements Shape {
	
	String area = "area";
	@Override
	public void calculateArea() {
		System.out.println("The Area of the circle is : " + area);
		
	}
	
	String perimeter = "perimeter";
	@Override
	public void calculatePerimeter() {
		System.out.println("The perimeter of the circle is : " + perimeter);
		
	}

	}

 class Square implements Shape {
	
	String area = "area";
	@Override
	public void calculateArea() {
		System.out.println("The Area of the square is : " + area);
		
	}
	String perimeter = "perimeter";
	@Override
	public void calculatePerimeter() {
		System.out.println("The perimeter of the square is : " + perimeter);
		
		
	}
}
