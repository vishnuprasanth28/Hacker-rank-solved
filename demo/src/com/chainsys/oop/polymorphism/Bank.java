package com.chainsys.oop.polymorphism;

public class Bank {
	
	public Bank() {
	}
	
	public static void depsoit(int amount, int accountNumber) {
		if(amount>0){
		int balance =0;
		balance =balance + amount;
		System.out.println(" your current balance : "+balance+" after depsoit of"+amount);
		}else {
			System.out.println("Please Enter valid amount or account number");
		}
		
	}
	public static void depsoit(int amount, int accountNumber,String accountName) {
		if(amount>0 ) {
		int balance = 0;
		balance =balance + amount;
		System.out.println(accountName+" your current balance : "+balance+" after depsoit of"+amount);
		}else {
			System.out.println("Please enter valid data");
		}
	}
	
	public static void depsoit(int amount,int ifscCode, int accountNumber ) {
		
		if(amount>0 && ifscCode==1111) {
		int balance = 0;
		balance =balance +amount;
		System.out.println(" your current balance : "+balance+" after depsoit of"+amount);
		}else {
			System.out.println("Please enter valid data");
		}
		}
	public static void withDrawl(int amount,int accountNumber) {
		if (amount>0) {
		int balance =1200;
		balance= balance-amount;
		System.out.println("you withdrawl "+amount+" and your current balance is"+balance );
		}else {
			System.out.println("Please enter valid data");
		}
	}

}
