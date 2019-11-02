package example;

import java.util.Scanner;

public class DisplayBox {

	public static void drawBox(int width) {
		for (int i = 1; i <= width; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}

	public static void drawBox(int width, String character) {
		for (int i = 1; i <= width; i++) {
			System.out.print(character);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		int length, width;
		String y, character;
		Scanner input = new Scanner(System.in);

		System.out.print("Do you want to enter a character to use to diaply the box?");
		y = input.nextLine();
		System.out.print("Enter a length: ");
		length = input.nextInt();
		System.out.print("Enter a width: ");
		width = input.nextInt();

		if (y.startsWith("y") == true) {
			System.out.print("Enter the character you want: ");
			character = input.next();
			for (int i = 1; i <= length; i++) {
				drawBox(width, character);
			}
		} else {
			for (int i = 1; i <= length; i++) {
				drawBox(width);
			}
		}

		input.close();
	}

}
