package example;

import java.util.Scanner;

public class Formal {

	public static void main(String[] args) {
		String name = null;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		name = input.nextLine();
		input.close();
		boolean var1 = name.startsWith("Mr.");
		boolean var2 = name.startsWith("Mrs.");
		boolean var3 = name.startsWith("Miss.");
		boolean var4 = name.startsWith("Ms.");
		
		if (var1 == true) {
			System.out.println("Hello, sir.");
		} else if (var2 == true || var3 == true || var4 == true) {
			System.out.println("Hello, ma'am");
		} else {
			System.out.println("Hello, " + name);
		}
	}

}
