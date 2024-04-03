package main.java.race.elf;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.race.Race;
import main.java.size.SizeCategory;

public class Elf extends Race {
	public Elf() {
		this.raceName = "Elf";
		this.ageMax = 750;
		this.speed = 30;
		this.size = SizeCategory.MEDIUM;
		addLanguage(Language.ELVISH);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.DEX, 2);
	}
}