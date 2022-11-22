package com.neotech.lesson22;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car("Toyota", "Camrey" );
		c.driving();
		
		FamilyCar fc = new FamilyCar();
		fc.driving();
		fc.traveling();
		
		SportCar sc = new SportCar("BMW", "M3", 2);
		sc.driving();
		sc.drifting();
		
		LuxurySportCar lsc = new LuxurySportCar("Lambo", "Mercilago", 250, 0);
		lsc.driving();
		lsc.racing();

	}

}