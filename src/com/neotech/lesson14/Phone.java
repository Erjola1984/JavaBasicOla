package com.neotech.lesson14;


public class Phone {
	
	String brand;
	String color;
	String model;
	int price;

	void text ()
	{
		System.out.println(brand + " is texting!");
	}
	
	void navigate()
	{
		System.out.println(brand + " is navigating!");
	}
	
	void sharing()
	{
		System.out.println(brand + " is sharing information!");
	}
	
	
	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		
		iphone.brand = "Apple";
		iphone.color = "Red";
		iphone.model = "14 Pro";
		iphone.price = 2000;
		
		iphone.text();
		iphone.navigate();
		iphone.sharing();
		
		Phone android = new Phone();
		
		android.brand = "Samsung";
		android.color = "blue";
		android.model = "Note 4";
		android.price = 1590;
		
		android.text();
		android.navigate();
		android.sharing();
		
		Phone nokia = new Phone();
		
		nokia.brand = "Nokia";
		nokia.color = "Blue";
		nokia.price = 30;	
		
		nokia.text();
		nokia.text();
		nokia.sharing();
		
	}
}
