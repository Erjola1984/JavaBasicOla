package com.neotech.lesson23;

public class ParentChildTest {
	
	public static void  main (String[] args) {
		
		Parent p = new Parent();
		//p.hello(); // can not access it's private
		p.by();
		
		Child c = new Child();
		//c.hello();
		c.by();
		
	}

}
