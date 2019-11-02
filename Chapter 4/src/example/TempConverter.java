package example;

import java.util.Scanner;

public class TempConverter {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int feri;
		
		System.out.print("Enter fahrenheit temp: ");
		feri = input.nextInt();
		input.close();
		double cel;
		cel = ((double)feri-32)*5/9;
		System.out.println("Celsius:" + cel );
		
	}
}
