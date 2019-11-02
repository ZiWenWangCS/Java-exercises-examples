package exercise;

import java.util.Scanner;

public class DigitsDisplay {

	public static void main(String[] args) {
		int length, counter;
		String num;
		String digits;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a postive integer: ");
		num = input.nextLine();
		input.close();
		length = num.length();
		counter = length;
		
		while (counter != 0) {
			while (length - counter >= 0) {
				digits = num.substring(length - counter , length - counter +1);
				System.out.println(digits);
				break;
			}
			counter -= 1;
		}

	}

}
