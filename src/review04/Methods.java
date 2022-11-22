package com.neotech.review04;

public class Methods {
	
	void sayWelcome() {
		for (int i = 1; i <= 5; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}
		
	void sayWelcomeWithNumber(int n) {
		for (int i = 1; i <= n; n++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}
	
	void sayGreeting(String greeting) {
		for(int i = 1; i <= 5; i++) {
			System.out.println(greeting + " ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		Methods m = new Methods();
		m.sayWelcome();
		m.sayWelcomeWithNumber(3);
		m.sayGreeting("Hola");
		m.sayGreeting("Laskavo");
		
	}
	
}
