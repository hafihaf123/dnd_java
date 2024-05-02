package main.java.creature.character.race.dwarf;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.item.armor.ArmorCategory;

public class MountainDwarf extends Dwarf {
	public MountainDwarf() {
		this.raceName = "Mountain Dwarf";
		this.proficiencies.addProficiency(ArmorCategory.LIGHT_ARMOR, ArmorCategory.MEDIUM_ARMOR);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.STR, 2);
	}
}