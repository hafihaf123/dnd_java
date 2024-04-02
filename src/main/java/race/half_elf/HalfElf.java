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
		addLanguage(chooseExtraLanguage("Choose an extra language: (cannot choose: COMMON, ELVISH)", this.languages));
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.CHARISMA, 2);
		Attribute firstExtraAttribute = chooseExtraAttribute("Choose an extra attribute to increase by 1: (cannot choose: CHARISMA)", Attribute.CHARISMA);
		Attribute secondExtraAttribute = chooseExtraAttribute(STR."Choose another extra attribute to increase by 1: (cannot choose: CHARISMA, \{firstExtraAttribute})", Attribute.CHARISMA, firstExtraAttribute);
		attributes.applyBonus(firstExtraAttribute, 1);
		attributes.applyBonus(secondExtraAttribute, 1);
	}
}
