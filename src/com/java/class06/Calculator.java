package com.java.class06;

public class Calculator {
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;

		String operation = "Divide";

		switch (operation) {
		case "Add":
			System.out.println(num1 + num2);
			break;
		case "Subtraction":
			if (num1 < num2) {
				System.out.println(num2 - num1);
			} else
				System.out.println(num1 - num2);
			break;
		case "Multiply":
			System.out.println(num1 * num2);
			break;
		case "Divide":
			if (num1 < num2) {
				System.out.println(num2 / num1);
			} else
				System.out.println(num1 / num2);
			break;
		}

	}

}
