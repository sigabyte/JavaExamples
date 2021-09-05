package com.java.class08;

public class JavaReview {
	public static void main(String[] args) {
		// 1.double result = 5.0/2;
		// 1.System.out.println(result);

		// int result = 20/5/2*8+4*2/10;
		// System.out.println(result);

		// boolean b1 = true, b2 = true, b3 = false;
		// boolean result = b1 || b2 && b3;
		// System.out.println(result);

		// double result = (int) 5 / 2;
		// System.out.println(result);

		// int i=0;
		// System.out.println("line 1");

		// if (i<0);{
		// System.out.println("line 2");
		// }
		// System.out.println("line 3");

		// int i=0;
		// System.out.println("line 1");

		// if (i < 0) {
		// System.out.println("line 2");
		// System.out.println("line 3");
		// }

		// int i = 0;
		// System.out.println("line 1");

		// if (i <= 0) {
		// System.out.println("line 2");
		// } else {
		// System.out.println("line 3");
		// }

		// int i=0;
		// System.out.println("line 1");

		// if (i <0){
		// System.out.println("line 2");
		// }else if (i<=0) {
		// System.out.println("line 3");
		// }else {
		// System.out.println("line 4");
		// }

		String country = "india";
		switch (country) {

		default:
			System.out.println("Please enter  valid country");
		case "India":
			System.out.println("Delhi");
		case "USA":
			System.out.println("Washington");
		case "Turkey":
			System.out.println("Ankara");

		}
	}

}
