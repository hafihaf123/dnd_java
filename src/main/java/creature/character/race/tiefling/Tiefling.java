package main.java.creature.character.race.tiefling;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.character.race.Race;
import main.java.creature.properties.size.SizeCategory;
import main.java.damage.DamageType;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;

public class Tiefling extends Race {
	public Tiefling() {
		this.raceName = "Tiefling";
		this.ageMax = 110;
		this.size = SizeCategory.MEDIUM;
		this.speed = new Length(LengthUnits.FT, 30);
		addLanguage(Language.INFERNAL);
		addResistance(DamageType.FIRE);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.INT, 1);
		attributes.applyBonus(Attribute.CHA, 2);
	}
}
