package com.chainsys.day3;

import java.util.Scanner;

public class Employee {
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your age");
	int age = sc.nextInt();
	System.out.println("for male press  m  and for female press f");
	char gender = sc.next().charAt(0);
	System.out.println("Marital status");
	
	
	
	if (age>0 && age<100 ) {
	
	if (gender == 'F'||gender == 'f') {
		System.out.println("work in urban areas");
	}
	else if (gender =='m'|| gender =='M') {
		if (age > 20 && age <40)
		{
			System.out.println(" He can work anywhere");
		}
		else if(age > 40 && age < 60){
			System.out.println("he will work in urban areas only");
		}
		else {
			System.out.println("please enter correct details");
		}
		}
	else {
		System.out.println("please enter valid data");
	}
	
	}
	else {
		System.out.println("please enter proper data");
	}
	 sc.close();
	
	}
}
		
	
	


