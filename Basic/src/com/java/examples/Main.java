package com.java.examples;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello");
		
		Student student1=new Student();
		Student.setRollno(25);
		Student student2=new Student();
		Student.setRollno(30);
		
		System.out.println(student1.toString()+" "+student2.toString()+" "+Student.getRollno() );
		System.out.println(""); 

	}
	

}
