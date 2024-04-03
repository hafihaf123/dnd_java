package main.java.race.gnome;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;

public class RockGnome extends Gnome {
	public RockGnome() {
		this.raceName = "Rock Gnome";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.CON, 1);
	}
}
