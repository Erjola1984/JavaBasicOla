package com.neotech.lesson19_1;

//this import only class Employee from package com.neotech.lesson19.
import com.neotech.lesson19.Employee;

public class EmployeeOutsidePackage {
	
	public static void main(String[] args) {
		
		Employee.company = "Neotech";//it must be public if we want to access it
		
		Employee emp = new Employee();
		emp.name = "Ola";//we can access, this is public
		
		//emp.lastName = "Begaj"; //can not access this is protected, can not access outside the package
		emp.salary = 123455; //default, we can not access from outside the package
		//emp.ssn = 12344;//private is not visible
		
		
		//can we access the methods
		emp.method1();// we can access because this is public
		
		//for all those methods we need to make them public so we can access
//		emp.method2();
//		emp.method3();
//		emp.method4();
		
	//	emp.method5(); -> different issue
		
		
	}

}
