package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> choco = new ArrayList<>();
		
		choco.add("Kinder");
		choco.add("Albeni");
		choco.add("Godiva");
		choco.add("Ferrero");
		choco.add("Toblerone");
		
		ArrayList<String>sweets = new ArrayList<>();
		
		sweets.add("Baklava");
		sweets.add("Tiramisu");
		sweets.add("Ice cream");
		sweets.add("Tres Leches");
		
		//add all elements of choco on the sweet ArrayList
		
		sweets.addAll(choco);
		System.out.println("the size of sweets is:" + sweets.size());
		System.out.println(sweets);

		//iterator
		//we can loop on the list with
		//for loops(indexed or for each)
		//while
		//do while
		
		//iterator for string objects -- to iterate the obj of sweets Arrayloop
		Iterator<String> it = sweets.iterator();
		
		System.out.println(it.next());
		
		while (it.hasNext()) //it.hasNext() checks if there is any other element next
 		{
			String element = it.next(); //gives as the next element
			String element2 = it.next();
			
			if (element.equals("Albeni"))
			{
				it.remove();
			}
			System.out.println(element + " - ");
		}
		
		System.out.println();
		
		System.out.println(sweets);
		for(String str : sweets)
		{
			System.out.println(str + " ");
		}
		System.out.println();
		
		//normal for loop
		//if you want to iterate backwards
		
		for (int i = sweets.size()-1; i > 0; i++ )
		{
			System.out.println(sweets.get(i) + " ");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
