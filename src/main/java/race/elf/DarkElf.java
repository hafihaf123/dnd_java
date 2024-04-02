package main.java.race.elf;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;

public class DarkElf extends Elf {
	public DarkElf() {
		this.raceName = "Drow";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.CHARISMA, 1);
	}
}