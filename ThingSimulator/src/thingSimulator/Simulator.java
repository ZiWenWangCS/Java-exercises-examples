package thingSimulator;

import java.util.Scanner;

public class Simulator {

	/* game introduction */
	public static void intro() {
		System.out.println("Welcome to the Thing Simulator");
		System.out.println("The objective of this game is to figure out who is assimilated");
		System.out.println("by administering test to each of the 10 chracter");
		System.out.println("Every night, strange events will occur.");
		System.out.println("It will be up to you to deduce who is not human based off these"
				+ "\nevents. You must eliminate all assimilated hosts before they equal the "
				+ "survivors and swarm them...");
		System.out.println("You are stuck in a reserach base in the heart of the antarctic"
				+ ". Radios are useless due to the storm outside."
				+ "\nThe creatures aims to escape to civilization and assimilate all of"
				+ "humnaity. You must sotp it!");
		System.out.println("Press enter to start the simulator");

	}

	/*
	 * game start generate a rand num pre: none post: a person gets infected
	 */
	public static void start(int[] infected) {
		int x = (int) (10 * Math.random()); // generate number between 0 - 9
		infected[x] = 1;
	}

	/*
	 * print out the characters that is still not isolated pre: game not ended post:
	 * printout characters names
	 */
	public static void survivedCharacter(int[] infected, String[] character) {
		for (int i = 0; i < infected.length; i++) {
			if (infected[i] != 2) {
				System.out.println(character[i]);
			}
		}
		System.out.println();
	}

	/*
	 * gives out hint to player pre: one's a character gets infected post: gives
	 * hint
	 */
	public static void playerHint(int[] infected, String[] hint) {
		for (int i = 0; i < infected.length; i++) {
			if (infected[i] == 1) {
				System.out.println("Hint: " + hint[i] + "\n");
				break;
			}
		}
	}

	/*
	 * check user guess pre: 0<=test<=9 post: if user guesses right the character is
	 * taken out of the game
	 * 
	 */
	public static void checkInfected(int test, int[] infected) {
		test -= 1;
		if (infected[test] == 1) {
			System.out.println("He was assimlated! Thankfully you promplty incinerated" + " him!");
			infected[test] = 2;
		} else {
			System.out.println("He is a human!");
		}
	}

	/*
	 * pre: none post: infects a character 60%
	 * 
	 */
	public static void infection(int[] array) {
		int rand = (int) (10 * Math.random());
		if (rand > 3) {
			rand = (int) (10 * Math.random());
			while (array[rand] == 2 || array[rand] == 1) { // if the character has 1 or 2 as their infected array then
															// regenerate a number
				rand = (int) (10 * Math.random());
			}
			array[rand] = 1;
		} else {
			System.out.println("\nNo one got infected last night!");
		}
	}

	/*
	 * check if the infected character is over 60% pre: none post: if over 60%
	 * endGame = true the game is ended
	 */
	public static boolean end(int[] array) {
		int infected = 0;
		int assimlated = 0;
		double percentInfected;
		for (int i = 0; i < array.length; i++) {// seraches for element that contains 1
			if (array[i] == 1) {
				infected += 1;
			}
			if (array[i] == 2) {
				assimlated += 1;
			}
		}

		percentInfected = (double)infected / (array.length - assimlated);
		if (percentInfected >= 0.6 || assimlated == 10) { // over or equal to 60% of character end game or assimlated = 10
			if (assimlated == 10) {
				System.out.println("Player Win!"); // if player got all characters assimilated player win
			} else { //else lose
				System.out.println("Player Lose! More than 60% of people got infected");
			}
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// 0= not infected 1 = infected 2 = assimlated
		int[] infected = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		String[] character = { "1: Blair (Scalpel)", "2: Nauls (Radio)", "3: Palmer (Switchblade)",
				"4: Childs (Flamethrower) ", "5: Dr. Copper (Scalpel)", "6: Windows (Radio)", "7: Clark (Switchblade)",
				"8: Norris (Flamethrower)", "9: Garry (Pistol)", "10: John (Pistol)" }; // array for each character
		String[] hint = { "Scalpel", "Radio", "Switchblade", "FlameThrower", "Scapel", "Radio", "Switchblade",
				"Flamethrower", "Pistol", "Pistol" }; // hints to give to the user
		int test;
		boolean endGame = false;
		Scanner input = new Scanner(System.in);

		intro(); // Introduction
		input.nextLine();
		start(infected); // 1 character in the array gets infected randomly

		while (!endGame) {
			for (int i = 1; i > 0; i++) { // Infinite loop
				System.out.println("Day: " + i + "\n"); // print out date
				survivedCharacter(infected, character); // print out characters
				playerHint(infected, hint); // gives hint
				System.out.print("Choose who to test: ");// prompt user who to test
				test = input.nextInt();
				checkInfected(test, infected); // check if the user guessed correctly
				endGame = end(infected);
				if (endGame) {
					break;
				}
				System.out.print("Press a number enter to sleep for the night...");
				input.next();
				infection(infected);
				//for (int x = 0; x < 10; x++) {
					//System.out.print(infected[x] + " ");
				//}
			}
		}
		input.close();
	}

}
