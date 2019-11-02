package excercises;

/*
 * feb 9 2019
 * ZiWen Wang
 * Project
 * Calculate the percent spend for designing, coding, debugging, and testing
 */

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		int design, code, debug, test;
		double percentDesign, percentCode, percentDebug, percentTest;
		int sumOfTime;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of minutes spend on each of the following project tasks:\n");
		System.out.print("Designing: ");
		design = input.nextInt();
		System.out.print("Coding: ");
		code = input.nextInt();
		System.out.print("Debugging: ");
		debug = input.nextInt();
		System.out.print("Testing: ");
		test = input.nextInt();
		input.close();
		
		sumOfTime = design + code + debug + test;
		percentDesign = (double)design/sumOfTime * 100;
		percentCode = (double)code/sumOfTime *  100;
		percentDebug = (double)debug/sumOfTime * 100;
		percentTest = (double)test/sumOfTime * 100;
		
		System.out.println("");
		System.out.format("%-14s %-7s", "Task", "% Time \n");
		System.out.format("%-14s %-5.2f %1s %1s", "Designing", percentDesign, "%", "\n");
		System.out.format("%-14s %-5.2f %1s %1s", "Coding", percentCode, "%", "\n");
		System.out.format("%-14s %-5.2f %1s %1s", "Debugging", percentDebug, "%", "\n");
		System.out.format("%-14s %-5.2f %1s %1s", "Testing", percentTest, "%", "\n");
		
	}

}
