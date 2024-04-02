package main.java.race.halfling;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;

public class Stout extends Halfling {
	public Stout() {
		this.raceName = "Stout";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.CONSTITUTION, 1);
	}
}
