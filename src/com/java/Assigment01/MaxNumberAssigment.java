package com.java.Assigment01;

public class MaxNumberAssigment {
	public static void main(String[] args) {
		int num1 = 5, num2 = 3, num3 = 6;

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1 + " is greatest");
			}
		}

		if (num2 > num1) {
			if (num2 > num3) {
				System.out.println(num2 + " is greatest");
			}
		}

		if (num3 > num1) {
			if (num3 > num2) {
				System.out.println(num3 + " is greatest");
			}
		} else {
			System.out.println("You entered same numbers, please enter different numbers");
		}
	}

}
