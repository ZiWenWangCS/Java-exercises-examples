package exercise;

import java.util.Scanner;

public class Chaos {

	public static void main(String[] args) {
		double x=0.5;
		double y;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a value: ");
		y = input.nextDouble();
		input.close();

		for (int i = 0; i < 50; i++) {
			x = y * x * (1 - x);
			System.out.println(x);
		}
	}

}
