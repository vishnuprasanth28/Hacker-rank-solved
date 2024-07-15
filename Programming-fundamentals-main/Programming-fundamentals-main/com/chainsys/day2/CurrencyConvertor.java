package com.chainsys.day2;

import java.util.Scanner;

public class CurrencyConvertor {

	public static void main(String[]args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount in rupees");
		int value = sc.nextInt();
		
		System.out.println("value in dollars :"+dollars(value));
		System.out.println("value in dinar :"+kuwaitDinar(value));
		
		sc.close();
	}
	public static double dollars(int value) {
		
		double usd = value * 0.012;
		return usd;
		
	}
public static double kuwaitDinar(int value) {
		
		double dinar = value * 0.0037;
		return dinar;
		
	}

}
