package exercises;

import java.util.Scanner;
import java.text .*;

public class Exercise6 {

	public static void main(String[] args) {
		int operator;
		double num1, num2;
		double answer, userAnswer;
		Scanner input = new Scanner(System.in);
		DecimalFormat myFormatter = new DecimalFormat("##.##"); // formatting decimal places

		num1 = (int) (10 * Math.random() + 1);
		num2 = (int) (10 * Math.random() + 1);
		operator = (int) (4 * Math.random() + 1); // operator: (1,+) (2,-) (3,*) (4,/)
		operator = 4;
		if (operator == 1) {
			answer = (double) (num1 + num2);
			System.out.print("What is " + num1 + " + " + num2 + " ? ");
		} else if (operator == 2) {
			answer = (double) (num1 - num2);
			System.out.print("What is " + num1 + " - " + num2 + " ? ");
		} else if (operator == 3) {
			answer = (double) (num1 * num2);
			System.out.print("What is " + num1 + " * " + num2 + " ? ");
		} else {
			answer = (double) (num1 / num2);
			System.out.print("What is " + num1 + " / " + num2 + " ? ");
			answer = Double.parseDouble(myFormatter.format(answer)); // convert string to double
		}

		userAnswer = input.nextDouble();
		input.close();

		if (answer == userAnswer) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong!");

		}
	}

}
