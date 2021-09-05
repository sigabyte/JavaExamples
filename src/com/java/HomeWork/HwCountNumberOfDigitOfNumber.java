package com.java.HomeWork;

public class HwCountNumberOfDigitOfNumber {
	public static void main(String[] args) {
		int num = 5785458;
		int count = 0;
		while (num > 0) {

			num = num / 10;
			count++;
		}
		System.out.println("Number of digit " + count);
	}

}
