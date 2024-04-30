package main.java.creature.character.properties.skills;

import main.java.creature.character.properties.proficiency.Proficiency;
import main.java.creature.properties.attributes.Attribute;

public enum Skill implements Proficiency {
    ACROBATICS(Attribute.DEX),
    ANIMAL_HANDLING(Attribute.WIS),
    ARCANA(Attribute.INT),
    ATHLETICS(Attribute.STR),
    DECEPTION(Attribute.CHA),
    HISTORY(Attribute.INT),
    INSIGHT(Attribute.WIS),
    INTIMIDATION(Attribute.CHA),
    INVESTIGATION(Attribute.INT),
    MEDICINE(Attribute.WIS),
    NATURE(Attribute.INT),
    PERCEPTION(Attribute.WIS),
    PERFORMANCE(Attribute.CHA),
    PERSUASION(Attribute.CHA),
    RELIGION(Attribute.INT),
    SLEIGHT_OF_HAND(Attribute.DEX),
    STEALTH(Attribute.DEX),
    SURVIVAL(Attribute.WIS);


    private final Attribute attribute;

    Skill(Attribute attribute) {
        this.attribute = attribute;
    }

    public Attribute getAttribute() {
        return attribute;
    }
}
