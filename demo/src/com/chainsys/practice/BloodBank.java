package com.chainsys.practice;

public class BloodBank  {
	
	public void donateBlood(String donorName) {
		System.out.println(donorName+" thanks for donating blood");
		
	}
	
	public void donateBlood(int id,String name,String bloodGrp,boolean isDrinked,String contact)
	{
		System.out.println(name+" thanks for donating blood");
	}
	public static void receiveBlood(int id,String name,String bloodGrp,String contact) {
		System.out.println(name+"we are happy to help you");
		
	}

	public static void receiveBlood(String recipientName) {
		System.out.println(recipientName+" thanks for reaching out");
		
	}

}
