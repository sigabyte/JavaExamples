package com.java.class05;

// Take age and weight from user

// 1.age >= 18and weight >= 50 --> You are eligible
// 2.age >= 18and weight < 50 --> You are under weight
// 3.age < 18and weight >= 50 --> You are too young to donate
// 4.age < 18and weight < 50 --> You are not eligible

public class BloodDonation {
	public static void main(String[] args) {
		int age = 17, weight = 52;

		if (age >= 18) {
			if (weight >= 50) {
				System.out.println("You are eligible");
			}
		}

		if (age >= 18) {
			if (weight <= 50) {
				System.out.println("You are under weight");
			}
		}

		if (age < 18) {
			if (weight >= 50) {
				System.out.println("You are too young to donate");
			}
		}

		if (age < 18) {
			if (weight < 50) {
				System.out.println("you are not eligible");
			}
		}
	}

}
