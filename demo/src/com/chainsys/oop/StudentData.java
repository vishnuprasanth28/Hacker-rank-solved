package com.chainsys.oop;

public class StudentData {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("vishnu");
		student.setRollNumber(28);
		student.setSchoolName("Velammal");
		System.out.println("Student Name : "+student.getName());
		System.out.println("roll number : "+student.getRollNumber());
		System.out.println("School name : "+student.getSchoolName());
		
		
	}

}
