
package com.java.HomeWork;

public class HomeWork01Sep4 {
	public static void main(String[] args) {
		int numbers[] = { 43, -46, 47, 40, -12, 35, -10, 65, -4, 32 };
		// Solution with single for loop
		
		int max = numbers[0];

		for (int n : numbers) {
			if (n > max) {
				max = n;
			}
		}
		System.out.println("The largest number is " + max);

		// solution with single for loop
		
		int large = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > large) {
				large = numbers[i];

			}
		}
		System.out.println("The largest number is " + large);

	}

}
