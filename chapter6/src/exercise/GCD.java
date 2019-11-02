package exercise;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		int num1, num2;
		int temp = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num1 = input.nextInt();
		System.out.print("Enter a second number : ");
		num2 = input.nextInt();
		input.close();
		
		while (num2>0) {
			temp = num1 % num2;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.println(num1);
	}

}
