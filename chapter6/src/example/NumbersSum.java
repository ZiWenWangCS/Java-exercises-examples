package example;

import java.util.Scanner;

public class NumbersSum {

	public static void main(String[] args) {
		int userNum;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer to find the sum: ");
		userNum = input.nextInt();
		input.close();
		
		do {
			sum += userNum;
			userNum -= 1;
			System.out.println(userNum);
		} while (userNum != 1);
		
		sum += userNum;
		System.out.print("The sum is: " + sum);
	}

}
