package com.java.class13;

public class ReverseOfNumber {
	public static void main(String[] args) {
		int num = 456;
		int reverse = 0;

		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;

		}
		System.out.print(reverse);

	}

}
