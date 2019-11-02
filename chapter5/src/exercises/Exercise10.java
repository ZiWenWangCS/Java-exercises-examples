package exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		double length, width, height;
		double radius;
		double side;
		double volume;
		Scanner input = new Scanner(System.in);
		DecimalFormat myFormatter = new DecimalFormat(".##");

		System.out.println("Rectangular prism");
		System.out.print("Enter the length: ");
		length = input.nextDouble();
		System.out.print("Enter the width: ");
		width = input.nextDouble();
		System.out.print("Enter the height: ");
		height = input.nextDouble();

		volume = width * height * length;

		System.out.println("The volume is : " + myFormatter.format(volume) + "\n");

		System.out.println("Sphere");
		System.out.print("Enter the radius:");
		radius = input.nextDouble();

		volume = (Math.PI * Math.pow(2 * radius, 3)) / 6;

		System.out.println("The volume is: " + myFormatter.format(volume) + "\n");

		System.out.println("Cube");
		System.out.print("Enter the side: ");
		side = input.nextDouble();

		input.close();

		volume = Math.pow(side, 3);

		System.out.println("The volujme is: " + myFormatter.format(volume));
	}

}
