package main.java.creature.character.properties.race.gnome;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;

public class ForestGnome extends Gnome {
	public ForestGnome() {
		this.raceName = "Forest Gnome";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.DEX, 1);
	}
}
