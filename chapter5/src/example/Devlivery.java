package example;

import java.util.Scanner;

public class Devlivery {

	public static void main(String[] args) {
		int height, width, length;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of your package: ");
		length = input.nextInt();
		System.out.print("Enter the width of your package: ");
		width = input.nextInt();
		System.out.print("Enter the height of your package: ");
		height = input.nextInt();
		input.close();
		
		if ( !(length > 0) || !(width > 0) || !(height > 0)) {
			System.out.println("Rject");
		} else if ( (length > 10 ) || (width > 10) || (height > 10 )) {
			System.out.println("Reject");
		} else if ( (length <= 10) & (width <= 10) & (height <= 10 )) {
			System.out.println("Accept");
		}

	}

}
