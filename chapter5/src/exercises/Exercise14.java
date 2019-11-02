package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Exercise14 {

	public static void main(String[] args) {
		int n;
		double y, k, t;
		Scanner input = new Scanner(System.in);
		DecimalFormat myFormatter = new DecimalFormat(".##");
		
		System.out.print("Enter the intial bacteria amount: ");
		n = input.nextInt();
		System.out.print("Enter a constant value for k: ");
		k = input.nextDouble();
		System.out.print("Enter the growth time period in hours: ");
		t = input.nextDouble();
		input.close();
		
		y = (double) n * Math.exp(k * t);
		
		System.out.println("");
		System.out.println(myFormatter.format(y) + " backteria will be present after " + t +" hours." );

	}

}
