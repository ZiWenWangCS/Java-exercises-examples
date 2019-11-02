package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		int find;
		double n, k, t, y;
		Scanner input = new Scanner(System.in);
		DecimalFormat myFormatter = new DecimalFormat(".#####");

		System.out.println("1. Final Amount");
		System.out.println("2. Initial Amount");
		System.out.println("3. Constant <half-life>");
		System.out.print("Find: ");
		find = input.nextInt();

		if (find == 1) {
			System.out.print("Enter the intial mass: ");
			n = input.nextDouble();
			System.out.print("Enter a constant value for k: ");
			k = input.nextDouble();
			System.out.print("Enter elapsed time in years: ");
			t = input.nextDouble();
			input.close();

			y = (double) n * Math.exp(-k * t);
			System.out.println("Final amount: " + myFormatter.format(y));
		} else if (find == 2) {
			System.out.print("Enter the final mass: ");
			y = input.nextDouble();
			System.out.print("Enter a constant value for k: ");
			k = input.nextDouble();
			System.out.print("Enter elapsed time in years: ");
			t = input.nextDouble();
			input.close();

			n = y / Math.exp(-k * t);
			System.out.println("The inital amount: " + myFormatter.format(n));
		} else if (find == 3) {
			System.out.print("Enter the intial mass: ");
			n = input.nextDouble();
			System.out.print("Enter the final mass: ");
			y = input.nextDouble();
			System.out.print("Enter elapsed time in years: ");
			t = input.nextDouble();
			input.close();

			k = Math.log(y / n) / t;
			System.out.println("Constant (-k) <half-life>: " + myFormatter.format(k));
		}
	}

}
