package example;

import java.util.Scanner;

public class CharAndArray {

	public static void main(String[] args) {
		final int LOW = 'A'; // smallest possible value A = 65
		final int HIGH = 'Z'; // highest possible value Z = 90
		int[] letterCoutns = new int[HIGH - LOW + 1];
		Scanner input = new Scanner(System.in);
		String word;
		char[] wordLetters;
		int offset; // array index
		int decimal;

		/* prompt user for a word */
		System.out.print("Enter a word: ");
		word = input.nextLine();
		input.close();

		/* ocnvert word to char array and coutn letter occurences */
		word = word.toUpperCase();
		/* trim all the white spaces and nonalphabetic characters */
		for (int i = 0; i < word.length(); i++) {
			decimal = word.charAt(i);
			if (decimal < 65 || decimal > 90) {
				//System.out.println(Character.toString((char) decimal));
				word = word.replace(Character.toString((char) decimal), "");
				//System.out.println(word);
				i-=1;		//letters being replaced index gets less
				//System.out.println("i: " + i + " length: " + word.length() );
			}
		}

		wordLetters = word.toCharArray();
		for (int letter = 0; letter < wordLetters.length; letter++) {
			offset = wordLetters[letter] - LOW;
			letterCoutns[offset] += 1;
		}

		/* show letter occurences */
		for (int i = LOW; i <= HIGH; i++) {
			System.out.println((char) i + ": " + letterCoutns[i - LOW]);
		}
	}

}
