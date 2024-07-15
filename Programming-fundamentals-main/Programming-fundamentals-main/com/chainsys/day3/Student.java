package com.chainsys.day3;

import java.util.Scanner;

public class Student {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of classes");
		float numberOfClasses = sc.nextInt();
		System.out.println("Enter number of attended classes");
		float attendedClasses = sc.nextInt();
		
		
		float attendancePercent;
				if ((numberOfClasses>0) && (attendedClasses>0)) {
					
					
					attendancePercent =( (attendedClasses/numberOfClasses)*100);
					System.out.println("Attendance percentage :"+attendancePercent);
					System.out.println("do you any medical emergency");
					boolean medicalLeave = sc.nextBoolean();
					if(attendancePercent>75) {
						System.out.println("Allowed for Exam");
					}
					
					else if (medicalLeave) {
						System.err.println(" if your attendance less than 75% Submit your medical certificate");
						
					}
					else {
						System.out.println("not Allowed");
					}
					
				}
				else {
				
					System.out.println("please enter valid number");
				}
		sc.close();
	}
	}

