package com.java.HomeWork;

public class HwFindMaximumNumberOfDigit {
	public static void main(String[] args) {
		int num = 7000;
		int max = 0;

		while (num > 0) {
			if (num % 10 > max) {
				max = num % 10;
			}

			num = num / 10;
		}
		System.out.println(max);

	}
}
