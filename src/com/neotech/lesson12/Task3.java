package com.neotech.lesson12;

public class Task3 {

	public static void main(String[] args) {
		// 
		
		String[] countries = {"Turkey", "Usa", "Albania" };
		// using for loop
		
		for (int i = 0; i < countries.length; i++) {
			
			String country = countries[i];
			if(country.equals("Turqey")) {
				System.out.println("Ankara");
			}else if (country.equals("Usa")) {
				System.out.println("Washington DC");
			}else if (country.equals("Albania")) {
				System.out.println("Tirana");
			}else {
				System.out.println("No country");
			}
		}
			System.out.println("-------------------");
			
			//using for-each loop
			
			for (String country : countries) {
				if (country.equals("Turkey")) {
					System.out.println("Ankara");
				}else if (country.equals("Usa")) {
					System.out.println("Washington DC");
				}else if (country.equals("Albania")) {
					System.out.println("Tirana");
				}else {
					System.out.println("No country");
				}
			}
				
			}
		}
		

	


