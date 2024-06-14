package main.java.creature.character.race.halfling;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.character.race.Race;
import main.java.creature.properties.size.SizeCategory;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;

public class Halfling extends Race {
	public Halfling() {
		this.raceName = "Halfling";
		this.ageMax = 150;
		this.speed = new Length(LengthUnits.FT, 25);
		this.size = SizeCategory.SMALL;
		addLanguage(Language.HALFLING);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.DEX, 2);
	}
}
