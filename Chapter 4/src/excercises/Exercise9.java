package excercises;

/*
 * feb 9 2019
 * ZiWen Wang
 * Sleep
 * Calculate hours you have slept and days for been alive
 * assuming you sleep 8 hours a day 30 days a month and 365 days a year 
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise9 {

	public static void main(String[] args) {
		int birthYear, birthMonth, birthDay;
		int currentYear, currentMonth, currentDate;
		Scanner input = new Scanner(System.in);
		NumberFormat number = NumberFormat.getIntegerInstance();
		
		System.out.println("Enter your birthdate:");
		System.out.print("Year: ");
		birthYear = input.nextInt();
		System.out.print("Month: ");
		birthMonth = input.nextInt();
		System.out.print("Day: ");
		birthDay = input.nextInt();
		
		System.out.println("Enter today's date:");
		System.out.print("Year: ");
		currentYear = input.nextInt();
		System.out.print("Month: ");
		currentMonth = input.nextInt();
		System.out.print("Day: ");
		currentDate = input.nextInt();
		
		input.close();
		
		int alive = (365*currentYear + 30*currentMonth + currentDate) - (365*birthYear + 30*birthMonth + birthDay);
		int slept = alive * 8;
		
		System.out.println("You have been alive for " + number.format(alive) + " days.");
		System.out.println("You have slept " + number.format(slept) + " hours.");

	}

}
