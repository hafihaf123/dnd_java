package main.java.creature.character.race.human;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.character.race.Race;
import main.java.creature.properties.size.SizeCategory;
import main.java.utils.InputUtils;

public class Human extends Race {
	public Human() {
		this.raceName = "Human";
		this.ageMax = 100;
		this.size = SizeCategory.MEDIUM;
		this.speed = 30;
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		for (Attribute attribute : Attribute.values()) {
			attributes.applyBonus(attribute, 1);
		}
	}

	@Override
	public void createFromInput() {
		super.createFromInput();
		addLanguage(InputUtils.chooseExtraEnum("Choose an extra language", this.languages));
	}
}
