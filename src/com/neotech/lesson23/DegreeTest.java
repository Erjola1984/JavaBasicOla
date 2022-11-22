package com.neotech.lesson23;

public class DegreeTest {

	public static void main(String[] args) {
		
		Degree d = new Degree();
		d.getPrerequisite();
		
		Bachelors b = new Bachelors();
		b.getPrerequisite();
		
		Master m = new Master();
		//we are overriding, we are calling get Prerequisite () of the Master Class
		m.getPrerequisite();
		
		
	

	}

}
