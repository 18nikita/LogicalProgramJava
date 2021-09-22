package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {

	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
		System.out.println("");
	}

	public int getIntValue() {
		return scanner.nextInt();
	}

	// UC-1-Fibonacci Series
	public static void getFibonacciSeries(int number) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.println("Fibonacci series is: ");
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 1; i < number; ++i) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}

	// UC-2-Perfect Number
	public void getPerfectNumber(int number) {
		int i = 1, Sum = 0;

		for (i = 1; i < number; i++) {
			if (number % i == 0) {
				Sum = Sum + i;
			}
		}
		if (Sum == number) {
			System.out.println(number + " " + "is a perfect number");
		} else {
			System.out.println(number + " " + "is not a perfect number");
		}
	}

	// UC-3-Prime Number
	public static void getPrimeNumber(int number) {
		int prime = 0;
		int i;
		for (i = 2; i < number; i++) {
			if (number % i == 0) {
				prime = 1;
			}
		}
		if (prime == 0) {
			System.out.println("The no. is a prime no.");
		} else {
			System.out.println("The no. is not a prime no.");
		}
	}

	// UC-4-Reverse a number
	public static void getReverseNumber(int number) {
		int reverse = 0;
		if (number < 10) {
			System.out.println("The reverse no. is : " + number);
		} else {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
			System.out.println("The reverse no is: " + reverse);
		}
	}
}
