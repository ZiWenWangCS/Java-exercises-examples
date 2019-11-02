package example;


import java.util.Scanner;

public class AccountSetup {

	public static void main(String[] args) {
		String userName, password = null;
		int passwordLength = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your user name: ");
		userName = input.nextLine();
		
		while (passwordLength < 8) {
			System.out.print("Enter your password that is at least 8 characters: ");
			password = input.nextLine();
			passwordLength = password.length();
		}
		
		input.close();
		
		userName = userName.toLowerCase();
		password = password.toLowerCase();
		
		System.out.println("Your user name is " + userName + " your password is " + password);
	}

}
