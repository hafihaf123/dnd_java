package main.java.creature.character.race.half_elf;

import main.java.creature.character.properties.skills.Skill;
import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.character.race.Race;
import main.java.creature.properties.size.SizeCategory;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;
import main.java.utils.InputUtils;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HalfElf extends Race {
	public HalfElf() {
		this.raceName = "Half-Elf";
		this.ageMax = 200;
		this.size = SizeCategory.MEDIUM;
		this.speed = new Length(LengthUnits.FT, 30);
		addLanguage(Language.ELVISH);
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
        attributes.applyBonus(Attribute.CHA, 1);

		Set<Attribute> extraAttributes = new HashSet<>();
		extraAttributes.add(Attribute.CHA);
		for (int i = 0; i < 2; i++) {
			extraAttributes.add(InputUtils.chooseExtraEnum("Choose another extra attribute to increase by 1", extraAttributes));
		}
		for (Attribute attribute: extraAttributes)
			attributes.applyBonus(attribute, 1);
	}

	@Override
	public void createFromInput() {
		super.createFromInput();
		addLanguage(InputUtils.chooseExtraEnum("Choose an extra language", this.languages));
		Skill skill1 = InputUtils.chooseOne("Choose a skill to be proficient in", Skill.values());
		Skill skill2 = InputUtils.chooseExtraEnum("Choose one extra skill to be proficient in", Collections.singleton(skill1));
		this.proficiencies.addProficiency(skill1, skill2);
	}
}
