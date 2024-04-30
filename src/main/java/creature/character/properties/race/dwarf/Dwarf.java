package main.java.creature.character.properties.race.dwarf;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.character.properties.race.Race;
import main.java.creature.properties.size.SizeCategory;

public class Dwarf extends Race {
	public Dwarf() {
		this.raceName = "Dwarf";
		this.ageMax = 350;
		this.size = SizeCategory.MEDIUM;
		this.speed = 25;
		addLanguage(Language.DWARVISH);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.CON, 2);
	}
}