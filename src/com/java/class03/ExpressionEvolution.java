package com.java.class03;

public class ExpressionEvolution {
	public static void main(String[] args) {
		int result = 5 * 4 / 5;
		
		// if same priority expressions are in the line we consider associativity left to right
		// first always check priority
		result = 10 / 3 * 2;
		
		result = 40 / 8 / 2 * 6 / 4 + 8 - 4 * 7 / 14;
		
		result = 50 + 100 * 4 / 25 * 10 / 60 / 2 / 10 * (5 - 5);
		
		
		System.out.println(result);
		
		
	}

}
