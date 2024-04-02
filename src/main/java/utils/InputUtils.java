package main.java.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {
	public static String getStringInput(String prompt, Scanner scanner) {
		System.out.print(prompt);
		return scanner.nextLine();
	}
	
	public static int getIntegerInput(String prompt, Scanner scanner) {
		int input = 0;
		boolean validInput = false;
		do {
			try {
				System.out.print(prompt);
				input = scanner.nextInt();
				scanner.nextLine();
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a valid integer.");
				scanner.nextLine();
			}
		} while (!validInput);
		return input;
	}
}
