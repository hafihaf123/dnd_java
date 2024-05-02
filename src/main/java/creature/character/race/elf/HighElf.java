package main.java.creature.character.race.elf;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.item.weapon.melee.martial.Longsword;
import main.java.item.weapon.melee.martial.Shortsword;
import main.java.item.weapon.ranged.martial.Longbow;
import main.java.item.weapon.ranged.simple.Shortbow;
import main.java.utils.InputUtils;

public class HighElf extends Elf {
	public HighElf() {
		this.raceName = "High Elf";
		this.proficiencies.addProficiency(new Longsword(), new Shortsword(), new Longbow(), new Shortbow());
		addLanguage(InputUtils.chooseExtraEnum("Choose one extra language", getLanguages()));
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.INT, 1);
	}
}