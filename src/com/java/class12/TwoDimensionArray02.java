package com.java.class12;

public class TwoDimensionArray02 {
	public static void main(String[] args) {
		int numbers[][] = { { 4, 5, 9, 4 }, { 1, 2, 6, 4 }, { 1, 4, 9, 4 } };

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {

				System.out.print(numbers[i][j]);
			}

			System.out.println();
		}
		
	}

}
