package com.chainsys.day2;

import java.util.Scanner;

public class Mobile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//creating scanner class
		System.out.println("enter brand name");
		String brand = sc.next();
		System.out.println("enter it support android");
		boolean isAndroid = sc.nextBoolean();
		System.out.println("enter the price");
		int price = sc.nextInt();
		System.out.println("enter the ram");
		int ram = sc.nextInt();
		System.out.println("Brand :"+ brand+" "+ "android :" + isAndroid+" "+ "Mobileprice :"+price+" "+"RAM :"+ram);
		sc.close();
	}

}
