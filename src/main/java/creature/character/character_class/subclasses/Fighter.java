package main.java.creature.character.character_class.subclasses;

import main.java.creature.character.character_class.CharacterClass;
import main.java.creature.properties.attributes.Attribute;
import main.java.dice.Dice;
import main.java.item.armor.ArmorCategory;
import main.java.item.armor.shield.Shield;
import main.java.item.weapon.WeaponType;

public class Fighter extends CharacterClass {
    public Fighter() {
        this.className = "Fighter";
        this.hitDice = new Dice(10);
        this.primaryAbility = new Attribute[] {Attribute.STR, Attribute.DEX};
        addSavingThrowProficiency(Attribute.STR, Attribute.CON);
        addArmorAndWeaponProficiency(ArmorCategory.LIGHT_ARMOR, ArmorCategory.MEDIUM_ARMOR, ArmorCategory.HEAVY_ARMOR, new Shield(), WeaponType.SIMPLE, WeaponType.MARTIAL);
    }
}
