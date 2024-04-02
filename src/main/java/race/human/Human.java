package main.java.race.human;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.race.Race;
import main.java.size.SizeCategory;

public class Human extends Race {
	public Human() {
		this.raceName = "Human";
		this.ageMax = 100;
		this.size = SizeCategory.MEDIUM;
		this.speed = 30;
		addLanguage(chooseExtraLanguage("Choose an extra language: (cannot choose: COMMON)", this.languages));
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		for (Attribute attribute : Attribute.values()) {
			attributes.applyBonus(attribute, 1);
		}
	}
}
