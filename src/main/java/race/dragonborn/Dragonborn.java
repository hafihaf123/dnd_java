package main.java.race.dragonborn;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.race.Race;
import main.java.size.SizeCategory;

public class Dragonborn extends Race {
	public Dragonborn() {
		this.raceName = "Dragonborn";
		this.ageMax = 80;
		this.size = SizeCategory.MEDIUM;
		this.speed = 30;
		addLanguage(Language.DRACONIC);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.STR, 2);
		attributes.applyBonus(Attribute.CHA, 1);
	}
}
