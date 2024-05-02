package main.java.creature.character.race.elf;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.item.weapon.melee.martial.Longsword;
import main.java.item.weapon.melee.martial.Shortsword;
import main.java.item.weapon.ranged.martial.Longbow;
import main.java.item.weapon.ranged.simple.Shortbow;

public class WoodElf extends Elf {
	public WoodElf() {
		this.raceName = "Wood Elf";
		this.speed = 35;
		this.proficiencies.addProficiency(new Longsword(), new Shortsword(), new Longbow(), new Shortbow());
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.WIS, 1);
	}
}