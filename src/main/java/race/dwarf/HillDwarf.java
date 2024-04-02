package main.java.race.dwarf;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;

public class HillDwarf extends Dwarf {
	public HillDwarf() {
		this.raceName = "Hill Dwarf";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.WISDOM, 1);
	}
}