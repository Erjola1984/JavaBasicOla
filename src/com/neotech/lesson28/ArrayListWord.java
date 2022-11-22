package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

import javax.lang.model.element.Element;

public class ArrayListWord {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		
		words.add("morning");
		words.add("afternoon");
		words.add("aware");
		words.add("evening");
		words.add("care");
		
		words.addAll(words);
		Iterator <String> it = words.iterator();
		
		System.out.println(it.next());
		
		while(it.hasNext()) {
			Object lastLetter = 'e';
			if(lastLetter.equals('e') )
			{
				it.remove();
				it.next();

		
			}
		}
		
	}
}
		

	
		
		
		
		
		
		
		
		
		
		
