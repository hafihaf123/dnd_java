package main.java.char_sheet;

import com.itextpdf.text.DocumentException;
import main.java.creature.character.Character;
import main.java.creature.character.character_class.subclasses.Bard;
import main.java.creature.character.race.dragonborn.Dragonborn;
import main.java.creature.properties.alignment.Alignment;
import main.java.creature.properties.attributes.Attributes;

import java.io.File;
import java.io.IOException;

public class CharSheetCreatorMain {
    public static void main(String[] args) {
        File destination = new File("/home/user1/IdeaProjects/dnd_java/documents/char_sheets/charSheet1.pdf");
        Character character = new Character.Builder("hafihaf")
                .race(new Dragonborn())
                .age(45)
                .characterClass(new Bard())
                .attributes(new Attributes())
                .alignment(Alignment.CHAOTIC_EVIL)
                .build();
        CharSheetCreator creator = new CharSheetCreator(character);
        try {
            creator.createCharSheet(destination);
        } catch (IOException e) {
            System.out.println("There has occurred an IOException!!");
        } catch (DocumentException e) {
            System.out.println("There has occurred an DocumentException!!");
        }
    }
}
