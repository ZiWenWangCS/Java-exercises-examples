package example;

import java.util.Scanner;

public class Discriminant {

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the vlaue for a: ");
		a = input.nextInt();
		System.out.print("Enter the value for b: ");
		b = input.nextInt();
		System.out.print("Enter the vlaue for c: ");
		c = input.nextInt();
		input.close();
		
		d = (b*b) - (4*a*c);
		
		if (d > 0) {
			System.out.println("Two roots");
		} else if (d == 0) {
			System.out.println("One root");
		} else {
			System.out.println("No real root");
		}
	}

}
