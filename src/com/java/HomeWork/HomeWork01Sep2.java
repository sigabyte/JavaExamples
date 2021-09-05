package com.java.HomeWork;

public class HomeWork01Sep2 {
	public static void main(String[] args) {
		int numbers[] = { 43, -46, 47, 40, -12, 35, -10, 65, -4, 32 };

		int sumpos = 0, sumneg = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				sumpos = sumpos + numbers[i];

			} else {
				sumneg = sumneg + numbers[i];

			}
		}
		System.out.println(sumpos);
		System.out.println(sumneg);
	}

}
