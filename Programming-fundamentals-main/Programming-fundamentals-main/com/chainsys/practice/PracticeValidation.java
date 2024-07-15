package com.chainsys.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class PracticeValidation {

	public static void main(String[] args) {
		
		String text = "Madurai welcomes you all";
		
        Pattern p = Pattern.compile("all");

        // Create a Matcher object
        Matcher m = p.matcher(text);

        // Check for matches
        if (m.find()) {
            System.out.println("Found a match!");
        } else {
            System.out.println("No match found.");
        }
    }
}