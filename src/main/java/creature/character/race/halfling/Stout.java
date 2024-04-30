package main.java.creature.character.race.halfling;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;

public class Stout extends Halfling {
	public Stout() {
		this.raceName = "Stout";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.CON, 1);
	}
}
