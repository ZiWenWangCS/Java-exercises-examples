package example;

import java.util.Scanner;

public class SurfsUp {

	public static void main(String[] args) {
		int height;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter wave height: ");
		height = input.nextInt();
		input.close();
		
		if (height >= 6) { //over 6 or equal
			System.out.println("Great day for surfing!");
		} else if (height > 3) { // between 6 and 3
			System.out.println("Go body boarding!");
		} else if (height >=0){ // from 0 to 3
			System.out.println("Go for a swim.");
		} else { // negative value
			System.out.println("Whoa! what kind of surf is that?");
		}
		
	}
	
}