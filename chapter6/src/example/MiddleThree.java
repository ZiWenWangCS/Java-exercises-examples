package example;

import java.util.Scanner;

public class MiddleThree {

	public static void main(String[] args) {
		String phrase, threeLetters;
		int phraseLength;
		int mid;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter text that contains at least three characters: ");
		phrase = input.nextLine();
		input.close();

		phraseLength = phrase.length();
		System.out.println(phraseLength);
		mid = phraseLength / 2;
		System.out.println(mid);
		
		threeLetters = phrase.substring(mid - 1, mid + 2);
		System.out.println("middle three characters are: " + threeLetters);
	}

}
