package com.neotech.lesson21;

public class Constructor {
	//1st
	Constructor()
	{
		this(5);
		//this(2,4); it is not allowed
	}

	//2nd
	Constructor (int x)
	{
		this(2,4);
		System.out.println("Hello 2nd constructor");
	}
	
	//3rd
	Constructor(int x, int y)
	{
		System.out.println("Hello 3nd constructor");
	}
	public static void main(String [] args)
	{
		//Constructor obj1 = new Constructor(3, 5);//3rd constructor
		//Constructor obj2 = new Constructor(4);
		Constructor obj3 = new Constructor();
	}
}
