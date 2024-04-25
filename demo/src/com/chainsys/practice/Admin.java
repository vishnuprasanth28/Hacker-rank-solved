package com.chainsys.practice;

public class Admin {

		public void adminLogin(String name,String password) {
			
			if(name.equals("vishnu")&& password.equals("1234")) {
				System.out.println("Login success");
			}else {
				System.out.println("enter valid data");
				
			}
		}
}
