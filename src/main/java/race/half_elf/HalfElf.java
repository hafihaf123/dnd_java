package main.java.race.half_elf;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.race.Race;
import main.java.size.SizeCategory;

public class HalfElf extends Race {
	public HalfElf() {
		this.raceName = "Half-Elf";
		//two other ability scores of your choice increase by 1
		this.ageMax = 200;
		this.size = SizeCategory.MEDIUM;
		this.speed = 30;
		addLanguage(Language.ELVISH);
		addLanguage(chooseExtra("Choose an extra language: (cannot choose: COMMON, ELVISH)", this.languages));
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.CHA, 2);
		Attribute firstExtraAttribute = chooseExtra("Choose an extra attribute to increase by 1: (cannot choose: CHA)", Attribute.CHA);
		Attribute secondExtraAttribute = chooseExtra(STR."Choose another extra attribute to increase by 1: (cannot choose: CHA, \{firstExtraAttribute})", Attribute.CHA, firstExtraAttribute);
		attributes.applyBonus(firstExtraAttribute, 1);
		attributes.applyBonus(secondExtraAttribute, 1);
	}
}
