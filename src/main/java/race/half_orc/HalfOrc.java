package main.java.race.half_orc;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.race.Race;
import main.java.size.SizeCategory;

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
