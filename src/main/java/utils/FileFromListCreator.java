package main.java.utils;

import main.java.creature.properties.attributes.Attribute;
import main.java.dice.Dice;
import main.java.utils.subclass_creators.CharacterClassSubclassFileCreator;
import main.java.utils.subclass_creators.ItemSubclassFileCreator;
import main.java.utils.subclass_creators.SubclassFileCreator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class FileFromListCreator {
    private static final Path pathToListFile = Path.of("/home/user1/IdeaProjects/dnd_java/lists/character_class/character_class_list.txt");
    /** relative to the absolute path of the superclass directory */
    private static final String relativeDirPathName = "subclasses";

    public static void main(String[] args) {
        createFiles(readCharacterClassList());
    }

    private static List<CharacterClassSubclassFileCreator> readCharacterClassList() throws RuntimeException {
        try (
            BufferedReader fileReader = new BufferedReader(new FileReader(pathToListFile.toFile()))
        ) {
            AtomicInteger count = new AtomicInteger();
            List<String> names = new ArrayList<>();
            List<Dice> hitDices = new ArrayList<>();
            List<Attribute[]> primaryAttributes = new ArrayList<>();
            List<Attribute[]> savingThrowProficiencies = new ArrayList<>();
            List<String> armorAndWeaponProficiencies = new ArrayList<>();
            List<CharacterClassSubclassFileCreator> characterClassSubclassFileCreators = new ArrayList<>();
            fileReader
                .lines()
                .forEach(
                        line -> {
                            switch (count.get() % 6) {
                                case 0 -> names.add(line);
                                case 1 -> hitDices.add(new Dice(Integer.parseInt(line)));
                                case 2 -> {
                                    if (!line.contains(",")) {
                                        primaryAttributes.add(new Attribute[]{Attribute.valueOf(line.substring(0, 3).toUpperCase())});
                                    } else {
                                        Attribute attribute1 = Attribute.valueOf(line.substring(0, line.indexOf(",")).substring(0, 3).toUpperCase());
                                        Attribute attribute2 = Attribute.valueOf(line.substring(line.indexOf(",") + 1).substring(0, 3).toUpperCase());
                                        primaryAttributes.add(new Attribute[]{attribute1, attribute2});
                                    }
                                }
                                case 3 -> {
                                    if (!line.contains(",")) {
                                        primaryAttributes.add(new Attribute[]{Attribute.valueOf(line.substring(0, 3).toUpperCase())});
                                    } else {
                                        Attribute attribute1 = Attribute.valueOf(line.substring(0, line.indexOf(",")).substring(0, 3).toUpperCase());
                                        Attribute attribute2 = Attribute.valueOf(line.substring(line.indexOf(",") + 1).substring(0, 3).toUpperCase());
                                        savingThrowProficiencies.add(new Attribute[]{attribute1, attribute2});
                                    }
                                }
                                case 4 -> armorAndWeaponProficiencies.addAll(Arrays.asList(line.split(",")));
                                case 5 -> {}
                                default -> throw new RuntimeException("error in counting the lines");
                            }
                            count.getAndIncrement();
                        }
                );
            for (int i = 0; i < count.get()/6; i++) {
                characterClassSubclassFileCreators.add(new CharacterClassSubclassFileCreator(
                        names.get(i),
                        hitDices.get(i),
                        primaryAttributes.get(i),
                        Set.of(savingThrowProficiencies.get(i)),
                        List.of(armorAndWeaponProficiencies.get(i)),
                        relativeDirPathName
                ));
            }
            return characterClassSubclassFileCreators;
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }

    private static List<ItemSubclassFileCreator> readItemList() throws RuntimeException {
        try (
                BufferedReader fileReader = new BufferedReader(new FileReader(pathToListFile.toFile()))
        ) {
            return fileReader
                    .lines()
                    .map(line -> line.split(" "))
                    .map(parts -> {
                                String name = parts[0];
                                int cost = Integer.parseInt(parts[1]);
                                String coinType = parts[2].toUpperCase();
                                double weight = Double.parseDouble(parts[3]);
                                return new ItemSubclassFileCreator(name, cost, coinType, weight, relativeDirPathName);
                            }
                    )
                    .toList();
        } catch (IOException ioException) {
            throw new RuntimeException(ioException);
        }
    }

    private static <T extends SubclassFileCreator> void createFiles(List<T> list) throws RuntimeException{
        try {
            list.forEach(SubclassFileCreator::createFile);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}