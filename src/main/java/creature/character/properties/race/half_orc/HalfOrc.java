package main.java.creature.character.properties.race.half_orc;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.character.properties.race.Race;
import main.java.creature.properties.size.SizeCategory;

public class HalfOrc extends Race {
	public HalfOrc() {
		this.raceName = "Half-Orc";
		this.ageMax = 75;
		this.size = SizeCategory.MEDIUM;
		this.speed = 30;
		addLanguage(Language.ORC);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.STR, 2);
		attributes.applyBonus(Attribute.CON, 1);
	}
}
