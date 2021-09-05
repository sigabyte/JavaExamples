package com.java.class13;

// write a program to seperate each didgit from the number

// input  5782
//2
//8
//7
//5

public class DisplayDigit {
	public static void main(String[] args) {
		int num = 5785; 
		
		while (num > 0) {

			System.out.println(num % 10);

			num = num / 10;
		}

	}

}
