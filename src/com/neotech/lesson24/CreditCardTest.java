package com.neotech.lesson24;


public class CreditCardTest {

	public static void main(String[] args) {
		
			CreditCard cc  = new CreditCard();
			
			cc.calculateInterest(500, 3);
			
			Visa v = new Visa();
			
			AX a = new AX();
			a.calculateAXInterest(200, 2, 3);
		}
	


	}


