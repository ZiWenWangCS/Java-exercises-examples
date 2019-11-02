package example;

import java.util.Scanner;
import java.text.NumberFormat;

public class GradeAvg {

	public static void main(String[] args) {
		
		int grade;
		Scanner input = new Scanner(System.in);
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		System.out.print("Enter the grade: ");
		grade = input.nextInt();
		System.out.println(grade);
		System.out.print("Enter the grade: ");
		grade += input.nextInt();
		System.out.println(grade);
		System.out.print("Enter the grade: ");
		grade += input.nextInt();
		System.out.println(grade);
		System.out.print("Enter the grade: ");
		grade += input.nextInt();
		System.out.println(grade);
		System.out.print("Enter the grade: ");
		grade += input.nextInt();
		System.out.println(grade);
		input.close();
		
		double avg = (double)grade/500;
		System.out.println("Average grade: " + percent.format(avg));
	}
}
