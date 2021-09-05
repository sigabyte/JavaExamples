package com.java.class04;

// a program to check given year is a leap year or not

public class LeapYear {
	public static void main(String[] args) {
		int year = 2016;

		if (year % 4 == 0) {
			System.out.println("The year is a leap year");
		} else {
			System.out.println("the year is not a leap year");
		}
	}

}
