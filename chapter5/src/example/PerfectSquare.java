package example;

import java.lang.Math;
import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number to determine if it is a perfect squareroot: ");
		num1 = input.nextInt();
		input.close();
		num3 = (int) Math.sqrt(num1);
		num2 = (int) Math.pow(num3, 2);
		
		if (num1 == num2 ) {
			System.out.println("The number you entered is a square root");
		} else {
			System.out.println("It is not a perfect square root");
		}

	}

}
