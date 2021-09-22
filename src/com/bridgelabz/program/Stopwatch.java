package com.bridgelabz.program;

import com.bridgelabz.utility.Utility;

public class Stopwatch {
	public static void main(String[] args) {
		// UC-1-Fibonacci series
		
		Utility utility=new Utility();
		System.out.println("Enter the no.");
		int number=utility.getIntValue();
		Utility.getStopwatch(number);
	}
}
