package example;

import java.util.Scanner;

public class TimeConverter {

	public static void hourToMinute() {
		int hour, min;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the hour: ");
		hour = input.nextInt();
		min = 60 * hour;
		System.out.println(min);
		input.close();
	}

	public static void dayToHour() {
		int hour, day;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the day: ");
		day = input.nextInt();
		hour = 24 * day;
		System.out.println(hour);
		input.close();
	}

	public static void minuteToHour() {
		int min;
		double hour;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the minutes: ");
		min = input.nextInt();
		hour = min / 60;
		System.out.println(hour);
		input.close();
	}

	public static void hourToDay() {
		int hour;
		double day;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the hour: ");
		hour = input.nextInt();
		day = hour / 24;
		System.out.println(day);
		input.close();
	}

	public static void main(String[] args) {
		int choice;
		Scanner input = new Scanner(System.in);

		System.out.println("1. Convert hours to minutes");
		System.out.println("2. Convert days to hours");
		System.out.println("3. Convert Minutes to hours");
		System.out.println("4. Convert hours to days");
		System.out.print("Enter your choice: ");
		choice = input.nextInt();
		input.close();

		if (choice == 1) {
			hourToMinute();
		} else if (choice == 2) {
			dayToHour();
		} else if (choice == 3) {
			minuteToHour();
		} else {
			hourToDay();
		}

	}

}
