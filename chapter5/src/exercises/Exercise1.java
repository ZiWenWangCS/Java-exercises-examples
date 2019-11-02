package exercises;

import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise1 {

	public static void main(String[] args) {
		int copies;
		double pay;
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();

		System.out.print("Enter the number of copies to be printed: ");
		copies = input.nextInt();
		input.close();

		if (copies < 100) {
			System.out.println("Price per copy is: $0.3");
			pay = copies * 0.3;
		} else if (copies < 499) {
			System.out.println("Price per copy is: $0.28");
			pay = copies * 0.28;
		} else if (copies < 749) {
			System.out.println("Price per copy is: $0.27");
			pay = copies * 0.27;
		} else if (copies < 1000) {
			System.out.println("Price per copy is: $0.26");
			pay = copies * 0.26;
		} else {
			System.out.println("Price per copy is: $0.25");
			pay = copies * 0.25;
		}
	
		System.out.println("Total cost is:" + money.format(pay));
	}

}
