package com.java.Assignment02;

public class PrintNumbers1to20DivisibleBy5And3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}
