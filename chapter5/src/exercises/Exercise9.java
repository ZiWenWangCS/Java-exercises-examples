package exercises;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		int secretNum, playerNum;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 1 and 20: ");
		playerNum = input.nextInt();
		input.close();

		secretNum = (int) (20 * Math.random() + 1);

		System.out.println("Computer's Number:" + secretNum);
		System.out.println("Player's Number:" + playerNum);

		if (playerNum == secretNum) {
			System.out.println("You won!");
		} else {
			System.out.println("Better luck next time.");
		}

	}

}
