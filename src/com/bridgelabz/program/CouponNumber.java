package com.bridgelabz.program;

import com.bridgelabz.utility.Utility;

public class CouponNumber {
	public static void main(String[] args) {
		// UC-5-Coupon Number
		
		Utility utility = new Utility();
		System.out.println("Enter the no.");
		int number = utility.getIntValue();
		Utility.getCouponNumber(number);

	}
}
