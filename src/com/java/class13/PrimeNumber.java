package com.java.class13;

public class PrimeNumber {
	public static void main(String[] args) {
		int num = 13, divisor = 0;
		// int num = 13, n = 2, c = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				divisor++;
			}
		}

		if (divisor == 0) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
		// while (n <= num / 2) {
		// if (num % n == 0) {
		// c++;
		// }
		// n++;
		// }
		// if (c == 0) {
		// System.out.println("number is prime");
		// } else {
		// System.out.println("number is not prime");
		// }

	}

}
