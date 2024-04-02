package main.java.character_class;

import main.java.attributes.Attribute;

public class Barbarian extends CharacterClass {
	public Barbarian() {
		this.className = "Barbarian";
		this.hitDie = 12;
		this.primaryAbility = new Attribute[] {Attribute.STRENGTH};
		this.savingThrowProficiencies = new Attribute[] {Attribute.STRENGTH, Attribute.CONSTITUTION};
	}
}
