package com.neotech.lesson24;

public class CreditCard {
	
	  //Homework 1:
	  //  ▪ Create a class CreditCard and define two variables, balance and interest.
	  //   ▪ Create an instance method that will calculate the interest based on the given balance.
	 // ▪ Create 2 subclasses: Visa and AX. In AX class override the method calculate interest.
	 //  ▪ Call the method by creating an object of each of the three classes.

	int balance;
	int interest;
	
	
		public CreditCard(double balance2) {
		// TODO Auto-generated constructor stub
	}


		void calculateInterest(int balance, int interest)
		{
			System.out.println("The interest is: " +  balance *  interest);
		}
		}

 class Visa extends CreditCard {
	 
	 void calculateVisaInterest()
	 {
		 System.out.println();
	 }
	
 	 }
 
 class AX extends CreditCard 
 {
	 int time;
	 void calculateAXInterest (int balance, int interest, int time)
	 {
		 System.out.println("The interest is: " + balance *  interest * time);
		}
	 }
	 
 
 
