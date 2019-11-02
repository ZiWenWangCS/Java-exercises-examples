package example;

import java.util.Scanner;

public class Stages {

	public static void main(String[] args) {
		int age;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		age = input.nextInt();
		input.close();
		
		if (age >= 18) { //age greater than 18
			System.out.println("adult");
		} else {
			if (age <= 5) { // age smaller than 18
				System.out.println("toddler");
			} else if (age <=10) {
				System.out.println("child");
			} else if (age <=12) {
				System.out.println("preteen");
			} else {
				System.out.println("teen");
			}
		}
	}

}
