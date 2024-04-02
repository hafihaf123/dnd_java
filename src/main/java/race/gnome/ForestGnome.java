package main.java.race.gnome;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;

public class ForestGnome extends Gnome {
	public ForestGnome() {
		this.raceName = "Forest Gnome";
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.DEXTERITY, 1);
	}
}
