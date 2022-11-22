package com.neotech.lesson22;

public class Addition {
	
//method signature is very important when we print 
//or create method; they are	:
//return type    method name   parameters: int int int  
	
	
	void add (int a, int b)
	{
		System.out.println( a + b);
	}
	
	//method overloading by changing the number of the parameters
	void add(int a, int b, int c)
	{
		System.out.println(a + b + c);
	}
	
	//method overloading by changing the type of the parameters
	void add(double a, double b)
	{
		System.out.println(a + b);
		;
	}
	
	
	void add(int a, int b, double c)
	
	{
		System.out.println(a + b + c);
	}
	
	//changing both at the same time; number and type
	void add(int a, double b, int c, double d)
	
	{
		System.out.println(a + b + c + d);
	}
	
	void add(String s, int i)
	{
		System.out.println("we can not add them");
	}
	//method overloading by changing the order of the parameters
	void add (int i, String s)
	{
		System.out.println("we can not add them");
	}
	void add(int a, double b)
	{
		System.out.println(a + b);
	}
}
