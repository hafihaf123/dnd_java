package main.java.creature.character.character_class;

import main.java.creature.properties.attributes.Attribute;
import main.java.dice.Dice;
import main.java.item.armor.ArmorCategory;
import main.java.item.weapon.WeaponType;

public class Barbarian extends CharacterClass {
	public Barbarian() {
		this.className = "Barbarian";
		this.hitDice = new Dice(12);
		this.primaryAbility = new Attribute[] {Attribute.STR};
		addSavingThrowProficiency(Attribute.STR, Attribute.CON);
		addArmorAndWeaponProficiency(ArmorCategory.LIGHT_ARMOR, ArmorCategory.MEDIUM_ARMOR, ArmorCategory.SHIELD, WeaponType.SIMPLE, WeaponType.MARTIAL);
		parseProficiencies();
	}
}
