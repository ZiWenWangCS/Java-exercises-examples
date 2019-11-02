package excercises;
/*
 * feb 9 2019
 * ZiWen Wang
 * Change
 * Calculate the changes to give back to the client
 */

import java.util.Scanner;


public class Exericse5 {

	public static void main(String[] args) {
		
		int cent;
		int quart, dime, nick, penn;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the change in cents: ");
		cent = input.nextInt();
		input.close();
		
		quart = cent/25;
		cent %= 25;
		dime = cent/10;
		cent %= 10;
		nick = cent/5;
		cent %= 5;
		penn = cent;
		
		System.out.println("The minmum number of coins is:");
		System.out.println("Quarters: " + quart);
		System.out.println("Dimes: " + dime);
		System.out.println("Nickels: " + nick);
		System.out.println("Pennies: " + penn);

	}

}
