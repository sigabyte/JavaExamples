package com.java.class11;

public class FindIndexOfNumber {
	public static void main(String[] args) {
		int numbers[] = { 43, 46, 47, 40, 12, 35 };

		int targetNumber = 40;

		for (int i = 0; i < numbers.length; i++) {

			if (targetNumber == numbers[i]) {
				System.out.println(i);
			}
		}

	}

}
