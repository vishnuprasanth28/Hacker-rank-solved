package com.chainsys.hackerrank;

import java.util.Scanner;

public class HackerRank3 {
	/*
	 * very line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
	 */
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
           System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("================================");
        sc.close();

}
}

