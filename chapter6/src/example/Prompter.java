package example;

import java.util.Scanner;

public class Prompter {

	public static void main(String[] args) {
		int max, min, userNum;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a minimum value: ");
		min = input.nextInt();
		System.out.print("Enter a maximum value: ");
		max = input.nextInt();
		
		do {
			System.out.println("Enter a between " + min + " and " + max);
			userNum = input.nextInt();
		} while (userNum <= min || userNum >= max);
		
		input.close();
	}

}
