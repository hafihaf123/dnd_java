package main.java.race.halfling;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.race.Race;
import main.java.size.SizeCategory;

public class Halfling extends Race {
	public Halfling() {
		this.raceName = "Halfling";
		this.ageMax = 150;
		this.speed = 25;
		this.size = SizeCategory.SMALL;
		addLanguage(Language.HALFLING);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.DEX, 2);
	}
}
