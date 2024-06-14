package main.java.creature.character.character_class.subclasses;

import main.java.creature.character.character_class.CharacterClass;
import main.java.creature.properties.attributes.Attribute;
import main.java.dice.Dice;
import main.java.item.armor.ArmorCategory;
import main.java.item.armor.shield.Shield;
import main.java.item.weapon.melee.martial.Scimitar;
import main.java.item.weapon.melee.simple.*;
import main.java.item.weapon.ranged.simple.Dart;
import main.java.item.weapon.ranged.simple.Sling;

public class Druid extends CharacterClass {
    public Druid() {
        this.className = "Druid";
        this.hitDice = new Dice(8);
        this.primaryAbility = new Attribute[] {Attribute.WIS};
        addSavingThrowProficiency(Attribute.INT, Attribute.WIS);
        addArmorAndWeaponProficiency(ArmorCategory.LIGHT_ARMOR, ArmorCategory.MEDIUM_ARMOR, new Shield(), new Club(), new Dagger(), new Dart(), new Javelin(), new Mace(), new Quarterstaff(), new Scimitar(), new Sickle(), new Sling(), new Spear());
    }
}
