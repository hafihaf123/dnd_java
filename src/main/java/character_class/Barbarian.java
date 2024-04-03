package main.java.character_class;

import main.java.attributes.Attribute;

public class Barbarian extends CharacterClass {
	public Barbarian() {
		this.className = "Barbarian";
		this.hitDie = 12;
		this.primaryAbility = new Attribute[] {Attribute.STR};
		this.savingThrowProficiencies = new Attribute[] {Attribute.STR, Attribute.CON};
	}
}
