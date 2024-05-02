package main.java.creature.character.race.gnome;

import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.item.tool.artisans_tools.TinkersTools;

public class RockGnome extends Gnome {
	public RockGnome() {
		this.raceName = "Rock Gnome";
		this.proficiencies.addProficiency(new TinkersTools());
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		super.applyRaceBonuses(attributes);
		attributes.applyBonus(Attribute.CON, 1);
	}
}
