package main.java.character;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.character_class.CharacterClass;
import main.java.character_class.CharacterClassFactory;
import main.java.dice.Dice;
import main.java.race.Race;
import main.java.race.RaceFactory;

import java.util.*;

import static main.java.utils.InputUtils.getIntegerInput;
import static main.java.utils.InputUtils.getStringInput;
import static main.java.utils.MathUtils.sumOfArrayExceptMin;

public class CharacterManager {
	private final Scanner scanner;
	private final CharacterClassFactory characterClassFactory;
	private final RaceFactory raceFactory;
	
	public CharacterManager(Scanner scanner, CharacterClassFactory characterClassFactory, RaceFactory raceFactory) {
		this.scanner = scanner;
		this.characterClassFactory = characterClassFactory;
		this.raceFactory = raceFactory;
	}
	
	public Character createCharacterFromInput() {
		String name = readCharacterName();
		Race race = readCharacterRace();
		int age = readCharacterAge(race);
		CharacterClass characterClass = readCharacterClass();
		Attributes attributes = readCharacterAttributes();
		
		return new Character.Builder(name)
				.race(race)
				.age(age)
				.characterClass(characterClass)
				.attributes(attributes)
				.build();
	}
	
	private String readCharacterName() {
		return getStringInput("Enter character name: ", scanner);
	}
	
	private Race readCharacterRace() {
		String raceInput = getStringInput("Enter race: ", scanner);
		return raceFactory.getRace(raceInput);
	}
	
	private int readCharacterAge(Race race) {
		int ageInput = getIntegerInput("Enter age: ", scanner);
		if (ageInput > race.getAgeMax()) {
			System.out.println(STR."The age you entered is more than the average lifespan of the race you chose (\{race.getRaceName()})");
			String choice = getStringInput("Do you really want to continue? (Y/n)  ", scanner);
			if (Objects.equals(choice, "n")) {
				ageInput = readCharacterAge(race);
			}
		}
		if (ageInput < 0) {
			System.out.println("Age cannot be negative!");
			ageInput = readCharacterAge(race);
		}
		return ageInput;
	}
	
	private CharacterClass readCharacterClass() {
		String classInput = getStringInput("Enter class: ", scanner);
		return characterClassFactory.getClass(classInput);
	}
	
	private Attributes readCharacterAttributes() {
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
					n = getIntegerInput(STR."\{attribute}:  ", scanner);
					if (chosenValues.contains(n)) {
						throw new IllegalArgumentException("This value is already chosen for another attribute. Please choose a different one.");
					} else if (n < 1 || n > 6) {
						throw new IllegalArgumentException("invalid choice input - it must be in <1,6>");
					} else {
						isValidChoice = true;
						chosenValues.add(n);
					}
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
			} while (!isValidChoice);
			
			attributes.setAttribute(attribute, points[n-1]);
		}
		return attributes;
	}
}
