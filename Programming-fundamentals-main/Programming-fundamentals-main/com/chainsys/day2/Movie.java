package com.chainsys.day2;

import java.util.Scanner;

public class Movie {
	public static void main(String[]args) {
		CinemaRegulation cr = new CinemaRegulation();
		cr.onlinePlatforms();
		cr.updatedRules();
		cr.illegalRelease();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the movie name");
		
		String movieName = sc.next();
		System.out.println("enter the language");
		String movieLanguage = sc.next();
		System.out.println("enter the price");
		int ticketPrice = sc.nextInt();
		System.out.println("enter tickets availability");
		boolean isTicketAvailable = sc.nextBoolean();
		System.out.println("Movie :"+ movieName +"  " +"Language :"+movieLanguage+"  "+"Ticket price :"+ticketPrice+" "+"Ticket Available :"+isTicketAvailable);
		sc.close();
	}

}
