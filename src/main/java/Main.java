package main.java;

import main.java.char_sheet.CharSheetCreator;
import main.java.creature.character.Character;
import main.java.creature.character.CharacterManager;
import main.java.creature.character.character_class.CharacterClassFactory;
import main.java.creature.character.race.RaceFactory;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
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

		System.out.println("\nDo you want to create a character sheet? (Y/n)");
		if (!Objects.equals(scanner.next(), "n")) {
            try {
                new CharSheetCreator(
                        new File("/home/user1/IdeaProjects/dnd_java/documents/CharSheetPDF.pdf"),
                        character
                ).createCharSheet(
                        new File(STR."/home/user1/IdeaProjects/dnd_java/documents/char_sheets/\{character.getName().toLowerCase().replace(' ', '_')}.pdf")
                );
            } catch (IOException e) {
				System.out.println("The creation failed.");
            }
        }
	}
}