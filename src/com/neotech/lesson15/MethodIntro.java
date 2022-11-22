package com.neotech.lesson15;

public class MethodIntro {
	
	// does not return anything
	
	void greet()
	
	{//begin body method
		System.out.println("Ola");
		System.out.println("Hello Java");
			
	}//end body method
			
	void greet2(String name)		
	{
		System.out.println("Hello " + name);
		System.out.println("How are you?");
	}
			
	void greet3(String name1)
	{
		System.out.println("I love " + name1);
	}
			

	public static void main(String[] args) {
    //calling a method---> executing a method, running the code		
	MethodIntro obj = new MethodIntro();
	
	obj.greet();
	//obj.greet2("Emine");=>> we are passing a String
	obj.greet2("Emine");
	obj.greet2(" ");
	obj.greet2("Sunday I am off!");
	
	String name = "Ola";
	obj.greet2(name);
	
	String name1 = "Ilove the sun";
	obj.greet3("sunnydays");
	
	
	
	

	}

}
