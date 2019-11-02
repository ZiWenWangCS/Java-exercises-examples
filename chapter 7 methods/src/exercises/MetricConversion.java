package exercises;

import java.util.Scanner;

public class MetricConversion {

	public static void inchToC(int inches) {
		double c;
		c = inches * 2.54;
		System.out.println(inches + " inches quals " + c + " centimeters");
	}

	public static void ftToC(int ft) {
		double c;
		c = 30 * ft;
		System.out.println(ft + " feet equals " + c + " centimeters");
	}

	public static void yToM(int yard) {
		double meter;
		meter = 0.91 * yard;
		System.out.println(yard + " yards equals " + meter + " meters");
	}

	public static void miToKm(int mile) {
		double km;
		km = mile * 1.6;
		System.out.println(mile + " mile equals " + km + " km");
	}

	public static void cToInch(int centimeter) {
		double inch;
		inch = centimeter / 2.54;
		System.out.println(centimeter + " centimeters equal " + inch + " inches");
	}

	public static void cToFt(int centimeter) {
		double meter;
		meter = centimeter / 100;
		System.out.println(centimeter + " centimters equal " + meter + " meters");
	}

	public static void mToY(int meter) {
		double yards;
		yards = meter * 0.91;
		System.out.println(meter + " meters equal " + yards + " yards");
	}

	public static void kToMi(int km) {
		double mile;
		mile = 1.6 * km;
		System.out.println(km + " km equal " + mile + " miles");
	}

	public static void main(String[] args) {
		int convert, userNum;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number:");
		userNum = input.nextInt();
		System.out.println("Convert:");
		System.out.println("1. Inches to centimeters \t" + "5. Centimeters to Inches");
		System.out.println("2. Feet to Centimeters \t" + "6. Centimeters to Feet");
		System.out.println("3. Yards to Meters \t" + "7. Meters to Yards");
		System.out.println("4. Miles to Kilometers \t" + "8. Kilometers to Miles");
		System.out.print("Enter your choice: ");
		convert = input.nextInt();
		input.close();

		switch (convert) {
		case 1:
			inchToC(userNum);
			break;
		case 2:
			ftToC(userNum);
			break;
		case 3:
			yToM(userNum);
			break;
		case 4:
			miToKm(userNum);
			break;
		case 5:
			cToInch(userNum);
			break;
		case 6:
			cToFt(userNum);
			break;
		case 7:
			mToY(userNum);
			break;
		case 8:
			kToMi(userNum);
			break;
		}
	}

}
