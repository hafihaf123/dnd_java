package main.java.creature.character.character_class.subclasses;

import main.java.creature.character.character_class.CharacterClass;
import main.java.creature.properties.attributes.Attribute;
import main.java.dice.Dice;
import main.java.item.armor.ArmorCategory;
import main.java.item.weapon.WeaponType;

public class Cleric extends CharacterClass {
	public Cleric() {
		this.className = "Cleric";
		this.hitDice = new Dice(8);
		this.primaryAbility = new Attribute[] {Attribute.WIS};
		addSavingThrowProficiency(Attribute.WIS, Attribute.CHA);
		addArmorAndWeaponProficiency(ArmorCategory.LIGHT_ARMOR, ArmorCategory.MEDIUM_ARMOR, ArmorCategory.SHIELD, WeaponType.SIMPLE);
	}
}