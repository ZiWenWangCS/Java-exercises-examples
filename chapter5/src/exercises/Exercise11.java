package exercises;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		int a, b, c;
		double d;
		double root1, root2;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the vlaue for a: ");
		a = input.nextInt();
		System.out.print("Enter the value for b: ");
		b = input.nextInt();
		System.out.print("Enter the value for c: ");
		c = input.nextInt();
		input.close();

		d = Math.pow(b, 2) - (4 * a * c);

		if (d > 0) {
			root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			System.out.print("The roots are " + root1 + " and " + root2);
		} else if (d == 0) {
			root1 = -b / (2 * a);
			System.out.print("The only real root is " + root1);
		} else {
			System.out.println("No real root");
		}

	}

}
