package main.java.race.tiefling;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.race.Race;
import main.java.size.SizeCategory;

public class Tiefling extends Race {
	public Tiefling() {
		this.raceName = "Tiefling";
		this.ageMax = 110;
		this.size = SizeCategory.MEDIUM;
		this.speed = 30;
		addLanguage(Language.INFERNAL);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.INT, 1);
		attributes.applyBonus(Attribute.CHA, 2);
	}
}
