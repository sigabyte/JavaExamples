package com.java.Assigment01;

public class PercentageGradeCalc {
	public static void main(String[] args) {
		int phy = 88, chem = 65, bio = 55, math = 85, comp = 90;
		
		double totalMarks = phy+chem+bio+math+comp;
		double percentage = totalMarks/500*100;
		System.out.print(percentage);
		
		if (percentage>=90) {
			System.out.println(" - Grade A");
		}else if (percentage>=80) {
			System.out.println(" - Grade B");
		}else if (percentage>=70) {
			System.out.println(" - Grade C");
		}else if (percentage>=60) {
			System.out.println(" - Grade D");
		}else if (percentage>=40) {
			System.out.println(" - Grade E");
		}else {
			System.out.println(" - Grade F");
		}
		
		if (phy >= 90) {
			System.out.println("physics A");
		} else if (phy >= 80) {
			System.out.println("Physics B");
		} else if (phy >= 70) {
			System.out.println("Physics C");
		} else if (phy >= 60) {
			System.out.println("Physics D");
		} else if (phy >= 40) {
			System.out.println("Physics E");
		} else if (phy < 40) {
			System.out.println("Physics F");
		}

		if (chem >= 90) {
			System.out.println("Chemistry A");
		} else if (chem >= 80) {
			System.out.println("Chemistry B");
		} else if (chem >= 70) {
			System.out.println("Chemistry C");
		} else if (chem >= 60) {
			System.out.println("Chemistry D");
		} else if (chem >= 40) {
			System.out.println("Chemistry E");
		} else if (chem < 40) {
			System.out.println("Chemistry F");
		}

		if (bio >= 90) {
			System.out.println("Biology A");
		} else if (bio >= 80) {
			System.out.println("Biology B");
		} else if (bio >= 70) {
			System.out.println("Biology C");
		} else if (bio >= 60) {
			System.out.println("Biology D");
		} else if (bio >= 40) {
			System.out.println("Biology E");
		} else if (bio < 40) {
			System.out.println("Biology F");
		}

		if (math >= 90) {
			System.out.println("Mathematics A");
		} else if (math >= 80) {
			System.out.println("Mathematics B");
		} else if (math >= 70) {
			System.out.println("Mathematics C");
		} else if (math >= 60) {
			System.out.println("Mathematics D");
		} else if (math >= 40) {
			System.out.println("Mathematics E");
		} else if (math < 40) {
			System.out.println("Mathematics F");
		}

		if (comp >= 90) {
			System.out.println("Computer A");
		} else if (comp >= 80) {
			System.out.println("Computer B");
		} else if (comp >= 70) {
			System.out.println("Computer C");
		} else if (comp >= 60) {
			System.out.println("Computer D");
		} else if (comp >= 40) {
			System.out.println("Computer E");
		} else if (comp < 40) {
			System.out.println("Computer F");
		}

	}

}
