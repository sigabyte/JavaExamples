package com.java.class11;

public class ForEachLoop {
	public static void main(String[] args) {

		int numbers[] = { 43, 46, 47, 40, 12, 35 };

		//for (int i = 0; i < numbers.length; i++) {
			//System.out.println (numbers[i]);
		//}

		// for each loop is use full to work on the data
		//for loop is use full to work with index
		
		for (int n : numbers) {
			System.out.print(" " + n);
		}

	}

}
