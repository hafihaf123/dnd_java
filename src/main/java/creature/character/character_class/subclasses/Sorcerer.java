package main.java.creature.character.character_class.subclasses;

import main.java.creature.character.character_class.CharacterClass;
import main.java.creature.properties.attributes.Attribute;
import main.java.dice.Dice;
import main.java.item.weapon.melee.simple.Dagger;
import main.java.item.weapon.melee.simple.Quarterstaff;
import main.java.item.weapon.ranged.simple.Dart;
import main.java.item.weapon.ranged.simple.LightCrossbow;
import main.java.item.weapon.ranged.simple.Sling;

public class Sorcerer extends CharacterClass {
    public Sorcerer() {
        this.className = "Sorcerer";
        this.hitDice = new Dice(6);
        this.primaryAbility = new Attribute[] {Attribute.CHA};
        addSavingThrowProficiency(Attribute.CON, Attribute.CHA);
        addArmorAndWeaponProficiency(new Dagger(), new Dart(), new Sling(), new Quarterstaff(), new LightCrossbow());
    }
}
