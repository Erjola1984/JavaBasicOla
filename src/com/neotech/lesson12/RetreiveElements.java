package com.neotech.lesson12;

public class RetreiveElements {

	public static void main(String[] args) {
		char[] grades = {'A', 'B', 'C', 'D', 'F' };
		
		//loop through the grades array
		
		for (int i = 0; i <grades.length; i++) {
			System.out.print(grades[i] + ", ");
				
		}
	    System.out.println();
	    
	    // 2nd way: enhanced loop/ advanced for loop/ for each loop
	    
	    for(char grade: grades) {
	    	
	    	System.out.print(grade + ", ");
	    }
	    System.out.println();
	    
	    
	    String[] fruits = {"Apple", "Orange", "Pear", "Peach", "Kiwi", "Watermelon"};
	    for(int i = 0; i < fruits.length; i++) {
	    
	    System.out.print(fruits[i] + ", ");
	    //lets print our favorite fruit
	    if(fruits[i].equals("Apple")) {
	    	System.out.println(fruits[i] + " is my fav fruit");
	    } else {
	    	System.out.println(fruits[i]);
	    	
	    }
	    
	    System.out.println("-------------------------");
	    
	    // lets do 2nd way: for-each loop
	    for(String fruit : fruits) {
	    	if(fruit.equals("Watermelon")) {
	    		System.out.println(fruit + "is my fav fruit");
	    	}else {
	    		

	    	}
	    }
	    
	    
	    
	    }	    
}
}