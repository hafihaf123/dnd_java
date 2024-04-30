package main.java.creature.character.race.dwarf;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;

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