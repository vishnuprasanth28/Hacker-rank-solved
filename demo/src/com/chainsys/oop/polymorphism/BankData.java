package com.chainsys.oop.polymorphism;

import java.util.regex.Pattern;

public class BankData {
	int accountNumber;
	String accountName;
	String bankName;
	int ifscCode;
	String branchLocation;
	
	public BankData() {
	
	}
	
	
	public BankData(int accountNumber, String accountName, String bankName, int ifscCode, String branchLocation) {
	
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.branchLocation = branchLocation;
	}
	@Override
	public String toString() {
		return "BankData [accountNumber=" + accountNumber + ", accountName=" + accountName + ", bankName=" + bankName
				+ ", ifscCode=" + ifscCode + ", branchLocation=" + branchLocation + "]";
	}
	
	public int getAccountNumber() {
		 return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		if(Pattern.matches("^[0-9]{8}$", accountNumber) ) {
		this.accountNumber = Integer.parseInt(accountNumber);
		} else {System.out.println("please enter valid account number");
		
		}
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		if(Pattern.matches("^[a-zA-Z]{3,25}", accountName)) {
		this.accountName = accountName;
		}else { 
			System.out.println("Please enter valid name");
		}
	}
		
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBranchLocation() {
		return branchLocation;
	}
	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}
	

}
