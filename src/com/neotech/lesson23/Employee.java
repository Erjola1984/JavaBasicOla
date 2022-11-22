package com.neotech.lesson23;

public class Employee {

	double salary;
	
	void getPaid()
	{
		System.out.println("This emplyee salary is " + salary);
	}
	
    }

class Contractor extends Employee
{
	double hourlyRate;
	void getPaid()
	{
		System.out.println("The contratctor hourlyRate is " + hourlyRate);
	}
}
	
class fulltimeEmployee extends Employee
{
	
}
	
	
	
	
	