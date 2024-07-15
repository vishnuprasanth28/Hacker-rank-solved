package com.chainsys.work1;

public class CabDiscount {
	public static double discountCalculation(double price) {
		
		if(price>=2000 && price<5000) {
			System.out.println("eligible for 2% discount");
			double discountPrice = price*0.05;
			double payAble = price - discountPrice;
			return payAble;
		}
		else if(price>=5000) {
			System.out.println("eligible for 5% discount");
			double discountPrice = price*0.05;
			double payAble = price - discountPrice;
			return payAble;
		}
		else {
			System.out.println("not eligible for discount");
			return price;
		}
	}

}
