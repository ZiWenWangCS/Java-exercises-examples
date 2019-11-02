package example;

import java.util.Scanner;
import java.lang.String;

public class NumberCounts {

	public static void main(String[] args) {
		int[] counts = new int[10];
		String user;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a num: ");
		user = input.next();
		input.close();

		for (int i = 0; i < counts.length; i++) {
			String xString = Integer.toString(i);
			for (int u = 0; u <= user.length(); u++) {
				if (user.indexOf(xString) >= 0) {
					counts[i] += 1;
					user = user.replaceFirst(xString, "");
				}
			}
		}
		
		
		for (int i=0; i < counts.length; i ++) {
			System.out.println(counts[i]);
		}

	}

}
