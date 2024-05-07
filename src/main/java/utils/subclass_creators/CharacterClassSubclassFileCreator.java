package main.java.utils.subclass_creators;

import main.java.creature.character.character_class.CharacterClass;
import main.java.creature.properties.attributes.Attribute;
import main.java.dice.Dice;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

public class CharacterClassSubclassFileCreator extends CharacterClass implements SubclassFileCreator {

    private static final Path srcPath = Path.of("/home/user1/IdeaProjects/dnd_java/src");
    private static final Path characterClassDirPath = srcPath.resolve("main/java/creature/character/character_class");
    /** relative to the absolute path of the item directory */
    private final Path newDirPath;
    private final Path newFilePath;
    private final List<String> armorAndWeaponProficienciesNames;

    /** @param newDirPath relative to the absoluteCharacterClassDirPath */
    public CharacterClassSubclassFileCreator(
        String className,
        Dice hitDice,
        Attribute[] primaryAbility,
        Set<Attribute> savingThrowProficiencies,
        List<String> armorAndWeaponProficienciesNames,
        String newDirPath
    ) {
        this.className = className;
        this.hitDice = hitDice;
        this.primaryAbility = primaryAbility;
        this.savingThrowProficiencies = savingThrowProficiencies;
        this.armorAndWeaponProficienciesNames = armorAndWeaponProficienciesNames;
        this.newDirPath = characterClassDirPath.resolve(newDirPath);
        this.newFilePath = this.newDirPath.resolve(STR."\{className}.java");
    }

    @Override
    public void createFile() {
        setupDir();
        try(
                FileWriter writer = new FileWriter(newFilePath.toFile())
        ) {
            writer.write(createFileContent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setupDir() {
        try {
            Files.createDirectories(newDirPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String createFileContent() {
        String armorAndWeaponProficienciesNames = getArmorAndWeaponProficienciesNames();
        return STR.
                """
                package \{srcPath.relativize(newDirPath).toString().replace('/', '.')};

                import main.java.creature.character.character_class.CharacterClass;
                import main.java.creature.properties.attributes.Attribute;
                import main.java.dice.Dice;
                import main.java.item.armor.ArmorCategory;
                import main.java.item.weapon.WeaponType;
                import main.java.item.weapon.melee.simple.*;
                import main.java.item.weapon.melee.martial.*;
                import main.java.item.weapon.ranged.simple.*;
                import main.java.item.weapon.ranged.martial.*;

                public class \{className} extends CharacterClass {
                    public \{className}() {
                        this.className = "\{className}";
                        this.hitDice = new Dice(\{hitDice.getSides()});
                        this.primaryAbility = new Attribute[] {Attribute.\{primaryAbility[0].name()}\{ primaryAbility.length == 2 ? STR.", Attribute.\{primaryAbility[1].name()}" : ""}};
                        addSavingThrowProficiency(Attribute.\{savingThrowProficiencies.stream().sorted().toList().getFirst().name()}, Attribute.\{savingThrowProficiencies.stream().sorted().toList().get(1).name()});
                        addArmorAndWeaponProficiency(\{armorAndWeaponProficienciesNames});
                    }
                }
                """;
    }

    private String getArmorAndWeaponProficienciesNames() {
        StringBuilder armorAndWeaponProficienciesNames = new StringBuilder();
        this.armorAndWeaponProficienciesNames.forEach(
                it -> {
                    armorAndWeaponProficienciesNames.append(", ");
                    if (it.contains("Armor") || it.contains("Shield")) {
                        armorAndWeaponProficienciesNames.append(STR."ArmorCategory.\{it.toUpperCase()}");
                    } else if (it.contains("Weapon")) {
                        armorAndWeaponProficienciesNames.append(STR."WeaponType.\{it.substring(0, it.indexOf('_')).toUpperCase()}");
                    } else {
                        armorAndWeaponProficienciesNames.append(STR."new \{it}()");
                    }
                }
        );
        armorAndWeaponProficienciesNames.delete(0, 2);
        return armorAndWeaponProficienciesNames.toString();
    }
}