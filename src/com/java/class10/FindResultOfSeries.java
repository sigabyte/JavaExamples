package com.java.class10;
// program for sum of serie 1/2+2/3+3/4+....+10/11
public class FindResultOfSeries {

	public static void main(String[] args) {
		float sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = sum + (float)i / (i + 1);
		}
		System.out.println(sum);
	}

}
