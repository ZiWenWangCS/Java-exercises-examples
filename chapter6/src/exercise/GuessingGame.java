package exercise;

import java.util.Scanner;

public class GuessingGame {

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
				System.out.println("Try again");
				if (playerNum > secretNum) {
					System.out.println("Too high");
				} else {
					System.out.println("Too low");
				}
			}
			
		}

		input.close();
		
	}

}
