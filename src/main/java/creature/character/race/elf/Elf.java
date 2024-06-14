package main.java.creature.character.race.elf;

import main.java.creature.character.properties.skills.Skill;
import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.character.race.Race;
import main.java.creature.properties.size.SizeCategory;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;

public class Elf extends Race {
	public Elf() {
		this.raceName = "Elf";
		this.ageMax = 750;
		this.speed = new Length(LengthUnits.FT, 30);
		this.size = SizeCategory.MEDIUM;
		addLanguage(Language.ELVISH);
		proficiencies.addProficiency(Skill.PERCEPTION);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.DEX, 2);
	}
}