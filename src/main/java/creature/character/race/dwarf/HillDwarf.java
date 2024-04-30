package main.java.creature.character.race.dwarf;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;

public class HillDwarf extends Dwarf {
	public HillDwarf() {
		this.raceName = "Hill Dwarf";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.WIS, 1);
	}
}