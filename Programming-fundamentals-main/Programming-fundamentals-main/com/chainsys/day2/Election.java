package com.chainsys.day2;

import java.util.Scanner;

public class Election {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		System.out.println("Am I eligable for voting :"+(age>=18));
		
		sc.close();
	}

}
