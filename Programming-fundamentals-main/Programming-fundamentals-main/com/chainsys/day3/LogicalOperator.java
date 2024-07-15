package com.chainsys.day3;

import java.util.Scanner;

public class LogicalOperator {
	static  int c;
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int a ,b;
		System.out.println("enter the number");
			 a = sc.nextInt();
			System.out.println("enter the number");
				 b =sc.nextInt();
		if (a>0 && b>0) {
		
	
		System.out.println(c<1);
//		System.out.println(a>b);
//		System.out.println(a<=b);
//		System.out.println(a>=b);
//		System.out.println(a==b);
	}
		else {
			System.out.println("Invalid data");
		}
		sc.close();
	}
}
