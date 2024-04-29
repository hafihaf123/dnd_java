package main.java.skills;

import main.java.attributes.Attribute;

public enum Skill {
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
