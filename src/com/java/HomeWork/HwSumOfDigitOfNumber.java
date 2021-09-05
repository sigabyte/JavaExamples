package com.java.HomeWork;

public class HwSumOfDigitOfNumber {
	public static void main(String[] args) {
		int num = 6547;
		int sum = 0;

		while (num > 0) {

			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println("Sum of Digit the number is " + sum);
	}

}
