package main.java.race.dwarf;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.race.Race;
import main.java.size.SizeCategory;

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