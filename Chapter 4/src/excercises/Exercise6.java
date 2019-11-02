package excercises;
/*
 * feb 9 2019
 * ZiWen Wang
 * Digits
 * display the hundreds tens and one place digit
 */

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		int num, hundred, ten, one;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit number: ");
		num = input.nextInt();
		input.close();
		
		hundred = num/100;
		num %= 100;
		ten = num /10;
		num %= 10;
		one = num;
		
		System.out.println("The hundreds place digit is: " + hundred);
		System.out.println("The tens place digit is: " + ten);
		System.out.println("The ones place digit is: " + one);

	}

}
