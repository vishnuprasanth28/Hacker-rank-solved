package com.chainsys.hackerrank;


import java.util.Scanner;
	


public class HackerRank{
	   

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("enter any number");
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        while(N>0 && N<=100){
	            if(N%2!=0) {
	            	System.out.println("Weird");
	            }else {
	            	if(N>=2 && N<=5) {
	            		System.out.println("Not Weird");
	            	}else if (N>=6 && N<=20) {
	            		System.out.println("Weird");
	            	}else {
	            		System.out.println("Not Weird");
	            	}
	            }
	            break ;
	        }
	        

	        scanner.close();
	    }
}
	



