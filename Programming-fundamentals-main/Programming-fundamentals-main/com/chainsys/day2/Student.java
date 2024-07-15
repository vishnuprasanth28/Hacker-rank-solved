package com.chainsys.day2;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String studentName = sc.next();
		System.out.println("Enter the college name");
		String collegeName = sc.next();
		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("Enter the department");
		String branch = sc.next();
		System.out.println("Student Name :"+studentName +" "+ "College Name :"+collegeName+" "+"Student Age :"+age+" "+ "Department :"+ branch);
		sc.close();
	}

}
 