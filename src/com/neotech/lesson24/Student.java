package com.neotech.lesson24;

public class Student {
	
	protected void study()
	{
		System.out.println("Student is studying");
	}

	public void doHomework()
	{
		System.out.println("Student is doing homework");
		
	}
	
	}
	
	class NeotechStudent extends Student{
	@Override
	public void study()
	{
		System.out.println("Neotech student is coding");
	}
		
	public void getJob()
	{
		System.out.println("Neotech student become QA");
	}
	}
	
	class CollegeStudent extends Student {
		
		@Override
		
		public void study()
		{
			System.out.println("College student is studying science");
		}
	}
	
	class SchoolStudent extends Student {
		
		@Override
		
		public void study()
		{
			System.out.println("School student is school trip.");
		}
	}
	
	
	
	
	
