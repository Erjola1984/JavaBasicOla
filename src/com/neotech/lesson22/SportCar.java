package com.neotech.lesson22;

public class SportCar extends Car {

	int seats;
	
	SportCar ()
	
	{
		System.out.println("SportCar Default Constractor");
	}
	
	SportCar(String make, String model, int Seats)
	
	{
		super (make, model);//calling the superclass constructor that has a signature
		this.seats = seats;
	}

	void  driving()
	{
		System.out.println("Sports cars have 2 seats!!");
	}
	
	void drifting()
	{
		System.out.println("Sports cars can drift!");
	}
	
}

class LuxurySportCar extends SportCar {
	
	int speed;
	
	LuxurySportCar()
	{
		System.out.println("LuxurySportsCar Default Constructor");
	}
	
	LuxurySportCar(String make, String model, int seats, int speed)
	{
		super(make, model, seats);
		this.speed = speed;
	}
	
	
	void driving()
	{
		System.out.println("LuxurySportCars drive faster");
	}
	
	void racing()
	{
		System.out.println("LuxurySportCars are good for racing");
	}
		
	}
	

