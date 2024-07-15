package com.chainsys.day3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the User name");
		String user = sc.next();
		if(UserCheck(user)) {
		
		System.out.println("Please enter your password");
		String password = sc.next();
		if(PasswordCheck(password)) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Please enter valid password");
		}
		
		
		}
		else {
			System.out.println("Enter valid user name");
		}
		/*
		 * if (user.equals("vishnu")&& password ==12345) {
		 * System.out.println("Login Successfull"); } else {
		 * System.out.println("Please enter correct details"); }
		 */
		
		sc.close();
	}
	public static boolean UserCheck(String user){
		
		Pattern p = Pattern.compile("vishnu");
		Matcher m = p.matcher(user);
		
		
		return m.find();
	}
	public static boolean PasswordCheck(String password) {
		 Pattern p = Pattern.compile("12345");
		 Matcher m = p.matcher(password);
		return m.find();
	}

}

