package com.java.class05;

// Take user name and password from user

// DB username and password is 1234 and 1111

// if user name is wrong but password is correct ---> Your username is wrong
// if user name is wrong but password is incorrect ---> Your  have entered invalid cred
//if user name is correct but password is correct ---> Login successful
//if user name is correct but password is incorrect ---> Your password is wrong

public class LoginValidation {
	public static void main(String[] args) {
		int username = 3523, password = 53532;
		int dbUsername = 1234, dbPassword = 1111;

		if (username == dbUsername) {
			if (password == dbPassword) {
				System.out.println("Login successful");
			} else {
				System.out.println("Your password is wrong");
			}

		} else if (password == dbPassword) {
			System.out.println("Your username is wrong");
		} else {
			System.out.println("You've entered invalid cred");
		}

	}

}
