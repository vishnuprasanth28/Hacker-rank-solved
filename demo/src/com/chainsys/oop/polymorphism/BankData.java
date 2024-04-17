package com.chainsys.oop.polymorphism;



public class BankData {
	String accountNumber;
	String accountName;
	String bankName;
	int ifscCode;
	String branchLocation;
	
	public BankData() {
	
	}
	
	
	public BankData(String accountNumber, String accountName, String bankName, int ifscCode, String branchLocation) {
	
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
	
	public long getAccountNumber() {
		 return Long.parseLong(accountNumber);
	}
	public void setAccountNumber(String accountNumber) {
		
		this.accountNumber = accountNumber;
		
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		
		this.accountName = accountName;
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
