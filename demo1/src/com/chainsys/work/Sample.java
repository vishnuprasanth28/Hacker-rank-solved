package com.chainsys.work;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      printPattern(4);
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



