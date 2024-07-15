package com.chainsys.practice;


public class MethodsToPractice {
	
	public static void main(String[] args) {
		
		String str = "hello";
		String str1 = "vishnu chainsys";
		String[] words;
		String space ="    ";
		
		System.out.println(	str.compareTo(str1));// compares two string return 0 if same 
		
		System.out.println("upper case :"+str.toUpperCase());
		
		System.out.println("lower case : "+ str.toLowerCase());
		
		System.out.println("Print the character of specified index:"+str.charAt(2));
		
		System.out.println("checks it contains the character :"+str.contains("s"));
		
		System.out.println("print the hashcode"+str.hashCode());
		
		System.out.println("concatenades two string :"+str.concat(" welcome"));
		
		System.out.println("to check string is blank :"+str.isBlank());
		
		System.out.println("last index of :"+str.lastIndexOf("l"));
		
		System.out.println("prints the length of string :"+str.length());
		
		System.out.println("Replace the character :"+str.replace('h', 'c'));
		
		System.out.println("replace the word in string :"+str1.replaceAll("vishnu", "madurai"));
		
		//splits the string and stores in Array format
		words=str1.split("\\s");
		for (String s :words)
		{
			
			System.out.println(s);
		}
		
		// removes white spaces in front and back
		System.out.println(str1.strip());
		
		// if string full of spaces it returns empty string
		System.out.println("this to removes the space in string :"+space.trim());
		
			
	}

}
