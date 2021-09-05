package com.java.class11;

public class ArrayExample {
	public static void main(String[] args) {
		
		// Declaration of single variable
		int num;
		
		// Declaration of array
		int data[];
		
		// Initialise array
		data = new int[5];
		
		// Declaration & iniialisation in same line
		int listOfNum[] = new int [4];
		
		// Another way to declare & initialise array
		
		int numbers[] = {43,46,47,40,12,35};
		
		
		// Print all numbers in array
		for (int i = 0; i < numbers.length; i++) {
			System.out.println (numbers[i]);
		}
		
		//To find array length (how many number in array?)
		System.out.println(numbers.length);
		
		
			
	}

}
