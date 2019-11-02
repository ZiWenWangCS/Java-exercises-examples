package example;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		
		int width, length;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the width: ");
		width = input.nextInt();
		System.out.print("Enter the length: ");
		length = input.nextInt();
		input.close();
	
		int perimeter= 2*width+2*length;
		System.out.println("Perimeter of rectangle: "+ perimeter);
	}

}
