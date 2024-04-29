package main.java.race.half_elf;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.race.Race;
import main.java.size.SizeCategory;

import java.util.HashSet;
import java.util.Set;

public class HalfElf extends Race {
	public HalfElf() {
		this.raceName = "Half-Elf";
		this.ageMax = 200;
		this.size = SizeCategory.MEDIUM;
		this.speed = 30;
		addLanguage(Language.ELVISH);
		addLanguage(chooseExtra("Choose an extra language", this.languages));
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
        attributes.applyBonus(Attribute.CHA, 1);
		Set<Attribute> extraAttributes = new HashSet<>();
		extraAttributes.add(Attribute.CHA);
		extraAttributes.add(chooseExtra("Choose another extra attribute to increase by 1", extraAttributes));
		extraAttributes.add(chooseExtra("Choose another extra attribute to increase by 1", extraAttributes));
		for (Attribute attribute: extraAttributes)
			attributes.applyBonus(attribute, 1);
	}
}
