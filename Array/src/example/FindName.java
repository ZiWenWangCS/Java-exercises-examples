package example;

import java.util.Scanner;

public class FindName {

	public static void promptName(String[] array) {
		Scanner input = new Scanner(System.in);

		for (int i = 0; i <= array.length - 1; i++) {
			System.out.print("Enter the name: ");
			array[i] = input.nextLine();
		}
	}

	public static int linear(String[] array, String wordToFind) {
		int index = 0;

		while (!(array[index].equalsIgnoreCase(wordToFind)) && (index < array.length - 1)) {
			index += 1;
		}

		if (array[index].equalsIgnoreCase(wordToFind)) {
			return (index + 1);
		} else {
			return (-1);
		}
	}

	public static void main(String[] args) {
		String[] name;
		String wordToFind;
		Scanner input = new Scanner(System.in);

		System.out.print("How many names you want to enter?");
		name = new String[input.nextInt()];

		promptName(name);

		System.out.print("Enter the name you want to find: ");
		wordToFind = input.next();

		System.out.println(linear(name, wordToFind));

		input.close();
	}

}
