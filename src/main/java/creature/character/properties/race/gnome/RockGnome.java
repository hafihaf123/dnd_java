package main.java.creature.character.properties.race.gnome;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;

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
