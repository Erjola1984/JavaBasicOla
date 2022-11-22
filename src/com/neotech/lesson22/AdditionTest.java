package com.neotech.lesson22;

public class AdditionTest {

	public static void main(String[] args) {
		
		Addition obj = new Addition();
		obj.add(5, 6);
		obj.add(10,15, 20);
		
		obj.add(2.5, 3.5);
		obj.add(5, 6, 2.5);

		obj.add(4, 5.5);
		
		obj.add(4, 5, 7, 9);
		
		
}
}