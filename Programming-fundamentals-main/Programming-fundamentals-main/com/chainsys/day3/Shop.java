package com.chainsys.day3;

import java.util.Scanner;

public class Shop {
	public static void main(String[]args) {
		int price;
		double discountedPrice;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the quantity of units");
		int unit = sc.nextInt();
		if (unit >0) {
			price = unit *100;
			if (price >= 1000) {
				System.out.println("Eligible for 10% discount");
				
				discountedPrice = price/1000;
				
				System.out.println("Amount you saved :"+discountedPrice);
				
			}
			else {
				System.out.println("Please add more units to get discount");
			}
			
		}
		
		sc.close();
	}

}
