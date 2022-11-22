package com.neotech.lesson14;

public class Shelter {

	
		
	String name, bark, breed, color, breeds;
	int age;
		void eat() {
			System.out.println(name + " eats!");
		}
		
		void run() {
			System.out.println(name + " runs!");
		}
		
		void bark() {
			System.out.println(name + " barks loud");
		}
		
		public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.breed = "Bulldog";
		dog1.size = "big";
		dog1.color = "white";
		dog1.age = 5;
		
		dog1.eat();
		dog1.run();
		dog1.bark();
		
		
		Dog dog2 = new Dog();
		dog2.breed = "Bulldog";
		dog2.size = "small";
		dog2.color = "black";
		dog2.age = 4;
		
		dog2.eat();
		dog2.run();
		dog2.bark();
		
		Dog dog3 = new Dog();
		dog3.breed = "Pitbull";
		dog3.size = "Medium";
		dog3.color = "Brown";
		dog3.age = 10;
		
		dog3.eat();
		dog3.run();
		dog3.bark();
		
		
	}

}
