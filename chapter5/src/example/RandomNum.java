package example;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class RandomNum {

	public static void main(String[] args) {
		int min, max;
		Scanner input = new Scanner(System.in);
		Random r = new Random();

		System.out.print("Enter the minimum num: ");
		min = input.nextInt();
		System.out.print("Enter the maximum num: ");
		max = input.nextInt();
		input.close();

		System.out.println("The number between " + min + " and " + max + " is " + (r.nextInt(max - min + 1) + min));

		for (int i = 1; i < 1000; i++) {
			System.out.println("The number between " + min + " and " + max + " is "
					+ (int) ((max - min) * Math.random() + min));
		}
	}

}
