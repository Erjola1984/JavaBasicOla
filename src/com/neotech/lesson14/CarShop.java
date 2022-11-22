package com.neotech.lesson14;

public class CarShop {

	public static void main(String[] args) {
		//lets create some cars for our shop
		
		Cars car2 = new Cars();
		car2.make = "Toyota";
		car2.model = "Camry";
		car2.color = "Black";
		car2.year = 2019;
		car2.mileage = 25000;
		car2.maxSpeed = 200;
		
		System.out.println(car2.make + " " + car2.model + " " + car2.color + " " + 
		car2.year + " " + car2.mileage );
		
		car2.drive();
		car2.stop();
		car2.transportPeople();
		
		Cars car3 = new Cars();
	
	
	}

}
