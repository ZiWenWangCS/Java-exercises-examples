package example;

import java.util.Scanner;

public class Exponentiation {

	/**
	 * calculate the num rasied to a power
	 * pre : power >= 1
	 * post : num rasied to a power
	 */
	public static int powerOf(int x, int y) {
		int value = 1;
		for (int i = 1; i <= y; i++) {
			value *= x;
		}
		return (value);
	}

	public static void main(String[] args) {
		int num, power, value;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		num = input.nextInt();
		System.out.print("Enter the power: ");
		power = input.nextInt();

		value = powerOf(num, power);

		System.out.println(value);
		input.close();

	}

}
