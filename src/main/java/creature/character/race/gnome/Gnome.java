package main.java.creature.character.race.gnome;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.character.race.Race;
import main.java.creature.properties.size.SizeCategory;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;

public class Gnome extends Race {
	public Gnome() {
		this.raceName = "Gnome";
		this.ageMax = 500;
		this.size = SizeCategory.SMALL;
		this.speed = new Length(LengthUnits.FT, 25);
		addLanguage(Language.GNOMISH);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.INT, 2);
	}
}
