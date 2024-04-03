package main.java.race.dwarf;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;

public class MountainDwarf extends Dwarf {
	public MountainDwarf() {
		this.raceName = "Mountain Dwarf";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.STR, 2);
	}
}