package main.java.creature.character.race.dragonborn;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.character.race.Race;
import main.java.creature.properties.size.SizeCategory;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;

public class Dragonborn extends Race {
	public Dragonborn() {
		this.raceName = "Dragonborn";
		this.ageMax = 80;
		this.size = SizeCategory.MEDIUM;
		this.speed = new Length(LengthUnits.FT, 30);
		addLanguage(Language.DRACONIC);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.STR, 2);
		attributes.applyBonus(Attribute.CHA, 1);
	}
}
