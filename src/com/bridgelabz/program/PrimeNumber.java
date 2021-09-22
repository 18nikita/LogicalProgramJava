package com.bridgelabz.program;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	// UC-3-Prime Number
	public static void main(String[] args) {
		
	
			Utility utility=new Utility();
			System.out.println("Enter the no.");
			int number=utility.getIntValue();
			Utility.getPrimeNumber(number);
	}		
}
