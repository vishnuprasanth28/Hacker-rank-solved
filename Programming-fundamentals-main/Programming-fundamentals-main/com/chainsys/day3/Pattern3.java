package com.chainsys.day3;

public class Pattern3 {
	    public static void main(String[] args) {
	        printPattern(4); // Adjust the argument to change the size of the pattern
	    }

	    public static void printPattern(int rows) {
	    	 for(int i=4;i>=1;i--) {
	             for(int j=i;j<4;j++) {
	                 System.out.print(" ");
	             }
	             for(int k=1;k<=2*i-1;k++) {
	                 if(k%2==0) {
	                     System.out.print(0);
	                 }
	                 else {
	                     System.out.print(1);
	                 }
	             }
	             System.out.println();
	         }

	     }
	}


