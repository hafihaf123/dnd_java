package main.java.creature.character.properties.race.human;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.character.properties.race.Race;
import main.java.creature.properties.size.SizeCategory;

public class Human extends Race {
	public Human() {
		this.raceName = "Human";
		this.ageMax = 100;
		this.size = SizeCategory.MEDIUM;
		this.speed = 30;
		addLanguage(chooseExtra("Choose an extra language", this.languages));
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		for (Attribute attribute : Attribute.values()) {
			attributes.applyBonus(attribute, 1);
		}
	}
}
