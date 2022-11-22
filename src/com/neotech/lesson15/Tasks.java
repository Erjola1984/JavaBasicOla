package com.neotech.lesson15;

public class Tasks {
	
	// method1: Create a method that will take 2 parameters as numbers
	//and prints which number is larger.
	
  //method2: Create a method that will take a number and prints whether
	//the number is even or odd.
			
	    //method3: Create a method that will say Hello in a different language
		//based on the country that will passed when method is executed.

	//minimalist method;
	//1.return type (void)
	//2.in this case 2 int parameters
	//3.name
			
void larger(int a, int b)
{
	if(a > b)
		System.out.println(a + " is larger than " + b);
	{
	if (b > a)	
	{
		System.out.println(b + " is larger than " + a);
	}
	if ( a == b)
		System.out.println("They are equals!");
	}
}

void evenOrOdd (int num)
{
	if (num % 2 == 0)
	{
		System.out.println(num + " is odd");
	}
	else {
		System.out.println();
	}
		
}

void sayHello(String country)
{
	switch (country)
	{
	case "Us":
	System.out.println("Hello");
	break;
	case "Albania":
	System.out.println("Pershendetje");
	break;
	case "Italy":
		System.out.println("Bella Ciao");
		
	}
}



	public static void main(String[] args) {
		
		Tasks t = new Tasks();
		t.larger(3,4);
		t.evenOrOdd(7);
		t.sayHello("Albania");
	
	}

}
