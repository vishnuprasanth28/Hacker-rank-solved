package com.chainsys.oop.polymorphism;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankData data = new BankData();
		
		System.out.println("Enter your name");
		String accountHolderName =sc.next();
		if(Pattern.matches("^[a-zA-Z]{3,25}", accountHolderName)) {
		data.setAccountName(accountHolderName);
		}else {
			System.out.println("Please enter valid name");
		}
		System.out.println("Enter your account number");
		data.setAccountNumber(generateAccountNumber());
		
		data.setBranchLocation("madurai");
		data.setIfscCode(1111);
		
		
		Bank.depsoit(10000,data.getAccountNumber());
		Bank.depsoit(20000,data.getIfscCode() ,data.getAccountNumber());
		Bank.depsoit(150000,data.getAccountNumber(), data.getAccountName());
		Bank.withDrawl(500,data.getAccountNumber());
		sc.close();
	}
	


public static String generateAccountNumber() {
	
	int randomNumber =(int) (Math.random() * 10000);
	String accountNo = "1234"+randomNumber;
	
	return accountNo;
}
}