package example;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int x;
		double factorial =1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		x = input.nextInt();
		input.close();
		
		for (int i = 1; i < x; ) {
			factorial *= x;
			x -=1;
			System.out.println(factorial);
		}
		
	}

}
