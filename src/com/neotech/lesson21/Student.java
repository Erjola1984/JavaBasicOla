package com.neotech.lesson21;

public class Student {
	//write a program as a Students class
	//that has instance variables name and address
	//create a constructor that will initialize those variables
	//print name and the address of given student using displayInfo method
	
	//instance variables
	String name, address;
	
	//constructor method for initialization
	
	public Student ()
	{
		
	}
	
	public Student(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
    //3rd constructor method
	
	public Student(String name)
	
	{
		this.name = name;
		this.address = address;
		
	}
	
	
	
	
	
	
	public void displayInfo()
	{
		String name = "Erjola";
		System.out.println("Name: " + name);
		System.out.println("Name : " + this.name + " Address: " + this.address );
	}
	
	
}
