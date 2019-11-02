package exercise;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int prime, num = 1;
		int factor = 1;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		prime = input.nextInt();
		input.close();

		while (!(factor == 0) && num < prime - 1) {
			num += 1;
			factor = prime % num;
			
		}
		if (!(factor ==0)) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");

		}
	}

}
