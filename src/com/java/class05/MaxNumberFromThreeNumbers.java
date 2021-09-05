package com.java.class05;

public class MaxNumberFromThreeNumbers {
	public static void main(String[] args) {
		int a = 199, b = 133, c = 291;

		if (a > b && a > c) {
			System.out.println(a + " is the greatest");
		} else if (b > c) {
			System.out.println(b + " is the greates");
		} else {
			System.out.println(c + " is the greatest");
		}

	}
}
