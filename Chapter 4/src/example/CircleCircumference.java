package example;

//import package
import java.util.Scanner;

public class CircleCircumference {
	
	public static void main(String[] args) {
		final double PI = 3.14; //constant cannot be changed
		int r;
		double circumference;
		// <class> <variable name> = new <class>(<arguments>);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a radius: ");
		r = input.nextInt();
		input.close();
		
		if (r > 0) {
			circumference = 2*PI*r;
			System.out.print("The circumference is: " + circumference);
		} else {
			System.out.print("Negative raddi are illegal.");
		}
		
		

	}

}
