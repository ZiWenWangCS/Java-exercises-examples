package exercise;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		String sentence;
		char vowels = 0;
		int counter = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter text:");
		sentence = input.nextLine();
		sentence = sentence.toLowerCase();
		input.close();

		for (int i = 0; i < sentence.length(); i++) {
			vowels = sentence.charAt(i);
			if (vowels == 'a' || vowels == 'e' || vowels == 'u' || vowels == 'i' || vowels == 'o') {
				counter += 1;
			}
		}

		System.out.println("The number of vowels in " + sentence + " is " + counter);
	}

}
