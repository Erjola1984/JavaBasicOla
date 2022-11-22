package com.neotech.lesson19;

public class Employee {
	
	public static String company; // it was defaul, we change it to public
	public String name;
	protected String lastName;
	public double salary; // no access modifier--> it means default
	private int ssn;
	
	// 1.if no access modifier, then it is default
	//2. the formula of assigning access modifier:
	//access modifier data_type variable name
	
	//methods with a different access modifiers
	
	public void method1()
	{
		System.out.println("I am a public method!!!");
	}
	
	
	protected void method2()
	{
		System.out.println("I am a protected method!!!");
	}
	
	 void method3()
	{
		System.out.println("I am a default method!!!");
	}
	
	 private void method4()
		{
			System.out.println("I am a private method!!!");
		}
	 
	 public static void main1(String[] args) {
		
	
	 //we want to see what elements we can access from within the same class
	 
	 Employee emp = new Employee();
	 
	 company = "Neotech";
	 emp.name = "Ola";
	 emp.lastName = "Begaj";
	 emp.salary = 123455;
	 emp.ssn = 12344;
	 
	 
	 //reading variables and methods, ex red square; ssn: int employee
	 //access modifier(private), identifier is ssn, type is int, belongs to employee
	 
	 //we can access the methods:
	 emp.method1();//we can access public method
	 emp.method2();// can access protected method
	 emp.method3();//can access a default method
	 emp.method4();//we can access a private method
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 } 
	 
	 
	 


	 
	 
	 
	 
	 
	 
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
