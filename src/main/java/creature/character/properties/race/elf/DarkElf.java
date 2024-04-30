package main.java.creature.character.properties.race.elf;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;

public class DarkElf extends Elf {
	public DarkElf() {
		this.raceName = "Drow";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.CHA, 1);
	}
}