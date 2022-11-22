package com.neotech.lesson24;

public class FinalKeyword {
	
	public static String str = "Hello";
	
	//Final variable = Constant! can not be re-assigned
	public static final String str2 = "Bye";
	
	public final double PI = 3.1415926;//PI will always have this value.
	
	public static void main(String[] args) {
		str = "Hi";//we can change it because it is not final
		//str2 = "Try me"; - CE = compile error, we put 'Final" in the beginning
		
		//local variable
		final String finalStr = "Java is easy";
		//final Str = "Java is difficult"; ;;can not change, it is final
		
		final int age = 28;
		//after one year
		//age = 29; it is final
		
	}
	//final method can noot be overridden
	public final void hello() {
		System.out.println("Hello, I am final method.");
	}
	//yes, we can overload a final method
	public final void hello (String name) {
		System.out.println("Hello " + name);
		
	}
	
}
class SubClass extends FinalKeyword {
	//lets override the first hello method
	
	//@Override
	//public void hello() { --> CE ; can not override a final method
		
	//not overriding! Method signature is different; just another method
	public void hello (int number) {
		
	}
}