package com.neotech.lesson19;

public class EmployeeWithinPackage {
	
	public static void main(String[] args) {

		Employee.company = "Neotech";
		
		Employee emp = new Employee();
		emp.name = "Ola";
		emp.lastName = "Begaj";
		emp.salary = 90000;
		
		//this is not visible
		//emp.ssn = 3456;
		//emp.phone = 234567;
		
		//can we access methods
		emp.method1();// public method so we can access it
		emp.method2(); //protected method we can access it
		emp.method3(); //default method, we can access it within package
		//emp.method4();//error, it exists but we can not access it
	}

}
