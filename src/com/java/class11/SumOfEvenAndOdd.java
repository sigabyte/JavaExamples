package com.java.class11;

public class SumOfEvenAndOdd {
	public static void main(String[] args) {
		int numbers[] = { 43, 46, 47, 40, 12, 35 };

		int sumodd = 0, sumeven = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sumeven = sumeven + numbers[i];

			} else {
				sumodd = sumodd + numbers[i];

			}
		}
		System.out.println(sumodd);
		System.out.println(sumeven);

	}

}
