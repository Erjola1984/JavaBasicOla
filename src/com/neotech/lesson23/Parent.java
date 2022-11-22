package com.neotech.lesson23;

public class Parent {
	
	Parent()
	{
		System.out.println("Parent Class Constructor");
	}
	
	void hello()
	{
		System.out.println("Hello fromvParent Class ");
	}
	void by()
	{
		System.out.println("By from Parent Class ");
	}
	
	
}

class Child extends Parent
{
	Child(){
		
	}
	
	
	void hello()
		{
			System.out.println("Hello from Child class");
		}
	void by()
	{
		System.out.println("By from Child class");
	}
	//we are not overriding bcs we don't have access to private methods
	//static method from parent class
	
	
	
	
	
}