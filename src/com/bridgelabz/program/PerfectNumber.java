package com.bridgelabz.program;

import com.bridgelabz.utility.Utility;

public class PerfectNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter No.");
		int number = utility.getIntValue();
		utility.getPerfectNumber(number);
	}
}
