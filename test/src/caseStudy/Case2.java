package caseStudy;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		int gender;
		int height;
		double weight = 0;
		double acutalWeight;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your gender 1 is male 2 is female: ");
		gender = input.nextInt();
		System.out.print("Enter your height in inches: ");
		height = input.nextInt();
		System.out.print("Enter your actual weight in pounds: ");
		acutalWeight = input.nextDouble();

		height -= 60;
		

		if (height >= 0) {
			if (gender == 1) {
				weight = 50 + (2.3 * height);
			} else {
				weight = 45.5 + (2.3 * height);
			}
			weight *= 2.2;

			if (acutalWeight > (1.1 * weight)) {
				System.out.println("consder more exercise and less refined sugards!");
			} else if (acutalWeight < (0.9 * weight)) {
				System.out.println("you need to eat calories! eat more vegetables/grains/proteins!");
			} else {
				System.out.println("you are A-Ok, keep it up! ");
			}

			System.out.println("The ideal weight in pounds is: " + weight);
			input.close();
		} else {
			System.out.println("you are too short");
		}

		
	}

}
