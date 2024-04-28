package main.java;

import main.java.character.Character;
import main.java.character.CharacterManager;
import main.java.character_class.CharacterClassFactory;
import main.java.race.RaceFactory;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello and welcome!");
		Scanner scanner = new Scanner(System.in);
		
		CharacterClassFactory characterClassFactory = new CharacterClassFactory();
		RaceFactory raceFactory = new RaceFactory();
		
		CharacterManager characterManager = new CharacterManager(scanner, characterClassFactory, raceFactory);

		Character character = characterManager.createCharacterFromInput();
		
		System.out.println(STR."\n\{character}");
	}
}