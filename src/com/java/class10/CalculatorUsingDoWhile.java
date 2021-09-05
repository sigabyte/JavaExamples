package com.java.class10;

import java.util.Scanner;

public class CalculatorUsingDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int userChoice = 0;

		do {
			System.out.println("Please enter two values");

			int a = sc.nextInt(), b = sc.nextInt();

			System.out.println("Please enter operation to perform");
			System.out.println("Press 1 for addition");
			System.out.println("Press 2 for subtraction");
			System.out.println("Press 3 for multiplication");
			System.out.println("Press 4 for division");

			int operation = sc.nextInt();

			switch (operation) {
			case 1:
				System.out.println(a + b);
				break;
			case 2:
				if (a > b) {
					System.out.println(a - b);
				} else {
					System.out.println(b - a);
				}
				break;
			case 3:
				System.out.println(a * b);
				break;
			case 4:
				if (a > b) {
					System.out.println((double) a / b);
				} else {
					System.out.println((double) b / a);
				}
				break;
			default:
				System.out.println("Please enter number from 1 to 4 only");
			}

			System.out.println("Do you want to perform more operation");
			System.out.println("Press 1 for yes");
			System.out.println("Press 2 for No");
			userChoice = sc.nextInt();

		} while (userChoice == 1);

	}

}
