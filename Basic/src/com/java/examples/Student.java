package com.java.examples;

public class Student {
	
	private static int rollno;
	public String name;
	
	public Student() {
		this.rollno=20;
		this.name ="pooja";
	}

	public static int getRollno() {
		return rollno;
	}

	public static void setRollno(int rollno) {
		Student.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	
	

}
