package main.java.character_class;

import main.java.attributes.Attribute;

public class Cleric extends CharacterClass {
	public Cleric() {
		this.className = "Cleric";
		this.hitDie = 8;
		this.primaryAbility = new Attribute[] {Attribute.WIS};
		this.savingThrowProficiencies = new Attribute[] {Attribute.WIS, Attribute.CHA};
	}
}
