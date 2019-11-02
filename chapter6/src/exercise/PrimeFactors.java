package exercise;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		int userNum, counter = 2;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		userNum = input.nextInt();
		input.close();

		while (counter <= userNum) {
			if (userNum % counter == 0) {
				System.out.print(counter + ", ");
				userNum /= counter;
			} else {
				counter += 1;
			}
		}

	}

}
