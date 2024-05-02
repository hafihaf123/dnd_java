package main.java.utils;

import java.util.*;

import static main.java.utils.ObjectsUtils.isExcluded;

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

	public static <T extends Enum<T>> T chooseExtraEnum(String prompt, Set<T> toExclude) {
		Scanner scanner = new Scanner(System.in);
		T extra;
		do {
			System.out.print(STR."\{prompt}: (cannot choose:");
			for (T t: toExclude)
				System.out.print(STR." \{t}");
			System.out.println(")");
			for (T t: EnumSet.allOf(toExclude.iterator().next().getDeclaringClass())) {
				System.out.println(t);
			}
			String input = getStringInput("", scanner);
			try {
				extra = Enum.valueOf(toExclude.iterator().next().getDeclaringClass(), input.toUpperCase());
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid language choice.");
				extra = chooseExtraEnum(prompt, toExclude);
			}
		} while (!isExcluded(extra, toExclude));
		return extra;
	}

	@SafeVarargs
    public static <T> T chooseOne(String prompt, T... chooseFrom) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(STR."\{prompt}: (enter index as number)");
		for (int i = 0; i < chooseFrom.length; i++) {
			System.out.println(STR."(\{i+1}) - \{chooseFrom[i]}");
		}
		return chooseFrom[(getIntegerInput("", scanner) - 1)];
	}
}
