package com.chainsys.workday1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		String s = "Make right in right time";
		Pattern p = Pattern.compile("right");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group()+" starts at "+m.start());
			break ;
			
		}
	}
}
