package main.java.creature.character.race.elf;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.item.weapon.melee.martial.Rapier;
import main.java.item.weapon.melee.martial.Shortsword;
import main.java.item.weapon.ranged.martial.HandCrossbow;

public class DarkElf extends Elf {
	public DarkElf() {
		this.raceName = "Drow";
		this.proficiencies.addProficiency(new Rapier(), new Shortsword(), new HandCrossbow());
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.CHA, 1);
	}
}