package exercises;

import java.util.Scanner;

public class Nim {

	public static boolean isValidEntry(int num, int stones) {
		if (num <= stones && num > 0 && num <= 3) {
			return (true);
		} else {
			return (false);
		}
	}

	public static int drawStones(int stones) {
		int x = 100;
		while (x > stones) {
			x = (int) (3 * Math.random() + 1);
		}
		return (x);
	}

	public static int userTurn(int stones, int userChoice) {
		stones -= userChoice;
		if (stones == 0) {
			System.out.println("You lose");
		}
		return (stones);
	}

	public static int compTurn(int stones, int compchoice) {
		stones -= compchoice;
		if (stones == 0) {
			System.out.println("You win!");
		}
		return (stones);
	}

	public static void main(String[] args) {
		int userChoice;
		int stones;
		int compStones = 0;
		Scanner input = new Scanner(System.in);

		stones = (int) (16 * Math.random() + 15);

		while (stones > 0) {
			System.out.print("There are " + stones + " stones." + " How many would you like? ");
			userChoice = input.nextInt();

			if (isValidEntry(userChoice, stones)) {
				stones = userTurn(stones, userChoice);
				if (stones > 0) {
					compStones = drawStones(stones);
					System.out.println(
							"There are " + stones + " stones. " + "The computer takes " + compStones + " stones");
					stones = compTurn(stones, compStones);
				}
			}
		}
		input.close();
	}
}
