package main.java.creature.character.character_class;

import main.java.creature.properties.attributes.Attribute;

public class Bard extends CharacterClass {
	public Bard() {
		this.className = "Bard";
		this.hitDie = 8;
		this.primaryAbility = new Attribute[] {Attribute.CHA};
		this.savingThrowProficiencies = new Attribute[] {Attribute.DEX, Attribute.CHA};
	}
}
