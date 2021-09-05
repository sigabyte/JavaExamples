package com.java.class12;

public class TwoDimensionArray {
	public static void main(String[] args) {
		int data[][] = new int[4][5];

		data[1][3] = 8;

		System.out.println(data[1][3]);

		 
		// initialising data to array
		int numbers [][] = { {4,5,9,4},{1,2,6,4},{1,4,9,4}};
		// print number of rows in array
		System.out.println(numbers.length);
		
		// print number of column in particular row
		System.out.println(numbers[0].length);
		
		// printing all elements from array
		for (int i=0;i<numbers.length;i++) {
			for (int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]);
			}
			System.out.println();
		}
	}

}
