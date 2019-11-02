package example;

import java.util.Scanner;

public class DiceRolls {

	public static void nextInt(int numRolls, int[] outcomes, int sides, int rollsTogether) {
		int outcome = 0;
		for (int roll = 0; roll < numRolls; roll++) {
			for (int i = 0; i < rollsTogether; i++) {
				outcome += (int) (sides * Math.random() + 1);
			}
			outcomes[outcome] += 1;
			outcome = 0;
		}

		/* show counts of outcomes */
		for (int i = rollsTogether; i < (sides * rollsTogether) + 1; i++) {
			System.out.println(i + ": " + outcomes[i]);
		}

	}

	public static void main(String[] args) {
		int[] outcomes;
		Scanner input = new Scanner(System.in);
		int numRolls;
		int sides;
		int rollsTogether;

		/* prompt user for number */
		System.out.print("How many rolls? ");
		numRolls = input.nextInt();
		System.out.print("How many sides? ");
		sides = input.nextInt();
		System.out.print("Number of dices to be rolled together: ");
		rollsTogether = input.nextInt();
		outcomes = new int[sides * rollsTogether + 1];
		input.close();

		/* Roll dice and add to outcomes */
		nextInt(numRolls, outcomes, sides, rollsTogether);

	}

}
