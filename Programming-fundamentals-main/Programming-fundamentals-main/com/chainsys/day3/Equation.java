package com.chainsys.day3;

import java.util.Scanner;

public class Equation {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the value of y");
		int y = sc.nextInt();
		if(y>5 && y<=10) {
			System.out.println("2y2 + y + 5 :"+(2*(y*y) + y +5));
		}
		else {
			System.out.println("please enter number between 5 to 10");
		}
	sc.close();
	}

}
