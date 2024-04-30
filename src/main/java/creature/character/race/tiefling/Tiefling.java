package main.java.creature.character.race.tiefling;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.character.race.Race;
import main.java.creature.properties.size.SizeCategory;

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
