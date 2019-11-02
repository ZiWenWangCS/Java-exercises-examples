package exercises;

import java.util.Scanner;

public class GuessingGame {
	
	public static void giveHint(int playerNum, int secretNum) {
		if (playerNum > secretNum) {
			System.out.println("Hint: try a lower number");
		} else {
			System.out.println("Hint try a higher number");
		}
		
	}

	public static void main(String[] args) {
		int secretNum, playerNum =-1;
		Scanner input = new Scanner(System.in);

		secretNum = (int) (20 * Math.random() + 1);

		while (playerNum !=secretNum) {
			System.out.print("Enter a number between 1 and 20: ");
			playerNum = input.nextInt();
			
			if (playerNum == secretNum) {
				System.out.println("You won!");
			} else {
				giveHint(playerNum, secretNum);
			}
			
		}

		input.close();
		
	}

}
