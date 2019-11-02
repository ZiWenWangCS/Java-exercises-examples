package exercise;

import java.util.Scanner;

public class PrimeNumberB {

	public static void main(String[] args) {
		int firstInput, secInput;
		int remainder = 1, factor = 1;
		String primeString = "";
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a nummber: ");
		firstInput = input.nextInt();
		System.out.print("Enter a larger number than previous: ");
		secInput = input.nextInt();
		input.close();

		while (firstInput < secInput) {
			while (remainder != 0 && factor < firstInput - 1) {
				factor += 1;
				//System.out.println("Factor: " + factor);
				remainder = firstInput % factor;
				//System.out.println("Remainder: " + remainder);
			}
			if (remainder != 0 && firstInput !=1) { // firstinput not equal to 1 b/c 1 is not prime num
				primeString += firstInput + ", ";
				//System.out.println("primestring " + primeString);
			}
			remainder = 1;
			factor = 1;
			firstInput += 1;
			//System.out.println("firsrtinput: " + firstInput);
		}
		System.out.println("The prime numbers are: " + primeString);
	}

}
