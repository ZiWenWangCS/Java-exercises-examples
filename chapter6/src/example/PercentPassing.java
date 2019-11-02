package example;

import java.util.Scanner;


public class PercentPassing {

	public static void main(String[] args) {
		final int SENTINEL = -1;
		int numPass = 0;
		int score;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your grade " + "or " + SENTINEL + " to quit: ");
		score = input.nextInt();
		
		while (score != SENTINEL) {
			if (score >= 70) {
				numPass += 1;
			}
			System.out.print("Enter your grade " + "or " + SENTINEL + " to quit: ");
			score = input.nextInt();
		}
		
		input.close();
		System.out.println("You have passed " + numPass + " test.");
	}

}
