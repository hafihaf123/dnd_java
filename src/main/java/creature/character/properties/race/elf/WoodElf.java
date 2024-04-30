package main.java.creature.character.properties.race.elf;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;

public class WoodElf extends Elf {
	public WoodElf() {
		this.raceName = "Wood Elf";
		this.speed = 35;
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.WIS, 1);
	}
}