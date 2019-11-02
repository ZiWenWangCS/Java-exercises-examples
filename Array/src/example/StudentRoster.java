package example;

import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numStudent;
		String[] student;
		
		System.out.print("How many student?: ");
		numStudent = input.nextInt();
		student = new String[numStudent];
	
		student[0] = input.nextLine();
		
		for (int i = 0; i < student.length; i++) {
			System.out.print("Enter the name: ");
			student[i] = input.nextLine();
		}
		
		System.out.println("Student Roster");
		
		for (int i =0; i < student.length; i++) {
			System.out.println(student[i]);
		}

		input.close();
	}

}
