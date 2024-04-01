package main.java;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.character.Character;
import main.java.character_class.CharacterClass;
import main.java.character_class.CharacterClassFactory;
import main.java.dice.Dice;
import main.java.race.Race;
import main.java.race.RaceFactory;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import static main.java.utils.MathUtils.sumOfArrayExceptMin;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello and welcome!");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter character name:");
		String name = scanner.nextLine();
		
		System.out.println("Enter race:");
		String raceInput = scanner.nextLine();
		RaceFactory raceFactory = new RaceFactory();
		Race race = raceFactory.getRace(raceInput);
		
		System.out.println("Enter class:");
		String classInput = scanner.nextLine();
		CharacterClassFactory characterClassFactory = new CharacterClassFactory();
		CharacterClass characterClass = characterClassFactory.getClass(classInput);
		
		Attributes attributes = new Attributes();
		
		Dice d6 = new Dice(6);
		int[] points = new int[6];
		for(int i=0; i<6; i++) {
			int[] rolls = new int[4];
			for (int ii=0; ii<4; ii++) {
				rolls[ii] = d6.roll();
			}
			points[i] = sumOfArrayExceptMin(rolls);
		}
		
		System.out.println("points for stats:");
		for (int i=0; i<6; i++) {
			System.out.println(STR."(\{i+1}) - \{points[i]}");
		}
		
		Set<Integer> chosenValues = new HashSet<>();
		for (Attribute attribute : Attribute.values()) {
			int n = 0;
			boolean isValidChoice = false;
			
			do {
				try {
					System.out.print(STR."\{attribute}:  ");
					n = scanner.nextInt();
					if (chosenValues.contains(n)) {
						throw new IllegalArgumentException("This value is already chosen for another attribute. Please choose a different one.");
					} else if (n < 1 || n > 6) {
						throw new IllegalArgumentException("invalid choice input - it must be in <1,6>");
					} else {
						isValidChoice = true;
						chosenValues.add(n);
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Please enter a valid integer.");
					scanner.next();
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			} while (!isValidChoice);
			
			attributes.setAttribute(attribute, points[n-1]);
		}
		
		Character character = new Character.Builder(name)
				.race(race)
				.characterClass(characterClass)
				.attributes(attributes)
				.build();
		
		System.out.println();
		System.out.println(character);
	}
}