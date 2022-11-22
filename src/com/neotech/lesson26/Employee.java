package com.neotech.lesson26;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	
	//we define getters and setters
	//I want to provide a method that allows users
	//of this class to get the Name.
	//Getter: has a return type.
	
	public String getName() 
	{
		return name;
	}
	
	//I want to provide a method that allows user of this
	//class to set the Name.
	//Setter: no return but needs argument
	
	public void setName(String name)
	{
		if(!name.isEmpty() && name.length() >= 3)
	{
			
			this.name = name;
	}

	}
	//getter for age
	
	public int getAge()
	{
		return age;
	}
	
	
}
