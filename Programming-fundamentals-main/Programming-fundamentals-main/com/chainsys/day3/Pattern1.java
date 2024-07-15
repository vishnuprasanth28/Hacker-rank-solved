package com.chainsys.day3;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row = sc.nextInt();
		
		if (row>0) 
		{
			for(int i =0;i<row;i++) 
			{
				for (int j =0;j<=i;j++) 
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		sc.close();
		
		}

	

}
