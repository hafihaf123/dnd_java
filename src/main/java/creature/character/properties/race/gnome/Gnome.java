package main.java.creature.character.properties.race.gnome;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.character.properties.race.Race;
import main.java.creature.properties.size.SizeCategory;

public class Gnome extends Race {
	public Gnome() {
		this.raceName = "Gnome";
		this.ageMax = 500;
		this.size = SizeCategory.SMALL;
		this.speed = 25;
		addLanguage(Language.GNOMISH);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.INT, 2);
	}
}
