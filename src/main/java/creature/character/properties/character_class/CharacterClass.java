package main.java.creature.character.properties.character_class;

import main.java.creature.properties.attributes.Attribute;

public abstract class CharacterClass {
	protected String className;
	protected int hitDie;
	protected Attribute[] primaryAbility;
	protected Attribute[] savingThrowProficiencies;
	
	public String getClassName() {
		return className;
	}
	
	public int getHitDie() {
		return hitDie;
	}
	
	public Attribute[] getPrimaryAbility() {
		return primaryAbility;
	}
	
	public Attribute[] getSavingThrowProficiencies() {
		return savingThrowProficiencies;
	}
}
