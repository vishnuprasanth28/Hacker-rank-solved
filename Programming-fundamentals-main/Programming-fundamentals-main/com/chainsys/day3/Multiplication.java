package com.chainsys.day3;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to print their table");
		int n = sc.nextInt();
		if (n>0) {
		for ( int i= 0; i<=10;i++) {
			System.out.println(n+"x"+i+"="+i*n);
		}
	}
		sc.close();
}
}	