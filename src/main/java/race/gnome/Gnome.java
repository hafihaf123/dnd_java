package main.java.race.gnome;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.race.Race;
import main.java.size.SizeCategory;

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
		attributes.applyBonus(Attribute.INTELLIGENCE, 2);
	}
}
