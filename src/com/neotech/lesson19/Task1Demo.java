package com.neotech.lesson19;

public class Task1Demo {

	public static void main(String[] args) {
		// can we access it by class name?- nooo
		
		Task1 obj = new Task1();
		int [] arr = {22, 33, 44, 55};
		
		//obj.sum(arr);
		
		int sum = obj.sum(arr);
		
		System.out.println("the total sum of the array is: " + sum);
	}

}
