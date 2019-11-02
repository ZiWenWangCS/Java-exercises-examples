package exercises;

import java.text.NumberFormat;
import java.util.Scanner;

public class AddCoins {

	public static void main(String[] args) {
		int quart, dime, nick, penn;
		double total;
		NumberFormat money  = NumberFormat.getCurrencyInstance();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your total coins: ");
		System.out.print("Quarters: ");
		quart = input.nextInt();
		System.out.print("Dimes: ");
		dime = input.nextInt();
		System.out.print("Nickles: ");
		nick = input.nextInt();
		System.out.print("Pennies: ");
		penn = input.nextInt();
		input.close();
		
		total = getDollarAmount(quart, dime, nick, penn);
		System.out.println("Total: " + money.format(total));
	}

	private static double getDollarAmount(int quart, int dime, int nick, int penn) {
		double money;
		money = (quart * 0.25) + (dime * 0.1) + (nick * 0.05) + (penn * 0.01);
		return money;
	}

}
