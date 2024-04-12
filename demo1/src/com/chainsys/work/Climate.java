package com.chainsys.work;

import java.util.Scanner;

public class Climate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("is rainining outside ?");
		boolean isRaining = sc.nextBoolean();
		if (isRaining) {
			System.out.println("Please take an umberella");
			System.out.println("Please enter the temperature");
			int temp = sc.nextInt();
			if (temp>0) {
			if (temp<32) {
				System.out.println("Advice to heavy jacket");
				
			}
			else if (temp>32 || temp <50) {
				System.out.println("Advice to  take light jacket");
				
			}
			else {
				System.out.println("No need jacket");
			}
		}else {
			System.out.println("Please valid temperature");
		}
		
		}
		else {
			System.out.println("no rain");
		}
	}

}

