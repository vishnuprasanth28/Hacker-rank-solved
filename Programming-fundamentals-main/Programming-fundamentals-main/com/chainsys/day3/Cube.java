package com.chainsys.day3;

import java.util.Scanner;

public class Cube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println("even numbers are");
		for (int i=1;i<=n; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
			
		}
		System.out.println("odd numbers are :");
		for (int i =1; i<=n; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
		System.out.println("cube of"+n+" :"+  Math.pow(n, 3));
	
		}
		System.out.println("Please enter valid number");
		sc.close();
	}
	 
}
