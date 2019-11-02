package excercises;

/*
 * feb 9 2019
 * ZiWen Wang
 * SimpleInterest
 * calculating the interest
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise13 {

	public static void main(String[] args) {
		double interest;
		int year;
		double principal;
		double total;
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		/*
		System.out.print("Enter the prinipal: ");
		principal = input.nextInt();
		System.out.print("Enter the number of years: ");
		year = input.nextInt();
		System.out.print("Enter the interest rate: ");
		interest = input.nextDouble();
		input.close();
		
		total = principal * (1 + year * interest);
		System.out.print("The value after the term is: " + money.format(total));
		*/
		
		System.out.print("Enter the amount of money you want: ");
		total = input.nextInt();
		System.out.print("Enter the number of years: ");
		year = input.nextInt();
		System.out.print("Enter the interest rate: ");
		interest = input.nextDouble();
		input.close();
		
		principal = total / (1 + year * interest);
		System.out.print("The value after the term is: " + money.format(principal));
	}

}
