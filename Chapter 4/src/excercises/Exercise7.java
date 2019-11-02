package excercises;

/*
 * feb 9 2019
 * ZiWen Wang
 * DivAndMod
 * Divsion and modululs division 
 */

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {

		int firstNum, secNum;
		int quotient, remainder;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		firstNum = input.nextInt();
		System.out.print("Enter a second integer: ");
		secNum = input.nextInt();
		input.close();
		
		quotient = firstNum/secNum;
		remainder = firstNum%secNum;
		System.out.println("");
		System.out.println(firstNum + " / " + secNum + " = " + quotient);
		System.out.println(firstNum + " % " + secNum + " = " + remainder);
		
		quotient = secNum/firstNum;
		remainder = secNum%firstNum;
		System.out.println("");
		System.out.println(firstNum + " / " + secNum + " = " + quotient);
		System.out.println(firstNum + " % " + secNum + " = " + remainder);
		
	}

}
