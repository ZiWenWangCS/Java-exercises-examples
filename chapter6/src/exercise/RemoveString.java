package exercise;

import java.util.Scanner;

public class RemoveString {

	public static void main(String[] args) {
		String sentence, word;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		sentence = input.nextLine();
		System.out.print("Enter a string: ");
		word = input.nextLine();
		input.close();
		
		sentence = sentence.replaceAll(word + " ", "");
		
		System.out.println(sentence);
		
	}

}
