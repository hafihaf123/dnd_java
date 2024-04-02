package main.java.race.halfling;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;

public class Lightfoot extends Halfling {
	public Lightfoot() {
		this.raceName = "Lightfoot";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.CHARISMA, 1);
	}
}
