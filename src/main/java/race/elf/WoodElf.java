package main.java.race.elf;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;

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