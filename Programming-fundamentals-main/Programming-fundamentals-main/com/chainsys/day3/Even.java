package com.chainsys.day3;

import java.util.Scanner;

public class Even {
	public static void main( String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int n;
		while(num>0) {
			n = num%10;
			if (n%2==0) {
				System.out.println("Even digits are :"+ n);
			}
			num = num/10;
		}
		sc.close();
	}

}
