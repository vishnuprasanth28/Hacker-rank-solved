package com.chainsys.day2;

import java.util.Scanner;

public class Hospital {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hospital name");
		String hospitalName = sc.next();
		System.out.println("enter the location");
		String location = sc.next();
		System.out.println("enter insurance available");
		boolean insuranceAccepted = sc.nextBoolean();
		System.out.println("enter the number of doctors");
		int doctorsCount = sc.nextInt();
		System.out.println("enter the number of patients");
		int patientCount = sc.nextInt();
		System.out.println("Hospital name :"+hospitalName +" "+"location :"+location+"  "+"Insurance :"+insuranceAccepted+"  " +"Number of doctors :"+doctorsCount+" "+"number of patients :"+ patientCount);
		sc.close();
	}
	

}
