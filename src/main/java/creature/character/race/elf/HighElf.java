package main.java.creature.character.race.elf;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;

public class HighElf extends Elf {
	public HighElf() {
		this.raceName = "High Elf";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.INT, 1);
	}
}