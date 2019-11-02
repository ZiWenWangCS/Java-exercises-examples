package exercises;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		int grade;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the percentage: ");
		grade = input.nextInt();
		input.close();
		
		if (grade > 89) {
			System.out.println("The corresponding letter grade is: A");
		} else if (grade > 79) {
			System.out.println("The corresponding letter grade is: B");
		} else if (grade > 69) {
			System.out.println("The corresponding letter grade is: C");
		} else if (grade > 59) {
			System.out.println("The corresponding letter grade is: D");
		} else {
			System.out.println("The corresponding letter grade is: F" );
		}

	}

}
