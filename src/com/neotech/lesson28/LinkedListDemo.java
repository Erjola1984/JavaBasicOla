package com.neotech.lesson28;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//ArrayList<String> al = new LinkedList<>();
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("ERjola");
		ll.add("Alex");
		ll.add(0, "Dardan");
		ll.addFirst("Murad");
		
		System.out.println(ll);
		
		System.out.println("The size of the linkedList is: " + ll.size());
		
		//getting elements form the linked list
		//for loop
		
		for(int i = 0; i < ll.size(); i++)
		{
			System.out.println(ll.get(i) + " ");
		}
		
		System.out.println("--------------");
		
		for (String person : ll) {
			System.out.println();
		}
		
		while 
		{
			
		}
		
		
	}
	

}
