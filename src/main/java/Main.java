package main.java;

import main.java.character.Character;
import main.java.race.Race;
import main.java.race.RaceFactory;

import java.util.Scanner;

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
		
		Character character = new Character.Builder(name)
				.race(race)
				.build();
		
		System.out.println();
		System.out.println(character);
	}
}