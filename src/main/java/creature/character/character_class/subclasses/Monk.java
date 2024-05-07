package main.java.creature.character.character_class.subclasses;

import main.java.creature.character.character_class.CharacterClass;
import main.java.creature.properties.attributes.Attribute;
import main.java.dice.Dice;
import main.java.item.weapon.WeaponType;
import main.java.item.weapon.melee.martial.Shortsword;

public class Monk extends CharacterClass {
    public Monk() {
        this.className = "Monk";
        this.hitDice = new Dice(8);
        this.primaryAbility = new Attribute[] {Attribute.DEX, Attribute.WIS};
        addSavingThrowProficiency(Attribute.STR, Attribute.DEX);
        addArmorAndWeaponProficiency(WeaponType.SIMPLE, new Shortsword());
    }
}
