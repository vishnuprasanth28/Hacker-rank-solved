package com.chainsys.practice;

import java.util.HashMap;
import java.util.Map;

public class PracticeMap {
	public static void main(String[]args) {
		Map<Integer,String> data= new HashMap<>();
		data.put(1001, "vishnu");
		data.put(1002, "vishnu");
		data.put(1003, "mohammed");
		data.put(1004, "kaif");
		System.out.println(data);
		
		System.out.println(data.containsKey(1001));
		System.out.println(data.entrySet());
		System.out.println(data.keySet());
		}

}
