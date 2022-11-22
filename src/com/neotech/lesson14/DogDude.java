package com.neotech.lesson14;

public class DogDude {	
	public static void main(String[] args) {
	
			
		DogDude d1 = new DogDude();
		DogDude d2 = new DogDude();
		DogDude d3 = new DogDude();
		
		d1.age = 10;
		d1.color = "black";
		d1.size = "Small";
		d1.breed = "Bulldog";
		
		d1.run();
		d1.sleep();
		d1.bark();
		d1.healthy();
	
		d2.age = 15;
		d2.color = "white & black";
		d2.size = "Big";
		d2.breed = "Hasky";
		
		d2.run();
		d2.sleep();
		d2.bark();
		d2.healthy();
		
		d3.age = 7;
		d3.color = "brown";
		d3.size = "Medium";
		d3.breed = "Labrador";
		
		d3.run();
		d3.sleep();
		d3.bark();
		d3.healthy();	
	}

	String color, size, name, breed;
	int age;	
	
	 void healthy() {
		System.out.println(size + " " + breed  + " " + " is very healthy!!" );	
	}
	 void sleep() {
		 System.out.println(size + " " + breed  + " " + " does not like to sleep in the sun!" );	
			
	}
	void run() {
		System.out.println(size + " " + breed  + " " + " likes to run in the park!" );
	}
	void bark() {
		System.out.println(size + " " + breed  + " " + " is not  healthy!" );
	}
	
	}

	
		
	


