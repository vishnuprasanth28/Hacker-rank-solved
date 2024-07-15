package com.chainsys.day3;
import java.util.HashSet;
public class FascinatingNumber {
	

	public static void main(String[] args) {
	        int n = 327; 

	    
	        int result1 = n * 2;
	        int result2 = n * 3;

	        
	        String concatenated = String.valueOf(n) + String.valueOf(result1) + String.valueOf(result2);

	        
	        boolean isFascinating = isPandigital(concatenated);

	        if (isFascinating) {
	            System.out.println("The given number " + n + " is a fascinating number.");
	        } else {
	            System.out.println("The given number " + n + " is not a fascinating number.");
	        }
	    }

	    private static boolean isPandigital(String s) {
	        HashSet<Character> digits = new HashSet<>();
	        for (char c : s.toCharArray()) {
	            if (c >= '1' && c <= '9') {
	                digits.add(c);
	            }
	        }
	        return digits.size() == 9;
	    }
	
}

