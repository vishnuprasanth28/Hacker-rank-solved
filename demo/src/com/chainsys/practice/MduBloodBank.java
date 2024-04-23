package com.chainsys.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MduBloodBank extends BloodBank {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		BloodBank bloodBank =new BloodBank();
				Donor donor = new Donor();
		Recipient recipient = new Recipient();	
		List<String> bloodList = new ArrayList<>();
		bloodList.add("A+");
		bloodList.add("B+");
		bloodList.add("O+");
		List<Person> donorList = new ArrayList<>();
		donorList.add(new Person("vishnu","A+","9787897345"));
		donorList.add(new Person("kumar","AB+","9787997345"));
		donorList.add(new Person("kasi","A-","9787897045"));
		
		
		System.out.println("For donate blood type-yes or for Recipient blood type -no ? ");
		String donate =sc.next();
		if(donate.equalsIgnoreCase("yes")) {
			System.out.println("Are you new donor");
			String isNewDonor =sc.next();
			if(isNewDonor.equalsIgnoreCase("yes")) {
				donor.setDonorId(NewDonor.generateId());
				System.out.println("Enter your name");
				String newDonorName = sc.next();
				while(true) {
					if(newDonorName.matches("^[A-Za-z]+$")) {
						donor.setDonorName(newDonorName);
						break;
					}
					System.out.println("Enter valid name");
					newDonorName=sc.next();
				}
				System.out.println("enter your blood group");
				String newDonorBlood = sc.next();
				while(true) {
					if(newDonorBlood.matches("^(A|B|AB|O)[+-]$")) {
						donor.setBloodGroup(newDonorBlood);
						break;
						
					}System.out.println("Enter valid blood group");
					newDonorBlood = sc.next();
				}
				System.out.println(donor.getDonorName()+" thank your for donating "+donor.getBloodGroup()+" your id is "+donor.getDonorId());
			}	
			else {
	
		System.out.println("Enter your id");
		int id = sc.nextInt();
		if(id>0) {
			donor.setDonorId(id);
		}else {
			System.out.println("please valid id");
			id = sc.nextInt();
		}
		System.out.println("enter your name");
		String name = sc.next();
		if(Pattern.matches("^[a-zA-Z]{3,25}", name)) {
			donor.setDonorName(name);
		}else {
			System.out.println("please enter valid name");
		}
		System.out.println("enter your age");
		int age =sc.nextInt();
		if(age>0 && age <=100) {
			donor.setAge(age);
		}else {
			System.out.println("please enter valid age");
		}
		System.out.println("enter your blood group");
		String bloodgrp = sc.next();
		if (Pattern.matches("^(A|B|AB|O)[+-]$", bloodgrp)) {
			donor.setBloodGroup(bloodgrp);
			bloodList.add(donor.getBloodGroup());
		
			
		}else {
			System.out.println("please enter valid blood group");
		}
		
		bloodBank.donateBlood(donor.getDonorName());
		}
		}
		else {
			System.out.println("Enter your name");
			String recieverName =sc.next();
			if(Pattern.matches("^[a-zA-Z]{3,25}", recieverName)) {
				recipient.setRecipientName(recieverName);
			}else {
				System.out.println("please enter valid name");
			}
			System.out.println("Enter your blood group you need");
			String bloodgroup = sc.next();
			if (Pattern.matches("^(A|B|AB|O)[+-]$", bloodgroup)) {
				recipient.setBloodGroupNeed(bloodgroup);
				
			}else {
				System.out.println("please enter valid blood group");
			}
			for(String s:bloodList) {
				if(s.equalsIgnoreCase(recipient.getBloodGroupNeed())) {
					System.out.println("Blood group you need is available");
					System.out.println("please mention how many units you need ");
					int bloodUnit=sc.nextInt();
					if(bloodUnit>0 && bloodUnit<50) {
						int payableAmount = bloodUnit*100;
						System.out.println("you have to pay "+payableAmount+" for "+bloodUnit+" unit of blood");
						
					}else {
						System.out.println("Please enter valid unit");
					}
					
				}
			
			}
			BloodBank.receiveBlood(recieverName);
		}
		sc.close();
	}
	
	}


