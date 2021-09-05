package com.java.Assignment02;

public class SumOfSeries {

	public static void main(String[] args) {

		float sum = 0;
		int a = 1, b = 2;

		for (int i = 0; i <= 9; i++) {

			sum = sum + (float) a / b;
			a = a + 1;
			b = b + 1;
		}
		System.out.println(sum);

	}

}
