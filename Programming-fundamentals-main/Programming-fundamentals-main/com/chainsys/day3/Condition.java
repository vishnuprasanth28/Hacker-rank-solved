package com.chainsys.day3;

import java.util.Scanner;

public class Condition {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		
		int a= sc.nextInt();
		if(a>0)
			System.out.println(a);
		else 
			System.out.println("please enter valid number");
		sc.close();
	}

}
