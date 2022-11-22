package com.neotech.review04;

public class World2 {

	public static void main(String[] args) {
		// initializing
		student student1 = new student();
		student1.studentNr = 1;
		student1.name = "Hera";
		student1.gradelevel = 4;
		
		student student2 = new student();
		student1.studentNr = 5;
		student1.name = "Qamile";
		student1.gradelevel = 7;
		
		Teacher teacher = new Teacher();
		teacher.name = "Ola";
		teacher.salary = 47000;
		teacher.subject = "Java";
		
		System.out.println("The student number is " + student1.studentNr);
		System.out.println("The sstudent name is " + student1.name);
		System.out.println("The student grade level is " + student1.gradelevel);
		
		student1.study();
		
		student2.sleep();
		student2.study();
		
		teacher.teach();
		teacher.yellAtStudent(student2.name);
		
		
		
		
		
		
		
		
		
	}

}
