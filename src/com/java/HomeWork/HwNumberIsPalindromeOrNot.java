package com.java.HomeWork;

public class HwNumberIsPalindromeOrNot {
	public static void main(String[] args) {
		int num = 124;
		int reverse = 0;
		// i swapped the number :)
		int c = num;

		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}

		if (c == reverse) {
			System.out.println("The number is Palindrome");
		} else {
			System.out.println("The number is not Palindrome");
		}

	}

}
