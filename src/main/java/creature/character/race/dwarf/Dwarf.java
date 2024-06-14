package main.java.creature.character.race.dwarf;

import main.java.creature.character.properties.proficiency.Proficiency;
import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.character.race.Race;
import main.java.creature.properties.size.SizeCategory;
import main.java.damage.DamageType;
import main.java.item.tool.artisans_tools.BrewersSupplies;
import main.java.item.tool.artisans_tools.MasonsTools;
import main.java.item.tool.artisans_tools.SmithsTools;
import main.java.item.weapon.melee.martial.Battleaxe;
import main.java.item.weapon.melee.martial.Warhammer;
import main.java.item.weapon.melee.simple.Handaxe;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;
import main.java.utils.InputUtils;

public class Dwarf extends Race {
	public Dwarf() {
		this.raceName = "Dwarf";
		this.ageMax = 350;
		this.size = SizeCategory.MEDIUM;
		this.speed = new Length(LengthUnits.FT, 25);
		addLanguage(Language.DWARVISH);
		addResistance(DamageType.POISON);
		this.proficiencies.addProficiency(new Battleaxe(), new Handaxe(), new Warhammer());
	}
	
	@Override
	public void applyRaceBonuses(Attributes attributes) {
		attributes.applyBonus(Attribute.CON, 2);
	}

	@Override
	public void createFromInput() {
		super.createFromInput();
		Proficiency artisansToolsProficiency = InputUtils.chooseOne(
				"Choose one proficiency with Artisan's tools of your choice",
				new SmithsTools(),
				new BrewersSupplies(),
				new MasonsTools()
		);
		this.proficiencies.addProficiency(artisansToolsProficiency);
	}
}