package com.neotech.lesson20;

public class Student {
	
	//Write a java program of Class Students that takes students
	//name and 3 subject grades. Inside your class also have a
	//method to Calculate Average Grade. Test Student class for 5
	//different students with different marks. Your program should
	//print an average mark of each students name.
	
	
	String name;
	int math;
	int art; 
	int music;
	int avr;
	
	Student()
	{
		
	}
	
	Student(String name, int math, int art, int music)
	{
		avr = (math + art + music) / 3;
		
		System.out.println(name + " average = " + avr);
	}

	public static void main(String[] args) {
		
		Student st1 = new Student("Ola", 85, 95, 100);
		Student st2 = new Student("Inva Vlora", 80, 97, 100);
		Student st3 = new Student("Hera", 75, 65, 69);
		Student st4 = new Student("Qame", 55, 76, 100);
		
		
		
		
	}

}
