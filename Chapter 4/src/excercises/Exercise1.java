package excercises;
/*
 * feb 9 2019
 * ZiWen Wang
 * ObjectHeight
 * Calculating object heights from falling at 100m at t second
 * formula h = 100 - 4.9*t^2
 */

import java.util.Scanner;

public class Exercise1 {

		public static void main(String[] args) {
			double t, h;
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter a time less than 4.5 seconds: ");
			t = input.nextInt();
			h = 100 - 4.9*t*t;
			input.close();
			
			System.out.println("The height of the object is: " + h +" meters");
		}
	
}
