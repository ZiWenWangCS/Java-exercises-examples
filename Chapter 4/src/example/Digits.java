package example;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a 2 digit number");
		num = input.nextInt();
		input.close();
		
		System.out.println("Your tens digit and ones digit is:" + num);
		
		
		

	}

}
