package com.neotech.lesson26;

public class DoctorTest {

	public static void main(String[] args) {
		Doctor doc = new Doctor();
		doc.setlicenseID(123456789);
		
		System.out.println(doc.getlicenseID());
		
		//power of encapsulation
		doc.setEmail("");
		System.out.println(doc.getEmail());
		
		
		
		
		
		
		

	}

}
