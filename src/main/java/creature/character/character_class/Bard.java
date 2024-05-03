package main.java.creature.character.character_class;

import main.java.creature.properties.attributes.Attribute;
import main.java.dice.Dice;
import main.java.item.armor.ArmorCategory;
import main.java.item.weapon.WeaponType;
import main.java.item.weapon.melee.martial.Longsword;
import main.java.item.weapon.melee.martial.Rapier;
import main.java.item.weapon.melee.martial.Shortsword;
import main.java.item.weapon.ranged.martial.HandCrossbow;

public class Bard extends CharacterClass {
	public Bard() {
		this.className = "Bard";
		this.hitDice = new Dice(8);
		this.primaryAbility = new Attribute[] {Attribute.CHA};
		addSavingThrowProficiency(Attribute.DEX, Attribute.CHA);
		addArmorAndWeaponProficiency(ArmorCategory.LIGHT_ARMOR, WeaponType.SIMPLE, new HandCrossbow(), new Longsword(), new Rapier(), new Shortsword());
	}
}
