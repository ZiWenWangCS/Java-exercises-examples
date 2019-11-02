package example;

import java.util.Scanner;


public class OddSum {

	public static void main(String[] args) {
		double userNum, sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		userNum = input.nextDouble();
		input.close();
		
		for (int i = 1; i <= userNum; i++) {
			sum += i;
			i +=1;
		}
		System.out.println(sum);
	}

}
