package main.java.char_sheet;

import main.java.creature.character.Character;
import main.java.creature.character.character_class.subclasses.Bard;
import main.java.creature.character.race.dragonborn.Dragonborn;
import main.java.creature.properties.alignment.Alignment;
import main.java.creature.properties.attributes.Attributes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class CharSheetCreatorMain {
    public static void main(String[] args) {
        Path documentsFolder = Path.of("/home/user1/IdeaProjects/dnd_java/documents");
        Path destinationFolder = documentsFolder.resolve("char_sheets");

        File templateDoc = documentsFolder.resolve("CharSheetPDF.pdf").toFile();
        File sheetFieldsDoc = documentsFolder.resolve("charSheetFields.pdf").toFile();

        File destination = destinationFolder.resolve("hafihaf.pdf").toFile();

        Character character = new Character.Builder("hafihaf")
                .race(new Dragonborn())
                .age(45)
                .characterClass(new Bard())
                .attributes(new Attributes(9, 12, 14, 6, 18, 13))
                .alignment(Alignment.CHAOTIC_EVIL)
                .build();

        CharSheetCreator creator = new CharSheetCreator(templateDoc, character);
        try {
            creator.createCharSheetFields(sheetFieldsDoc);
            creator.createCharSheet(destination);
        } catch (IOException e) {
            System.out.println("There has occurred an IOException!!");
        }
    }
}
