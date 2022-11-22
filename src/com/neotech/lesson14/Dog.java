package com.neotech.lesson14;

public class Dog {
	
	   // Create a class Dog
	   //  features: breed, size, color and age
	   // behaviors: eat(), run(), breed()

		String size,breed, color;
		int age;
		
		void eat() {
			System.out.println(breed + " eats!");
		}
		
		void run() {
			System.out.println(breed + " runs!");
		}
		
		void bark() {
			System.out.println(breed + " barks loud");
		}
		
		public static void main(String[] args) {
		
	
		Dog dog = new Dog();
		dog.breed = "Hasky";
		dog.size = "big";
		dog.color = "white";
		dog.age = 4;
		
		dog.eat();
		dog.run();
		dog.bark();
		
		
		
	}

		public void sleep() {
			// TODO Auto-generated method stub
			
		}

		public void healthy() {
			// TODO Auto-generated method stub
			
		}
	
	
}
	
	


