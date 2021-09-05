package com.java.class09;

public class FindResultOfSeries {

	public static void main(String[] args) {
		int ser = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				ser = ser - i;
			} else
				ser = ser + i;
			}
		System.out.println(ser);
	}

}
