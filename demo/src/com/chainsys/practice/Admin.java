package com.chainsys.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Admin {

	List<String> bloodStock = new ArrayList<>();

	public List<String> getBloodStock() {
		return bloodStock;
	}

	public void setBloodStock(List<String> bloodStock) {
		this.bloodStock = bloodStock;
	}

	public void adminLogin(String name, String password) {

		if (name.equals("vishnu") && password.equals("1234")) {
			System.out.println("Login success");
		} else {
			System.out.println("enter valid data");

		}
	}

	public void addBloodStock() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want add blood stock Press (y) or press any key :");
		String addStock = sc.next().toLowerCase();
		while (addStock.equals("y")) {
			System.out.println("Enter blood group :");
			String bloodType = sc.next();
			if (bloodType.matches("^(A|B|AB|O)[+-]$")) {
				bloodStock.add(bloodType);
			} else {
				System.out.println(" Please enter valid blood group ");
				addStock = sc.next().toLowerCase();

			}
			System.out.println("Do you want add more (y) or press any key :");
			addStock = sc.next().toLowerCase();
			// if(addStock)

		}
		System.out.println("Current Stock : " + Arrays.toString(bloodStock.toArray()));

	}
}
