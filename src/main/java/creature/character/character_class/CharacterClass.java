package main.java.creature.character.character_class;

import main.java.creature.character.properties.proficiency.Proficiencies;
import main.java.creature.character.properties.proficiency.Proficiency;
import main.java.creature.properties.attributes.Attribute;
import main.java.dice.Dice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class CharacterClass {
	protected String className;
	protected Dice hitDice;
	protected Attribute[] primaryAbility;
	protected Set<Attribute> savingThrowProficiencies = new HashSet<>();
	protected Set<Proficiency> armorAndWeaponProficiencies = new HashSet<>();
	protected Proficiencies proficiencies;

	public String getClassName() {
		return className;
	}
	
	public Dice getHitDice() {
		return hitDice;
	}
	
	public Attribute[] getPrimaryAbility() {
		return primaryAbility;
	}
	
	public Set<Attribute> getSavingThrowProficiencies() {
		return savingThrowProficiencies;
	}

	public void addSavingThrowProficiency(Attribute... attributes) {
        this.savingThrowProficiencies.addAll(Arrays.asList(attributes));
	}

	public void removeSavingThrowProficiency(Attribute attribute) {
		this.savingThrowProficiencies.remove(attribute);
	}

	public boolean hasSavingThrowProficiency(Attribute attribute) {
		return this.savingThrowProficiencies.contains(attribute);
	}

	public Set<Proficiency> getArmorAndWeaponProficiencies() {
		return armorAndWeaponProficiencies;
	}

	public void addArmorAndWeaponProficiency(Proficiency... proficiency) {
		this.armorAndWeaponProficiencies.addAll(Arrays.asList(proficiency));
	}

	public void removeArmorAndWeaponProficiency(Proficiency proficiency) {
		this.armorAndWeaponProficiencies.remove(proficiency);
	}

	public boolean hasArmorAndWeaponProficiency(Proficiency proficiency) {
		return this.armorAndWeaponProficiencies.contains(proficiency);
	}

	public void parseProficiencies() {
		this.proficiencies.addProficiency(savingThrowProficiencies);
		this.proficiencies.addProficiency(armorAndWeaponProficiencies);
	}

	public Proficiencies getProficienciesObject() {
		parseProficiencies();
		return proficiencies;
	}

	public Set<Proficiency> getProficienciesSet() {
		parseProficiencies();
		return this.proficiencies.getProficiencies();
	}
}
