package example;

import java.util.Scanner;

public class NameBackwards {

	public static void main(String[] args) {
		String word;
		Scanner input = new Scanner(System.in);
		char[] wordLetters;

		System.out.print("Enter your name: ");
		word = input.nextLine();
		wordLetters = word.toCharArray();
		input.close();

		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(wordLetters[i]);
		}

	}

}
