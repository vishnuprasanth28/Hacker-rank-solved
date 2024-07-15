package com.chainsys.day2;

public class Operators {
	public static void main (String[]args) {
		int a=10;
		int b=5;
		// Arithmatic operator
		System.out.println("Arithematic operator");
		System.out.println("a :"+a+" "+"b :"+b);
		System.out.println(a+b+" "+"addition");
		System.out.println(a-b+" "+"subraction");
		System.out.println(a*b+" "+"multiplication");
		System.out.println(a/b+" "+"divide");
		System.out.println(a%b+" "+"Modulo");
		
		// unary operator
		System.out.println(a++ + ++b); //here increment the value of a and b
		System.out.println(--a + --b); //here decrement the value of a and b
		
		//assignment operator
		int c = a;
		System.out.println("c :"+c); //assigned the value of a to c
		
		//relational operator
		System.out.println("A>B :"+(a > b) );//compare the value of a and b
		System.out.println("A<B :"+(a < b) );
		System.out.println("A==B :"+(a == b) );
		
		
		//logical operator
		System.out.println("A:B:C" +(a>b && a>c)); // And operator
		System.out.println("A:B:C" +(a>b || a>c)); // or operator
		System.out.println("A>O: "+ (a!=0)); // Not operator
	}

}
