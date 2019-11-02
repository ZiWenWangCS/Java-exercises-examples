package example;

import java.util.Scanner;

public class AlphaOrder {

	public static void main(String[] args) {
		String word1, word2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		word1 = input.nextLine();
		System.out.print("Enter a second word: ");
		word2 = input.nextLine();
		input.close();
		
		if (word1.compareToIgnoreCase(word2) == 0) {
			System.out.println("Words Area equal.");
		} else if (word1.compareToIgnoreCase(word2) < 0) {
			System.out.println("In alphabetical order: " + word1 + " " + word2);
		} else {
			System.out.println("In alphabeticla order: " + word2 + " " + word1);
		}

	}

}
