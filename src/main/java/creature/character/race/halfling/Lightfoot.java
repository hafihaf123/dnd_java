package main.java.creature.character.race.halfling;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;

public class Lightfoot extends Halfling {
	public Lightfoot() {
		this.raceName = "Lightfoot";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.CHA, 1);
	}
}
