package com.java.HomeWork;

public class HomeWork01Sep {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {

			for (int s = 1; s <= 5 - i; s++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}

			for (int j = 1; j <= i - 1; j++) {
				System.out.print(j);
			}

			System.out.println();
		}
		
		for (int i = 1; i <= 4; i++) {

			for (int sp = 5; sp <=9-i; sp++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k);

			}

			for (int k = 1; k <= i - 1; k++) {
				System.out.print(k);
			}

			System.out.println();
		}
	}

}
