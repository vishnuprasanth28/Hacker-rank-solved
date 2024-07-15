package com.chainsys.oop;

public class Student {
	int rollNumber;
	String Name;
	String schoolName;
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		if(rollNumber>0) {
			this.rollNumber = rollNumber;
		}else {
			System.out.println("Invalid roll number");
		}
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		if(name !=null && !name.isEmpty()) {
		Name = name;
		}else {
			System.out.println("Invalid Name");
		}
	}
	public String getSchoolName() {
		
		return schoolName;
		
	}
	public void setSchoolName(String schoolName) {
		if(schoolName !=null && !schoolName.isEmpty()) {
		this.schoolName = schoolName;
		}else
		{
			System.out.println("Invalid school name");
		}
	}
	public Student() {
		
	}
	public Student(int rollNumber, String name, String schoolName) {
		this.rollNumber=rollNumber;
		this.Name=name;
		this.schoolName=schoolName;
		
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", Name=" + Name + ", schoolName=" + schoolName + "]";
	}
	

}
