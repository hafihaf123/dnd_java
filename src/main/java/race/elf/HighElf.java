package main.java.race.elf;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;

public class HighElf extends Elf {
	public HighElf() {
		this.raceName = "High Elf";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.INTELLIGENCE, 1);
	}
}