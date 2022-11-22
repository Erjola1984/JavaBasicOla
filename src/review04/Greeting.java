package com.neotech.review04;

public class Greeting {
	// Task until 1:30
	// Create a method sayGreetingWithNumber that accepts 
	// the greeting and how many times it should be printed
	
	
	void sayGreetingWithNumber (String greeting, int n) {
		for(int i = 1; i <= n; i++) {
			System.out.println(greeting + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Methods m =new Methods();
		m.sayGreetingWithNumber("Pershendetje", 5);
		
		
	}
}
