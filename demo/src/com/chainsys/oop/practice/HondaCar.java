package com.chainsys.oop.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HondaCar {

	public static void main(String[] args) {
		PetrolCar petrolCar = new PetrolCar();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your car color");
		String color = sc.next();
		if(Pattern.matches("^[a-zA-Z]{3,25}", color)){
		petrolCar.setCarColor(color);
		}else {
			System.out.println("please enter valid color");
		}
		
		System.out.println("Enter gear box type");
		int gear = sc.nextInt();
		if(gear>0 && gear<=6){
		petrolCar.setGearType(gear);
		}else {
			System.out.println("Please enter valid data");
		}
		
		System.out.println("Enter maximum speed");
		int maxSpeed = sc.nextInt();
		if(maxSpeed>0 && maxSpeed <=250) {
		petrolCar.setMaxSpeed(maxSpeed);
		}else {
			System.out.println("Please enter valid data");
		}
		System.out.println(petrolCar.getCarColor()+" color car Powered by petrol "+ "has maximum speed of"+petrolCar.carColor );
		
		petrolCar.start();
		petrolCar.start(true);
		petrolCar.stop();
		
		sc.close();

	}

}
