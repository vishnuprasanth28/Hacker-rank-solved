package com.chainsys.day2;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the bank name");
		String bankName= sc.next();
		System.out.println("Enter the branch location");
		String branch = sc.next();
		System.out.println("Enter account number");
		int accountNo = sc.nextInt();
		System.out.println("enter account type");
		String accountType= sc.next();
		System.out.println("enter IFSC code");
		String ifscNo= sc.next();
		System.out.println("Bank :"+bankName+" "+"Branch location :"+branch+" "+"Account number :"+accountNo+" "+"Type of account :"+accountType+" "+"IFSC code :"+ifscNo);
		sc.close();
	}

}
