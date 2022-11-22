package com.neotech.lesson23;

public class AnimalTest {

	public static void main(String[] args) {
	
		Animal obj1 = new Animal();
		obj1.eat();
		obj1.sleep();
		
		Tiger obj2 = new Tiger();
		obj2.eat();
		obj2.run();
		obj2.sleep();
	
		//primitive casting
		int i = 3;
		double d = i;
		
		
		
		
		//non primitive casting=> widening
		//this is a two part sentence
		// create a tiger object
		//assign it to animal object
		Animal obj3 = new Tiger();
		obj3.eat();
		obj3.sleep();
	   //obj3.run(); // 
		
		//in this case it offers all the methods that are available to
		//the animal but if there is a different implementation for the
		//tiger it will use that.
		
		///// we are casting a Tiger object, as an Animal object.
		////so, we see all methods that are in Animal class
		//but when we override a method in the tiger class, that takes priority on Runtime.
		
		// can we do down-casting?
		//Down casting is not done like this
		
	//	Tiger obj4 = new Animal(); we can't
		
		Tiger obj4 = (Tiger) obj3;
		obj4.run();
		
		//also we can do down-casting this way but it is not safe
		
		Tiger obj5 = (Tiger) new Animal();//but we can lose data.
		
				
	}

}
