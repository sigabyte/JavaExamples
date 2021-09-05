package com.java.HomeWork;

public class HomeWork01Sep3 {
	public static void main(String[] args) {
		int numbers[] = { 43, -46, 47, 40, -12, 35, -10, 65, -4, 32 };
		// Solution with nested loop
		int large = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length - 1; j++) {
				if (numbers[i] >= numbers[j]) {
					large = numbers[i];
				} else {
					large = numbers[j];
				}
			}

		}
		System.out.println("The largest number is " + large);

	}

}
