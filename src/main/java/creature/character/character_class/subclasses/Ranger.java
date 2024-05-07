package main.java.creature.character.character_class.subclasses;

import main.java.creature.character.character_class.CharacterClass;
import main.java.creature.properties.attributes.Attribute;
import main.java.dice.Dice;
import main.java.item.armor.ArmorCategory;
import main.java.item.weapon.WeaponType;

public class Ranger extends CharacterClass {
    public Ranger() {
        this.className = "Ranger";
        this.hitDice = new Dice(10);
        this.primaryAbility = new Attribute[] {Attribute.DEX, Attribute.WIS};
        addSavingThrowProficiency(Attribute.STR, Attribute.DEX);
        addArmorAndWeaponProficiency(ArmorCategory.LIGHT_ARMOR, ArmorCategory.MEDIUM_ARMOR, ArmorCategory.SHIELD, WeaponType.SIMPLE, WeaponType.MARTIAL);
    }
}
