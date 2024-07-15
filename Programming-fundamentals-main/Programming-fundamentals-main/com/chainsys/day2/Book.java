package com.chainsys.day2;

import java.util.Scanner;

public class Book {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter book name");
		String bookName = sc.next();
		System.out.println("enter author name");
		String authorName = sc.next();
		System.out.println("Enter book price");
		int price = sc.nextInt();
		System.out.println("Enter the genre");
		String bookGenre= sc.next();
		
		System.out.println("Book name :"+bookName+"  "+ "Author :"+authorName +" "+"Book price :"+ price+" "+"Book genre :"+ bookGenre);
		sc.close();
	}

}

