package exercises;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		int x1, x2, x3, x4, x5, x6, x7, x8;
		int y1, y2, y3, y4, y5, y6, y7, y8;
		int common;
		int fractionPair;
		int userGuess;
		int playerScore = 0;
		int hardness;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Beginner press 1 Advanced press 2: ");
		hardness = input.nextInt();
		
		if (hardness == 2) {
			hardness = 200;
		} else {
			hardness = 10;
		}
		
		common = (int) (10 * Math.random() + 1);
		x1 = (int) (hardness * Math.random() + 1);
		x2 = (int) (hardness * Math.random() + 1);
		x3 = (int) (hardness * Math.random() + 1);
		x4 = (int) (hardness * Math.random() + 1);
		x5 = (int) (hardness * Math.random() + 1);
		x6 = (int) (hardness * Math.random() + 1);
		x7 = (int) (hardness * Math.random() + 1);
		y1 = (int) (hardness * Math.random() + 1);
		y2 = (int) (hardness * Math.random() + 1);
		y3 = (int) (hardness * Math.random() + 1);
		y4 = (int) (hardness * Math.random() + 1);
		y5 = (int) (hardness * Math.random() + 1);
		y6 = (int) (hardness * Math.random() + 1);
		y7 = (int) (hardness * Math.random() + 1);

		x8 = common * x1;
		y8 = common * y1;
		fractionPair = (int) (7 * Math.random() + 1);

		System.out.println("Equivalent Fractions Quiz\n");

		switch (fractionPair) {
		case 1:
			System.out.println("1. " + x1 + " / " + y1);
			System.out.println("2. " + x8 + " / " + y8);
			System.out.println("3. " + x2 + " / " + y2);
			System.out.println("4. " + x3 + " / " + y3);
			System.out.println("5. " + x4 + " / " + y4);
			System.out.println("6. " + x5 + " / " + y5);
			System.out.println("7. " + x6 + " / " + y6);
			System.out.println("8. " + x7 + " / " + y7);
			break;
		case 2:
			System.out.println("1. " + x1 + " / " + y1);
			System.out.println("2. " + x2 + " / " + y2);
			System.out.println("3. " + x8 + " / " + y8);
			System.out.println("4. " + x3 + " / " + y3);
			System.out.println("5. " + x4 + " / " + y4);
			System.out.println("6. " + x5 + " / " + y5);
			System.out.println("7. " + x6 + " / " + y6);
			System.out.println("8. " + x7 + " / " + y7);
			break;
		case 3:
			System.out.println("1. " + x1 + " / " + y1);
			System.out.println("2. " + x2 + " / " + y2);
			System.out.println("3. " + x3 + " / " + y3);
			System.out.println("4. " + x8 + " / " + y8);
			System.out.println("5. " + x4 + " / " + y4);
			System.out.println("6. " + x5 + " / " + y5);
			System.out.println("7. " + x6 + " / " + y6);
			System.out.println("8. " + x7 + " / " + y7);
			break;
		case 4:
			System.out.println("1. " + x1 + " / " + y1);
			System.out.println("2. " + x2 + " / " + y2);
			System.out.println("3. " + x3 + " / " + y3);
			System.out.println("4. " + x4 + " / " + y4);
			System.out.println("5. " + x8 + " / " + y8);
			System.out.println("6. " + x5 + " / " + y5);
			System.out.println("7. " + x6 + " / " + y6);
			System.out.println("8. " + x7 + " / " + y7);
			break;
		case 5:
			System.out.println("1. " + x1 + " / " + y1);
			System.out.println("2. " + x2 + " / " + y2);
			System.out.println("3. " + x3 + " / " + y3);
			System.out.println("4. " + x4 + " / " + y4);
			System.out.println("5. " + x5 + " / " + y5);
			System.out.println("6. " + x8 + " / " + y8);
			System.out.println("7. " + x6 + " / " + y6);
			System.out.println("8. " + x7 + " / " + y7);
			break;
		case 6:
			System.out.println("1. " + x1 + " / " + y1);
			System.out.println("2. " + x2 + " / " + y2);
			System.out.println("3. " + x3 + " / " + y3);
			System.out.println("4. " + x4 + " / " + y4);
			System.out.println("5. " + x5 + " / " + y5);
			System.out.println("6. " + x6 + " / " + y6);
			System.out.println("7. " + x8 + " / " + y8);
			System.out.println("8. " + x7 + " / " + y7);
			break;
		case 7:
			System.out.println("1. " + x1 + " / " + y1);
			System.out.println("2. " + x2 + " / " + y2);
			System.out.println("3. " + x3 + " / " + y3);
			System.out.println("4. " + x4 + " / " + y4);
			System.out.println("5. " + x5 + " / " + y5);
			System.out.println("6. " + x6 + " / " + y6);
			System.out.println("7. " + x7 + " / " + y7);
			System.out.println("8. " + x8 + " / " + y8);
			break;
		}

		System.out.print("Which fraciton number is equivalent ot fraction #1? #");
		userGuess = input.nextInt();
		input.close();

		if (userGuess == 2 && fractionPair == 1) {
			System.out.print("Correct!");
			playerScore += 1;
		} else if (userGuess == 3 && fractionPair == 2) {
			System.out.print("Correct!");
			playerScore += 1;
		} else if (userGuess == 4 && fractionPair == 3) {
			System.out.print("Correct!");
			playerScore += 1;
		} else if (userGuess == 5 && fractionPair == 4) {
			System.out.print("Correct!");
			playerScore += 1;
		} else if (userGuess == 6 && fractionPair == 5) {
			System.out.print("Correct!");
			playerScore += 1;
		} else if (userGuess == 7 && fractionPair == 6) {
			System.out.print("Correct!");
			playerScore += 1;
		} else if (userGuess == 8 && fractionPair == 7) {
			System.out.print("Correct!");
			playerScore += 1;
		} else {
			System.out.print("Wrong!");
		}

		System.out.println("Player Score: " + playerScore);
	}

}
