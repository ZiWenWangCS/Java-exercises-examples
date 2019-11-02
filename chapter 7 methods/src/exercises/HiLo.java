package exercises;

import java.util.Scanner;
import java.lang.Math;

public class HiLo {

	public static Integer loseOrWin(int point) {
		int computerNum;
		int riskPoint;
		int choice;
		Scanner input = new Scanner(System.in);

		System.out.println("High Low Game\n");
		System.out.println("Numbers 1 tyhrough 6 are low.");
		System.out.println("Numbers 8 through 13 are high.");
		System.out.println("7 is a lose");
		System.out.println("You have " + point + " points.");

		System.out.print("Enter points to risk:");
		riskPoint = input.nextInt();
		point -= riskPoint;
		System.out.print("Predict (1=High 0=Low): ");
		choice = input.nextInt();

		computerNum = (int) (13 * Math.random() + 1);

		if (choice == 1 && computerNum >= 8) {
			point = riskPoint * 2 + point;
			System.out.println("You win");
		} else if (choice == 0 && computerNum <= 6) {
			point = riskPoint * 2 + point;
			System.out.println("You win");
		} else {
			System.out.println("You lose");
		}
		return point;
	}

	public static void main(String[] args) {
		int point = 1000;
		int trials = 0;
		String playAgain = "y";
		Scanner input = new Scanner(System.in);

		while (point > 0 && playAgain.indexOf("y") >= 0) {
			point = loseOrWin(point);
			System.out.print("Play again?:");
			playAgain = input.next();
			System.out.println("You have " + point + " points");
			trials += 1;
		}
		
		System.out.print("Your trials: " + trials);
		input.close();
	}

}
