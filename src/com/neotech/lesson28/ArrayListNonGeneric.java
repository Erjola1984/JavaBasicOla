package com.neotech.lesson28;

import java.util.ArrayList;

public class ArrayListNonGeneric {

	public static void main(String[] args) {
	
		//Generic Arraylist
		
		ArrayList<Double> al = new ArrayList();
		
		al.add(2.5);
		al.add(4.7);
		//al.add(100); CE. this is not convertet automatically
		//al.add("five"); CE
		
		System.out.println(al);
		
		//replacing items in the ArrayList

		al.set(1, 10.2);
		//it the index is larger than the size of the arraylist, then you will get 
		//an IndexOutOfBoundsExeptionsa
		
		System.out.println(al);
		
		//how we remove an element??
		al.remove(0);
		System.out.println(al);
		
		
		//get an element at the index o
		
		System.out.println(al.get(0));
		
		//for loop
		
		for(int i = 0; i < al.size(); i++)
			//arr[i]
			
		System.out.println(al.get(i) + " ");	
		
		//for each loop
		//java automatically does auto boxing so we can use Double or double
		for (double d : al )
			System.out.println(d + " ");
			
		System.out.println("----------------------");	
			
		//non generic ArrayList
		
		ArrayList al2 = new ArrayList();
		 al2.add(100);
		 al2.add("hello");
		 al2.add('A');
		 al2.add(al);
		 
		System.out.println(al2); 
		 
		 //retrieving all el form non generic ArrayList
		for(Object obj : al2)
		{
			System.out.println(obj);
		}
			
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
			
			
			
			
			
			
			
		
		
		
		
		
		
	}
	

}
