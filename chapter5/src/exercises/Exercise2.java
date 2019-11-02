package exercises;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		int kg, length, width, height;
		int volume;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter package weight in kilograms: ");
		kg = input.nextInt();
		System.out.print("Enter package lenght in centimeters: ");
		length = input.nextInt();
		System.out.print("Enter the package width in centimeters: ");
		width = input.nextInt();
		System.out.print("Enter the package height in centimeters: ");
		height = input.nextInt();
		input.close();
		
		volume = length * width * height;
		
		if (volume > 100000 && kg >27 ) {
			System.out.println("Too large and too large.");
		} else if (kg > 27) {
			System.out.println("Too heavy.");
		} else if (volume > 100000) {
			System.out.println("Too large");
		} else {
			System.out.println("Accepted");
		}
		

	}

}
