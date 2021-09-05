package com.java.class04;

public class NameOfDayFromNumber {
	public static void main(String[] args) {
		int day = 0;
		String str[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		for (int i = 0; i <= 6; i++) {
			day = i;
			if (day == i) {
				System.out.println(str[i]);
			}
			System.out.println();
		}

		// if (day == 0) {
		// System.out.println("Sunday");
		// } else if (day == 1) {
		// System.out.println("Monday");
		// } else if (day == 2) {
		// System.out.println("Tuesday");
		// } else if (day == 3) {
		// System.out.println("Wednesday");
		// } else if (day == 4) {
		// System.out.println("Thursday");
		// } else if (day == 5) {
		// System.out.println("Friday");
		// } else if (day == 6) {
		// System.out.println("Saturday");
		// } else {
		// System.out.println("Enter number from 0 to 6");
		// }

	}

}
