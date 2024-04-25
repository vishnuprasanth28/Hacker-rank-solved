package com.chainsys.practice;

import java.util.Scanner;

public class MduBranch {
	public static void main(String[]args) {
//		MduBloodBank mduBloodBank = new MduBloodBank();
		Admin admin = new Admin();
		Scanner sc = new Scanner(System.in);
		System.out.println("  Welcome to MDU Blood Bank  \n");
		System.out.println("Login as admin answer y/n ");
		char isAdmin = sc.next().toLowerCase().charAt(0);
		switch(isAdmin) {
		case 'y':System.out.println("Enter user name");
					String userName = sc.next();
					System.out.println("Enter your password");
					String password =sc.next();
					admin.adminLogin(userName, password);
					break;
		case 'n':
			MduBloodBank.function();
			break;
		}
		
		
	}
}
